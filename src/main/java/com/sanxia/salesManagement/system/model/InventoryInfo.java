package com.sanxia.salesManagement.system.model;

import java.util.Date;

public class InventoryInfo {
    private Integer id;

    private Integer goodsId;

    private String goodsName;

    private Long purchasePrice;

    private Long purchaseTotal;

    private Integer remainingNumber;

    private Long saleTotal;

    private Long profit;

    private Date takeTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Long getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Long purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Long getPurchaseTotal() {
        return purchaseTotal;
    }

    public void setPurchaseTotal(Long purchaseTotal) {
        this.purchaseTotal = purchaseTotal;
    }

    public Integer getRemainingNumber() {
        return remainingNumber;
    }

    public void setRemainingNumber(Integer remainingNumber) {
        this.remainingNumber = remainingNumber;
    }

    public Long getSaleTotal() {
        return saleTotal;
    }

    public void setSaleTotal(Long saleTotal) {
        this.saleTotal = saleTotal;
    }

    public Long getProfit() {
        return profit;
    }

    public void setProfit(Long profit) {
        this.profit = profit;
    }

    public Date getTakeTime() {
        return takeTime;
    }

    public void setTakeTime(Date takeTime) {
        this.takeTime = takeTime;
    }
}