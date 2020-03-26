package com.sanxia.salesManagement.system.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sanxia.salesManagement.system.model.TradeFinish;
import com.sanxia.salesManagement.system.service.TradeFinishService;
@Controller
@RequestMapping(value="/tradeFinishController")
public class TradeFinishController {
	@Autowired
	private TradeFinishService tradeFinishService;
	//显示完成订单信息
	@RequestMapping(value = "tradeFinishlist.do")
	public String list(HttpServletRequest request, HttpServletResponse response, HttpSession session, Model model)
			throws ServletException, IOException {
		// 1.接受数据
		// 3.调用业务
		List<TradeFinish> tradeFinishlist = tradeFinishService.queryAllTradeFinish();  //查询所有的交易完成信息数据
		model.addAttribute("tradeFinishlist", tradeFinishlist );     //数据返回前端
		
		// 2.跳转页面
		return "view/tradeFinish/tradeFinishList";
	}
}
