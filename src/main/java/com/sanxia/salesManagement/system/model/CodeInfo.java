package com.sanxia.salesManagement.system.model;

public class CodeInfo {
    private Integer id;

    private Integer goodsId;

    private String goodsName;

    private Long goodsPrice;

    private Integer goodsCode;

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

    public Long getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Long goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Integer getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(Integer goodsCode) {
        this.goodsCode = goodsCode;
    }
}