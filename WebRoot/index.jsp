<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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

		<title>My JSP 'index.jsp' starting page</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<script type="text/javascript"
			src="http://www.francescomalagrino.com/BootstrapPageGenerator/3/js/jquery-2.0.0.min.js"></script>
		<script type="text/javascript"
			src="http://www.francescomalagrino.com/BootstrapPageGenerator/3/js/jquery-ui"></script>
		<link
			href="http://www.francescomalagrino.com/BootstrapPageGenerator/3/css/bootstrap-combined.min.css"
			rel="stylesheet" media="screen">
		<script type="text/javascript"
			src="http://www.francescomalagrino.com/BootstrapPageGenerator/3/js/bootstrap.min.js"></script>
		<link rel="stylesheet" href="css/main.css" type="text/css"></link>
		<link rel="stylesheet" href="css/index.css" type="text/css"></link>
		<script type="text/javascript" src="../js/bootstrap.js"></script>
		<script type="text/javascript" src="../js/npm.js"></script>
		<script type="text/javascript" src="../js/bootstrap.min.js"></script>
		<link rel="stylesheet" href="css/bootstrap-theme.css" type="text/css"></link>
		<link rel="stylesheet" href="css/bootstrap-theme.min.css"
			type="text/css"></link>
		<link rel="stylesheet" href="css/bootstrap.css" type="text/css"></link>
		<link href="images/favicon.ico" rel="shutcut icon">

	</head>

	<body>
		<div id="main">
			<jsp:include page="header.jsp"></jsp:include>
			<div id="content">
				<div>
					<iframe height="252px" width="1345px" frameborder="0"
						marginheight="0" marginwidth="0" scrolling="none"
						src="webpage.html"></iframe>
				</div>
				<div id="section-flow">
					<ul>
						<li>
							<i id="section-flow_one"></i>
							<span>1. 搜索机型</span>
						</li>
						<li>
							<i id="section-flow_two"></i>
							<span>2. 商家报价</span>
						</li>
						<li>
							<i id="section-flow_three"></i>
							<span>3. 提交订单</span>
						</li>
						<li>
							<i id="section-flow_four"></i>
							<span>4. 当面回收</span>
						</li>
					</ul>

				</div>

			</div>
			<div id="footer">
				<jsp:include page="footer.jsp"></jsp:include>
			</div>
		</div>
	</body>
</html>
