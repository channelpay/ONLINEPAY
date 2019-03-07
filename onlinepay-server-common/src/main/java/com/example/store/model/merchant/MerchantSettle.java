package com.example.store.model.merchant;

import java.io.Serializable;
import java.util.Date;

public class MerchantSettle implements Serializable {
    private Integer id;

    private Integer merchantId;

    private String merchantCardno;

    private String merchantName;

    private String merchantBankCode;

    private String merchantBankType;

    private String merchantBankName;

    private String merchantBankBranch;

    private String merchantBankProv;

    private String merchantBankCity;

    private String merchantBankDiscount;

    private String merchantBankSimple;

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

    public String getMerchantCardno() {
        return merchantCardno;
    }

    public void setMerchantCardno(String merchantCardno) {
        this.merchantCardno = merchantCardno == null ? null : merchantCardno.trim();
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName == null ? null : merchantName.trim();
    }

    public String getMerchantBankCode() {
        return merchantBankCode;
    }

    public void setMerchantBankCode(String merchantBankCode) {
        this.merchantBankCode = merchantBankCode == null ? null : merchantBankCode.trim();
    }

    public String getMerchantBankType() {
        return merchantBankType;
    }

    public void setMerchantBankType(String merchantBankType) {
        this.merchantBankType = merchantBankType == null ? null : merchantBankType.trim();
    }

    public String getMerchantBankName() {
        return merchantBankName;
    }

    public void setMerchantBankName(String merchantBankName) {
        this.merchantBankName = merchantBankName == null ? null : merchantBankName.trim();
    }

    public String getMerchantBankBranch() {
        return merchantBankBranch;
    }

    public void setMerchantBankBranch(String merchantBankBranch) {
        this.merchantBankBranch = merchantBankBranch == null ? null : merchantBankBranch.trim();
    }

    public String getMerchantBankProv() {
        return merchantBankProv;
    }

    public void setMerchantBankProv(String merchantBankProv) {
        this.merchantBankProv = merchantBankProv == null ? null : merchantBankProv.trim();
    }

    public String getMerchantBankCity() {
        return merchantBankCity;
    }

    public void setMerchantBankCity(String merchantBankCity) {
        this.merchantBankCity = merchantBankCity == null ? null : merchantBankCity.trim();
    }

    public String getMerchantBankDiscount() {
        return merchantBankDiscount;
    }

    public void setMerchantBankDiscount(String merchantBankDiscount) {
        this.merchantBankDiscount = merchantBankDiscount == null ? null : merchantBankDiscount.trim();
    }

    public String getMerchantBankSimple() {
        return merchantBankSimple;
    }

    public void setMerchantBankSimple(String merchantBankSimple) {
        this.merchantBankSimple = merchantBankSimple == null ? null : merchantBankSimple.trim();
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
        MerchantSettle other = (MerchantSettle) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMerchantId() == null ? other.getMerchantId() == null : this.getMerchantId().equals(other.getMerchantId()))
            && (this.getMerchantCardno() == null ? other.getMerchantCardno() == null : this.getMerchantCardno().equals(other.getMerchantCardno()))
            && (this.getMerchantName() == null ? other.getMerchantName() == null : this.getMerchantName().equals(other.getMerchantName()))
            && (this.getMerchantBankCode() == null ? other.getMerchantBankCode() == null : this.getMerchantBankCode().equals(other.getMerchantBankCode()))
            && (this.getMerchantBankType() == null ? other.getMerchantBankType() == null : this.getMerchantBankType().equals(other.getMerchantBankType()))
            && (this.getMerchantBankName() == null ? other.getMerchantBankName() == null : this.getMerchantBankName().equals(other.getMerchantBankName()))
            && (this.getMerchantBankBranch() == null ? other.getMerchantBankBranch() == null : this.getMerchantBankBranch().equals(other.getMerchantBankBranch()))
            && (this.getMerchantBankProv() == null ? other.getMerchantBankProv() == null : this.getMerchantBankProv().equals(other.getMerchantBankProv()))
            && (this.getMerchantBankCity() == null ? other.getMerchantBankCity() == null : this.getMerchantBankCity().equals(other.getMerchantBankCity()))
            && (this.getMerchantBankDiscount() == null ? other.getMerchantBankDiscount() == null : this.getMerchantBankDiscount().equals(other.getMerchantBankDiscount()))
            && (this.getMerchantBankSimple() == null ? other.getMerchantBankSimple() == null : this.getMerchantBankSimple().equals(other.getMerchantBankSimple()))
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
        result = prime * result + ((getMerchantCardno() == null) ? 0 : getMerchantCardno().hashCode());
        result = prime * result + ((getMerchantName() == null) ? 0 : getMerchantName().hashCode());
        result = prime * result + ((getMerchantBankCode() == null) ? 0 : getMerchantBankCode().hashCode());
        result = prime * result + ((getMerchantBankType() == null) ? 0 : getMerchantBankType().hashCode());
        result = prime * result + ((getMerchantBankName() == null) ? 0 : getMerchantBankName().hashCode());
        result = prime * result + ((getMerchantBankBranch() == null) ? 0 : getMerchantBankBranch().hashCode());
        result = prime * result + ((getMerchantBankProv() == null) ? 0 : getMerchantBankProv().hashCode());
        result = prime * result + ((getMerchantBankCity() == null) ? 0 : getMerchantBankCity().hashCode());
        result = prime * result + ((getMerchantBankDiscount() == null) ? 0 : getMerchantBankDiscount().hashCode());
        result = prime * result + ((getMerchantBankSimple() == null) ? 0 : getMerchantBankSimple().hashCode());
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
        sb.append(", merchantCardno=").append(merchantCardno);
        sb.append(", merchantName=").append(merchantName);
        sb.append(", merchantBankCode=").append(merchantBankCode);
        sb.append(", merchantBankType=").append(merchantBankType);
        sb.append(", merchantBankName=").append(merchantBankName);
        sb.append(", merchantBankBranch=").append(merchantBankBranch);
        sb.append(", merchantBankProv=").append(merchantBankProv);
        sb.append(", merchantBankCity=").append(merchantBankCity);
        sb.append(", merchantBankDiscount=").append(merchantBankDiscount);
        sb.append(", merchantBankSimple=").append(merchantBankSimple);
        sb.append(", merchantCreateDate=").append(merchantCreateDate);
        sb.append(", merchantUpdateDate=").append(merchantUpdateDate);
        sb.append(", merchantExplends=").append(merchantExplends);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}