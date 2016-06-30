<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'table.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

		<link rel="stylesheet" href="<%=basePath %>manager/css/bootstrap.css" type="text/css"></link>
	</head>

	<body>
		<table class="table table-striped table-bordered table-hover">
			<tr>
				<td>
					<a>网络营销之该如何打造吸引性的软文营销</a>
				</td>
				<td>
					<a>公司动态</a>
				</td>
				<td>
					2013-06-26
				</td>
				<td>
					<a>编辑</a> |
					<a>删除</a>
				</td>
			</tr>
			<tr>
				<td>
					<a>如何利用电子商务提升企业竞争力</a>
				</td>
				<td>
					<a>公司动态</a>
				</td>
				<td>
					2013-06-26
				</td>
				<td>
					<a>编辑</a> |
					<a>删除</a>
				</td>
			</tr>
			<tr>
				<td>
					<a>企业网站建设的重要性</a>
				</td>
				<td>
					<a>公司动态</a>
				</td>
				<td>
					2013-06-26
				</td>
				<td>
					<a>编辑</a> |
					<a>删除</a>
				</td>
			</tr>

		</table>
	</body>
</html>
