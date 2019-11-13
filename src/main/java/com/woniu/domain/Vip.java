package com.woniu.domain;

import java.io.Serializable;
import java.util.Date;

public class Vip implements Serializable {
    private String vipId;

    private String vipName;

    private Integer vipScore;

    private String vipRank;

    private String vipPhone;

    private Date vipDate;

    private static final long serialVersionUID = 1L;

    public String getVipId() {
        return vipId;
    }

    public void setVipId(String vipId) {
        this.vipId = vipId == null ? null : vipId.trim();
    }

    public String getVipName() {
        return vipName;
    }

    public void setVipName(String vipName) {
        this.vipName = vipName == null ? null : vipName.trim();
    }

    public Integer getVipScore() {
        return vipScore;
    }

    public void setVipScore(Integer vipScore) {
        this.vipScore = vipScore;
    }

    public String getVipRank() {
        return vipRank;
    }

    public void setVipRank(String vipRank) {
        this.vipRank = vipRank == null ? null : vipRank.trim();
    }

    public String getVipPhone() {
        return vipPhone;
    }

    public void setVipPhone(String vipPhone) {
        this.vipPhone = vipPhone == null ? null : vipPhone.trim();
    }

    public Date getVipDate() {
        return vipDate;
    }

    public void setVipDate(Date vipDate) {
        this.vipDate = vipDate;
    }
}