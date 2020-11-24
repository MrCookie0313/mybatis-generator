package com.cookie.mybatis.redis;

/**
 * @author Cookie
 * @version 1.0
 * @date 2020/11/24 11:03
 */
public class TaskBodyDTO {
    private String body;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
}
