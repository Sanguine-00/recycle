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
		<title>DouPHP 管理中心 - 商品分类</title>
		<meta name="Copyright" content="Douco Design." />
		<link href="<%=basePath %>manager/css/public.css" rel="stylesheet" type="text/css">
		<script type="text/javascript" src="<%=basePath %>manager/js/jquery.min.js"></script>
		<script type="text/javascript" src="<%=basePath %>manager/js/global.js"></script>
	</head>
	<body>
		<div id="urHere">
			DouPHP 管理中心
			<b></b><strong>商品分类</strong>
		</div>
		<div class="mainBox"
			style="height: auto !important; height: 550px; min-height: 550px;">
			<h3>
				<a href="add_product_category.jsp" class="actionBtn add"
					target="main">添加分类</a>商品分类
			</h3>
			<table width="100%" border="0" cellpadding="8" cellspacing="0"
				class="tableBasic">
				<tr>
					<th width="120" align="left">
						分类名称
					</th>
					<th align="left">
						图片
					</th>
					<th width="80" align="center">
						操作
					</th>
				</tr>

				<s:iterator value="typeInfoList" var="typeInfo" status="status">
					<tr>
						<td align="center">
							<a href="product.php?cat_id=1"><s:property value="type" /> </a>
						</td>
						<td align="center">
							<img alt='<s:property value="type" />'
								src='upload/<s:property value="logo" />'>

						</td>

						<td align="center">
							<a href='editTypeInfoById?id=<s:property value="id" />'>编辑</a> |
							<a href='deleteTypeInfoById?id=<s:property value="id" />'>删除</a>
						</td>
					</tr>
				</s:iterator>
			</table>
		</div>
	</body>
</html>