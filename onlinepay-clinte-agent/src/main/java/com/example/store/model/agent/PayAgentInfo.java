package com.example.store.model.agent;

import java.io.Serializable;
import java.util.Date;

public class PayAgentInfo implements Serializable {
    private Integer id;

    private String agentNo;

    private String agentName;

    private String agentStatus;

    private String agentPhone;

    private String agentEmail;

    private String agentUser;

    private String agentMobile;

    private String agentIdcardno;

    private String agentLicence;

    private String agentProvince;

    private String agentCity;

    private String agentDiscount;

    private String agentAddress;

    private Date agentCreatedate;

    private Date agentUpdatedate;

    private String agentExpends;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAgentNo() {
        return agentNo;
    }

    public void setAgentNo(String agentNo) {
        this.agentNo = agentNo == null ? null : agentNo.trim();
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName == null ? null : agentName.trim();
    }

    public String getAgentStatus() {
        return agentStatus;
    }

    public void setAgentStatus(String agentStatus) {
        this.agentStatus = agentStatus == null ? null : agentStatus.trim();
    }

    public String getAgentPhone() {
        return agentPhone;
    }

    public void setAgentPhone(String agentPhone) {
        this.agentPhone = agentPhone == null ? null : agentPhone.trim();
    }

    public String getAgentEmail() {
        return agentEmail;
    }

    public void setAgentEmail(String agentEmail) {
        this.agentEmail = agentEmail == null ? null : agentEmail.trim();
    }

    public String getAgentUser() {
        return agentUser;
    }

    public void setAgentUser(String agentUser) {
        this.agentUser = agentUser == null ? null : agentUser.trim();
    }

    public String getAgentMobile() {
        return agentMobile;
    }

    public void setAgentMobile(String agentMobile) {
        this.agentMobile = agentMobile == null ? null : agentMobile.trim();
    }

    public String getAgentIdcardno() {
        return agentIdcardno;
    }

    public void setAgentIdcardno(String agentIdcardno) {
        this.agentIdcardno = agentIdcardno == null ? null : agentIdcardno.trim();
    }

    public String getAgentLicence() {
        return agentLicence;
    }

    public void setAgentLicence(String agentLicence) {
        this.agentLicence = agentLicence == null ? null : agentLicence.trim();
    }

    public String getAgentProvince() {
        return agentProvince;
    }

    public void setAgentProvince(String agentProvince) {
        this.agentProvince = agentProvince == null ? null : agentProvince.trim();
    }

    public String getAgentCity() {
        return agentCity;
    }

    public void setAgentCity(String agentCity) {
        this.agentCity = agentCity == null ? null : agentCity.trim();
    }

    public String getAgentDiscount() {
        return agentDiscount;
    }

    public void setAgentDiscount(String agentDiscount) {
        this.agentDiscount = agentDiscount == null ? null : agentDiscount.trim();
    }

    public String getAgentAddress() {
        return agentAddress;
    }

    public void setAgentAddress(String agentAddress) {
        this.agentAddress = agentAddress == null ? null : agentAddress.trim();
    }

    public Date getAgentCreatedate() {
        return agentCreatedate;
    }

    public void setAgentCreatedate(Date agentCreatedate) {
        this.agentCreatedate = agentCreatedate;
    }

    public Date getAgentUpdatedate() {
        return agentUpdatedate;
    }

    public void setAgentUpdatedate(Date agentUpdatedate) {
        this.agentUpdatedate = agentUpdatedate;
    }

    public String getAgentExpends() {
        return agentExpends;
    }

