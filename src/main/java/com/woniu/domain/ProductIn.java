package com.woniu.domain;

import java.io.Serializable;
import java.util.Date;

public class ProductIn implements Serializable {
    private String piId;

    private Date piDate;

    private Double piAllprice;

    private String piPayway;

    private String piPay;

    private String staffId;

    private static final long serialVersionUID = 1L;

    public String getPiId() {
        return piId;
    }

    public void setPiId(String piId) {
        this.piId = piId == null ? null : piId.trim();
    }

    public Date getPiDate() {
        return piDate;
    }

    public void setPiDate(Date piDate) {
        this.piDate = piDate;
    }

    public Double getPiAllprice() {
        return piAllprice;
    }

    public void setPiAllprice(Double piAllprice) {
        this.piAllprice = piAllprice;
    }

    public String getPiPayway() {
        return piPayway;
    }

    public void setPiPayway(String piPayway) {
        this.piPayway = piPayway == null ? null : piPayway.trim();
    }

    public String getPiPay() {
        return piPay;
    }

    public void setPiPay(String piPay) {
        this.piPay = piPay == null ? null : piPay.trim();
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId == null ? null : staffId.trim();
    }
}