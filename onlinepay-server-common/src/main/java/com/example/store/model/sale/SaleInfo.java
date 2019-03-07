package com.example.store.model.sale;

import java.io.Serializable;
import java.util.Date;

public class SaleInfo implements Serializable {
    private Integer id;

    private String salename;

    private String saleshowname;

    private Date cratedate;

    private Date updatedate;

    private String expends;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSalename() {
        return salename;
    }

    public void setSalename(String salename) {
        this.salename = salename == null ? null : salename.trim();
    }

    public String getSaleshowname() {
        return saleshowname;
    }

    public void setSaleshowname(String saleshowname) {
        this.saleshowname = saleshowname == null ? null : saleshowname.trim();
    }

    public Date getCratedate() {
        return cratedate;
    }

    public void setCratedate(Date cratedate) {
        this.cratedate = cratedate;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    public String getExpends() {
        return expends;
    }

    public void setExpends(String expends) {
        this.expends = expends == null ? null : expends.trim();
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
        SaleInfo other = (SaleInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSalename() == null ? other.getSalename() == null : this.getSalename().equals(other.getSalename()))
            && (this.getSaleshowname() == null ? other.getSaleshowname() == null : this.getSaleshowname().equals(other.getSaleshowname()))
            && (this.getCratedate() == null ? other.getCratedate() == null : this.getCratedate().equals(other.getCratedate()))
            && (this.getUpdatedate() == null ? other.getUpdatedate() == null : this.getUpdatedate().equals(other.getUpdatedate()))
            && (this.getExpends() == null ? other.getExpends() == null : this.getExpends().equals(other.getExpends()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSalename() == null) ? 0 : getSalename().hashCode());
        result = prime * result + ((getSaleshowname() == null) ? 0 : getSaleshowname().hashCode());
        result = prime * result + ((getCratedate() == null) ? 0 : getCratedate().hashCode());
        result = prime * result + ((getUpdatedate() == null) ? 0 : getUpdatedate().hashCode());
        result = prime * result + ((getExpends() == null) ? 0 : getExpends().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", salename=").append(salename);
        sb.append(", saleshowname=").append(saleshowname);
        sb.append(", cratedate=").append(cratedate);
        sb.append(", updatedate=").append(updatedate);
        sb.append(", expends=").append(expends);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}