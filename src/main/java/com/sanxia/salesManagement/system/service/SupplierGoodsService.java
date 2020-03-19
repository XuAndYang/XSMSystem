package com.sanxia.salesManagement.system.service;

import java.math.BigDecimal;
import java.util.HashMap;

public interface SupplierGoodsService {

	BigDecimal selectPriceByIdAndTime(HashMap<String, Object> map);

	int selectNumberByIdAndTime(HashMap<String, Object> map);

}
