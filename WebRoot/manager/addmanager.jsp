<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>DouPHP 管理中心 - 网站管理员</title>
		<meta name="Copyright" content="Douco Design." />
		<link href="<%=basePath %>manager/css/public.css" rel="stylesheet" type="text/css">
		<script type="text/javascript" src="<%=basePath %>manager/js/jquery.min.js"></script>
		<script type="text/javascript" src="<%=basePath %>manager/js/global.js"></script>
	</head>
	<body>
		<!-- 当前位置 -->
		<div id="urHere">
			DouPHP 管理中心
			<b>></b><strong>网站管理员</strong>
		</div>
		<div id="manager" class="mainBox"
			style="height: auto !important; height: 550px; min-height: 550px;">
			<h3>
				<a href="findAllUsers" class="actionBtn" target="main">返回列表</a>网站管理员
			</h3>
			<form action="editUserResult" method="post" target="main">
				<table width="100%" border="0" cellpadding="8" cellspacing="0"
					class="tableBasic">
					<tr>
						<td width="100" align="right">
							名字:
						</td>
						<td>
							<input type="text" name="name" size="40" class="inpMain"
								value="${name }" />
						</td>
					</tr>
					<tr>
						<td width="100" align="right">
							角色:
						</td>
						<td>
							<s:radio list="#{2:'管理员',1:'普通用户',3:'会员用户'}" name="roleInfoId"
								value="roleInfoId"></s:radio>
						</td>
					</tr>
					<tr>
						<td width="100" align="right">
							手机号:
						</td>
						<td>
							<input type="text" name="phone" size="40" class="inpMain"
								value="${phone }" />
						</td>
					</tr>
					<tr>
						<td align="right">
							地址:
						</td>
						<td>
							<input type="text" name="address" size="40" class="inpMain"
								value="${address }" />
						</td>
					</tr>
					<tr>
						<td align="right">
							密码:
						</td>
						<td>
							<input type="password" name="password" size="40" class="inpMain"
								value="${password }" />
						</td>
					</tr>
					<!--<tr>
								<td align="right">
									确认密码
								</td>
								<td>
									<input type="password" name="password_confirm" size="40"
										class="inpMain" />
								</td>
							</tr>
							-->
					<tr>
						<td></td>
						<td>
							<input type="hidden" name="token" value="5a58b748" />
							<input type="submit" name="submit" class="btn" value="提交" />
						</td>
					</tr>
				</table>
			</form>
		</div>

	</body>
</html>