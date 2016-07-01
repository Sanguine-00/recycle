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

		<title>My JSP 'footer.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

		<link rel="stylesheet" href="css/header.aboutme.css" type="text/css"></link><link
			rel="stylesheet" href="css/footer.css" type="text/css"></link>
	</head>

	<body>
		<div id="foot" class="">
			<div class="footer_info">
				<div id="footerinfo_left">
					<dl>
						<dt>
							交易方式
						</dt>
						<dd>
							<a href="/help/ondoorMap.html" title="上海交易方式" class="no_hover"
								target="_blank">上海交易方式</a>
						</dd>
						<dd>
							<a href="/help/ondoorMapBJ.html" title="北京交易方式" class="no_hover"
								target="_blank">北京交易方式</a>
						</dd>
						<dd>
							<a href="/help/NationalTrade.html" title="全国交易方式"
								class="no_hover" target="_blank">全国交易方式</a>
						</dd>
					</dl>
					<dl>
						<dt>
							质检说明
						</dt>
						<dd>
							<a href="/help/CheckDefinition.html" title="质检名词解释"
								class="no_hover" target="_blank">质检名词解释</a>
						</dd>
						<dd>
							<a href="/help" title="专业质检说明" class="no_hover" target="_blank">专业质检说明</a>
						</dd>
					</dl>
					<dl>
						<dt>
							帮助中心
						</dt>
						<dd>
							<a href="/help/CommonQuestion.html" title="手机回收常见问题"
								class="no_hover" target="_blank">常见问题</a>
						</dd>
						<dd>
							<a href="/help/AhsServices.html" title="服务条款" class="no_hover"
								target="_blank">服务条款</a>
						</dd>
						<dd>
							<a href="/help/Suggestion.html" title="投诉建议" class="no_hover"
								target="_blank">投诉建议</a>
						</dd>
					</dl>
					<dl>
						<dt>
							关于我们
						</dt>
						<dd>
							<a href="/home/Intro.html" title="了解爱回收" class="no_hover"
								target="_blank">了解我们</a>
						</dd>
						<dd>
							<a href="/help/Recruit.html" title="加入爱回收" class="no_hover"
								target="_blank">加入我们</a>
						</dd>
						<dd>
							<a href="/help/Recycle.html?name=RegionCoop" title="加盟合作"
								class="no_hover" target="_blank">加盟合作</a>
						</dd>

						<dd>
							<a href="/activity/zhaopin" title="爱回收2015校园招聘" class="no_hover"
								target="_blank">2016校园招聘</a>
						</dd>
					</dl>
					<dl>
						<dt>
							关注我们
						</dt>
						<dd>
							<a href="http://e.weibo.com/aihuishou" title="爱回收网官方新浪微博"
								class="no_hover" target="_blank" rel="external nofollow">新浪微博</a>
						</dd>
						<dd id="footer_weixin">
							<a href="#footer_weixin" title="爱回收网官方微信" class="no_hover">官方微信</a>
							<div id="head_weixin">
								<div class="head_weixin_arrow"></div>
								<img src="/Images/Backgrounds/head_weixin.jpg" />
								<br />
								微信扫描二维码，随时随地与小爱亲密接触
								<br />
								精彩活动，劲爆优惠触手可及
							</div>
						</dd>
					</dl>
					<dl>
						<dt>
							合作伙伴
						</dt>


						<dd>
							<a title="京东" target="_blank" class="no_hover"
								href="http://huishou.jd.com">京东</a>
						</dd>
						<dd>
							<a title="大疆" target="_blank" class="no_hover"
								href="http://store.dji.com/recycle" rel="nofollow">大疆</a>
						</dd>
						<dd>
							<a href="/home/links.html" title="更多友情链接及友链申请" class="no_hover"
								target="_blank">更多</a>
						</dd>
					</dl>
				</div>
				<div id="footerinfo_right">
					<div class="footerinfo_time">
						<p class="ahs_contact_phone">
							400-1616-365
						</p>
						<p class="ahs_contact_time">
							周一至周日 9:00-21:00
						</p>
					</div>
					<div class="icon_kefu_footer kefu_pop">
						<div class="icon_kefu_text">
							在线客服
						</div>
					</div>
					<div class="footerinfo_addr">
						<p>
							爱回收寄件地址：上海市宝山区纪蕴路588号1号楼6楼
						</p>
						<p>
							唐先生收 400-1616-365
						</p>
						<br />
						<br />
						<a href="/help/NationalTrade.html" target="_blank"
							class="no_hover" title="爱回收免费快递说明">快递费用说明</a>
					</div>

				</div>
				<br />
				<br />
			</div>


			<div class="copyright">
				<div class="backlinks">
					<dl>
						<dt>
							友情链接：
						</dt>
						<dd>
							<a href="http://shanghai.baixing.com/" target="_blank">百姓网</a>
						</dd>
						<dd>
							<a href="http://bj.58.com/shouji/" target="_blank">北京二手手机</a>
						</dd>
						<dd>
							<a href="http://bj.58.com/ershoushichang/" target="_blank">北京二手手机回收</a>
						</dd>
						<dd>
							<a href="http://www.imobile.com.cn/" target="_blank">手机之家</a>
						</dd>
					</dl>
				</div>
				<a class="no_hover" href="http://www.miibeian.gov.cn/"
					title="爱回收：ICP号" rel="external nofollow" target="_blank"><div
						class="ICP"></div> </a>&nbsp;&nbsp;
				<a class="no_hover" href="http://www.alipay.com" title="支付宝商家认证"
					rel="external nofollow" target="_blank"><div
						class="alipay_foot"></div> </a>&nbsp;&nbsp;
				<a class="no_hover"
					href='https://www.sgs.gov.cn/lz/licenseLink.do?method=licenceView&entyId=dov73ne26zbqq0ili575jvlptdlmfxy2vl'
					rel="external nofollow" target="_blank" title="上海市工商局"><div
						class="gongshangju_foot"></div> </a>&nbsp;&nbsp;
				<a class="no_hover" href='http://show.eastday.com/jubao/jbx2.asp'
					rel="external nofollow" target="_blank" title="上海网警"><div
						class="wangjing_foot"></div> </a>&nbsp;&nbsp;
				<a class="no_hover"
					href='http://webscan.360.cn/index/checkwebsite?url=www.aihuishou.com'
					rel="external nofollow" target="_blank" title="360网站安全检测100分"><div
						class="check360_foot"></div> </a>
				<br />
				<br />
				Copyright 2010 - 2016 上海悦易网络信息技术有限公司 &nbsp; &nbsp; 沪ICP备10043802号 -
				2

			</div>


		</div>
	</body>
</html>
