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
		<title>DouPHP 管理中心 - 文章分类</title>
		<meta name="Copyright" content="Douco Design." />
		<link href="<%=basePath %>manager/css/public.css" rel="stylesheet" type="text/css">
		<script type="text/javascript" src="<%=basePath %>manager/js/jquery.min.js"></script>
		<script type="text/javascript" src="<%=basePath %>manager/js/global.js"></script>
	</head>
	<body>

		<!-- 当前位置 -->
		<div id="urHere">
			DouPHP 管理中心
			<b>></b><strong>文章分类</strong>
		</div>
		<div class="mainBox"
			style="height: auto !important; height: 550px; min-height: 550px;">
			<h3>
				<a href="editNewsType?id=-1" target="main" class="actionBtn add">添加分类</a>文章分类
			</h3>
			<table width="100%" border="0" cellpadding="8" cellspacing="0"
				class="tableBasic">
				<tr>
					<th width="120" align="left">
						分类名称
					</th>
					<th align="left">
						别名
					</th>
					<th align="left">
						简单描述
					</th>
					<th width="80" align="center">
						操作
					</th>
				</tr>

				<s:iterator value="list" var="newsType" status="s">
					<tr>
						<td align="left">
							<a href='findNewsByTypeId?newsTypeId=<s:property value="id" />'><s:property value="name" /> </a>
						</td>
						<td>
							<s:property value="eName" />
						</td>
						<td>
							<s:property value="descpt" />
						</td>
						<td align="center">
							<a href='editNewsType?id=<s:property value="id" />'>编辑</a> |
							<a href='deleteNewsType?id=<s:property value="id" />'>删除</a>
						</td>
					</tr>
				</s:iterator>
			</table>
		</div>
	</body>
</html>