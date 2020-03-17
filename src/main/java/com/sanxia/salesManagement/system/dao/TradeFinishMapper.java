package com.sanxia.salesManagement.system.dao;

import com.sanxia.salesManagement.system.model.TradeFinish;

public interface TradeFinishMapper {
    int deleteByPrimaryKey(Integer tradeId);

    int insert(TradeFinish record);

    int insertSelective(TradeFinish record);

    TradeFinish selectByPrimaryKey(Integer tradeId);

    int updateByPrimaryKeySelective(TradeFinish record);

    int updateByPrimaryKey(TradeFinish record);
}