package com.sanxia.salesManagement.system.service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

import com.sanxia.salesManagement.system.model.SaleInfo;
import com.sanxia.salesManagement.system.model.TradeFinish;

public interface TradeFinishService {

	int selectSaleNumByIdAndTime(HashMap<String, Object> map);

	BigDecimal selectSalePriceByIdAndTime(HashMap<String, Object> map);
	
	List<TradeFinish> queryAllTradeFinish();
 
	int addTradeFinishBySaleInfo(TradeFinish tf);

	int deleteTradeFinishBySaleId(int sale_id);

	TradeFinish selectTradeBySaleId(int sale_id);

}