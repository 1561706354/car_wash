package com.car_wash.pojo;

import java.util.Date;

public class RecordTable {
    private Integer recordId;

    private String recordUser;

    private String recordSite;

    private String recordPaymentMethod;

    private String recordConsumptionType;

    private Long recordConsumptionAmount;

    private Date recordPaymentTime;

    private String recordType;

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public String getRecordUser() {
        return recordUser;
    }

    public void setRecordUser(String recordUser) {
        this.recordUser = recordUser == null ? null : recordUser.trim();
    }

    public String getRecordSite() {
        return recordSite;
    }

    public void setRecordSite(String recordSite) {
        this.recordSite = recordSite == null ? null : recordSite.trim();
    }

    public String getRecordPaymentMethod() {
        return recordPaymentMethod;
    }

    public void setRecordPaymentMethod(String recordPaymentMethod) {
        this.recordPaymentMethod = recordPaymentMethod == null ? null : recordPaymentMethod.trim();
    }

    public String getRecordConsumptionType() {
        return recordConsumptionType;
    }

    public void setRecordConsumptionType(String recordConsumptionType) {
        this.recordConsumptionType = recordConsumptionType == null ? null : recordConsumptionType.trim();
    }

    public Long getRecordConsumptionAmount() {
        return recordConsumptionAmount;
    }

    public void setRecordConsumptionAmount(Long recordConsumptionAmount) {
        this.recordConsumptionAmount = recordConsumptionAmount;
    }

    public Date getRecordPaymentTime() {
        return recordPaymentTime;
    }

    public void setRecordPaymentTime(Date recordPaymentTime) {
        this.recordPaymentTime = recordPaymentTime;
    }

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType == null ? null : recordType.trim();
    }
}