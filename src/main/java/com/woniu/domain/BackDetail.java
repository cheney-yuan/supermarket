package com.woniu.domain;

import java.io.Serializable;

public class BackDetail implements Serializable {
    private String pbId;

    private String productId;

    private String productName;

    private Integer backNum;

    private String productUnit;

    private static final long serialVersionUID = 1L;

    public String getPbId() {
        return pbId;
    }

    public void setPbId(String pbId) {
        this.pbId = pbId == null ? null : pbId.trim();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public Integer getBackNum() {
        return backNum;
    }

    public void setBackNum(Integer backNum) {
        this.backNum = backNum;
    }

    public String getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit == null ? null : productUnit.trim();
    }
}