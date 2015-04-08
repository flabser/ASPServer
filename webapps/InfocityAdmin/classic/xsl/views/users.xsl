<?xml version="1.0" ?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:import href="../templates/view.xsl"/>
	<xsl:variable name="viewtype">Вид</xsl:variable>
	<xsl:output method="html" encoding="utf-8" doctype-public="-//W3C//DTD XHTML 1.0 Transitional//EN"
		doctype-system="http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd" indent="no"/>
	<xsl:variable name="skin" select="request/@skin"/>
	<xsl:variable name="useragent" select="request/@useragent"/>
	<xsl:template match="responses">
		<tr>
			<xsl:attribute name="class">response<xsl:value-of select="../@docid"/></xsl:attribute>
			<script>
				color=$(".response"+<xsl:value-of select="../@docid"/>).prev().attr("bgcolor");
				$(".response"+<xsl:value-of select="../@docid"/>).css("background",color);
			</script>
			<style type="text/css">
				div.Node * { vertical-align: middle }
			</style>
			<td>
			</td>
			<td colspan="4">
				<xsl:apply-templates mode="line"/>
			</td>
		</tr>
	</xsl:template>
	<xsl:template match="viewtext" mode="line"/>
	<xsl:template match="viewtext1" mode="line"/>
	<xsl:template match="viewtext2" mode="line"/>
	<xsl:template match="*" mode="line">
			<xsl:if test="name(.) != 'userid'">	
				<div class="Node" style="height:100%">
					<xsl:attribute name="id"><xsl:value-of select="@docid"/><xsl:value-of select="@doctype"/></xsl:attribute>
					<xsl:call-template name="graft"/>
					<xsl:apply-templates select="." mode="item"/>
				</div>
				<xsl:apply-templates mode="line"/>
			</xsl:if>
		</xsl:template>

		<xsl:template match="entry" mode="item">
			<input type="checkbox" name="chbox" style="margin:0px; padding:0px; height:13px" >
				<xsl:attribute name="id" select="@docid"/>
				<xsl:attribute name="value" select="@doctype"/>
			</input>
			<a  href="" style="font-style:arial; font-size:12px; margin:0px 2px;" class="doclink">
				<xsl:attribute name="href" select="@url"/>
				<xsl:attribute name="onclick">javascript:beforeOpenDocument()</xsl:attribute>
				<xsl:attribute name="title" select="userid"/>
				<xsl:value-of select="replace(@viewtext,'&amp;quot;','&#34;')"/>	
			</a>
		</xsl:template>

		<xsl:template name="graft">
			<xsl:apply-templates select="ancestor::entry" mode="tree"/>
			<xsl:choose>
				<xsl:when test="following-sibling::*">
					<img style="vertical-align:top;" src="/SharedResources/img/classic/tree_tee.gif"/>
				</xsl:when>
				<xsl:otherwise>
					<img style="vertical-align:top;" src="/SharedResources/img/classic/tree_corner.gif"/>
				</xsl:otherwise>
			</xsl:choose>
		</xsl:template>
		
		<xsl:template match="responses" mode="tree"/>

		<xsl:template match="*" mode="tree">
			<xsl:choose>
				<xsl:when test="following-sibling::* and *[@url]">
					<img style="vertical-align:top;" src="/SharedResources/img/classic/tree_bar.gif"/>
				</xsl:when>
				<xsl:otherwise>
					<img style="vertical-align:top;" src="/SharedResources/img/classic/tree_spacer.gif"/>
				</xsl:otherwise>
			</xsl:choose>
		</xsl:template>
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
							<font style="font-size:25px; color:#111; "><xsl:value-of select="columns/column[@id='VIEW']/@caption"/></font>
							<br/>
							<br/>
							<table style="border-collapse:collapse;  font-family:Verdana,Arial,Helvetica,sans-serif !important; color:#111; margin: 5px 0px 5px;">
								<tr>
									<td style="font-size:16px; text-align:right;">
										<br/>
										<button class="button">
											<xsl:attribute name="onclick">javascript:window.location.href="<xsl:value-of select="newDocURL"/>&amp;page=0"; beforeOpenDocument()</xsl:attribute>
											<xsl:value-of select="columns/column[@id='DOBAVIT']/@caption"/>
										</button>
									</td>
									<td style="font-size:16px; text-align:right;">
										<br/>
										<button class="button">
											<xsl:attribute name="onclick">javascript:delGlossary("Avanti","1");</xsl:attribute>
											<xsl:value-of select="columns/column[@id='UDALIT']/@caption"/>
										</button>
									</td>
								</tr>
							</table>
							<div style="overflow:auto;">
									<div id="tablecontent-for-structurelist" style="margin-top:80px">
										<div>
											<xsl:for-each select="query/entry">
												<input type="checkbox" name="chbox">
													<xsl:attribute name="id" select="@docid"/>
													<xsl:attribute name="value" select="@doctype"/>
												</input>
												<font style="font-family:	Verdana,Arial,Helvetica,sans-serif; font-size:1em">
													<a href="{@url}" class="doclink">
														<xsl:value-of select="replace(@viewtext,'&amp;quot;','&#34;')"/>	
													</a>
												</font>
												<table id="viewtable" style="border-collapse:collapse; border:0; font-size:0.85em">
													<xsl:apply-templates select="responses"/>
												</table>
												<br/>
											</xsl:for-each>
										</div>
										<div style="clear:both; width:100%">&#xA0;</div>
									</div>
								<table class="viewtable" id="viewtable" style=""/>
							</div>
								
						</div>
					</div>
		 		</div>
					</span>
					</div>
					<table class="viewtable" id="viewtable" style=""/>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>