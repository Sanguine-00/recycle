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
		<title>DouPHP 管理中心 - 文章列表</title>
		<meta name="Copyright" content="Douco Design." />
		<link href="<%=basePath %>manager/css/public.css" rel="stylesheet" type="text/css">
		<script type="text/javascript" src="<%=basePath %>manager/js/jquery.min.js"></script>
		<script type="text/javascript" src="<%=basePath %>manager/js/global.js"></script>
		<script type="text/javascript" src="<%=basePath %>manager/js/jquery.autotextarea.js"></script>
	</head>
	<body>
		<div id="urHere">
			DouPHP 管理中心
			<b>></b><strong>文章列表</strong>
		</div>
		<div class="mainBox"
			style="height: auto !important; height: 550px; min-height: 550px;">
			<h3>
				<a href="editNewsById?id=-1" target="main" class="actionBtn add">添加文章</a>文章列表
			</h3>
			<div class="filter">
				<form action="findNewsByTypeId" method="post" target="main">
					<s:if test="#request.newsTypeList!=null">
						<s:select list="newsTypeList" listKey="id" listValue="name"
							name="newsTypeId" value="newsTypeId"></s:select>
					</s:if>
					<input name="submit" class="btnGray" type="submit" value="筛选" />
				</form>
			</div>
			<div id="list">
				<form name="action" method="post" action="article.php?rec=action">
					<table width="100%" border="0" cellpadding="8" cellspacing="0"
						class="tableBasic">
						<tr>
							<th width="22" align="center">
								<input name='chkall' type='checkbox' id='chkall'
									onclick=
	selectcheckbox(this.form);;
value='check' />
							</th>
							<th width="40" align="center">
								编号
							</th>
							<th align="left">
								文章名称
							</th>
							<th width="150" align="center">
								文章分类
							</th>
							<th width="80" align="center">
								最近修改时间
							</th>
							<th width="80" align="center">
								操作
							</th>
						</tr>
						<s:iterator value="newsList" var="news" status="status">
							<tr>
								<td align="center">
									<input type="checkbox" name="checkbox[]" value="#status.count" />
								</td>
								<td align="center">
									<s:property value="#status.count" />
								</td>
								<td>
									<a href='newsDetaile?id=<s:property value="id"/>'><s:property
											value="title" /> </a>
								</td>
								<td align="center">
									<s:property value="newsType.name" />
								</td>
								<td align="center">
									<s:property value="time" />
								</td>
								<td align="center">
									<a href='editNewsById?id=<s:property value="id"/>'
										target="main">编辑</a> |
									<a href='deleteNewsById?id=<s:property value="id"/>'
										target="main">删除</a>
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
								公司动态
							</option>
							<option value="2">
								行业新闻
							</option>
						</select>
						<input name="submit" class="btn" type="submit" value="执行" />
					</div>
				</form>
			</div>
			<div class="clear"></div>
			<div class="pager">
				<ul>
					<li class="current">
						<a href="getHoustListByUserAndPage?pageIndex=1">首页</a>
					</li>
					<li>
						<a
							href='getHoustListByUserAndPage?pageIndex=<s:property value="prev"/>'>上一页</a>
					</li>
					<li>
						<a
							href='getHoustListByUserAndPage?pageIndex=<s:property value="next"/>'>下一页</a>
					</li>
					<li>
						<a
							href='getHoustListByUserAndPage?pageIndex=<s:property value="total"/>'>末页</a>
					</li>
				</ul>
				<span class="total"><s:property value="pageIndex" />/<s:property
						value="total" />页</span>
			</div>
		</div>
		onload = function() { document.forms['action'].reset(); } function
		douAction() { var frm = document.forms['action'];

		frm.elements['new_cat_id'].style.display =
		frm.elements['action'].value == 'category_move' ? '' : 'none'; }
		</script>
	</body>
</html>