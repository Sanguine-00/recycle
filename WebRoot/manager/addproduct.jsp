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
		<title>DouPHP 管理中心 - 添加商品</title>
		<meta name="Copyright" content="Douco Design." />
		<link href="<%=basePath %>manager/css/public.css" rel="stylesheet" type="text/css">
		<script type="text/javascript" src="<%=basePath %>manager/js/jquery.min.js"></script>
		<script type="text/javascript" src="<%=basePath %>manager/js/global.js"></script>
		<script type="text/javascript" src="<%=basePath %>manager/js/jquery.autotextarea.js"></script>
		<script type="text/javascript" src="<%=basePath %>manager/js/jquery.brandInfo.js"></script>
		<script type="text/javascript" src="js/jquery.userInfo.js"></script>
		<script type="text/javascript" src="js/jquery.upload.js"></script>
	</head>
	<body>
		<!-- 当前位置 -->
		<div id="urHere">
			DouPHP 管理中心
			<b>></b><strong>添加商品</strong>
		</div>
		<div class="mainBox"
			style="height: auto !important; height: 550px; min-height: 550px;">
			<h3>
				<a href="findAllProductInfo" class="actionBtn" target="main">商品列表</a>添加商品
			</h3>
			<form action='saveUpdatedProductInfo?id=<s:property value="id"/>'
				method="post" enctype="multipart/form-data">
				<table width="100%" border="0" cellpadding="8" cellspacing="0"
					class="tableBasic">
					<tr>
						<td width="90" align="right">
							商品名称
						</td>
						<td>
							<input type="text" name="name" value='<s:property value="name"/>'
								size="80" class="inpMain" />
						</td>
					</tr>
					<tr>
						<td align="right">
							商品分类
						</td>
						<td id="divBrandInfo">
							<s:if test="#request.brandInfoList!=null">
								<s:select list="brandInfoList" listKey="id" listValue="name"
									name="brandInfoId" value="brandInfoId">
								</s:select>
							</s:if>
						</td>
					</tr>
					<tr>
						<td align="right">
							所属人
						</td>
						<td id="divUserInfo">
							<s:if test="#request.userInfoList!=null">
								<s:select list="userInfoList" listKey="id" listValue="name"
									name="userInfoId" value="userInfoId">
								</s:select>
							</s:if>
						</td>
					</tr>
					<tr>
						<td align="right">
							商品价格
						</td>
						<td>
							<input type="text" name="price"
								value='<s:property value="price"/>' size="40" class="inpMain" />
						</td>
					</tr>
					<tr>
						<td align="right" valign="top">
							商品描述
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
							<textarea id="" descpt"" name="descpt"
								style="width: 780px; height: 400px;" class="textArea"></textarea>
						</td>
					</tr>
					<tr>
						<td align="right">
							图片
						</td>
						<td>
							<input type="file" name="file" id="file" value=""
								onchange="$(uploadFile(this))">
							<input type="hidden" name="logoUrl" id="logo"
								value='<s:property value="lologoUrlo"/>'>
						</td>
					</tr>
					<tr>
						<td></td>
						<td>
							<input type="hidden" name="token" value="21307217" />
							<input name="submit" class="btn" type="submit" value="提交" />
						</td>
					</tr>
				</table>
			</form>
		</div>
	</body>
</html>
