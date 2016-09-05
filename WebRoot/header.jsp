<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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

		<title>My JSP 'header.jsp' starting page</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<script type="text/javascript"
			src="http://www.francescomalagrino.com/BootstrapPageGenerator/3/js/jquery-2.0.0.min.js"></script>
		<script type="text/javascript"
			src="http://www.francescomalagrino.com/BootstrapPageGenerator/3/js/jquery-ui"></script>
		<link
			href="http://www.francescomalagrino.com/BootstrapPageGenerator/3/css/bootstrap-combined.min.css"
			rel="stylesheet" media="screen">
		<script type="text/javascript"
			src="http://www.francescomalagrino.com/BootstrapPageGenerator/3/js/bootstrap.min.js"></script>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

		<link rel="stylesheet" href="css/header.aboutme.css" type="text/css"></link>
	</head>

	<body>
		<div id="header">
			<div class="navbar">
				<div class="navbar-content">
					<div id="region-selection" data-currentid="1">
						南京
					</div>


					<div id="region-selection" data-currentid="1">
						<s:if test="#session.loginUser!=null">
										${sessin.loginUser.name }&nbsp;欢迎您!
									
									</s:if>
						<s:else>
							<div class="ordercenter"
								style="width: 90px; border: 0; padding: 0px; margin: 0px; float: left;">
								<div class="container-fluid"
									style="width: 50px; border: 0; padding: 0px; margin: 0px; float: left;">
									<div class="row-fluid"
										style="width: 50px; border: 0; padding: 0px; margin: 0px;">
										<div class="span12"
											style="width: 50px; border: 0; padding: 0px; margin: 0px;">
											<a id="modal-176090" href="#modal-container-176090"
												role="button" class="btn" data-toggle="modal">登陆</a>
											<div id="modal-container-176090" class="modal hide fade"
												role="dialog" aria-labelledby="myModalLabel"
												aria-hidden="true">
												<div class="modal-header">
													<button type="button" class="close" data-dismiss="modal"
														aria-hidden="true">

													</button>
													<h3 id="myModalLabel">
														登陆
													</h3>
												</div>
												<div class="modal-body">
													<div class="container-fluid">
														<div class="row-fluid">
															<div class="span12">
																<form class="form-horizontal" action="publicLogin">
																	<div class="control-group">
																		<label class="control-label" for="inputEmail">
																			用户：
																		</label>
																		<div class="controls">
																			<input id="inputEmail" type="text" />
																		</div>
																	</div>
																	<div class="control-group">
																		<label class="control-label" for="inputPassword">
																			密码：
																		</label>
																		<div class="controls">
																			<input id="inputPassword" type="password" />
																		</div>
																	</div>
																	<div class="control-group">
																		<div class="controls">
																			<label class="checkbox">
																				<input type="checkbox" />
																				记住我
																			</label>
																			<button type="submit" class="btn">
																				登陆
																			</button>
																		</div>
																	</div>
																</form>
															</div>
														</div>
													</div>
												</div>
												<div class="modal-footer">
													<button class="btn" data-dismiss="modal" aria-hidden="true">
														关闭
													</button>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="ordercenter"
								style="width: 90px; border: 0; padding: 0px; margin: 0px; float: left;">
								<div class="container-fluid" style="width: 50px;"
									style="width: 50px; border: 0; padding: 0px; margin: 0px; float:left;">
									<div class="row-fluid"
										style="width: 50px; border: 0; padding: 0px; margin: 0px;">
										<div class="span12"
											style="width: 50px; border: 0; padding: 0px; margin: 0px;">
											<a id="modal-176090" href="#modal-container-176090"
												role="button" class="btn" data-toggle="modal">注册</a>
											<div id="modal-container-176090" class="modal hide fade"
												role="dialog" aria-labelledby="myModalLabel"
												aria-hidden="true">
												<div class="modal-header">
													<button type="button" class="close" data-dismiss="modal"
														aria-hidden="true">
														×
													</button>
													<h3 id="myModalLabel">
														注册
													</h3>
												</div>
												<div class="modal-body">
													<div class="container-fluid">
														<div class="row-fluid">
															<div class="span12">
																<form class="form-horizontal" action="publicRegister">
																	<div class="control-group">
																		<label class="control-label" for="inputEmail">
																			用户：
																		</label>
																		<div class="controls">
																			<input id="inputEmail" type="text" />
																		</div>
																	</div>
																	<div class="control-group">
																		<label class="control-label" for="inputPassword">
																			密码：
																		</label>
																		<div class="controls">
																			<input id="inputPassword" type="password" />
																		</div>
																	</div>
																	<div class="control-group">
																		<div class="controls">
																			<label class="checkbox">
																				<input type="checkbox" />
																				记住我
																			</label>
																			<button type="submit" class="btn">
																				注册
																			</button>
																		</div>
																	</div>
																</form>
															</div>
														</div>
													</div>
												</div>
												<div class="modal-footer">
													<button class="btn" data-dismiss="modal" aria-hidden="true">
														关闭
													</button>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>

						</s:else>
					</div>
					<ul class="nav-right">
						<li class="ordercenter  ">
							<i></i>

							<span class="triangle_right"></span>

						</li>
						<li class="recyclecart">
							<div id="recycle-cart">
								<i class="icon-cart"></i>回收车
								<span class="highlight">0</span>件
								<i class="icon-dropdown"></i>
								<div class="spacer"></div>
								<div id="recycle-cart-pop">

									<div class="nogoods">
										回收车中还没有商品，赶紧回收吧！
									</div>
									<div class="hasgoods"></div>
								</div>
							</div>
						</li>

						<li class="highlight">
							<a href="/home/Intro.html" title="爱回收网,关于我们,专业手机回收,服务贴心,价格公道"
								class="no_hover" target="_blank">关于我们</a>
						</li>
						<li class="highlight">
							<a href="/home/safe.html" target="_blank"
								title="安全保-知名保险公司和爱回收网联合推出的安全保障服务" class="no_hover">安全保</a>
						</li>
						<li>
							<a
								href="/activity/project100?utm_source=portal&utm_medium=portal_header&utm_campaign=project100"
								class="no_hover main_project"
								title="爱回收网100工程-1元换数据线,0元手机贴膜,0元电池换新" target="_blank">100服务</a>
						</li>
						<li>
							<a href="http://www.kdyoupin.com//b2b" title="企业电商商家，二手机，库存机回收"
								class="no_hover main_project" target="_blank">企业回收</a>
						</li>
						<li>
							<a href="/help/CommonQuestion.html" target="_blank"
								title="帮助中心 | 常见问题" class="no_hover">帮助中心</a>
						</li>
					</ul>
				</div>
			</div>
			<div class="top-area">
				<div class="search">
					<a href="/" title="爱回收网,手机回收,笔记本回收,中国专业可靠的二手数码回收平台"> <span
						class="icon-logo"></span> <span class="icon-description">数码回收一站式平台</span>
					</a>
					<div class="searchbox">
						<input id="txt-keyword" type="text" placeholder="请输入手机型号"
							autocomplete="off" class="ac_input" />
						<a id="btnSearchKeyWords" href="/shouji"
							title="二手手机回收｜旧手机回收｜二手手机交易－爱回收"> </a>
					</div>
				</div>

				<div class="nav-projects">
					<div class="tab-menu">
						<ul>
							<li>
								<a href="http://www.aihuishou.com" target="_blank"
									class="activemenu" title="手机回收,二手手机回收,专业靠谱的数码产品回收平台"> 手机回收
									<i></i> </a>
							</li>
							<li>
								<a href="http://www.aihuishou.com" target="_blank"
									class="activemenu" title="手机回收,二手手机回收,专业靠谱的数码产品回收平台"> 笔记本回收
									<i></i> </a>
							</li>
							<li>
								<a href="http://www.aihuishou.com" target="_blank"
									class="activemenu" title="手机回收,二手手机回收,专业靠谱的数码产品回收平台">
									平板电脑回收 <i></i> </a>
							</li>
							<li>
								<a href="http://www.aihuishou.com" target="_blank"
									class="activemenu" title="手机回收,二手手机回收,专业靠谱的数码产品回收平台"> 相机回收
									<i></i> </a>
							</li>

						</ul>

					</div>
				</div>
			</div>
			<div class="clear"></div>
		</div>
	</body>
</html>
