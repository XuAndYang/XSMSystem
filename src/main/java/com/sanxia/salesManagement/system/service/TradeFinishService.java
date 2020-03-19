package com.sanxia.salesManagement.system.service;

import java.math.BigDecimal;
import java.util.HashMap;

public interface TradeFinishService {

	int selectSaleNumByIdAndTime(HashMap<String, Object> map);

	BigDecimal selectSalePriceByIdAndTime(HashMap<String, Object> map);

}
