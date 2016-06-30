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
		<title>DouPHP 管理中心 - 商品列表</title>
		<meta name="Copyright" content="Douco Design." />
		<link href="<%=basePath %>manager/css/public.css" rel="stylesheet" type="text/css">
		<script type="text/javascript" src="<%=basePath %>manager/js/jquery.min.js"></script>
		<script type="text/javascript" src="<%=basePath %>manager/js/global.js"></script>
		<script type="text/javascript" src="<%=basePath %>manager/js/jquery.autotextarea.js"></script>
	</head>
	<body>
		<div id="urHere">
			DouPHP 管理中心
			<b></b><strong>商品列表</strong>
		</div>
		<div class="mainBox"
			style="height: auto !important; height: 550px; min-height: 550px;">
			<h3>
				<a href="addproduct.jsp" class="actionBtn add">添加商品</a>商品列表
			</h3>
			<div class="filter">
				<form action="findByUserInfoIdAndBrandInfoId" method="post"
					target="main">
					<s:if test="#request.brandInfoList!=null">
						<s:select list="brandInfoList" listKey="id" listValue="name"
							name="brandInfoId" value="brandInfoId">
						</s:select>
					</s:if>
					<s:if test="#request.userInfoList!=null">
						<s:select list="userInfoList" listKey="id" listValue="name"
							name="userInfoId" value="userInfoId">
						</s:select>
					</s:if>
					<input name="submit" class="btnGray" type="submit" value="筛选" />
				</form>
			</div>
			<div id="list">
				<form name="action" method="post" action="product.php?rec=action">
					<table width="100%" border="0" cellpadding="8" cellspacing="0"
						class="tableBasic">
						<tr>
							<th width="22" align="center">
								<input name='chkall' type='checkbox' id='chkall'
									onclick=
	selectcheckbox(this.form);;;;;
value='check'>
							</th>
							<th width="40" align="center">
								编号
							</th>
							<th width="80" align="center">
								商品名称
							</th>
							<th width="150" align="center">
								商品分类
							</th>
							<th width="80" align="center">
								所属人
							</th>
							<th width="80" align="center">
								简介
							</th>

							<th align="center">
								图片
							</th>
							<th width="80" align="center">
								操作
							</th>
						</tr>

						<s:iterator value="productInfoList" var="productInfo"
							status="status">
							<tr>
								<td align="center">
									<input type="checkbox" name="checkbox[]" value="#status.count" />
								</td>
								<td align="center">
									<s:property value="#status.count" />
								</td>
								<td>
									<s:property value="name" />
								</td>
								<td align="center">
									<s:property value="brandInfo.name" />
								</td>
								<td align="center">
									<s:property value="userInfo.name" />
								</td>
								<td align="center">
									<s:property value="descpt" />
								</td>
								<td align="center">
									<img alt='<s:property value="logoUrl" />'
										src='upload/<s:property value="logoUrl" />'>
								</td>
								<td align="center">
									<a href='editProductById?id=<s:property value="id"/>'>编辑</a> |
									<a href='deleteProductInfoById?id=<s:property value="id"/>'>删除</a>
								</td>
							</tr>
						</s:iterator>
					</table>
					<div class="action">
						<select name="action" onchange="douAction()">
							<option value="0">
								请选择...
							</option>
							<option value="del_all">
								删除
							</option>
							<option value="category_move">
								移动分类至
							</option>
						</select>
						<select name="new_cat_id" style="display: none">
							<option value="0">
								未分类
							</option>
							<option value="1">
								电子数码
							</option>
							<option value="4">
								- 智能手机
							</option>
							<option value="5">
								- 平板电脑
							</option>
							<option value="2">
								家居百货
							</option>
							<option value="3">
								母婴用品
							</option>
						</select>
						<input name="submit" class="btn" type="submit" value="执行" />
					</div>
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