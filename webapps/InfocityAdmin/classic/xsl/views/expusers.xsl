﻿<?xml version="1.0" ?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:import href="../templates/view.xsl"/>
	<xsl:variable name="viewtype">Вид</xsl:variable>
	<xsl:output method="html" encoding="utf-8" doctype-public="-//W3C//DTD XHTML 1.0 Transitional//EN"
		doctype-system="http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd" indent="no"/>
	<xsl:variable name="skin" select="request/@skin"/>
	<xsl:variable name="useragent" select="request/@useragent"/>
	<xsl:template match="/request">
		<html>
			<head>
				<title>
					<xsl:value-of select="concat(columns/column[@id='ADMINEIS']/@caption, ' - ',  columns/column[@id='VIEW']/@caption)"/>
				</title>
				<link type="text/css" rel="stylesheet" href="classic/css/outline.css"/>
				<link type="text/css" rel="stylesheet" href="classic/css/main.css"/>
				<link type="text/css" rel="stylesheet" href="/SharedResources/jquery/css/smoothness/jquery-ui-1.8.20.custom.css"/>
				<link type="text/css" rel="stylesheet" href="/SharedResources/jquery/js/hotnav/jquery.hotnav.css"/>
				<script type="text/javascript" src="/SharedResources/jquery/js/jquery-1.4.2.js"/>
				<script type="text/javascript" src="/SharedResources/jquery/js/ui/jquery.ui.widget.js"/>
				<script type="text/javascript" src="/SharedResources/jquery/js/ui/jquery.ui.core.js"/>
				<script type="text/javascript" src="/SharedResources/jquery/js/ui/jquery.effects.core.js"/>
				<script type="text/javascript" src="/SharedResources/jquery/js/ui/jquery.ui.datepicker.js"/>
				<script type="text/javascript" src="/SharedResources/jquery/js/ui/jquery.ui.datepicker-ru.js"/>
				<script type="text/javascript" src="/SharedResources/jquery/js/ui/jquery.ui.mouse.js"/>
				<script type="text/javascript" src="/SharedResources/jquery/js/ui/jquery.ui.draggable.js"/>
				<script type="text/javascript" src="/SharedResources/jquery/js/ui/jquery.ui.position.js"/>
				<script type="text/javascript" src="/SharedResources/jquery/js/ui/jquery.ui.button.js"/>
				<script type="text/javascript" src="/SharedResources/jquery/js/ui/jquery.ui.dialog.js"/>
				<script type="text/javascript" src="/SharedResources/jquery/js/cookie/jquery.cookie.js"/>
				<script type="text/javascript" src="/SharedResources/jquery/js/hotnav/jquery.hotkeys.js"/>
				<script type="text/javascript" src="/SharedResources/jquery/js/hotnav/jquery.hotnav.js"/>
				<script type="text/javascript" src="classic/scripts/outline.js"/>
				<script type="text/javascript" src="classic/scripts/view.js"/>
				<script type="text/javascript" src="classic/scripts/form.js"/>
			</head>			
			<body>
				<div id="filterform" style="position:absolute; top:5px; left:10px; z-index:5; width:600px; height:550px; background:#ffffff; border:1px solid #cdcdcd; display:none" >
					<script>
						lt = ($(document).height() - $("#filterform").height() )/2;
						ll = ($(window).width() - $("#filterform").width() )/2;
						$("#filterform").css("top",lt).css("left",ll );
					</script>
					<div style="text-align:center; width:100%; height:20px; background: url('/SharedResources/jquery/css/smoothness/images/ui-bg_glass_75_e6e6e6_1x400.png') repeat-x scroll 50% 50% #E6E6E6; border-bottom: 1px solid #D3D3D3; color: #555555; font-weight: normal;">
						<font style="font-size:13px; line-height:19px; color:#555555;"><xsl:value-of select="columns/column[@id='REQUEST_FILTER']/@caption"/></font>
					</div>
					<div style="width:100%; height:455px">

					</div>
				</div>
				<xsl:call-template name="flashentry"/>
				<div id="blockWindow" style="display:none"/>
				<div id="wrapper">
					<div id='loadingpage' style='position:absolute; display:none'>
						<script>
							lw = $("#loadingpage").width();
							lh = $("#loadingpage").height();
							lt = ($(window).height() - lh )/2;
							ll = ($(window).width() - lw )/2;
							$("#loadingpage").css("top",lt);
							$("#loadingpage").css("left",ll + 95);
							$("#loadingpage").css("z-index",1);

						</script>
						<img src='/SharedResources/img/classic/4(4).gif'/>
					</div>	
					<xsl:call-template name="header-view"/>
					<xsl:call-template name="outline-menu-view"/>
					<span id="view" class="viewframe{outline/category[entry[@current=1]]/@id}">
						<div id="viewcontent" style="margin-left:12px;">
							<div id="viewcontent-header" style="height:20px;"></div>
							<div id="viewtablediv">
								<div id="tablecontent">
									<xsl:call-template name="viewinfo"/>
									<font style="font-size:25px; color:#111;"><xsl:value-of select="columns/column[@id='VIEW']/@caption"/></font>
									<div class="button_panel" style="">
										<script type="text/javascript">
											$(function() {
												$(".button_panel button").button();
												$(".viewinfo").remove();
											});
										</script>
										<span style="float:left; margin-left:3px; margin-top:12px">
											<button title="{columns/column[@id='FILTER']/@caption}">
												<xsl:attribute name="onclick">javascript:getReportUsers();</xsl:attribute>
												<font style="font-size:12px; vertical-align:top">Сформировать отчет</font>
											</button>
										</span>
										<span style="float:right; padding-right:10px;"></span>
									</div>
								</div>
							</div>
		 				</div>
					</span>
				</div>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>