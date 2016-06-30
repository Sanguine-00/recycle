<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="/struts-dojo-tags" prefix="sx" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<base href="<%=basePath%>">
	</head>
	<body>
		<s:form cssClass="get" action="login" id="log">
			用户名:<s:textfield name="name" cssClass="text"></s:textfield>
			密&nbsp;码:<s:password name="password" cssClass="password"></s:password>
			<s:hidden name="action" value="ajax"></s:hidden>
			<sx:submit type="submit" targets="log" value="立即登陆" executeScripts="true" href="login"></sx:submit>
		</s:form>
	</body>
</html>

