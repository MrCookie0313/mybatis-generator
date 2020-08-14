package com.cookie.mybatis.model;

import java.util.Date;

public class Accommdation {
    private String accommodationId;

    private String orderId;

    private String hotelName;

    private String hotelAddress;

    private String city;

    private String district;

    private String subdistrict;

    private String zipcode;

    private String referPersonName;

    private String referPersonAddress;

    private String accommodationImageUrl;

    private String deletedFlag;

    private Date createdAt;

    private Date updatedAt;

    private Date deletedAt;

    public String getAccommodationId() {
        return accommodationId;
    }

    public void setAccommodationId(String accommodationId) {
        this.accommodationId = accommodationId == null ? null : accommodationId.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName == null ? null : hotelName.trim();
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress == null ? null : hotelAddress.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public String getSubdistrict() {
        return subdistrict;
    }

    public void setSubdistrict(String subdistrict) {
        this.subdistrict = subdistrict == null ? null : subdistrict.trim();
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode == null ? null : zipcode.trim();
    }

    public String getReferPersonName() {
        return referPersonName;
    }

    public void setReferPersonName(String referPersonName) {
        this.referPersonName = referPersonName == null ? null : referPersonName.trim();
    }

    public String getReferPersonAddress() {
        return referPersonAddress;
    }

    public void setReferPersonAddress(String referPersonAddress) {
        this.referPersonAddress = referPersonAddress == null ? null : referPersonAddress.trim();
    }

    public String getAccommodationImageUrl() {
        return accommodationImageUrl;
    }

    public void setAccommodationImageUrl(String accommodationImageUrl) {
        this.accommodationImageUrl = accommodationImageUrl == null ? null : accommodationImageUrl.trim();
    }

    public String getDeletedFlag() {
        return deletedFlag;
    }

    public void setDeletedFlag(String deletedFlag) {
        this.deletedFlag = deletedFlag == null ? null : deletedFlag.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }
}