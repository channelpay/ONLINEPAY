package com.example.store.model.agent;

import java.io.Serializable;
import java.util.Date;

public class PayAgentSttle implements Serializable {
    private Integer id;

    private Integer agentid;

    private String agCardno;

    private String agName;

    private String agBankcode;

    private String agBanktype;

    private String agBankprov;

    private String agBankcity;

    private String agBankdiscount;

    private String agBankname;

    private String agBankbranch;

    private String agBanksimple;

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

    public Integer getAgentid() {
        return agentid;
    }

    public void setAgentid(Integer agentid) {
        this.agentid = agentid;
    }

    public String getAgCardno() {
        return agCardno;
    }

    public void setAgCardno(String agCardno) {
        this.agCardno = agCardno == null ? null : agCardno.trim();
    }

    public String getAgName() {
        return agName;
    }

    public void setAgName(String agName) {
        this.agName = agName == null ? null : agName.trim();
    }

    public String getAgBankcode() {
        return agBankcode;
    }

    public void setAgBankcode(String agBankcode) {
        this.agBankcode = agBankcode == null ? null : agBankcode.trim();
    }

    public String getAgBanktype() {
        return agBanktype;
    }

    public void setAgBanktype(String agBanktype) {
        this.agBanktype = agBanktype == null ? null : agBanktype.trim();
    }

    public String getAgBankprov() {
        return agBankprov;
    }

    public void setAgBankprov(String agBankprov) {
        this.agBankprov = agBankprov == null ? null : agBankprov.trim();
    }

    public String getAgBankcity() {
        return agBankcity;
    }

    public void setAgBankcity(String agBankcity) {
        this.agBankcity = agBankcity == null ? null : agBankcity.trim();
    }

    public String getAgBankdiscount() {
        return agBankdiscount;
    }

    public void setAgBankdiscount(String agBankdiscount) {
        this.agBankdiscount = agBankdiscount == null ? null : agBankdiscount.trim();
    }

    public String getAgBankname() {
        return agBankname;
    }

    public void setAgBankname(String agBankname) {
        this.agBankname = agBankname == null ? null : agBankname.trim();
    }

    public String getAgBankbranch() {
        return agBankbranch;
    }

    public void setAgBankbranch(String agBankbranch) {
        this.agBankbranch = agBankbranch == null ? null : agBankbranch.trim();
    }

    public String getAgBanksimple() {
        return agBanksimple;
    }

    public void setAgBanksimple(String agBanksimple) {
        this.agBanksimple = agBanksimple == null ? null : agBanksimple.trim();
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
        PayAgentSttle other = (PayAgentSttle) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAgentid() == null ? other.getAgentid() == null : this.getAgentid().equals(other.getAgentid()))
            && (this.getAgCardno() == null ? other.getAgCardno() == null : this.getAgCardno().equals(other.getAgCardno()))
            && (this.getAgName() == null ? other.getAgName() == null : this.getAgName().equals(other.getAgName()))
            && (this.getAgBankcode() == null ? other.getAgBankcode() == null : this.getAgBankcode().equals(other.getAgBankcode()))
            && (this.getAgBanktype() == null ? other.getAgBanktype() == null : this.getAgBanktype().equals(other.getAgBanktype()))
            && (this.getAgBankprov() == null ? other.getAgBankprov() == null : this.getAgBankprov().equals(other.getAgBankprov()))
            && (this.getAgBankcity() == null ? other.getAgBankcity() == null : this.getAgBankcity().equals(other.getAgBankcity()))
            && (this.getAgBankdiscount() == null ? other.getAgBankdiscount() == null : this.getAgBankdiscount().equals(other.getAgBankdiscount()))
            && (this.getAgBankname() == null ? other.getAgBankname() == null : this.getAgBankname().equals(other.getAgBankname()))
            && (this.getAgBankbranch() == null ? other.getAgBankbranch() == null : this.getAgBankbranch().equals(other.getAgBankbranch()))
            && (this.getAgBanksimple() == null ? other.getAgBanksimple() == null : this.getAgBanksimple().equals(other.getAgBanksimple()))
            && (this.getAgCreatedate() == null ? other.getAgCreatedate() == null : this.getAgCreatedate().equals(other.getAgCreatedate()))
            && (this.getAgUpdatedate() == null ? other.getAgUpdatedate() == null : this.getAgUpdatedate().equals(other.getAgUpdatedate()))
            && (this.getAgExpends() == null ? other.getAgExpends() == null : this.getAgExpends().equals(other.getAgExpends()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAgentid() == null) ? 0 : getAgentid().hashCode());
        result = prime * result + ((getAgCardno() == null) ? 0 : getAgCardno().hashCode());
        result = prime * result + ((getAgName() == null) ? 0 : getAgName().hashCode());
        result = prime * result + ((getAgBankcode() == null) ? 0 : getAgBankcode().hashCode());
        result = prime * result + ((getAgBanktype() == null) ? 0 : getAgBanktype().hashCode());
        result = prime * result + ((getAgBankprov() == null) ? 0 : getAgBankprov().hashCode());
        result = prime * result + ((getAgBankcity() == null) ? 0 : getAgBankcity().hashCode());
        result = prime * result + ((getAgBankdiscount() == null) ? 0 : getAgBankdiscount().hashCode());
        result = prime * result + ((getAgBankname() == null) ? 0 : getAgBankname().hashCode());
        result = prime * result + ((getAgBankbranch() == null) ? 0 : getAgBankbranch().hashCode());
        result = prime * result + ((getAgBanksimple() == null) ? 0 : getAgBanksimple().hashCode());
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
        sb.append(", agentid=").append(agentid);
        sb.append(", agCardno=").append(agCardno);
        sb.append(", agName=").append(agName);
        sb.append(", agBankcode=").append(agBankcode);
        sb.append(", agBanktype=").append(agBanktype);
        sb.append(", agBankprov=").append(agBankprov);
        sb.append(", agBankcity=").append(agBankcity);
        sb.append(", agBankdiscount=").append(agBankdiscount);
        sb.append(", agBankname=").append(agBankname);
        sb.append(", agBankbranch=").append(agBankbranch);
        sb.append(", agBanksimple=").append(agBanksimple);
        sb.append(", agCreatedate=").append(agCreatedate);
        sb.append(", agUpdatedate=").append(agUpdatedate);
        sb.append(", agExpends=").append(agExpends);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}