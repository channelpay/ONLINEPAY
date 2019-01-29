package com.example.store.model.agent;

import java.io.Serializable;
import java.util.Date;

public class PayAgentParam implements Serializable {
    private Integer id;

    private Integer agentId;

    private String agNo;

    private String agDeskey;

    private String agSignkey;

    private String agEmail;

    private String agMobile;

    private String agPassword;

    private Date agCreatedate;

    private Date agUpdatedate;

    private String agExpends;

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

    public String getAgNo() {
        return agNo;
    }

    public void setAgNo(String agNo) {
        this.agNo = agNo == null ? null : agNo.trim();
    }

    public String getAgDeskey() {
        return agDeskey;
    }

    public void setAgDeskey(String agDeskey) {
        this.agDeskey = agDeskey == null ? null : agDeskey.trim();
    }

    public String getAgSignkey() {
        return agSignkey;
    }

    public void setAgSignkey(String agSignkey) {
        this.agSignkey = agSignkey == null ? null : agSignkey.trim();
    }

    public String getAgEmail() {
        return agEmail;
    }

    public void setAgEmail(String agEmail) {
        this.agEmail = agEmail == null ? null : agEmail.trim();
    }

    public String getAgMobile() {
        return agMobile;
    }

    public void setAgMobile(String agMobile) {
        this.agMobile = agMobile == null ? null : agMobile.trim();
    }

    public String getAgPassword() {
        return agPassword;
    }

    public void setAgPassword(String agPassword) {
        this.agPassword = agPassword == null ? null : agPassword.trim();
    }

    public Date getAgCreatedate() {
        return agCreatedate;
    }

    public void setAgCreatedate(Date agCreatedate) {
        this.agCreatedate = agCreatedate;
    }

    public Date getAgUpdatedate() {
        return agUpdatedate;
    }

    public void setAgUpdatedate(Date agUpdatedate) {
        this.agUpdatedate = agUpdatedate;
    }

    public String getAgExpends() {
        return agExpends;
    }

    public void setAgExpends(String agExpends) {
        this.agExpends = agExpends == null ? null : agExpends.trim();
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
        PayAgentParam other = (PayAgentParam) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAgentId() == null ? other.getAgentId() == null : this.getAgentId().equals(other.getAgentId()))
            && (this.getAgNo() == null ? other.getAgNo() == null : this.getAgNo().equals(other.getAgNo()))
            && (this.getAgDeskey() == null ? other.getAgDeskey() == null : this.getAgDeskey().equals(other.getAgDeskey()))
            && (this.getAgSignkey() == null ? other.getAgSignkey() == null : this.getAgSignkey().equals(other.getAgSignkey()))
            && (this.getAgEmail() == null ? other.getAgEmail() == null : this.getAgEmail().equals(other.getAgEmail()))
            && (this.getAgMobile() == null ? other.getAgMobile() == null : this.getAgMobile().equals(other.getAgMobile()))
            && (this.getAgPassword() == null ? other.getAgPassword() == null : this.getAgPassword().equals(other.getAgPassword()))
            && (this.getAgCreatedate() == null ? other.getAgCreatedate() == null : this.getAgCreatedate().equals(other.getAgCreatedate()))
            && (this.getAgUpdatedate() == null ? other.getAgUpdatedate() == null : this.getAgUpdatedate().equals(other.getAgUpdatedate()))
            && (this.getAgExpends() == null ? other.getAgExpends() == null : this.getAgExpends().equals(other.getAgExpends()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAgentId() == null) ? 0 : getAgentId().hashCode());
        result = prime * result + ((getAgNo() == null) ? 0 : getAgNo().hashCode());
        result = prime * result + ((getAgDeskey() == null) ? 0 : getAgDeskey().hashCode());
        result = prime * result + ((getAgSignkey() == null) ? 0 : getAgSignkey().hashCode());
        result = prime * result + ((getAgEmail() == null) ? 0 : getAgEmail().hashCode());
        result = prime * result + ((getAgMobile() == null) ? 0 : getAgMobile().hashCode());
        result = prime * result + ((getAgPassword() == null) ? 0 : getAgPassword().hashCode());
        result = prime * result + ((getAgCreatedate() == null) ? 0 : getAgCreatedate().hashCode());
        result = prime * result + ((getAgUpdatedate() == null) ? 0 : getAgUpdatedate().hashCode());
        result = prime * result + ((getAgExpends() == null) ? 0 : getAgExpends().hashCode());
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
        sb.append(", agNo=").append(agNo);
        sb.append(", agDeskey=").append(agDeskey);
        sb.append(", agSignkey=").append(agSignkey);
        sb.append(", agEmail=").append(agEmail);
        sb.append(", agMobile=").append(agMobile);
        sb.append(", agPassword=").append(agPassword);
        sb.append(", agCreatedate=").append(agCreatedate);
        sb.append(", agUpdatedate=").append(agUpdatedate);
        sb.append(", agExpends=").append(agExpends);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}