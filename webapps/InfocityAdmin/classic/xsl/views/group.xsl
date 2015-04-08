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
						
					</div>
					<div id="viewtablediv">
						<div id="tablecontent">
					
							<xsl:call-template name="viewinfo"/>
							<font style="font-size:25px; color:#111; "><xsl:value-of select="columns/column[@id='VIEW']/@caption"/></font>
									<div class="button_panel" style="">
							<script type="text/javascript">    
					       		$(function() {
									$( ".button_panel button" ).button();
			        			});
    						</script>
							<span style="float:left; margin-left:3px; margin-top:2px">
									<button title="{action[.='NEW_DOCUMENT']/@hint}" id="btnNewdoc">
										<xsl:attribute name="onclick">javascript:window.location.href="<xsl:value-of select="newDocURL"/>&amp;page=0"; beforeOpenDocument()</xsl:attribute>
										<img src="/SharedResources/img/classic/icons/page_white.png" class="button_img"/>
										<font style="font-size:12px; vertical-align:top"><xsl:value-of select="action[.='NEW_DOCUMENT']/@caption"/></font>
									</button>
									<button title="{columns/column[@id = 'BTNDELETEDOCUMENT']/@hint}" style="margin-left:5px">
										<xsl:attribute name="onclick">javascript:delGlossary("Avanti","0");</xsl:attribute>
										<img src="/SharedResources/img/classic/icons/page_white_delete.png" class="button_img"/>
										<font style="font-size:12px; vertical-align:top">Удалить группу</font>
									</button>
								<xsl:if test="action[.='DELETE_GLOSSARY']/@enable = 'true'">
									<button title="{columns/column[@id = 'BTNDELETE']/@hint}" id="btnDeldoc" style="margin-left:5px">
										<xsl:attribute name="onclick">javascript:delGlossary("Avanti","0");</xsl:attribute>
										<img src="/SharedResources/img/classic/icons/page_white_delete.png" class="button_img"/>
										<font style="font-size:12px; vertical-align:top"><xsl:value-of select="columns/column[@id = 'BTNDELETE']/@caption"/></font>
									</button>
								</xsl:if>
							</span>
							<span style="float:right; padding-right:10px;">
							</span>
						</div>
							<br/>
							<br/>
							<div style="overflow:auto;">
								<table style="width:100%;border-collapse:collapse; font-size:14px; margin-top:30px; margin-right:20px">
									<tr style="height:40px; background:#efefef; border:1px solid #ccc;">
										<td style="text-align:center; font-weight:bold; width:20px">
											<input type="checkbox" id="allchbox" onClick="checkAll(this);"/>	
										</td>
										<td style="text-align:center; font-weight:bold; min-width:200px"><xsl:value-of select="columns/column[@id = 'VIEWTEXT1']/@caption"/></td>
									</tr>
								</table>
								<div style="position:absolute; top:143px; bottom:0px; overflow-y:scroll; width:100%">
									<table class="viewtable" style="width:100%;border-collapse:collapse; font-size:14px;">
										<xsl:for-each select="query/entry">
											 <tr style="height:30px;">
												<td style="border:1px solid #ccc; text-align:center; width:20px">
													<input type="checkbox" name="chbox" id="{@docid}" value="{@doctype}"/>
												</td>
												<td nowrap="nowrap" style="border:1px solid #ccc; text-align:left; min-width:200px">
													<div style="display:block; overflow:hidden; width:93%;">&#xA0;
														<a href="{@url}&amp;page={/request/query/@currentpage}" title="{@viewtext}" class="doclink">
															<xsl:attribute name="onclick">javascript:beforeOpenDocument()</xsl:attribute>
															<xsl:if test="@isread = '0'">
																<xsl:attribute name="style">font-weight:bold</xsl:attribute>
															</xsl:if>
															<xsl:value-of select="viewcontent/viewtext1"/>
														</a>
													</div>
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