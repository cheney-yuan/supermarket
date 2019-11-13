package com.woniu.domain;

import java.io.Serializable;

public class ProductInDetail implements Serializable {
    private String piId;

    private String productId;

    private String productName;

    private Integer productInNum;

    private Double importPrice;

    private String specification;

    private String supplierId;

    private static final long serialVersionUID = 1L;

    public String getPiId() {
        return piId;
    }

    public void setPiId(String piId) {
        this.piId = piId == null ? null : piId.trim();
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

    public Integer getProductInNum() {
        return productInNum;
    }

    public void setProductInNum(Integer productInNum) {
        this.productInNum = productInNum;
    }

    public Double getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(Double importPrice) {
        this.importPrice = importPrice;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification == null ? null : specification.trim();
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId == null ? null : supplierId.trim();
    }
}