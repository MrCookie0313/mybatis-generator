package com.cookie.mybatis.util;

import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.excel.metadata.BaseRowModel;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import org.apache.commons.io.IOUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Cookie
 * @version 1.0
 * @date 2020/09/16 17:46
 * @Des todo
 */
public class ExcelUtil {


    public static void readExcel(MultipartFile excel, BaseRowModel rowModel, AnalysisEventListener excelListener) {
        ExcelReader reader = getReader(excel, excelListener);
        if (reader == null) {
            return;
        }
        for (Sheet sheet : reader.getSheets()) {
            if (rowModel != null) {
                sheet.setClazz(rowModel.getClass());
            }
            reader.read(sheet);
        }
    }

    /**
     * 读取excel
     *
     * @param excel
     * @param excelListener
     * @return
     */
    public static ExcelReader readExcel(MultipartFile excel, AnalysisEventListener excelListener) {
        return getReader(excel, excelListener);
    }

    /**
     * 读取 Excel(多个 sheet)
     *
     * @param excel    文件
     * @param rowModel 实体类映射，继承 BaseRowModel 类
     * @return Excel 数据 list
     */
    public static List<Object> readExcel(MultipartFile excel, BaseRowModel rowModel) {
        ExcelListener excelListener = new ExcelListener();
        ExcelReader reader = getReader(excel, excelListener);
        if (reader == null) {
            return null;
        }
        for (Sheet sheet : reader.getSheets()) {
            if (rowModel != null) {
                sheet.setClazz(rowModel.getClass());
            }
            reader.read(sheet);
        }
        return excelListener.getDatas();
    }

    /**
     * 读取某个 sheet 的 Excel
     *
     * @param excel    文件
     * @param rowModel 实体类映射，继承 BaseRowModel 类
     * @param sheetNo  sheet 的序号 从1开始
     * @return Excel 数据 list
     */
    public static List<Object> readExcel(MultipartFile excel, BaseRowModel rowModel, int sheetNo) {
        return readExcel(excel, rowModel, sheetNo, 1);
    }

    /**
     * 读取某个 sheet 的 Excel
     *
     * @param excel       文件
     * @param rowModel    实体类映射，继承 BaseRowModel 类
     * @param sheetNo     sheet 的序号 从1开始
     * @param headLineNum 表头行数，默认为1
     * @return Excel 数据 list
     */
    public static List<Object> readExcel(MultipartFile excel, BaseRowModel rowModel, int sheetNo,
                                         int headLineNum) {
        ExcelListener excelListener = new ExcelListener();
        ExcelReader reader = getReader(excel, excelListener);
        if (reader == null) {
            return null;
        }
        reader.read(new Sheet(sheetNo, headLineNum, rowModel.getClass()));
        return excelListener.getDatas();
    }

    /**
     * 导出 Excel ：一个 sheet，带表头
     *
     * @param response  HttpServletResponse
     * @param list      数据 list，每个元素为一个 BaseRowModel
     * @param fileName  导出的文件名
     * @param sheetName 导入文件的 sheet 名
     * @param object    映射实体类，Excel 模型
     */
    public static void writeExcel(HttpServletResponse response, List<? extends BaseRowModel> list,
                                  String fileName, String sheetName, BaseRowModel object) {
        OutputStream outputStream = null;
        try {
            outputStream = getOutputStream(fileName, response);
            ExcelWriter writer = new ExcelWriter(outputStream, ExcelTypeEnum.XLSX);
            Sheet sheet = new Sheet(1, 0, object.getClass());
            sheet.setSheetName(sheetName);
            writer.write(list, sheet);
            writer.finish();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            IOUtils.closeQuietly(outputStream);
        }
    }

