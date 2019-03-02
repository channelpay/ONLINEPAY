package com.example.store.model.channel;

public enum Channel {

    FLYPAY(1,"非凡之窗");

    private Integer channleId;
    private String channleName;

    Channel(Integer channleId,String channleName) {
        this.channleId = channleId;
        this.channleName = channleName;
    }

    public Integer getChannleId() {
        return channleId;
    }

    public void setChannleId(Integer channleId) {
        this.channleId = channleId;
    }

    public String getChannleName() {
        return channleName;
    }

    public void setChannleName(String channleName) {
        this.channleName = channleName;
    }
}
