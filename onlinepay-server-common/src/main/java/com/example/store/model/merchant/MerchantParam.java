package com.example.store.model.merchant;

import java.io.Serializable;
import java.util.Date;

public class MerchantParam implements Serializable {
    private Integer id;

    private Integer merchantId;

    private String merchantDeskey;

    private String merchantSignkey;

    private Date mercahntCreateDate;

    private Date mercahntUpdateDate;

    private String mercahntExpends;

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

    public String getMerchantDeskey() {
        return merchantDeskey;
    }

    public void setMerchantDeskey(String merchantDeskey) {
        this.merchantDeskey = merchantDeskey == null ? null : merchantDeskey.trim();
    }

    public String getMerchantSignkey() {
        return merchantSignkey;
    }

    public void setMerchantSignkey(String merchantSignkey) {
        this.merchantSignkey = merchantSignkey == null ? null : merchantSignkey.trim();
    }

    public Date getMercahntCreateDate() {
        return mercahntCreateDate;
    }

    public void setMercahntCreateDate(Date mercahntCreateDate) {
        this.mercahntCreateDate = mercahntCreateDate;
    }

    public Date getMercahntUpdateDate() {
        return mercahntUpdateDate;
    }

    public void setMercahntUpdateDate(Date mercahntUpdateDate) {
        this.mercahntUpdateDate = mercahntUpdateDate;
    }

    public String getMercahntExpends() {
        return mercahntExpends;
    }

    public void setMercahntExpends(String mercahntExpends) {
        this.mercahntExpends = mercahntExpends == null ? null : mercahntExpends.trim();
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
        MerchantParam other = (MerchantParam) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMerchantId() == null ? other.getMerchantId() == null : this.getMerchantId().equals(other.getMerchantId()))
            && (this.getMerchantDeskey() == null ? other.getMerchantDeskey() == null : this.getMerchantDeskey().equals(other.getMerchantDeskey()))
            && (this.getMerchantSignkey() == null ? other.getMerchantSignkey() == null : this.getMerchantSignkey().equals(other.getMerchantSignkey()))
            && (this.getMercahntCreateDate() == null ? other.getMercahntCreateDate() == null : this.getMercahntCreateDate().equals(other.getMercahntCreateDate()))
            && (this.getMercahntUpdateDate() == null ? other.getMercahntUpdateDate() == null : this.getMercahntUpdateDate().equals(other.getMercahntUpdateDate()))
            && (this.getMercahntExpends() == null ? other.getMercahntExpends() == null : this.getMercahntExpends().equals(other.getMercahntExpends()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMerchantId() == null) ? 0 : getMerchantId().hashCode());
        result = prime * result + ((getMerchantDeskey() == null) ? 0 : getMerchantDeskey().hashCode());
        result = prime * result + ((getMerchantSignkey() == null) ? 0 : getMerchantSignkey().hashCode());
        result = prime * result + ((getMercahntCreateDate() == null) ? 0 : getMercahntCreateDate().hashCode());
        result = prime * result + ((getMercahntUpdateDate() == null) ? 0 : getMercahntUpdateDate().hashCode());
        result = prime * result + ((getMercahntExpends() == null) ? 0 : getMercahntExpends().hashCode());
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
        sb.append(", merchantDeskey=").append(merchantDeskey);
        sb.append(", merchantSignkey=").append(merchantSignkey);
        sb.append(", mercahntCreateDate=").append(mercahntCreateDate);
        sb.append(", mercahntUpdateDate=").append(mercahntUpdateDate);
        sb.append(", mercahntExpends=").append(mercahntExpends);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}