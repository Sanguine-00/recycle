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

		<title>News Detail</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

		<script type="text/javascript"
			src="<%=basePath %>manager/js/jquery.autotextarea.js"></script>

	</head>

	<body>
		<div>
			<div>
				<h1>
					<s:property value="title" />
				</h1>

				<hr>
				<h3>
					<s:property value="time" />
				</h3>
			</div>
			<!-- KindEditor -->
			<link rel="stylesheet"
				href="<%=basePath %>manager/js/kindeditor/themes/default/default.css" />
			<link rel="stylesheet"
				href="<%=basePath %>manager/js/kindeditor/plugins/code/prettify.css" />
			<script charset="utf-8"
				src="<%=basePath %>manager/js/kindeditor/kindeditor.js"></script>
			<script charset="utf-8"
				src="<%=basePath %>manager/js/kindeditor/lang/zh_CN.js"></script>
			<script charset="utf-8"
				src="<%=basePath %>manager/js/kindeditor/plugins/code/prettify.js"></script>
			<script charset="utf-8"
				src="<%=basePath %>manager/js/kindeditor/plugins/code/prettify.js"></script>
			<script>
	KindEditor.ready(function(K) {
		var editor1 = K.create('textarea[name="content"]', {
			cssPath : '<%=basePath %>manager/plugins/code/prettify.css',
			uploadJson : '<%=basePath %>manager/php/upload_json.php',
			fileManagerJson : '<%=basePath %>manager/php/file_manager_json.php',
			allowFileManager : true,
			afterCreate : function() {
				var self = this;
				K.ctrl(document, 13, function() {
					self.sync();
					K('form[name=example]')[0].submit();
				});
				K.ctrl(self.edit.doc, 13, function() {
					self.sync();
					K('form[name=example]')[0].submit();
				});
			}
		});
		prettyPrint();
	});
</script>
			<textarea id="content" name="content"
				style="width: 1100px; height: 600px;" class="textArea">
				<s:property value="content" />
			</textarea>
			<s:property value="userInfo.name" />
		</div>
	</body>
</html>
