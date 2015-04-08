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
				<script>
					$(function() {
						$('#date').datepicker({
							showOn: 'button',
							buttonImage: '/SharedResources/img/iconset/calendar.png',
							buttonImageOnly: true,
							regional:['ru'],
						});
					});
				</script>
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
					
							<font style="font-size:25px; color:#111; "><xsl:value-of select="columns/column[@id='VIEW']/@caption"/></font>
									<div class="button_panel" style="">
							<script type="text/javascript">    
					       		$(function() {
									$( "button" ).button();
			        			});
    						</script>
							<span style="float:left; margin-left:3px; margin-top:2px">
							</span>
							<span style="float:right; padding-right:10px;">
							</span>
						</div>
							<br/>
							<br/>
							<div style="overflow:auto;">
								<div>
									<font style="font-size:13px">Сервер-источник : </font> 
									<select id="server" onchange="javascript:selectServerLog(this)" style="padding:3px; width: 140px; vertical-align:bottom">
										<option value="">
										</option>
										<xsl:for-each select="glossaries/typeservices/entry">
											<option value="{name}">
												<xsl:value-of select="namerus"/>
											</option>
										</xsl:for-each>
									</select>
									<font style="font-size:13px; margin-left:10px"><xsl:value-of select="columns/column[@id = 'SERVICE']/@caption"/> : </font>
									<select id="service" style="padding:3px; width: 140px; vertical-align:bottom">
										<option value="">
										</option>
										<xsl:for-each select="glossaries/typeservices/entry/services/entry">
											<option class="{../../name}" value="{name}" style="display:none">
												<xsl:value-of select="viewtext"/>
											</option>
										</xsl:for-each>
									</select>
									<font style="font-size:13px; margin-left:10px"><xsl:value-of select="columns/column[@id = 'DATE']/@caption"/> : </font>
									<input type="text" id="date" style="padding:3px; width: 80px; vertical-align:bottom"/>
									<button class="button" style="margin-left:5px">
										<xsl:attribute name="onclick">javascript:getLogService();</xsl:attribute>
										<xsl:value-of select="columns/column[@id = 'UPLOADJOURNAL']/@caption"/>
									</button>
								</div>
								<table style="width:100%;border-collapse:collapse; font-size:14px; margin-top:10px; margin-right:20px">
									<tr style="height:40px; background:#efefef; border:1px solid #ccc;">
										<td style="text-align:center; font-weight:bold; width:20px">
											
										</td>
										<td style="text-align:center; font-weight:bold;  min-width:200px"><xsl:value-of select="columns/column[@id = 'CONTENT']/@caption"/></td>
									</tr>
								</table>
								<div style="position:absolute; top:153px; bottom:0px; overflow-y:scroll; width:100%">
									<table class="viewtable" style="width:100%;border-collapse:collapse; font-size:12px;">
									</table>
								</div>
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