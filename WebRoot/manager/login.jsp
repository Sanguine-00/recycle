
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
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
		<title>登陆</title>
		<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
	overflow: hidden;
}

.STYLE3 {
	color: #528311;
	font-size: 12px;
}

.STYLE4 {
	color: #42870a;
	font-size: 12px;
}
-->
</style>
		<!--

		<script type="text/javascript">
	function showMessage() {
		var message = session.getAttribute("messageInLogin.html").value();
		if (message != null) {
			alert(message);
		}
	}
</script>
	-->
	</head>

	<body>

		<form action="login" id="login">
			<table width="100%" height="100%" border="0" cellpadding="0"
				cellspacing="0">
				<tr>
					<td bgcolor="#e5f6cf">
						&nbsp;
					</td>
				</tr>
				<tr>
					<td height="608" background="<%=basePath %>manager/images/login_03.gif">
						<table width="862" border="0" align="center" cellpadding="0"
							cellspacing="0">
							<tr>
								<td height="266" background="<%=basePath %>manager/images/login_04.gif">
									&nbsp;
								</td>
							</tr>
							<tr>
								<td height="95">
									<table width="100%" border="0" cellspacing="0" cellpadding="0">
										<tr>
											<td width="424" height="95" background="<%=basePath %>manager/images/login_06.gif">
												&nbsp;
											</td>
											<td width="183" background="<%=basePath %>manager/images/login_07.gif">
												<table width="100%" border="0" cellspacing="0"
													cellpadding="0">
													<tr>
														<td width="21%" height="30">
															<div align="center">
																<span class="STYLE3">用户</span>
															</div>
														</td>
														<td width="79%" height="30">
															<input type="text" name="name" id="name"
																style="height: 18px; width: 130px; border: solid 1px #cadcb2; font-size: 12px; color: #81b432;">
														</td>
													</tr>
													<tr>
														<td height="30">
															<div align="center">
																<span class="STYLE3">密码</span>
															</div>
														</td>
														<td height="30">
															<input type="password" name="password" id="password"
																style="height: 18px; width: 130px; border: solid 1px #cadcb2; font-size: 12px; color: #81b432;">
														</td>
													</tr>
													<tr>
														<td height="30">
															&nbsp;
														</td>
														<td height="30">
															<img src="<%=basePath %>manager/images/dl.gif" width="81" height="22"
																border="0" usemap="#Map">
														</td>
													</tr>
												</table>
											</td>
											<td width="255" background="<%=basePath %>manager/images/login_08.gif">
												&nbsp;
											</td>
										</tr>
									</table>
								</td>
							</tr>
							<tr>
								<td height="247" valign="top" background="<%=basePath %>manager/images/login_09.gif">
									<table width="100%" border="0" cellspacing="0" cellpadding="0">
										<tr>
											<td width="22%" height="30">
												&nbsp;
											</td>
											<td width="56%">
												&nbsp;
											</td>
											<td width="22%">
												&nbsp;
											</td>
										</tr>
										<tr>
											<td>
												&nbsp;
											</td>
											<td height="30">
												<table width="100%" border="0" cellspacing="0"
													cellpadding="0">
													<tr>
														<td width="44%" height="20">
															&nbsp;
														</td>
														<td width="56%" class="STYLE4">
															版本2016V1.0
														</td>
													</tr>
												</table>
											</td>
											<td>
												&nbsp;
											</td>
										</tr>
									</table>
								</td>
							</tr>
						</table>
					</td>
				</tr>
				<tr>
					<td bgcolor="#a2d962">
						&nbsp;
					</td>
				</tr>
			</table>
			<map name="Map">
				<area shape="rect" coords="3,3,36,19"
					href="javascript:document:login.submit();">
				<area shape="rect" coords="40,3,78,18" href="javascript:clear();">
			</map>
		</form>
	</body>
</html>
