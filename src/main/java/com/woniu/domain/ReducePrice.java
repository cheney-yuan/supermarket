package com.woniu.domain;

import java.io.Serializable;
import java.util.Date;

public class ReducePrice implements Serializable {
    private String rpId;

    private String productId;

    private String productName;

    private Double chagePrice;

    private Double vipPrice;

    private Date startDate;

    private Date endDate;

    private static final long serialVersionUID = 1L;

    public String getRpId() {
        return rpId;
    }

    public void setRpId(String rpId) {
        this.rpId = rpId == null ? null : rpId.trim();
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

    public Double getChagePrice() {
        return chagePrice;
    }

    public void setChagePrice(Double chagePrice) {
        this.chagePrice = chagePrice;
    }

    public Double getVipPrice() {
        return vipPrice;
    }

    public void setVipPrice(Double vipPrice) {
        this.vipPrice = vipPrice;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}