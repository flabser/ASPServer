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
							<font style="font-size:25px; color:#111; "><xsl:value-of select="columns/column[@id='VIEW']/@caption"/></font>
							<br/>
							<br/>
							<div style="overflow:auto;">
								<table style="width:100%;border-collapse:collapse; font-size:14px; margin-top:80px">
									<tr style="height:40px; background:#efefef">
										<td style="border:1px solid #ccc; text-align:center; font-weight:bold; width:190px"><xsl:value-of select="columns/column[@id='TYPE']/@caption"/></td>
										<td style="border:1px solid #ccc; text-align:center; font-weight:bold; width:150px"><xsl:value-of select="columns/column[@id='SERVICE']/@caption"/></td>
										<td style="border:1px solid #ccc; text-align:center; font-weight:bold; width:300px"><xsl:value-of select="columns/column[@id='COMMENTS']/@caption"/></td>
										<td style="border:1px solid #ccc; text-align:center; font-weight:bold; width:70px"></td>
										<td style="border:1px solid #ccc; text-align:center; font-weight:bold; width:150px"><xsl:value-of select="columns/column[@id='RESULT']/@caption"/></td>
									</tr>
									<xsl:for-each select="glossaries/typeservices/entry">
										<xsl:variable name="typesrv" select="value"/>
										<tr style="color:#444444; font-size:13px; height:50px">
											<td style="border:1px solid #ccc; text-align:center;">
												<xsl:if test="/request/@lang = 'RUS'">
													 <xsl:value-of select="namerus"/>
												</xsl:if>
												<xsl:if test="/request/@lang = 'KAZ'">
													 <xsl:value-of select="namekaz"/>
												</xsl:if>
											</td>
											<td style="border:1px solid #ccc; text-align:center;">
												<select id="{$typesrv}" name="servicename" style="padding:5px; width:125px">
													<xsl:for-each select="/request/glossaries/nameservices/entry[type= $typesrv]">
														<option value="{value}">
															<xsl:if test="/request/@lang = 'RUS'">
																 <xsl:value-of select="viewtext"/>
															</xsl:if>
															<xsl:if test="/request/@lang = 'KAZ'">
																 <xsl:value-of select="viewtextkaz"/>
															</xsl:if>
														</option>
													</xsl:for-each>
												</select>
											</td>
											<td style="border:1px solid #ccc; text-align:center;"></td>
											<td  style="border:1px solid #ccc; text-align:center;">
												<button type="button" class="button">
													<xsl:attribute name="onclick">testservice("<xsl:value-of select='$typesrv'/>")</xsl:attribute>
													Тест
												</button>
											</td>
											<td  style="border:1px solid #ccc; text-align:center;">
												<xsl:attribute name="id">status<xsl:value-of select='$typesrv'/></xsl:attribute>
											</td>
										</tr>
									</xsl:for-each>
								</table>
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