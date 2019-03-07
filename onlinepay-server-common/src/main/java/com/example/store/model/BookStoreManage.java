package com.example.store.model;

import java.io.Serializable;
import java.util.Date;

public class BookStoreManage implements Serializable {
   
    private Long bookManageId;

    private String bookManageName;

    private Date bookManageBirth;

    private String bookManagePhone;

    private String bookManageAddress;

    private String bookManagePrimarykey;

    private String bookManagePassword;

    private Long bookManageMessid;

    private static final long serialVersionUID = 1L;

    public Long getBookManageId() {
        return bookManageId;
    }

    public void setBookManageId(Long bookManageId) {
        this.bookManageId = bookManageId;
    }

    public String getBookManageName() {
        return bookManageName;
    }

    public void setBookManageName(String bookManageName) {
        this.bookManageName = bookManageName == null ? null : bookManageName.trim();
    }

    public Date getBookManageBirth() {
        return bookManageBirth;
    }

    public void setBookManageBirth(Date bookManageBirth) {
        this.bookManageBirth = bookManageBirth;
    }

    public String getBookManagePhone() {
        return bookManagePhone;
    }

    public void setBookManagePhone(String bookManagePhone) {
        this.bookManagePhone = bookManagePhone == null ? null : bookManagePhone.trim();
    }

    public String getBookManageAddress() {
        return bookManageAddress;
    }

    public void setBookManageAddress(String bookManageAddress) {
        this.bookManageAddress = bookManageAddress == null ? null : bookManageAddress.trim();
    }

    public String getBookManagePrimarykey() {
        return bookManagePrimarykey;
    }

    public void setBookManagePrimarykey(String bookManagePrimarykey) {
        this.bookManagePrimarykey = bookManagePrimarykey == null ? null : bookManagePrimarykey.trim();
    }

    public String getBookManagePassword() {
        return bookManagePassword;
    }

    public void setBookManagePassword(String bookManagePassword) {
        this.bookManagePassword = bookManagePassword == null ? null : bookManagePassword.trim();
    }

    public Long getBookManageMessid() {
        return bookManageMessid;
    }

    public void setBookManageMessid(Long bookManageMessid) {
        this.bookManageMessid = bookManageMessid;
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
        BookStoreManage other = (BookStoreManage) that;
        return (this.getBookManageId() == null ? other.getBookManageId() == null : this.getBookManageId().equals(other.getBookManageId()))
            && (this.getBookManageName() == null ? other.getBookManageName() == null : this.getBookManageName().equals(other.getBookManageName()))
            && (this.getBookManageBirth() == null ? other.getBookManageBirth() == null : this.getBookManageBirth().equals(other.getBookManageBirth()))
            && (this.getBookManagePhone() == null ? other.getBookManagePhone() == null : this.getBookManagePhone().equals(other.getBookManagePhone()))
            && (this.getBookManageAddress() == null ? other.getBookManageAddress() == null : this.getBookManageAddress().equals(other.getBookManageAddress()))
            && (this.getBookManagePrimarykey() == null ? other.getBookManagePrimarykey() == null : this.getBookManagePrimarykey().equals(other.getBookManagePrimarykey()))
            && (this.getBookManagePassword() == null ? other.getBookManagePassword() == null : this.getBookManagePassword().equals(other.getBookManagePassword()))
            && (this.getBookManageMessid() == null ? other.getBookManageMessid() == null : this.getBookManageMessid().equals(other.getBookManageMessid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBookManageId() == null) ? 0 : getBookManageId().hashCode());
        result = prime * result + ((getBookManageName() == null) ? 0 : getBookManageName().hashCode());
        result = prime * result + ((getBookManageBirth() == null) ? 0 : getBookManageBirth().hashCode());
        result = prime * result + ((getBookManagePhone() == null) ? 0 : getBookManagePhone().hashCode());
        result = prime * result + ((getBookManageAddress() == null) ? 0 : getBookManageAddress().hashCode());
        result = prime * result + ((getBookManagePrimarykey() == null) ? 0 : getBookManagePrimarykey().hashCode());
        result = prime * result + ((getBookManagePassword() == null) ? 0 : getBookManagePassword().hashCode());
        result = prime * result + ((getBookManageMessid() == null) ? 0 : getBookManageMessid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bookManageId=").append(bookManageId);
        sb.append(", bookManageName=").append(bookManageName);
        sb.append(", bookManageBirth=").append(bookManageBirth);
        sb.append(", bookManagePhone=").append(bookManagePhone);
        sb.append(", bookManageAddress=").append(bookManageAddress);
        sb.append(", bookManagePrimarykey=").append(bookManagePrimarykey);
        sb.append(", bookManagePassword=").append(bookManagePassword);
        sb.append(", bookManageMessid=").append(bookManageMessid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}