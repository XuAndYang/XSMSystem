package com.sanxia.salesManagement.system.model;

import java.util.Date;

public class PayoutInfo {
    private Integer id;

    private Date time;

    private Long payoutMoney;

    private String useWays;

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

    public Long getPayoutMoney() {
        return payoutMoney;
    }

    public void setPayoutMoney(Long payoutMoney) {
        this.payoutMoney = payoutMoney;
    }

    public String getUseWays() {
        return useWays;
    }

    public void setUseWays(String useWays) {
        this.useWays = useWays;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }
}