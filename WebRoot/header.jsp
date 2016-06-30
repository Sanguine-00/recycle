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

		<title>My JSP 'header.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

		<link rel="stylesheet" href="css/main.css" type="text/css"></link>
	</head>

	<body>
		<div id="header">

			<div id="headerTop">
				<div id="logo">
					<img alt="logo" src="images/xbb_01.jpg">
				</div>
				<div id="date">
					<span>2016年06月30日 星期四</span>
				</div>
				<div id="weather">
					<iframe allowtransparency="true" scrolling="no"
						src="http://tianqi.2345.com/plugin/widget/index.htm?s=3&amp;z=2&amp;t=0&amp;v=0&amp;d=3&amp;bd=0&amp;k=&amp;f=&amp;q=1&amp;e=1&amp;a=1&amp;c=54511&amp;w=180&amp;h=36&amp;align=center"
						frameborder="0" height="36" width="190"></iframe>
				</div>
				<div id="seacher">
					<table class="search" align="center" cellpadding="0"
						cellspacing="0">
						<tbody>
							<tr>
								<td>
									<input name="searchword" class="searchKeyWord" type="text">
								</td>
								<td>
									<input value="" class="searchBtn" type="submit">
								</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
			<div class="clear"></div>
			<div id="headerMenu">
				<ul class="navi">
					<li>
						<a href="" target="_parent">要闻</a>
					</li>
					<li>
						<a href="" target="_parent">舆情</a>
					</li>
					<li>
						<a href="" target="_parent">深度</a>
					</li>
					<li>
						<a href="" target="_parent">专家</a>
					</li>
					<li>
						<a href="" target="_parent">人物</a>
					</li>
					<li>
						<a href="" target="_parent">视线</a>
					</li>
				</ul>
				<ul class="navi">
					<li>
						<a href="" target="_parent">要闻</a>
					</li>
					<li>
						<a href="" target="_parent">舆情</a>
					</li>
					<li>
						<a href="" target="_parent">深度</a>
					</li>
					<li>
						<a href="" target="_parent">专家</a>
					</li>
					<li>
						<a href="" target="_parent">人物</a>
					</li>
					<li>
						<a href="" target="_parent">视线</a>
					</li>
				</ul>
				<ul class="navi">
					<li>
						<a href="" target="_parent">要闻</a>
					</li>
					<li>
						<a href="" target="_parent">舆情</a>
					</li>
					<li>
						<a href="" target="_parent">深度</a>
					</li>
					<li>
						<a href="" target="_parent">专家</a>
					</li>
					<li>
						<a href="" target="_parent">人物</a>
					</li>
					<li>
						<a href="" target="_parent">视线</a>
					</li>
				</ul>
				<ul class="navi">
					<li>
						<a href="" target="_parent">要闻</a>
					</li>
					<li>
						<a href="" target="_parent">舆情</a>
					</li>
					<li>
						<a href="" target="_parent">深度</a>
					</li>
					<li>
						<a href="" target="_parent">专家</a>
					</li>
					<li>
						<a href="" target="_parent">人物</a>
					</li>
					<li>
						<a href="" target="_parent">视线</a>
					</li>
				</ul>
				<ul class="navi_right">
					<li>
						<a href="" target="_parent">right1</a>
					</li>
					<li>
						<a href="" target="_parent">right2</a>
					</li>
					<li>
						<a href="" target="_parent">right2</a>
					</li>
					<li>
						<a href="" target="_parent">right3</a>
					</li>
				</ul>
				
					<ul class="navi_end">
					<li>
						<a href="" target="_parent">要闻</a>
					</li>
					<li>
						<a href="" target="_parent">舆情</a>
					</li>
				</ul>


			</div>
		</div>
	</body>
</html>
