package com.cookie.mybatis.model;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import lombok.Data;

import java.util.Date;

/**
 * @author sunbing_vendor
 */
@Data
public class AdjustmentSalaryExportHeadVO extends BaseRowModel {

    @ExcelProperty(value = "一级部门", index = 0)
    private String centerName;

    @ExcelProperty(value = "二级部门", index = 1)
    private String secondDepartmentName;

    @ExcelProperty(value = "三级部门", index = 2)
    private String thirdDepartmentName;

    @ExcelProperty(value = "四级部门", index = 3)
    private String fourthDepartmentName;

    @ExcelProperty(value = "五级部门", index = 4)
    private String fifthDepartmentName;

    @ExcelProperty(value = "六级部门", index = 5)
    private String sixDepartmentName;

    @ExcelProperty(value = "工号", index = 6)
    private String workNum;

    @ExcelProperty(value = "姓名", index = 7)
    private String employeeName;

    @ExcelProperty(value = "入职时间", index = 8)
    private String entryDate;

    @ExcelProperty(value = "职位", index = 9)
    private String workPositionName;

    @ExcelProperty(value = "员工状态", index = 10)
    private String employeeStatus;

    @ExcelProperty(value = "员工类型", index = 11)
    private String employeeType;

    @ExcelProperty(value = "职级", index = 12)
    private String employeeLevel;

    @ExcelProperty(value = "Job code", index = 13)
    private String jobCode;

    @ExcelProperty(value = "绩效评定", index = 14)
    private String performanceEvaluation;

    @ExcelProperty(value = "调薪前基本工资", index = 15)
    private String baseBefore;

    @ExcelProperty(value = "调薪后基本工资", index = 16)
    private String baseAfter;

    @ExcelProperty(value = "调薪前绩效基数", index = 17)
    private String performanceBaseBefore;

    @ExcelProperty(value = "调薪后绩效基数", index = 18)
    private String performanceBaseAfter;

    @ExcelProperty(value = "生效时间", index =19)
    private String startDate;

    @ExcelProperty(value = "备注", index =20)
    private String remark;


}
