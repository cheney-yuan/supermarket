package com.woniu.domain;

import java.io.Serializable;
import java.util.Date;

public class Sale implements Serializable {
    private String saleId;

    private Double saleAllprice;

    private Date saleDate;

    private String staffId;

    private static final long serialVersionUID = 1L;

    public String getSaleId() {
        return saleId;
    }

    public void setSaleId(String saleId) {
        this.saleId = saleId == null ? null : saleId.trim();
    }

    public Double getSaleAllprice() {
        return saleAllprice;
    }

    public void setSaleAllprice(Double saleAllprice) {
        this.saleAllprice = saleAllprice;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId == null ? null : staffId.trim();
    }
}