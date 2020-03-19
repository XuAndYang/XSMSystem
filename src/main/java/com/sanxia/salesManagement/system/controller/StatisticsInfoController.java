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

import com.sanxia.salesManagement.system.model.OverInfo;
import com.sanxia.salesManagement.system.service.StatisticsInfoService;

@Controller
@RequestMapping(value="/statisticsInfoController")
public class StatisticsInfoController {
	@Autowired
	private StatisticsInfoService statisticsInfoService;
	
	//显示用户列表
			@RequestMapping(value = "statisticsInfolist.do")
			public String list(HttpServletRequest request, HttpServletResponse response, HttpSession session, Model model)
					throws ServletException, IOException {
				// 1.接受数据
				// 3.调用业务
//				List<OverInfo> overInfolist = overInfoService.queryAllOverInfo();
//				model.addAttribute("overInfolist", overInfolist);

				return "view/statisticsInfo/statisticsInfoList";

			}
}
