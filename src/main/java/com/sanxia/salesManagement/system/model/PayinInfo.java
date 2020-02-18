package com.sanxia.salesManagement.system.model;

import java.util.Date;

public class PayinInfo {
    private Integer id;

    private Date time;

    private Long payinMoney;

    private String origin;

    private Integer accountNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Long getPayinMoney() {
        return payinMoney;
    }

    public void setPayinMoney(Long payinMoney) {
        this.payinMoney = payinMoney;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }
}