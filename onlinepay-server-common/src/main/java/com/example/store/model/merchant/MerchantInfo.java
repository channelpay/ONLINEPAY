package com.example.store.model.merchant;

import java.io.Serializable;
import java.util.Date;

public class MerchantInfo implements Serializable {

    private Integer id;

    private Integer agentId;

    private String merchantNo;

    private String merchantName;

    private String merchantType;

    private String merchantStatus;

    private Integer mercahntPhone;

    private String merchantEmail;

    private String merchantUser;

    private Integer merchantMobile;

    private String merchantIdcardNo;

    private String merchantLicence;

    private String merchantProince;

    private String merchantCity;

    private String merchantDiscount;

    private String merchantAddress;

    private Date merchantUpdate;

    private String merchantCreate;

    private String merchantExpends;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo == null ? null : merchantNo.trim();
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName == null ? null : merchantName.trim();
    }

    public String getMerchantType() {
        return merchantType;
    }

    public void setMerchantType(String merchantType) {
        this.merchantType = merchantType == null ? null : merchantType.trim();
    }

    public String getMerchantStatus() {
        return merchantStatus;
    }

    public void setMerchantStatus(String merchantStatus) {
        this.merchantStatus = merchantStatus == null ? null : merchantStatus.trim();
    }

    public Integer getMercahntPhone() {
        return mercahntPhone;
    }

    public void setMercahntPhone(Integer mercahntPhone) {
        this.mercahntPhone = mercahntPhone;
    }

    public String getMerchantEmail() {
        return merchantEmail;
    }

    public void setMerchantEmail(String merchantEmail) {
        this.merchantEmail = merchantEmail == null ? null : merchantEmail.trim();
    }

    public String getMerchantUser() {
        return merchantUser;
    }

    public void setMerchantUser(String merchantUser) {
        this.merchantUser = merchantUser == null ? null : merchantUser.trim();
    }

    public Integer getMerchantMobile() {
        return merchantMobile;
    }

    public void setMerchantMobile(Integer merchantMobile) {
        this.merchantMobile = merchantMobile;
    }

    public String getMerchantIdcardNo() {
        return merchantIdcardNo;
    }

    public void setMerchantIdcardNo(String merchantIdcardNo) {
        this.merchantIdcardNo = merchantIdcardNo == null ? null : merchantIdcardNo.trim();
    }

    public String getMerchantLicence() {
        return merchantLicence;
    }

    public void setMerchantLicence(String merchantLicence) {
        this.merchantLicence = merchantLicence == null ? null : merchantLicence.trim();
    }

    public String getMerchantProince() {
        return merchantProince;
    }

    public void setMerchantProince(String merchantProince) {
        this.merchantProince = merchantProince == null ? null : merchantProince.trim();
    }

    public String getMerchantCity() {
        return merchantCity;
    }

    public void setMerchantCity(String merchantCity) {
        this.merchantCity = merchantCity == null ? null : merchantCity.trim();
    }

    public String getMerchantDiscount() {
        return merchantDiscount;
    }

    public void setMerchantDiscount(String merchantDiscount) {
        this.merchantDiscount = merchantDiscount == null ? null : merchantDiscount.trim();
    }

    public String getMerchantAddress() {
        return merchantAddress;
    }

    public void setMerchantAddress(String merchantAddress) {
        this.merchantAddress = merchantAddress == null ? null : merchantAddress.trim();
    }

    public Date getMerchantUpdate() {
        return merchantUpdate;
    }

    public void setMerchantUpdate(Date merchantUpdate) {
        this.merchantUpdate = merchantUpdate;
    }

    public String getMerchantCreate() {
        return merchantCreate;
    }

    public void setMerchantCreate(String merchantCreate) {
        this.merchantCreate = merchantCreate == null ? null : merchantCreate.trim();
    }

    public String getMerchantExpends() {
        return merchantExpends;
    }

    public void setMerchantExpends(String merchantExpends) {
        this.merchantExpends = merchantExpends == null ? null : merchantExpends.trim();
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
        MerchantInfo other = (MerchantInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAgentId() == null ? other.getAgentId() == null : this.getAgentId().equals(other.getAgentId()))
            && (this.getMerchantNo() == null ? other.getMerchantNo() == null : this.getMerchantNo().equals(other.getMerchantNo()))
            && (this.getMerchantName() == null ? other.getMerchantName() == null : this.getMerchantName().equals(other.getMerchantName()))
            && (this.getMerchantType() == null ? other.getMerchantType() == null : this.getMerchantType().equals(other.getMerchantType()))
            && (this.getMerchantStatus() == null ? other.getMerchantStatus() == null : this.getMerchantStatus().equals(other.getMerchantStatus()))
            && (this.getMercahntPhone() == null ? other.getMercahntPhone() == null : this.getMercahntPhone().equals(other.getMercahntPhone()))
            && (this.getMerchantEmail() == null ? other.getMerchantEmail() == null : this.getMerchantEmail().equals(other.getMerchantEmail()))
            && (this.getMerchantUser() == null ? other.getMerchantUser() == null : this.getMerchantUser().equals(other.getMerchantUser()))
            && (this.getMerchantMobile() == null ? other.getMerchantMobile() == null : this.getMerchantMobile().equals(other.getMerchantMobile()))
            && (this.getMerchantIdcardNo() == null ? other.getMerchantIdcardNo() == null : this.getMerchantIdcardNo().equals(other.getMerchantIdcardNo()))
            && (this.getMerchantLicence() == null ? other.getMerchantLicence() == null : this.getMerchantLicence().equals(other.getMerchantLicence()))
            && (this.getMerchantProince() == null ? other.getMerchantProince() == null : this.getMerchantProince().equals(other.getMerchantProince()))
            && (this.getMerchantCity() == null ? other.getMerchantCity() == null : this.getMerchantCity().equals(other.getMerchantCity()))
            && (this.getMerchantDiscount() == null ? other.getMerchantDiscount() == null : this.getMerchantDiscount().equals(other.getMerchantDiscount()))
            && (this.getMerchantAddress() == null ? other.getMerchantAddress() == null : this.getMerchantAddress().equals(other.getMerchantAddress()))
            && (this.getMerchantUpdate() == null ? other.getMerchantUpdate() == null : this.getMerchantUpdate().equals(other.getMerchantUpdate()))
            && (this.getMerchantCreate() == null ? other.getMerchantCreate() == null : this.getMerchantCreate().equals(other.getMerchantCreate()))
            && (this.getMerchantExpends() == null ? other.getMerchantExpends() == null : this.getMerchantExpends().equals(other.getMerchantExpends()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAgentId() == null) ? 0 : getAgentId().hashCode());
        result = prime * result + ((getMerchantNo() == null) ? 0 : getMerchantNo().hashCode());
        result = prime * result + ((getMerchantName() == null) ? 0 : getMerchantName().hashCode());
        result = prime * result + ((getMerchantType() == null) ? 0 : getMerchantType().hashCode());
        result = prime * result + ((getMerchantStatus() == null) ? 0 : getMerchantStatus().hashCode());
        result = prime * result + ((getMercahntPhone() == null) ? 0 : getMercahntPhone().hashCode());
        result = prime * result + ((getMerchantEmail() == null) ? 0 : getMerchantEmail().hashCode());
        result = prime * result + ((getMerchantUser() == null) ? 0 : getMerchantUser().hashCode());
        result = prime * result + ((getMerchantMobile() == null) ? 0 : getMerchantMobile().hashCode());
        result = prime * result + ((getMerchantIdcardNo() == null) ? 0 : getMerchantIdcardNo().hashCode());
        result = prime * result + ((getMerchantLicence() == null) ? 0 : getMerchantLicence().hashCode());
        result = prime * result + ((getMerchantProince() == null) ? 0 : getMerchantProince().hashCode());
        result = prime * result + ((getMerchantCity() == null) ? 0 : getMerchantCity().hashCode());
        result = prime * result + ((getMerchantDiscount() == null) ? 0 : getMerchantDiscount().hashCode());
        result = prime * result + ((getMerchantAddress() == null) ? 0 : getMerchantAddress().hashCode());
        result = prime * result + ((getMerchantUpdate() == null) ? 0 : getMerchantUpdate().hashCode());
        result = prime * result + ((getMerchantCreate() == null) ? 0 : getMerchantCreate().hashCode());
        result = prime * result + ((getMerchantExpends() == null) ? 0 : getMerchantExpends().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", agentId=").append(agentId);
        sb.append(", merchantNo=").append(merchantNo);
        sb.append(", merchantName=").append(merchantName);
        sb.append(", merchantType=").append(merchantType);
        sb.append(", merchantStatus=").append(merchantStatus);
        sb.append(", mercahntPhone=").append(mercahntPhone);
        sb.append(", merchantEmail=").append(merchantEmail);
        sb.append(", merchantUser=").append(merchantUser);
        sb.append(", merchantMobile=").append(merchantMobile);
        sb.append(", merchantIdcardNo=").append(merchantIdcardNo);
        sb.append(", merchantLicence=").append(merchantLicence);
        sb.append(", merchantProince=").append(merchantProince);
        sb.append(", merchantCity=").append(merchantCity);
        sb.append(", merchantDiscount=").append(merchantDiscount);
        sb.append(", merchantAddress=").append(merchantAddress);
        sb.append(", merchantUpdate=").append(merchantUpdate);
        sb.append(", merchantCreate=").append(merchantCreate);
        sb.append(", merchantExpends=").append(merchantExpends);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}