    public void setAgentExpends(String agentExpends) {
        this.agentExpends = agentExpends == null ? null : agentExpends.trim();
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
        PayAgentInfo other = (PayAgentInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAgentNo() == null ? other.getAgentNo() == null : this.getAgentNo().equals(other.getAgentNo()))
            && (this.getAgentName() == null ? other.getAgentName() == null : this.getAgentName().equals(other.getAgentName()))
            && (this.getAgentStatus() == null ? other.getAgentStatus() == null : this.getAgentStatus().equals(other.getAgentStatus()))
            && (this.getAgentPhone() == null ? other.getAgentPhone() == null : this.getAgentPhone().equals(other.getAgentPhone()))
            && (this.getAgentEmail() == null ? other.getAgentEmail() == null : this.getAgentEmail().equals(other.getAgentEmail()))
            && (this.getAgentUser() == null ? other.getAgentUser() == null : this.getAgentUser().equals(other.getAgentUser()))
            && (this.getAgentMobile() == null ? other.getAgentMobile() == null : this.getAgentMobile().equals(other.getAgentMobile()))
            && (this.getAgentIdcardno() == null ? other.getAgentIdcardno() == null : this.getAgentIdcardno().equals(other.getAgentIdcardno()))
            && (this.getAgentLicence() == null ? other.getAgentLicence() == null : this.getAgentLicence().equals(other.getAgentLicence()))
            && (this.getAgentProvince() == null ? other.getAgentProvince() == null : this.getAgentProvince().equals(other.getAgentProvince()))
            && (this.getAgentCity() == null ? other.getAgentCity() == null : this.getAgentCity().equals(other.getAgentCity()))
            && (this.getAgentDiscount() == null ? other.getAgentDiscount() == null : this.getAgentDiscount().equals(other.getAgentDiscount()))
            && (this.getAgentAddress() == null ? other.getAgentAddress() == null : this.getAgentAddress().equals(other.getAgentAddress()))
            && (this.getAgentCreatedate() == null ? other.getAgentCreatedate() == null : this.getAgentCreatedate().equals(other.getAgentCreatedate()))
            && (this.getAgentUpdatedate() == null ? other.getAgentUpdatedate() == null : this.getAgentUpdatedate().equals(other.getAgentUpdatedate()))
            && (this.getAgentExpends() == null ? other.getAgentExpends() == null : this.getAgentExpends().equals(other.getAgentExpends()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAgentNo() == null) ? 0 : getAgentNo().hashCode());
        result = prime * result + ((getAgentName() == null) ? 0 : getAgentName().hashCode());
        result = prime * result + ((getAgentStatus() == null) ? 0 : getAgentStatus().hashCode());
        result = prime * result + ((getAgentPhone() == null) ? 0 : getAgentPhone().hashCode());
        result = prime * result + ((getAgentEmail() == null) ? 0 : getAgentEmail().hashCode());
        result = prime * result + ((getAgentUser() == null) ? 0 : getAgentUser().hashCode());
        result = prime * result + ((getAgentMobile() == null) ? 0 : getAgentMobile().hashCode());
        result = prime * result + ((getAgentIdcardno() == null) ? 0 : getAgentIdcardno().hashCode());
        result = prime * result + ((getAgentLicence() == null) ? 0 : getAgentLicence().hashCode());
        result = prime * result + ((getAgentProvince() == null) ? 0 : getAgentProvince().hashCode());
        result = prime * result + ((getAgentCity() == null) ? 0 : getAgentCity().hashCode());
        result = prime * result + ((getAgentDiscount() == null) ? 0 : getAgentDiscount().hashCode());
        result = prime * result + ((getAgentAddress() == null) ? 0 : getAgentAddress().hashCode());
        result = prime * result + ((getAgentCreatedate() == null) ? 0 : getAgentCreatedate().hashCode());
        result = prime * result + ((getAgentUpdatedate() == null) ? 0 : getAgentUpdatedate().hashCode());
        result = prime * result + ((getAgentExpends() == null) ? 0 : getAgentExpends().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", agentNo=").append(agentNo);
        sb.append(", agentName=").append(agentName);
        sb.append(", agentStatus=").append(agentStatus);
        sb.append(", agentPhone=").append(agentPhone);
        sb.append(", agentEmail=").append(agentEmail);
        sb.append(", agentUser=").append(agentUser);
        sb.append(", agentMobile=").append(agentMobile);
        sb.append(", agentIdcardno=").append(agentIdcardno);
        sb.append(", agentLicence=").append(agentLicence);
        sb.append(", agentProvince=").append(agentProvince);
        sb.append(", agentCity=").append(agentCity);
        sb.append(", agentDiscount=").append(agentDiscount);
        sb.append(", agentAddress=").append(agentAddress);
        sb.append(", agentCreatedate=").append(agentCreatedate);
        sb.append(", agentUpdatedate=").append(agentUpdatedate);
        sb.append(", agentExpends=").append(agentExpends);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}