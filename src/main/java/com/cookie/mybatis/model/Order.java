package com.cookie.mybatis.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
@Data
public class Order {
    private String orderId;

    private Integer skuId;

    private String userId;

    private String tenantId;

    private String tranNo;

    private String orderStatus;

    private String countryCode;

    private String currencyCode;

    private String units;

    private Integer nacos;

    private String paymentStatus;

    private String visaType;

    private String verificationRemark;

    private String evisaDownloadUrl;

    private String deletedFlag;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createdAt;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updatedAt;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date deletedAt;

}