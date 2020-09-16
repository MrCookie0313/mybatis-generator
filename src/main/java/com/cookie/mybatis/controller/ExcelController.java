package com.cookie.mybatis.controller;

import com.cookie.mybatis.service.ExcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @author sunBing
 * @version 1.0
 * @date 2020/09/15 18:51
 */
@Controller
@RequestMapping("/excel")
public class ExcelController {

    @Autowired
    private ExcelService excelService;

    @RequestMapping(value = "/export",method = RequestMethod.POST)
    @ResponseBody
    public void exportExcel(HttpServletResponse response){
        excelService.exportExcel(response);

    }
}