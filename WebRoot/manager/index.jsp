<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="/struts-dojo-tags" prefix="sx"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<sx:head />
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>DouPHP 管理中心</title>
		<meta name="Copyright" content="Douco Design." />
		<link href="<%=basePath %>manager/css/public.css" rel="stylesheet" type="text/css">
		<script type="text/javascript" src="<%=basePath %>manager/js/jquery.min.js"></script>
		<script type="text/javascript" src="<%=basePath %>manager/js/global.js"></script>
	</head>
	<body>
		<div id="dcWrap">
			<div id="dcHead">
				<div id="head">
					<div class="logo">
						<a href="manager/index.html">&lt;<img
								src="manager/images/dclogo.gif" alt="logo"> </a>
					</div>
					<div class="nav">
						<ul>
							<li class="M">
								<a href="JavaScript:void(0);" class="topAdd">新建</a>
								<div class="drop mTopad">
									<a href="addproduct.jsp" target="main">商品</a>
									<a href="editNewsById?id=-1" target="main">文章</a>
									<a href="editUserInfo?id=-1" target="main">管理员</a>
									<a href="link.html"></a>
								</div>
							</li>
						</ul>
						<ul class="navRight">
							<li>
								欢迎您!"${session.login.name}"

							</li>

							<li>
								<s:a href="logout?id=-2">退出</s:a>
							</li>
						</ul>
					</div>
				</div>
			</div>
			<!-- dcHead 结束 -->
			<div id="dcLeft">
				<div id="menu">
					<ul class="top">
						<li>
							<a href="<%=basePath %>manager/index.jsp" target="main"><i class="home"></i><em>管理首页</em>
							</a>
						</li>
					</ul>
					<ul>
						<li>
							<a href="findAllTypeInfo" target="main"><i class="productCat"></i><em>商品分类</em>
							</a>
						</li>
						<li>
							<a href="findAllBrandInfo" target="main"><i
								class="productCat"></i><em>商品品牌</em> </a>
						</li>
						<li>
							<a href="findAllProductInfo" target="main"><i class="product"></i><em>商品列表</em>
							</a>
						</li>
					</ul>
					<ul>
						<li>
							<a href="findAllNewsType" target="main"><i class="articleCat"></i><em>新闻分类</em>
							</a>
						</li>
						<li>
							<a href="findAllNews" target="main"><i class="article"></i><em>新闻列表</em>
							</a>
						</li>
					</ul>
					<ul class="bot">
						<li>
							<a href="<%=basePath %>manager/theme.html" target="main"><i class="theme"></i><em>设置模板</em>
							</a>
						</li>
						<li>
							<a href="findAllUsers" target="main"><i class="manager"></i><em>网站管理员</em>
							</a>
						</li>
					</ul>
				</div>
			</div>
			<div id="divMain">

				<iframe src="main.htm" name="main" id="iframepage" frameborder="0"
					marginheight="0" marginwidth="0" height="560" width="86%"
					scrolling="auto"></iframe>
			</div>
			<div class="clear"></div>
			<div id="dcFooter">
				<div id="footer">
					<div class="line"></div>
					<ul>
						<li>
							版权所有 © 2013-2015 漳州豆壳网络科技有限公司，并保留所有权利。
						</li>
					</ul>
				</div>
			</div>
			<!-- dcFooter 结束 -->
			<div class="clear"></div>
		</div>
		<!--
			
			注意  下面的代码是放在和iframe同一个页面调用,放在iframe的下面
			-->
		<script type="text/javascript">
	$("#iframepage").load(function() {
		var mainheight = $(this).contents().find("body").height() + 30;
		$(this).height(mainheight);
	})
</script>
		<!--<script src="http://www.mycodes.net/js/tongji.js"></script>
			<script src="http://www.mycodes.net/js/youxia.js"
				type="text/javascript"></script>
	-->
	</body>
</html>