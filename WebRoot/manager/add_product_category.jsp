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
		<title>DouPHP 管理中心 - 添加分类</title>
		<meta name="Copyright" content="Douco Design." />
		<link href="<%=basePath %>manager/css/public.css" rel="stylesheet" type="text/css">
		<script type="text/javascript" src="<%=basePath %>manager/js/jquery.min.js"></script>
		<script type="text/javascript" src="<%=basePath %>manager/js/jquery.upload.js"></script>
		<script type="text/javascript" src="<%=basePath %>manager/js/global.js"></script>
	</head>
	<body>
		<!-- 当前位置 -->
		<div id="urHere">
			DouPHP 管理中心
			<b></b><strong>添加分类</strong>
		</div>
		<div class="mainBox"
			style="height: auto !important; height: 550px; min-height: 550px;">
			<h3>
				<a href="findAllTypeInfo" class="actionBtn" target="main">商品分类</a>添加分类
			</h3>
			<form action="saveUpdatedTypeInfo?id=<s:property value='id'/>"
				method="post" enctype="multipart/form-data">
				<table width="100%" border="0" cellpadding="8" cellspacing="0"
					class="tableBasic">
					<tr>
						<td width="80" align="right">
							分类名称
						</td>
						<td>
							<input type="text" name="type" value='<s:property value="type"/>'
								size="40" class="inpMain" />
						</td>
					</tr>
					<tr>
						<td align="right">
							图片
						</td>
						<td>
							<input type="file" name="file" id="file" value=""
								onchange="$(uploadFile(this))">
							<input type="hidden" name="logo" id="logo"
								value='<s:property value="logo"/>'>
						</td>
					</tr>
					<tr>
						<td></td>
						<td>
							<input type="hidden" name="token" value="b9439ae8" />
							<input name="submit" class="btn" type="submit" value="提交" />
						</td>
					</tr>
				</table>
			</form>
		</div>
	</body>
</html>