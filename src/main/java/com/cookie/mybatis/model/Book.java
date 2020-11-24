package com.cookie.mybatis.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Cookie
 * @version 1.0
 * @date 2020/11/06 14:17
 */
@Data

public class Book implements Serializable {
    private String id;

    private String bookName;

    private String title;
    private Date createTime;

    private String desc;

    private String cc;
}
