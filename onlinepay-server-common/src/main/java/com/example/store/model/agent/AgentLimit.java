package com.example.store.model.agent;

import java.io.Serializable;
import java.util.Date;

public class AgentLimit implements Serializable {
    private Integer id;

    private Integer agentId;

    private Integer productId;

    private String maxAmount;

    private String minAmount;

    private String agentT0Fee;

    private String agentT1Fee;

    private String agentFixFee;

    private Date agentCreatDate;

    private Date agentUpateDate;

    private String agentExpends;

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

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(String maxAmount) {
        this.maxAmount = maxAmount == null ? null : maxAmount.trim();
    }

    public String getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(String minAmount) {
        this.minAmount = minAmount == null ? null : minAmount.trim();
    }

    public String getAgentT0Fee() {
        return agentT0Fee;
    }

    public void setAgentT0Fee(String agentT0Fee) {
        this.agentT0Fee = agentT0Fee == null ? null : agentT0Fee.trim();
    }

    public String getAgentT1Fee() {
        return agentT1Fee;
    }

    public void setAgentT1Fee(String agentT1Fee) {
        this.agentT1Fee = agentT1Fee == null ? null : agentT1Fee.trim();
    }

    public String getAgentFixFee() {
        return agentFixFee;
    }

    public void setAgentFixFee(String agentFixFee) {
        this.agentFixFee = agentFixFee == null ? null : agentFixFee.trim();
    }

    public Date getAgentCreatDate() {
        return agentCreatDate;
    }

    public void setAgentCreatDate(Date agentCreatDate) {
        this.agentCreatDate = agentCreatDate;
    }

    public Date getAgentUpateDate() {
        return agentUpateDate;
    }

    public void setAgentUpateDate(Date agentUpateDate) {
        this.agentUpateDate = agentUpateDate;
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
        AgentLimit other = (AgentLimit) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAgentId() == null ? other.getAgentId() == null : this.getAgentId().equals(other.getAgentId()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getMaxAmount() == null ? other.getMaxAmount() == null : this.getMaxAmount().equals(other.getMaxAmount()))
            && (this.getMinAmount() == null ? other.getMinAmount() == null : this.getMinAmount().equals(other.getMinAmount()))
            && (this.getAgentT0Fee() == null ? other.getAgentT0Fee() == null : this.getAgentT0Fee().equals(other.getAgentT0Fee()))
            && (this.getAgentT1Fee() == null ? other.getAgentT1Fee() == null : this.getAgentT1Fee().equals(other.getAgentT1Fee()))
            && (this.getAgentFixFee() == null ? other.getAgentFixFee() == null : this.getAgentFixFee().equals(other.getAgentFixFee()))
            && (this.getAgentCreatDate() == null ? other.getAgentCreatDate() == null : this.getAgentCreatDate().equals(other.getAgentCreatDate()))
            && (this.getAgentUpateDate() == null ? other.getAgentUpateDate() == null : this.getAgentUpateDate().equals(other.getAgentUpateDate()))
            && (this.getAgentExpends() == null ? other.getAgentExpends() == null : this.getAgentExpends().equals(other.getAgentExpends()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAgentId() == null) ? 0 : getAgentId().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getMaxAmount() == null) ? 0 : getMaxAmount().hashCode());
        result = prime * result + ((getMinAmount() == null) ? 0 : getMinAmount().hashCode());
        result = prime * result + ((getAgentT0Fee() == null) ? 0 : getAgentT0Fee().hashCode());
        result = prime * result + ((getAgentT1Fee() == null) ? 0 : getAgentT1Fee().hashCode());
        result = prime * result + ((getAgentFixFee() == null) ? 0 : getAgentFixFee().hashCode());
        result = prime * result + ((getAgentCreatDate() == null) ? 0 : getAgentCreatDate().hashCode());
        result = prime * result + ((getAgentUpateDate() == null) ? 0 : getAgentUpateDate().hashCode());
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
        sb.append(", agentId=").append(agentId);
        sb.append(", productId=").append(productId);
        sb.append(", maxAmount=").append(maxAmount);
        sb.append(", minAmount=").append(minAmount);
        sb.append(", agentT0Fee=").append(agentT0Fee);
        sb.append(", agentT1Fee=").append(agentT1Fee);
        sb.append(", agentFixFee=").append(agentFixFee);
        sb.append(", agentCreatDate=").append(agentCreatDate);
        sb.append(", agentUpateDate=").append(agentUpateDate);
        sb.append(", agentExpends=").append(agentExpends);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}