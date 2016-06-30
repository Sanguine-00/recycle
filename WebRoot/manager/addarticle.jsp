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
		<title>DouPHP 管理中心 - 添加文章</title>
		<meta name="Copyright" content="Douco Design." />
		<link href="<%=basePath %>manager/css/public.css" rel="stylesheet" type="text/css">
		<script type="text/javascript" src="<%=basePath %>manager/js/jquery.min.js"></script>
		<script type="text/javascript" src="<%=basePath %>manager/js/global.js"></script>
		<script type="text/javascript" src="<%=basePath %>manager/js/jquery.autotextarea.js"></script>
	</head>
	<body>
		<div id="urHere">
			DouPHP 管理中心
			<b></b><strong>添加文章</strong>
		</div>
		<div class="mainBox"
			style="height: auto !important; height: 550px; min-height: 550px;">
			<h3>
				<a href="findAllNews" class="actionBtn" target="main">文章列表</a>添加文章
			</h3>
			<form action="saveUpdatedNews?id=${id }" target="main" method="post"
				enctype="multipart/form-data">
				<table width="100%" border="0" cellpadding="8" cellspacing="0"
					class="tableBasic">
					<tr>
						<td width="90" align="right">
							文章名称
						</td>
						<td>
							<input type="text" name="title" value="${title}" size="80"
								class="inpMain" />
						</td>
					</tr>
					<tr>
						<td align="right">
							文章分类
						</td>
						<td>
							<s:if test="#request.newsTypeList!=null">
								<s:select list="newsTypeList" listKey="id" listValue="name"
									name="newsTypeId" value="#request.newsTypeId"></s:select>
							</s:if>
						</td>
					</tr>
					<tr>
						<td align="right" valign="top">
							文章描述
						</td>
						<td>
							<!-- KindEditor -->
							<link rel="stylesheet"
								href="js/kindeditor/themes/default/default.css" />
							<link rel="stylesheet"
								href="js/kindeditor/plugins/code/prettify.css" />
							<script charset="utf-8" src="js/kindeditor/kindeditor.js"></script>
							<script charset="utf-8" src="js/kindeditor/lang/zh_CN.js"></script>
							<script charset="utf-8"
								src="js/kindeditor/plugins/code/prettify.js"></script>
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
							<!-- /KindEditor -->
							<textarea id="content" name="content"
								style="width: 780px; height: 400px;" class="textArea">${content}</textarea>
						</td>
					</tr>

					<tr>
						<td></td>
						<td>
							<input type="hidden" name="token" value="7e4a88fb" />
							<input type="hidden" name="image" value="">
							<input name="submit" class="btn" type="submit" value="提交" />
						</td>
					</tr>
				</table>
			</form>
		</div>
		</div>
		<script type="text/javascript">
	onload = function() {
		document.forms['action'].reset();
	}

	function douAction() {
		var frm = document.forms['action'];

		frm.elements['new_cat_id'].style.display = frm.elements['action'].value == 'category_move' ? ''
				: 'none';
	}
</script>
	</body>
</html>