package com.cookie.mybatis.model;

import java.util.Date;

public class Suborder {
    private String suborderId;

    private String orderId;

    private String visaStatus;

    private String contactNumber;

    private String email;

    private String firstName;

    private String lastName;

    private String title;

    private String middleName;

    private String annualIncome;

    private String occupation;

    private String purposeVisit;

    private String residenceAddress;

    private String traveldocNumber;

    private String countryOfBirth;

    private Date dateOfBirth;

    private String firstnameInPassport;

    private String lastnameInPassport;

    private String gender;

    private String nationality;

    private Date traveldocIssueDate;

    private Date traveldocExpiryDate;

    private String traveldocIssueCountry;

    private String traveldocIssuePlace;

    private String traveldocBirthPlace;

    private String traveldocImageUrl;

    private String traveldocCoverImageUrl;

    private String userPhotoImageUrl;

    private String deletedFlag;

    private Date createdAt;

    private Date updatedAt;

    private Date deletedAt;

    public String getSuborderId() {
        return suborderId;
    }

    public void setSuborderId(String suborderId) {
        this.suborderId = suborderId == null ? null : suborderId.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getVisaStatus() {
        return visaStatus;
    }

    public void setVisaStatus(String visaStatus) {
        this.visaStatus = visaStatus == null ? null : visaStatus.trim();
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber == null ? null : contactNumber.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? null : firstName.trim();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName == null ? null : lastName.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName == null ? null : middleName.trim();
    }

    public String getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(String annualIncome) {
        this.annualIncome = annualIncome == null ? null : annualIncome.trim();
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation == null ? null : occupation.trim();
    }

    public String getPurposeVisit() {
        return purposeVisit;
    }

    public void setPurposeVisit(String purposeVisit) {
        this.purposeVisit = purposeVisit == null ? null : purposeVisit.trim();
    }

    public String getResidenceAddress() {
        return residenceAddress;
    }

    public void setResidenceAddress(String residenceAddress) {
        this.residenceAddress = residenceAddress == null ? null : residenceAddress.trim();
    }

    public String getTraveldocNumber() {
        return traveldocNumber;
    }

    public void setTraveldocNumber(String traveldocNumber) {
        this.traveldocNumber = traveldocNumber == null ? null : traveldocNumber.trim();
    }

    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    public void setCountryOfBirth(String countryOfBirth) {
        this.countryOfBirth = countryOfBirth == null ? null : countryOfBirth.trim();
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstnameInPassport() {
        return firstnameInPassport;
    }

    public void setFirstnameInPassport(String firstnameInPassport) {
        this.firstnameInPassport = firstnameInPassport == null ? null : firstnameInPassport.trim();
    }

    public String getLastnameInPassport() {
        return lastnameInPassport;
    }

    public void setLastnameInPassport(String lastnameInPassport) {
        this.lastnameInPassport = lastnameInPassport == null ? null : lastnameInPassport.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality == null ? null : nationality.trim();
    }

    public Date getTraveldocIssueDate() {
        return traveldocIssueDate;
    }

    public void setTraveldocIssueDate(Date traveldocIssueDate) {
        this.traveldocIssueDate = traveldocIssueDate;
    }

    public Date getTraveldocExpiryDate() {
        return traveldocExpiryDate;
    }

    public void setTraveldocExpiryDate(Date traveldocExpiryDate) {
        this.traveldocExpiryDate = traveldocExpiryDate;
    }

    public String getTraveldocIssueCountry() {
        return traveldocIssueCountry;
    }

    public void setTraveldocIssueCountry(String traveldocIssueCountry) {
        this.traveldocIssueCountry = traveldocIssueCountry == null ? null : traveldocIssueCountry.trim();
    }

    public String getTraveldocIssuePlace() {
        return traveldocIssuePlace;
    }

    public void setTraveldocIssuePlace(String traveldocIssuePlace) {
        this.traveldocIssuePlace = traveldocIssuePlace == null ? null : traveldocIssuePlace.trim();
    }

    public String getTraveldocBirthPlace() {
        return traveldocBirthPlace;
    }

    public void setTraveldocBirthPlace(String traveldocBirthPlace) {
        this.traveldocBirthPlace = traveldocBirthPlace == null ? null : traveldocBirthPlace.trim();
    }

    public String getTraveldocImageUrl() {
        return traveldocImageUrl;
    }

    public void setTraveldocImageUrl(String traveldocImageUrl) {
        this.traveldocImageUrl = traveldocImageUrl == null ? null : traveldocImageUrl.trim();
    }

    public String getTraveldocCoverImageUrl() {
        return traveldocCoverImageUrl;
    }

    public void setTraveldocCoverImageUrl(String traveldocCoverImageUrl) {
        this.traveldocCoverImageUrl = traveldocCoverImageUrl == null ? null : traveldocCoverImageUrl.trim();
    }

    public String getUserPhotoImageUrl() {
        return userPhotoImageUrl;
    }

    public void setUserPhotoImageUrl(String userPhotoImageUrl) {
        this.userPhotoImageUrl = userPhotoImageUrl == null ? null : userPhotoImageUrl.trim();
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