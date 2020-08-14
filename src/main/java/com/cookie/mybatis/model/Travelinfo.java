package com.cookie.mybatis.model;

import java.util.Date;

public class Travelinfo {
    private String travelInfoId;

    private String orderId;

    private String carrierCode;

    private String flightNumber;

    private String departureAirportName;

    private String departureAirportCode;

    private String arrivalAirportName;

    private String arrivalAirportCode;

    private Date departureDate;

    private Date arrivalDate;

    private String flightType;

    private String flightImageUrl;

    private String deletedFlag;

    private Date createdAt;

    private Date updatedAt;

    private Date deletedAt;

    public String getTravelInfoId() {
        return travelInfoId;
    }

    public void setTravelInfoId(String travelInfoId) {
        this.travelInfoId = travelInfoId == null ? null : travelInfoId.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getCarrierCode() {
        return carrierCode;
    }

    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode == null ? null : carrierCode.trim();
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber == null ? null : flightNumber.trim();
    }

    public String getDepartureAirportName() {
        return departureAirportName;
    }

    public void setDepartureAirportName(String departureAirportName) {
        this.departureAirportName = departureAirportName == null ? null : departureAirportName.trim();
    }

    public String getDepartureAirportCode() {
        return departureAirportCode;
    }

    public void setDepartureAirportCode(String departureAirportCode) {
        this.departureAirportCode = departureAirportCode == null ? null : departureAirportCode.trim();
    }

    public String getArrivalAirportName() {
        return arrivalAirportName;
    }

    public void setArrivalAirportName(String arrivalAirportName) {
        this.arrivalAirportName = arrivalAirportName == null ? null : arrivalAirportName.trim();
    }

    public String getArrivalAirportCode() {
        return arrivalAirportCode;
    }

    public void setArrivalAirportCode(String arrivalAirportCode) {
        this.arrivalAirportCode = arrivalAirportCode == null ? null : arrivalAirportCode.trim();
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getFlightType() {
        return flightType;
    }

    public void setFlightType(String flightType) {
        this.flightType = flightType == null ? null : flightType.trim();
    }

    public String getFlightImageUrl() {
        return flightImageUrl;
    }

    public void setFlightImageUrl(String flightImageUrl) {
        this.flightImageUrl = flightImageUrl == null ? null : flightImageUrl.trim();
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