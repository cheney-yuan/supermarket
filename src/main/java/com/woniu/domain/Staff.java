package com.woniu.domain;

import java.io.Serializable;
import java.util.Date;

public class Staff implements Serializable {
    private String staffId;

    private String staffName;

    private String staffSex;

    private String staffHome;

    private String staffDiploma;

    private Double staffSalary;

    private String staffDuty;

    private String staffPhone;

    private String staffAddress;

    private String staffIdcard;

    private Date staffHiredate;

    private Integer uid;

    private static final long serialVersionUID = 1L;

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId == null ? null : staffId.trim();
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    public String getStaffSex() {
        return staffSex;
    }

    public void setStaffSex(String staffSex) {
        this.staffSex = staffSex == null ? null : staffSex.trim();
    }

    public String getStaffHome() {
        return staffHome;
    }

    public void setStaffHome(String staffHome) {
        this.staffHome = staffHome == null ? null : staffHome.trim();
    }

    public String getStaffDiploma() {
        return staffDiploma;
    }

    public void setStaffDiploma(String staffDiploma) {
        this.staffDiploma = staffDiploma == null ? null : staffDiploma.trim();
    }

    public Double getStaffSalary() {
        return staffSalary;
    }

    public void setStaffSalary(Double staffSalary) {
        this.staffSalary = staffSalary;
    }

    public String getStaffDuty() {
        return staffDuty;
    }

    public void setStaffDuty(String staffDuty) {
        this.staffDuty = staffDuty == null ? null : staffDuty.trim();
    }

    public String getStaffPhone() {
        return staffPhone;
    }

    public void setStaffPhone(String staffPhone) {
        this.staffPhone = staffPhone == null ? null : staffPhone.trim();
    }

    public String getStaffAddress() {
        return staffAddress;
    }

    public void setStaffAddress(String staffAddress) {
        this.staffAddress = staffAddress == null ? null : staffAddress.trim();
    }

    public String getStaffIdcard() {
        return staffIdcard;
    }

    public void setStaffIdcard(String staffIdcard) {
        this.staffIdcard = staffIdcard == null ? null : staffIdcard.trim();
    }

    public Date getStaffHiredate() {
        return staffHiredate;
    }

    public void setStaffHiredate(Date staffHiredate) {
        this.staffHiredate = staffHiredate;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}