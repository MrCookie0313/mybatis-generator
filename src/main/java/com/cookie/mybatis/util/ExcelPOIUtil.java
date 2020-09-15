package com.cookie.mybatis.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

/**
 * poi 工具
 * @author sunbing
 */
@Slf4j
public class ExcelPOIUtil {
    private static final String FORMAT_DATE = "yyyy-MM-dd";
    private static final String APPLICATION_XLS = "application/vnd.ms-excel";
    private static final String APPLICATION_XLSX = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";

    public static Workbook workBookReader(MultipartFile file) {
        String type = file.getContentType();
        if (!APPLICATION_XLS.equals(type)
                && !APPLICATION_XLSX.equals(type)
                && !"application/octet-stream".equals(type)) {
            log.error("上传文件类型错误");
            return null;
        }
        Workbook wb = null;
        String fileName = file.getOriginalFilename();
        try {
            assert fileName != null;
            if (fileName.endsWith("xls")) {
                wb = new HSSFWorkbook(file.getInputStream());
            } else if (fileName.endsWith("xlsx")) {
                wb = new XSSFWorkbook(file.getInputStream());
            }
        } catch (IOException e) {
            log.error(e.getMessage());
        }
        return wb;
    }

    public static Date cellDateStringValue(Cell cell, String format) {
        if (cell == null) {
            return null;
        }
        //cell.getCellTypeEnum()虽标记过时，但官方未提供替代方法
        Date value = null;
        switch (cell.getCellTypeEnum()) {
            case STRING:
                value = DateUtil.strToDate(cell.getRichStringCellValue().getString(), format);
                break;
            case NUMERIC:
                value = cell.getDateCellValue();
                break;
            default:
                break;
        }
        return value;
    }

    /**
     * 仅支持格式:yyyy-MM-dd
     *
     * @param cell
     * @return
     */
    public static LocalDate cellLocalDateStringValue(Cell cell) {
        if (cell == null) {
            return null;
        }
        //cell.getCellTypeEnum()虽标记过时，但官方未提供替代方法
        LocalDate value = null;
        switch (cell.getCellTypeEnum()) {
            case STRING:
                if (null != cell.getRichStringCellValue()) {
                    value = DateUtil.strToLocalDate(cell.getRichStringCellValue().getString());
                }
                break;
            case NUMERIC:
                value = DateUtil.dateToLocalDate(cell.getDateCellValue());
                break;
            default:
                break;
        }
        return value;
    }

    public static Integer cellIntegerValue(Cell cell) {
        if (cell == null) {
            return null;
        }
        Integer value = null;
        switch (cell.getCellTypeEnum()) {
            case STRING:
                if (null != cell.getStringCellValue()) {
                    value = new BigDecimal(cell.getStringCellValue()).intValue();
                }
                break;
            case NUMERIC:
                value = (int) cell.getNumericCellValue();
                break;
            default:
                break;
        }
        return value;
    }

    public static Long cellLongValue(Cell cell) {
        if (cell == null) {
            return null;
        }
        Long value = null;
        switch (cell.getCellTypeEnum()) {
            case STRING:
                if (null != cell.getStringCellValue()) {
                    value = new BigDecimal(cell.getStringCellValue()).longValue();
                }
                break;
            case NUMERIC:
                value = (long) cell.getNumericCellValue();
                break;
            default:
                break;
        }
        return value;
    }

    /**
     * 直接获取string字符
     * 无小数数字转换为string类型
     * 有小数则不可使用该方法
     *
     * @param cell
     * @return
     */
    public static String cellStringValue(Cell cell) {
        if (cell == null) {
            return null;
        }
        String value = null;
        switch (cell.getCellTypeEnum()) {
            case STRING:
                value = cell.getStringCellValue();
                break;
            case NUMERIC:
                BigDecimal bd = new BigDecimal(cell.getNumericCellValue());
                bd = bd.setScale(0, BigDecimal.ROUND_UP);
                value = bd.toString();
                break;
            default:
                break;
        }
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        return value;
    }

    public static String getCellValue(Cell cell) {
        int cellType = cell.getCellType();
        String cellValue = "";
        switch (cellType) {
            case HSSFCell.CELL_TYPE_NUMERIC:
                cellValue = String.valueOf(cell.getNumericCellValue());
                break;

            case HSSFCell.CELL_TYPE_FORMULA:
                try {
                    cellValue = cell.getStringCellValue();
                } catch (IllegalStateException e) {
                    cellValue = String.valueOf(cell.getNumericCellValue());
                }
                break;

            default:
                cellValue = cell.getStringCellValue();
        }

        return cellValue.trim();
    }
}