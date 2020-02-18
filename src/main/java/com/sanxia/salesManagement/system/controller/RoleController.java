package com.sanxia.salesManagement.system.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
import org.springframework.web.bind.annotation.RequestParam;

import com.sanxia.salesManagement.system.model.Role;
import com.sanxia.salesManagement.system.model.User;
import com.sanxia.salesManagement.system.service.RoleService;

import com.sanxia.salesManagement.system.service.UserService;

 
@Controller
@RequestMapping(value="/roleController")
public class RoleController {
	@Autowired
	private RoleService roleService;
	@Autowired
	private UserService userService;
	
//显示角色列表
	@RequestMapping(value = "rolelist.do")
	public String list(HttpServletRequest req, HttpServletResponse resp, Role role, Model model)
			throws ServletException, IOException {
		List<Role> roleList = roleService.queryAllRole();
		model.addAttribute("roleList", roleList);
		// for (User user2 : userList) {
		// System.out.println(user2);
		// }
		return "view/role/roleList";

	}
	
//增加角色信息
		@RequestMapping(value = "addUI.do")
		public String addUI(HttpServletRequest request, HttpServletResponse response, HttpSession session, Model model)
				throws ServletException, IOException {
			 
			//跳转到增加的页面
			return "view/role/roleAdd";
		}
		
		@RequestMapping(value = "add.do")
		public String add(HttpServletRequest req, HttpServletResponse resp, HttpSession session, Model model)
				throws ServletException, IOException, ParseException {
			String role_name =req.getParameter("role_name");
			String role_state =req.getParameter("role_state");
			
			Role role=new Role();
			role.setRoleName(role_name);
			role.setRoleState(role_state);
			int n=roleService.addRoleByRole(role);
			 
			//重新返回主页
			List<Role> roleList = roleService.queryAllRole();
			model.addAttribute("roleList", roleList);
			// 2.跳转页面
			return "view/role/roleList";
		}
		
//修改指定角色信息
		//跳转到编辑页面
		@RequestMapping(value="updateUI.do")
		public String updateUI(HttpServletRequest req, HttpServletResponse resp, HttpSession session,
				Model model){
			
			String roleIdStr= req.getParameter("roleId");
			int roleId=Integer.parseInt(roleIdStr);
	 
			Role role=roleService.queryRoleByRole_id(roleId);

			req.setAttribute("role",role);
			return "view/role/roleUpdate";
			
		}
		
		//修改用户信息
		@RequestMapping(value="update.do")
		public String update(HttpServletRequest req, HttpServletResponse resp, HttpSession session,
				Model model) throws ParseException{
			String role_name =req.getParameter("role_name");
			String role_state =req.getParameter("role_state");
			String roleIdStr= req.getParameter("role_id");
			int role_id=Integer.parseInt(roleIdStr);
			
			Role role=new Role();
			role.setRoleName(role_name);
			role.setRoleState(role_state);
			role.setRoleId(role_id);
			int n=roleService.updateRoleById(role);
			 
			//重新返回主页
			List<Role> roleList = roleService.queryAllRole();
			model.addAttribute("roleList", roleList);
			// 2.跳转页面
			return "view/role/roleList";
					
				}
//删除指定用户信息
		@RequestMapping(value ="deleteRole.do")
		public String delete(HttpServletRequest req, HttpServletResponse resp, User user, Model model,
				@RequestParam("roleId") String roleId) throws ServletException, IOException {
	//		System.out.println(roleId);
			int role_id = Integer.parseInt(roleId);
			int i = roleService.deleteRoleByRole_id(role_id);
			
			List<Role> roleList = roleService.queryAllRole();
			model.addAttribute("roleList", roleList);

			return "view/role/roleList";

		}
}
