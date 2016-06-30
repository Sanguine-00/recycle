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
				<a href="editUserInfo?id=-1" class="actionBtn" target="main">添加管理员</a>网站管理员
			</h3>
			<table width="100%" border="0" cellpadding="8" cellspacing="0"
				class="tableBasic">
				<tr>
					<th width="30" align="center">
						编号
					</th>
					<th align="left">
						名称
					</th>
					<th align="center">
						手机号
					</th>
					<th align="center">
						地址
					</th>
					<th align="center">
						操作
					</th>
				</tr>

				<s:iterator value="list" var="userInfo" status="s">
					<tr>
						<td align="center">
							<s:property value="#s.count" />
						</td>
						<td>
							<s:property value="name" />
						</td>
						<td align="center">
							<s:property value="phone" />
						</td>
						<td align="center">
							<s:property value="address" />
						</td>
						<td align="center">
							<a href='editUserInfo?id=<s:property value="id" />' target="main">编辑</a>
							|
							<a href='deleteUserById?id=<s:property value="id" />'
								target="main">删除</a>
						</td>
					</tr>
				</s:iterator>
			</table>
		</div>
	</body>
</html>