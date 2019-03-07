package com.example.store.model.merchant;

import java.io.Serializable;
import java.util.Date;

public class MerchantLimit implements Serializable {
    private Integer id;

    private Integer merchantId;

    private Integer productId;

    private Double maxAmount;

    private Double minAmount;

    private Double merchantT0Fee;

    private Double merchantT1Fee;

    private Double merchantFixFee;

    private Date merchantCreateDate;

    private Date merchantUpdateDate;

    private String merchantExplends;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Double getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(Double maxAmount) {
        this.maxAmount = maxAmount;
    }

    public Double getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(Double minAmount) {
        this.minAmount = minAmount;
    }

    public Double getMerchantT0Fee() {
        return merchantT0Fee;
    }

    public void setMerchantT0Fee(Double merchantT0Fee) {
        this.merchantT0Fee = merchantT0Fee;
    }

    public Double getMerchantT1Fee() {
        return merchantT1Fee;
    }

    public void setMerchantT1Fee(Double merchantT1Fee) {
        this.merchantT1Fee = merchantT1Fee;
    }

    public Double getMerchantFixFee() {
        return merchantFixFee;
    }

    public void setMerchantFixFee(Double merchantFixFee) {
        this.merchantFixFee = merchantFixFee;
    }

    public Date getMerchantCreateDate() {
        return merchantCreateDate;
    }

    public void setMerchantCreateDate(Date merchantCreateDate) {
        this.merchantCreateDate = merchantCreateDate;
    }

    public Date getMerchantUpdateDate() {
        return merchantUpdateDate;
    }

    public void setMerchantUpdateDate(Date merchantUpdateDate) {
        this.merchantUpdateDate = merchantUpdateDate;
    }

    public String getMerchantExplends() {
        return merchantExplends;
    }

    public void setMerchantExplends(String merchantExplends) {
        this.merchantExplends = merchantExplends == null ? null : merchantExplends.trim();
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
        MerchantLimit other = (MerchantLimit) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMerchantId() == null ? other.getMerchantId() == null : this.getMerchantId().equals(other.getMerchantId()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getMaxAmount() == null ? other.getMaxAmount() == null : this.getMaxAmount().equals(other.getMaxAmount()))
            && (this.getMinAmount() == null ? other.getMinAmount() == null : this.getMinAmount().equals(other.getMinAmount()))
            && (this.getMerchantT0Fee() == null ? other.getMerchantT0Fee() == null : this.getMerchantT0Fee().equals(other.getMerchantT0Fee()))
            && (this.getMerchantT1Fee() == null ? other.getMerchantT1Fee() == null : this.getMerchantT1Fee().equals(other.getMerchantT1Fee()))
            && (this.getMerchantFixFee() == null ? other.getMerchantFixFee() == null : this.getMerchantFixFee().equals(other.getMerchantFixFee()))
            && (this.getMerchantCreateDate() == null ? other.getMerchantCreateDate() == null : this.getMerchantCreateDate().equals(other.getMerchantCreateDate()))
            && (this.getMerchantUpdateDate() == null ? other.getMerchantUpdateDate() == null : this.getMerchantUpdateDate().equals(other.getMerchantUpdateDate()))
            && (this.getMerchantExplends() == null ? other.getMerchantExplends() == null : this.getMerchantExplends().equals(other.getMerchantExplends()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMerchantId() == null) ? 0 : getMerchantId().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getMaxAmount() == null) ? 0 : getMaxAmount().hashCode());
        result = prime * result + ((getMinAmount() == null) ? 0 : getMinAmount().hashCode());
        result = prime * result + ((getMerchantT0Fee() == null) ? 0 : getMerchantT0Fee().hashCode());
        result = prime * result + ((getMerchantT1Fee() == null) ? 0 : getMerchantT1Fee().hashCode());
        result = prime * result + ((getMerchantFixFee() == null) ? 0 : getMerchantFixFee().hashCode());
        result = prime * result + ((getMerchantCreateDate() == null) ? 0 : getMerchantCreateDate().hashCode());
        result = prime * result + ((getMerchantUpdateDate() == null) ? 0 : getMerchantUpdateDate().hashCode());
        result = prime * result + ((getMerchantExplends() == null) ? 0 : getMerchantExplends().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", merchantId=").append(merchantId);
        sb.append(", productId=").append(productId);
        sb.append(", maxAmount=").append(maxAmount);
        sb.append(", minAmount=").append(minAmount);
        sb.append(", merchantT0Fee=").append(merchantT0Fee);
        sb.append(", merchantT1Fee=").append(merchantT1Fee);
        sb.append(", merchantFixFee=").append(merchantFixFee);
        sb.append(", merchantCreateDate=").append(merchantCreateDate);
        sb.append(", merchantUpdateDate=").append(merchantUpdateDate);
        sb.append(", merchantExplends=").append(merchantExplends);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}