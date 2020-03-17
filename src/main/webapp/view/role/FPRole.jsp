<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
          <base href="<%=basePath%>" />
        <meta charset="UTF-8">
        <title>欢迎页面-X-admin2.2</title>
        <meta name="renderer" content="webkit">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
        <link rel="stylesheet" href="./css/font.css">
        <link rel="stylesheet" href="./css/xadmin.css">
        <script type="text/javascript" src="./lib/layui/layui.js" charset="utf-8"></script>
        <script type="text/javascript" src="./js/xadmin.js"></script>
        <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
        <!--[if lt IE 9]>
            <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
            <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
      
    </head>
    <body>
        <div class="layui-fluid">
            <div class="layui-row">
                <form class="layui-form" action="<%=basePath%>roleController/FPRole.do">
                <input type="hidden" name="userId" value="${user.userId }">
                
                    <div class="panel admin-panel">
			<div class="panel-head" id="add">
				<strong><span class="icon-pencil-square-o"></span>分配角色: <font>
               ${user.name }</font></strong> ${message }
			</div>
			 
			<div class="body-content" style="margin-top: 40px">
				<c:forEach items="${roleList }" var="role">
					<div class="field">
						<input type="radio" name="roleId" value="${role.roleId }"
							style="width: auto;" id="${role.roleId }"
							<c:if test="${role.roleId==roleXZ.roleId}">checked="checked"</c:if>
							>${role.roleName }
						<div class="tips"></div>
					</div>
				</c:forEach>
			</div>
		</div>
                    
                    
                    <div class="layui-form-item" style="margin-top: 40px">
                        <label for="repassword" class="layui-form-label"></label>
                        <button class="layui-btn" lay-filter="add" lay-submit="" >确认分配</button></div>
                </form>
            </div>
        </div>
        
         <script>layui.use(['form', 'layer','jquery'],
            function() {
                $ = layui.jquery;
                var form = layui.form,
                layer = layui.layer;

                //自定义验证规则
                form.verify({
                	login_name: function(value) {
                        if (value.length < 5) {
                            return '昵称至少得5个字符啊';
                        }
                    },
                    password: [/(.+){6,12}$/, '密码必须6到12位'],
                    repassword: function(value) {
                        if ($('#password').val() != $('#repassword').val()) {
                            return '两次密码不一致';
                        }
                    }
                });

                //监听提交
                form.on('submit(add)',
                function(data) {
                    console.log(data);
                    //发异步，把数据提交给php
                   // layer.alert("增加成功", {
                   //     icon: 6
                   // },
                    //function() {
                      
                   // });
                    parent.parent.location.reload();
                    //关闭当前frame
                    xadmin.close();
                    // 可以对父窗口进行刷新 
                    //xadmin.father_reload();
                    //return false;
                });
                 
            });
        setTimeout(function(){
        	var id = document.getElementById('login_name');
            id.value='';
            var password = document.getElementById('password');
            password.value='';
        },506)
        
        </script>
        <script>var _hmt = _hmt || []; (function() {
                var hm = document.createElement("script");
                hm.src = "https://hm.baidu.com/hm.js?b393d153aeb26b46e9431fabaf0f6190";
                var s = document.getElementsByTagName("script")[0];
                s.parentNode.insertBefore(hm, s);
            })();</script>
    
       
    </body>

</html>