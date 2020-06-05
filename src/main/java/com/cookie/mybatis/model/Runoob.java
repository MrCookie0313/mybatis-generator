package com.cookie.mybatis.model;

import java.util.Date;

public class Runoob {
    private Integer runoobId;

    private String runoobTitle;

    private String runoobAuthor;

    private Date submissionDate;

    public Integer getRunoobId() {
        return runoobId;
    }

    public void setRunoobId(Integer runoobId) {
        this.runoobId = runoobId;
    }

    public String getRunoobTitle() {
        return runoobTitle;
    }

    public void setRunoobTitle(String runoobTitle) {
        this.runoobTitle = runoobTitle == null ? null : runoobTitle.trim();
    }

    public String getRunoobAuthor() {
        return runoobAuthor;
    }

    public void setRunoobAuthor(String runoobAuthor) {
        this.runoobAuthor = runoobAuthor == null ? null : runoobAuthor.trim();
    }

    public Date getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(Date submissionDate) {
        this.submissionDate = submissionDate;
    }
}