package com.sanxia.salesManagement.system.controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sanxia.salesManagement.system.model.Permission;
import com.sanxia.salesManagement.system.model.Role;
import com.sanxia.salesManagement.system.service.PermissionService;
import com.sanxia.salesManagement.system.service.RoleService;



@Controller
@RequestMapping(value="/permissionController")
public class PermissionController {
	@Autowired
	private PermissionService permissionService;
	@Autowired
	private RoleService roleService;

//显示权限列表
	@RequestMapping(value = "permissionlist.do")
	public String list(HttpServletRequest req, HttpServletResponse resp, Permission permission, Model model)
			throws ServletException, IOException {
		List<Permission> permissionList = permissionService.queryAllPermission();
		model.addAttribute("permissionList", permissionList);
		// for (User user2 : userList) {
		// System.out.println(user2);
		// }
		return "view/permission/permissionList";

	}

//增加权限信息
			@RequestMapping(value = "addUI.do")
			public String addUI(HttpServletRequest request, HttpServletResponse response, HttpSession session, Model model)
					throws ServletException, IOException {
				 
				//跳转到增加的页面
				return "view/permission/permissionAdd";
			}
			
			@RequestMapping(value = "add.do")
			public String add(HttpServletRequest req, HttpServletResponse resp, HttpSession session, Model model)
					throws ServletException, IOException, ParseException {
				String permission_name =req.getParameter("permission_name");
				String permission_url =req.getParameter("permission_url");
				String permission_type =req.getParameter("type");
				
				String p_idstr =req.getParameter("p_id");
				int p_id=Integer.parseInt(p_idstr);
				
				
				
				Permission p=new Permission();
				p.setPermissionName(permission_name);
				p.setPermissionUrl(permission_url);
				p.setpId(p_id);
				p.setType(permission_type);
				int n=permissionService.addPermissionByPermission(p);
				 
				//重新返回主页
				List<Permission> permissionList = permissionService.queryAllPermission();
				model.addAttribute("permissionList", permissionList);
				 
				return "view/permission/permissionList";
			}


}
