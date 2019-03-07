package com.example.store.model;

import java.io.Serializable;
import java.util.Date;

public class BookStoreMessage implements Serializable {
    
    private Long bookStoreId;

    private String bookStoreType;

    private String bookStoreName;

    private String bookStorePhone;

    private Date bookStoreCreate;

    private String bookStoreAddress;

    private static final long serialVersionUID = 1L;

    public Long getBookStoreId() {
        return bookStoreId;
    }

    public void setBookStoreId(Long bookStoreId) {
        this.bookStoreId = bookStoreId;
    }

    public String getBookStoreType() {
        return bookStoreType;
    }

    public void setBookStoreType(String bookStoreType) {
        this.bookStoreType = bookStoreType == null ? null : bookStoreType.trim();
    }

    public String getBookStoreName() {
        return bookStoreName;
    }

    public void setBookStoreName(String bookStoreName) {
        this.bookStoreName = bookStoreName == null ? null : bookStoreName.trim();
    }

    public String getBookStorePhone() {
        return bookStorePhone;
    }

    public void setBookStorePhone(String bookStorePhone) {
        this.bookStorePhone = bookStorePhone == null ? null : bookStorePhone.trim();
    }

    public Date getBookStoreCreate() {
        return bookStoreCreate;
    }

    public void setBookStoreCreate(Date bookStoreCreate) {
        this.bookStoreCreate = bookStoreCreate;
    }

    public String getBookStoreAddress() {
        return bookStoreAddress;
    }

    public void setBookStoreAddress(String bookStoreAddress) {
        this.bookStoreAddress = bookStoreAddress == null ? null : bookStoreAddress.trim();
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
        BookStoreMessage other = (BookStoreMessage) that;
        return (this.getBookStoreId() == null ? other.getBookStoreId() == null : this.getBookStoreId().equals(other.getBookStoreId()))
            && (this.getBookStoreType() == null ? other.getBookStoreType() == null : this.getBookStoreType().equals(other.getBookStoreType()))
            && (this.getBookStoreName() == null ? other.getBookStoreName() == null : this.getBookStoreName().equals(other.getBookStoreName()))
            && (this.getBookStorePhone() == null ? other.getBookStorePhone() == null : this.getBookStorePhone().equals(other.getBookStorePhone()))
            && (this.getBookStoreCreate() == null ? other.getBookStoreCreate() == null : this.getBookStoreCreate().equals(other.getBookStoreCreate()))
            && (this.getBookStoreAddress() == null ? other.getBookStoreAddress() == null : this.getBookStoreAddress().equals(other.getBookStoreAddress()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBookStoreId() == null) ? 0 : getBookStoreId().hashCode());
        result = prime * result + ((getBookStoreType() == null) ? 0 : getBookStoreType().hashCode());
        result = prime * result + ((getBookStoreName() == null) ? 0 : getBookStoreName().hashCode());
        result = prime * result + ((getBookStorePhone() == null) ? 0 : getBookStorePhone().hashCode());
        result = prime * result + ((getBookStoreCreate() == null) ? 0 : getBookStoreCreate().hashCode());
        result = prime * result + ((getBookStoreAddress() == null) ? 0 : getBookStoreAddress().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bookStoreId=").append(bookStoreId);
        sb.append(", bookStoreType=").append(bookStoreType);
        sb.append(", bookStoreName=").append(bookStoreName);
        sb.append(", bookStorePhone=").append(bookStorePhone);
        sb.append(", bookStoreCreate=").append(bookStoreCreate);
        sb.append(", bookStoreAddress=").append(bookStoreAddress);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}