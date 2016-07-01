<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
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
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
		<link rel="stylesheet" href="css/main.css" type="text/css"></link>
		<link rel="stylesheet" href="css/index.css" type="text/css"></link>
		<link href="images/favicon.ico" rel="shutcut icon">

	</head>
	<body>

		<jsp:include page="header.jsp"></jsp:include>

		<div id="newsContent">

			<div id="newsLeft">
				<div class="current">
					当前位置
					<a href="<%=basePath%>">首页</a> >>
					<a href="findAllNewsById?id=<s:property value='id' />">要闻</a>
				</div>

				<div class="news_detail_main">
					<div class="news_title">
						<h1>
							${title }
						</h1>
						<p class="publicTime">
							时间:
							<s:property value="time" />
							发布者:
							<s:property value="userInfo.name" />
						</p>
					</div>
					<div class="news_content">
						<p>
							${content }
						</p>
					</div>
				</div>

			</div>
			<div id="newsRight">
				<ul>
					<li>
						<a href="#">新闻右边的列表</a>
					</li>
					<li>
						<a href="#">新闻右边的列表</a>
					</li>
					<li>
						<a href="#">新闻右边的列表</a>
					</li>
					<li>
						<a href="#">新闻右边的列表</a>
					</li>
					<li>
						<a href="#">新闻右边的列表</a>
					</li>
					<li>
						<a href="#">新闻右边的列表</a>
					</li>
					<li>
						<a href="#">新闻右边的列表</a>
					</li>
					<li>
						<a href="#">新闻右边的列表</a>
					</li>

				</ul>

			</div>


		</div>
		<div class="clear"></div>
		<jsp:include page="footer.jsp" flush="true"></jsp:include>

	</body>
</html>