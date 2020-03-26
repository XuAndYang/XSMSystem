package com.sanxia.salesManagement.system.controller;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sanxia.salesManagement.system.model.ChangeInfo;
import com.sanxia.salesManagement.system.model.CodeInfo;
import com.sanxia.salesManagement.system.model.TradeFinish;
import com.sanxia.salesManagement.system.service.ChangeInfoService;
import com.sanxia.salesManagement.system.service.GoodsInfoService;
import com.sanxia.salesManagement.system.service.TradeFinishService;

@Controller
@RequestMapping(value="/changeInfoController")
public class ChangeInfoController {
	@Autowired
	private ChangeInfoService changeInfoService;
	@Autowired
	private GoodsInfoService goodsInfoService;
	@Autowired
	private TradeFinishService tradeFinishService;
	
	//显示条形码信息列表
			@RequestMapping(value = "changeInfolist.do")
			public String list(HttpServletRequest request, HttpServletResponse response, HttpSession session, Model model)
					throws ServletException, IOException {
				// 1.接受数据
				// 3.调用业务
				List<ChangeInfo> changeInfoList = changeInfoService.queryAllChangeInfo();  //查询所有的商品信息数据
				model.addAttribute("changeInfoList", changeInfoList );     //数据返回前端

				return "view/changeInfo/changeInfoList";
			}
			//增加信息
			@RequestMapping(value = "addUI.do")
			public String addUI(HttpServletRequest request, HttpServletResponse response, HttpSession session, Model model)
					throws ServletException, IOException {
				 
				//跳转到增加的页面
				return "view/changeInfo/changeInfoAdd";
			}
			
			@RequestMapping(value = "add.do")
			public String add(HttpServletRequest req, HttpServletResponse resp, HttpSession session, Model model)
					throws ServletException, IOException, ParseException {
				String sale_id_str =req.getParameter("sale_id");
				int sale_id=Integer.parseInt(sale_id_str);
				TradeFinish tf=tradeFinishService.selectTradeBySaleId(sale_id);
				if(tf!=null) {
					String new_goods_id_str =req.getParameter("new_goods_id");
					int new_goods_id=Integer.parseInt(new_goods_id_str);	
					//查询商品名字
					String new_name=goodsInfoService.selectGoodsNameById(new_goods_id);
					String change_reason =req.getParameter("change_reason");
					Date time=new Date();
					//判断更换时间是否逾期(七天)
					//查询订单购买时间
					Date sale_time=tf.getTime();
					Calendar ca = Calendar.getInstance();
					ca.setTime(sale_time);
					ca.add(Calendar.DATE, 7);
					Date end_time = ca.getTime();
					String apply_status;
					if(time.before(end_time)) {
						 apply_status="已逾期";
					}else {
						 apply_status="处理中";
					}
					
					ChangeInfo c=new ChangeInfo();
					c.setApplyStatus(apply_status);
					c.setChangeReason(change_reason);
					c.setChangeTime(time);
					c.setNewGoodsId(new_goods_id);
					c.setNewGoodsName(new_name);
					c.setSaleId(sale_id);
					
					int n=changeInfoService.addChangeInfoByInfo(c);
					
				}else {
					List<ChangeInfo> changeInfoList = changeInfoService.queryAllChangeInfo();  //查询所有的商品信息数据
					model.addAttribute("changeInfoList", changeInfoList );     //数据返回前端

					return "view/changeInfo/changeInfoList";
				}
			
				
				List<ChangeInfo> changeInfoList = changeInfoService.queryAllChangeInfo();  //查询所有的商品信息数据
				model.addAttribute("changeInfoList", changeInfoList );     //数据返回前端

				return "view/changeInfo/changeInfoList";
				
			}

}
