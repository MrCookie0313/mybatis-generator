package com.cookie.mybatis.model;

import com.github.pagehelper.PageInfo;
import lombok.Data;

import java.util.List;

/**
 * PageBean
 *
 * @author slipkinem
 * @date 2018/9/5 - 下午6:08
 * @description 所有需要分页的用这个基类
 */
@Data
public class PageBean<T> {
    private List<T> rows;

    private int pageNum;

    private int pageSize;

    private long total;

    public PageBean () {}

    public  PageBean (PageInfo<T> pageInfo) {
        this.rows = pageInfo.getList();
        this.pageNum = pageInfo.getPageNum();
        this.pageSize = pageInfo.getPageSize();
        this.total = pageInfo.getTotal();
    }

    public PageBean (int pageNum, int pageSize){
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.total = 0;
    }

}
