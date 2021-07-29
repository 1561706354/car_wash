package com.car_wash.pojo;

public class EquipmentTable {
    private String equipmentNumber;

    private String equipmentSite;

    private String equipmentParameter;

    private Long equipmentPrice;

    private String equipmentDescribe;

    private String equipmentType;

    public String getEquipmentNumber() {
        return equipmentNumber;
    }

    public void setEquipmentNumber(String equipmentNumber) {
        this.equipmentNumber = equipmentNumber == null ? null : equipmentNumber.trim();
    }

    public String getEquipmentSite() {
        return equipmentSite;
    }

    public void setEquipmentSite(String equipmentSite) {
        this.equipmentSite = equipmentSite == null ? null : equipmentSite.trim();
    }

    public String getEquipmentParameter() {
        return equipmentParameter;
    }

    public void setEquipmentParameter(String equipmentParameter) {
        this.equipmentParameter = equipmentParameter == null ? null : equipmentParameter.trim();
    }

    public Long getEquipmentPrice() {
        return equipmentPrice;
    }

    public void setEquipmentPrice(Long equipmentPrice) {
        this.equipmentPrice = equipmentPrice;
    }

    public String getEquipmentDescribe() {
        return equipmentDescribe;
    }

    public void setEquipmentDescribe(String equipmentDescribe) {
        this.equipmentDescribe = equipmentDescribe == null ? null : equipmentDescribe.trim();
    }

    public String getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType == null ? null : equipmentType.trim();
    }
}