    public static ByteArrayOutputStream writeExcelByte(HttpServletResponse response, List<? extends BaseRowModel> list,
                                                       String fileName, String sheetName, BaseRowModel object) {
        ByteArrayOutputStream outputStream = null;
        try {
            outputStream = new ByteArrayOutputStream();
            ExcelWriter writer = new ExcelWriter(outputStream, ExcelTypeEnum.XLSX);
            Sheet sheet = new Sheet(1, 0, object.getClass());
            sheet.setSheetName(sheetName);
            writer.write(list, sheet);
            writer.finish();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return outputStream;
    }

    public static ByteArrayOutputStream writeExcelByte(List<? extends BaseRowModel> list, String sheetName, BaseRowModel object) {
        return writeExcelByte(null, list, null, sheetName, object);
    }

    public static ByteArrayOutputStream writeExcel(List<List<String>> list, String sheetName, List<String> headers) {

        List hh = new ArrayList();
        for (String header : headers) {
            List item = new ArrayList();
            item.add(header);
            hh.add(item);
        }

        ByteArrayOutputStream outputStream = null;
        try {
            outputStream = new ByteArrayOutputStream();
            ExcelWriter writer = new ExcelWriter(outputStream, ExcelTypeEnum.XLSX);
            Sheet sheet = new Sheet(1, 0);
            sheet.setHead(hh);
            sheet.setSheetName(sheetName);
            writer.write0(list, sheet);
            writer.finish();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return outputStream;
    }

    public static void writeExcel(HttpServletResponse response, List<List<String>> list, String fileName, String sheetName, List<String> headers) {

        List hh = new ArrayList();
        for (String header : headers) {
            List item = new ArrayList();
            item.add(header);
            hh.add(item);
        }

        OutputStream outputStream;
        try {
            outputStream = getOutputStream(fileName, response);
            ExcelWriter writer = new ExcelWriter(outputStream, ExcelTypeEnum.XLSX);
            Sheet sheet = new Sheet(1, 0);
            sheet.setHead(hh);
            sheet.setSheetName(sheetName);
            writer.write0(list, sheet);
            writer.finish();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 导出 Excel ：多个 sheet，带表头
     *
     * @param response  HttpServletResponse
     * @param list      数据 list，每个元素为一个 BaseRowModel
     * @param fileName  导出的文件名
     * @param sheetName 导入文件的 sheet 名
     * @param object    映射实体类，Excel 模型
     */
    public static ExcelWriterFactory writeExcelWithSheets(HttpServletResponse response, List<? extends BaseRowModel> list,
                                                          String fileName, String sheetName, BaseRowModel object) {
        ExcelWriterFactory writer = new ExcelWriterFactory(getOutputStream(fileName, response), ExcelTypeEnum.XLSX);
        Sheet sheet = new Sheet(1, 0, object.getClass());
        sheet.setSheetName(sheetName);
        writer.write(list, sheet);
        return writer;
    }

    /**
     * 导出文件时为Writer生成OutputStream
     */
    private static OutputStream getOutputStream(String fileName, HttpServletResponse response) {
        //创建本地文件
        String filePath = fileName + ".xlsx";
        try {
            fileName = new String(filePath.getBytes(), "ISO-8859-1");
            response.addHeader("Content-Disposition", "filename=" + fileName);
            return response.getOutputStream();
        } catch (IOException e) {
            throw new ExcelException("获取流失败！");
        }
    }

    /**
     * 返回 ExcelReader
     *
     * @param excel         需要解析的 Excel 文件
     * @param excelListener new ExcelListener()
     */
    private static ExcelReader getReader(MultipartFile excel,
                                         AnalysisEventListener excelListener) {
        String filename = excel.getOriginalFilename();
        if (filename == null || (!filename.toLowerCase().endsWith(".xls") && !filename.toLowerCase().endsWith(".xlsx"))) {
            throw new ExcelException("文件格式错误！");
        }
        InputStream inputStream;
        try {
            inputStream = excel.getInputStream();
            if (filename.toLowerCase().endsWith(".xls")) {
                return new ExcelReader(inputStream, ExcelTypeEnum.XLS, null, excelListener);
            } else {
                return new ExcelReader(inputStream, ExcelTypeEnum.XLSX, null, excelListener);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
