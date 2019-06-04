package com.worxfr.pojo;

import java.util.Date;

public class Impermission {
    private Long id;

    private Long fromId;

    private Long toId;

    private Date impermissionTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFromId() {
        return fromId;
    }

    public void setFromId(Long fromId) {
        this.fromId = fromId;
    }

    public Long getToId() {
        return toId;
    }

    public void setToId(Long toId) {
        this.toId = toId;
    }

    public Date getImpermissionTime() {
        return impermissionTime;
    }

    public void setImpermissionTime(Date impermissionTime) {
        this.impermissionTime = impermissionTime;
    }
}