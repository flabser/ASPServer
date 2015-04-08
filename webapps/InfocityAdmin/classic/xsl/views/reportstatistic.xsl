<?xml version="1.0" ?>
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
							<div id="viewcontent-header" style="height:100px;">
						<div class="button_panel" style="margin-top:1px">
							<script type="text/javascript">    
					       		$(function() {
									$( ".button" ).button();
			        			});
    						</script>
							<span style="float:right; padding-right:10px;">
							</span>
						</div>
					</div>
					<div id="viewtablediv">
						<div id="tablecontent">
							<xsl:call-template name="viewinfo"/>
							<font style="font-size:25px; color:#111; "><xsl:value-of select="columns/column[@id='VIEW']/@caption"/></font>
							<br/>
							<br/>
							<div style="overflow:auto;">
								<table style="width:98%;border-collapse:collapse; font-size:14px; margin-top:30px; margin-right:20px">
									<tr style="height:40px; background:#efefef; border:1px solid #ccc;">
										<td style="text-align:center; font-weight:bold; width:20px"></td>
										<td style="font-weight:bold; width:200px">
											<xsl:value-of select="columns/column[@id='LOGIN']/@caption"/>
											<input type="text" name="usersearch" id="usersearch" value="">
												<xsl:attribute name="style">
													height:19px; font-size:12px; margin-top:3px; margin-bottom:2px; margin-left:10px; width:180px
													<xsl:if test="query/@keyword ='null' ">
														color:#ccc;
													</xsl:if>
												</xsl:attribute>
												<xsl:attribute name="value">
													<xsl:choose>
														<xsl:when test="query/@keyword !='null'">
															<xsl:value-of select="query/@keyword"/>
														</xsl:when>
														<xsl:otherwise>Введите userid для поиска...</xsl:otherwise>
													</xsl:choose>
												</xsl:attribute>
												<xsl:attribute name="onkeyup">javascript:finduserid(this)</xsl:attribute>
												<xsl:attribute name="onfocus">javascript:removevalinput(this)</xsl:attribute>
												<xsl:attribute name="onblur">javascript:checkvalueinput(this)</xsl:attribute>
											</input>
										</td>
										<td style="text-align:center; font-weight:bold; width:200px">e-mail</td>
										<td style="text-align:center; font-weight:bold; width:200px">instmsgaddr</td>
									</tr>
								</table>
								<div style="position:absolute; top:153px; bottom:0px; overflow-y:scroll; width:100%">
									<table class="viewtable" style="width:100%;border-collapse:collapse; font-size:14px;">
										<xsl:for-each select="query/entry">
											 <tr style="height:30px;">
												<td style="border:1px solid #ccc; text-align:center; width:20px">
												</td>
												<td style="border:1px solid #ccc; text-align:center; width:200px">
													<a href="" class="doclink">
														<xsl:attribute name="href">Provider?type=page&amp;id=reportstatistics&amp;element=document&amp;userid=<xsl:value-of select="viewcontent/userid"/>&amp;key=&amp;page=1</xsl:attribute>
														<xsl:attribute name="onclick">javascript:addUserNameToCookies("<xsl:value-of select='viewcontent/userid'/>")</xsl:attribute>
														<xsl:value-of select="viewcontent/userid"/>
													</a>
												</td>
												<td style="border:1px solid #ccc; text-align:center; width:200px">
													<xsl:value-of select="viewcontent/email"/>
												</td>
												<td style="border:1px solid #ccc; text-align:center; width:200px">
													<xsl:value-of select="viewcontent/instmsgaddr"/>
												</td>
											</tr>
										</xsl:for-each>
									</table>
								</div>
<!-- 								<table class="viewtable" id="viewtable" style=""/> -->
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