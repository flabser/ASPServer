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
					<xsl:call-template name="viewtitle"/>
				</title>
				<link type="text/css" rel="stylesheet" href="classic/css/outline.css" media="screen"/>
				<link type="text/css" rel="stylesheet" href="classic/css/main.css" media="screen"/>
				<link type="text/css" rel="stylesheet" href="classic/css/print_outline.css" media="print"/>
				<link type="text/css" href="/SharedResources/jquery/css/base/jquery-ui-1.8.2.redmont.css" rel="stylesheet" media="screen"/>
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
				<xsl:attribute name="onbeforeprint">javascript:printprepare()</xsl:attribute>
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
					<div id="viewtablediv">
						<div style="padding-left:40px; text-align:left; padding-top:10%; padding-bottom:5px; border-bottom:1px solid #ccc">
							<font style="font-size:25px; font-family:Verdana,Arial,Helvetica,sans-serif"><xsl:value-of select="columns/column[@id='HELLO']/@caption"/>, <xsl:value-of select="@username"/> </font>
							<br/>
							<font style="font-size:16px; font-family:Helvetica,sans-serif; line-height:25px"><xsl:value-of select="columns/column[@id='STARTWORK']/@caption"/></font>
						</div>
						<div style="width:100%; text-align:center">
							<img src="classic/img/LogoCIS.png" style="width:500px; margin-top:150px"/>
						</div>
					</div>
		 		</div>
					</span>
					</div>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>