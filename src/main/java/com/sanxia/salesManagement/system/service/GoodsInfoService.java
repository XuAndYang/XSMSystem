package com.sanxia.salesManagement.system.service;

public interface GoodsInfoService {

	String selectGoodsNameById(int goods_id);

	int selectRemainingById(int goods_id);

}
