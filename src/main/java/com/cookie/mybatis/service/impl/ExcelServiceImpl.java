package com.cookie.mybatis.service.impl;

import com.cookie.mybatis.model.AdjustmentSalaryExportHeadVO;
import com.cookie.mybatis.service.ExcelService;
import com.cookie.mybatis.util.ExcelUtil;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * @author sunBing
 * @version 1.0
 * @date 2020/09/15 18:58
 */
@Service
public class ExcelServiceImpl implements ExcelService {
    @Override
    public void exportExcel(HttpServletResponse response) {
        ArrayList<AdjustmentSalaryExportHeadVO> exportHeadVOS = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            AdjustmentSalaryExportHeadVO adjustmentSalaryExportHeadVO = new AdjustmentSalaryExportHeadVO();
            adjustmentSalaryExportHeadVO.setCenterName("上海");
            adjustmentSalaryExportHeadVO.setSecondDepartmentName("北京");
            adjustmentSalaryExportHeadVO.setThirdDepartmentName("新加坡");
            adjustmentSalaryExportHeadVO.setFourthDepartmentName("IRDC");
            adjustmentSalaryExportHeadVO.setFifthDepartmentName("五级部门");
            adjustmentSalaryExportHeadVO.setSixDepartmentName("六级部门");
            adjustmentSalaryExportHeadVO.setWorkNum(String.valueOf(i));
            adjustmentSalaryExportHeadVO.setEmployeeName("cookie");
            adjustmentSalaryExportHeadVO.setEntryDate(LocalDate.now().toString());
            adjustmentSalaryExportHeadVO.setWorkPositionName("java开发");
            exportHeadVOS.add(adjustmentSalaryExportHeadVO);
        }
        ExcelUtil.writeExcel(response,exportHeadVOS,"部门表","员工部门信息",new AdjustmentSalaryExportHeadVO());

    }
}
