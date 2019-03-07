package com.example.store.model.product;

import java.io.Serializable;
import java.util.Date;

public class ProductInfo implements Serializable {

    private Integer id;

    private Integer saleid;

    private String productName;

    private String productCode;

    private String productUrl;

    private String productStatus;

    private Date productCreatedate;

    private Date productUpdatedate;

    private String productExpends;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSaleid() {
        return saleid;
    }

    public void setSaleid(Integer saleid) {
        this.saleid = saleid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    public String getProductUrl() {
        return productUrl;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl == null ? null : productUrl.trim();
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus == null ? null : productStatus.trim();
    }

    public Date getProductCreatedate() {
        return productCreatedate;
    }

    public void setProductCreatedate(Date productCreatedate) {
        this.productCreatedate = productCreatedate;
    }

    public Date getProductUpdatedate() {
        return productUpdatedate;
    }

    public void setProductUpdatedate(Date productUpdatedate) {
        this.productUpdatedate = productUpdatedate;
    }

    public String getProductExpends() {
        return productExpends;
    }

    public void setProductExpends(String productExpends) {
        this.productExpends = productExpends == null ? null : productExpends.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ProductInfo other = (ProductInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSaleid() == null ? other.getSaleid() == null : this.getSaleid().equals(other.getSaleid()))
            && (this.getProductName() == null ? other.getProductName() == null : this.getProductName().equals(other.getProductName()))
            && (this.getProductCode() == null ? other.getProductCode() == null : this.getProductCode().equals(other.getProductCode()))
            && (this.getProductUrl() == null ? other.getProductUrl() == null : this.getProductUrl().equals(other.getProductUrl()))
            && (this.getProductStatus() == null ? other.getProductStatus() == null : this.getProductStatus().equals(other.getProductStatus()))
            && (this.getProductCreatedate() == null ? other.getProductCreatedate() == null : this.getProductCreatedate().equals(other.getProductCreatedate()))
            && (this.getProductUpdatedate() == null ? other.getProductUpdatedate() == null : this.getProductUpdatedate().equals(other.getProductUpdatedate()))
            && (this.getProductExpends() == null ? other.getProductExpends() == null : this.getProductExpends().equals(other.getProductExpends()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSaleid() == null) ? 0 : getSaleid().hashCode());
        result = prime * result + ((getProductName() == null) ? 0 : getProductName().hashCode());
        result = prime * result + ((getProductCode() == null) ? 0 : getProductCode().hashCode());
        result = prime * result + ((getProductUrl() == null) ? 0 : getProductUrl().hashCode());
        result = prime * result + ((getProductStatus() == null) ? 0 : getProductStatus().hashCode());
        result = prime * result + ((getProductCreatedate() == null) ? 0 : getProductCreatedate().hashCode());
        result = prime * result + ((getProductUpdatedate() == null) ? 0 : getProductUpdatedate().hashCode());
        result = prime * result + ((getProductExpends() == null) ? 0 : getProductExpends().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", saleid=").append(saleid);
        sb.append(", productName=").append(productName);
        sb.append(", productCode=").append(productCode);
        sb.append(", productUrl=").append(productUrl);
        sb.append(", productStatus=").append(productStatus);
        sb.append(", productCreatedate=").append(productCreatedate);
        sb.append(", productUpdatedate=").append(productUpdatedate);
        sb.append(", productExpends=").append(productExpends);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}