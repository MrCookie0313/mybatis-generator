package com.cookie.mybatis.service;

import javax.servlet.http.HttpServletResponse;

/**
 * @author sunBing
 * @version 1.0
 * @date 2020/09/15 18:56
 */
public interface ExcelService {

    void exportExcel(HttpServletResponse response);
}
