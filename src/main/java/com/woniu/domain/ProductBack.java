package com.woniu.domain;

import java.io.Serializable;
import java.util.Date;

public class ProductBack implements Serializable {
    private String pbId;

    private Double pbAllprice;

    private Date pbDate;

    private String staffId;

    private static final long serialVersionUID = 1L;

    public String getPbId() {
        return pbId;
    }

    public void setPbId(String pbId) {
        this.pbId = pbId == null ? null : pbId.trim();
    }

    public Double getPbAllprice() {
        return pbAllprice;
    }

    public void setPbAllprice(Double pbAllprice) {
        this.pbAllprice = pbAllprice;
    }

    public Date getPbDate() {
        return pbDate;
    }

    public void setPbDate(Date pbDate) {
        this.pbDate = pbDate;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId == null ? null : staffId.trim();
    }
}