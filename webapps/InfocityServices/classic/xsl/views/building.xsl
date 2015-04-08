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
				<link type="text/css" rel="stylesheet" href="classic/css/outline.css"/>
				<link type="text/css" rel="stylesheet" href="classic/css/main.css"/>
				<link type="text/css" href="/SharedResources/jquery/css/base/jquery-ui-1.8.2.redmont.css" rel="stylesheet" />
				<link type="text/css" rel="stylesheet" href="/SharedResources/jquery/js/hotnav/jquery.hotnav.css"/>
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
					$(document).ready(function(){
						$(".inputrequest").keyup(function(eventObject){
							if (eventObject.keyCode==13){ 
								$("#sendrequest").click();
							}
						})
					})
				</script>
				<script type="text/javascript">
					$(document).ready(function(){
						$(".button").button();
 						loadprevresult()
						$(document).bind('keydown', function(e){
 							if (e.ctrlKey) {
 								switch (e.keyCode) {
								   case 82:
										<!-- клавиша r -->
								     	e.preventDefault();
								     	$("#sendrequest").click();
								     	break;
								   case 80:
								   		<!-- клавиша p -->
								     	e.preventDefault();
								     	$("#printbutton").click();
								      	break;
								   default:
								      	break;
								}

	    					}
    					});
    					$("#sendrequest").hotnav({keysource:function(e){ return "r"; }});
						$("#printbutton").hotnav({keysource:function(e){ return "p"; }});
					});
				</script>
			</head>			
			<body>
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
							<span style="float:right; padding-right:10px;">
							</span>
						</div>
					</div>
					<div id="viewtablediv">
						<div id="tablecontent">
								<font style="font-size:25px; color:#111; ">ДГАСК - Строительство</font>
							<br/>
							<br/>
							<table style="border-collapse:collapse;  font-family:Verdana,Arial,Helvetica,sans-serif !important; color:#111; margin: 45px 0px 10px;">
								<tr>
									<td width="250px" style="font-size:15px; text-align:right;"><xsl:value-of select="columns/column[@id='FAMILIYA']/@caption"/> :</td>
									<td width="300px">
										<input type="text" style="width:300px; padding:2px;" class="inputrequest"/>
									</td>
								</tr>
								<tr>
									<td style="font-size:15px; text-align:right;"><xsl:value-of select="columns/column[@id='IMYA']/@caption"/> :</td>
									<td>
										<input type="text" style="width:300px; padding:2px;" class="inputrequest"/>
									</td>
								</tr>
								<tr>
									<td style="font-size:15px; text-align:right;"><xsl:value-of select="columns/column[@id='OTCHESTVO']/@caption"/> :</td>
									<td>
										<input type="text" style="width:300px; padding:2px;" class="inputrequest"/>
									</td>
								</tr>
								<tr>
									<td style="padding:3px; text-align:left"></td>
									<td style="font-size:16px; text-align:right;">
										<br/>
										<button class="button" id="sendrequest"><xsl:value-of select="columns/column[@id='VYPOLNIT']/@caption"/></button>
									</td>
								</tr>
							</table>
							<div style="clear:both; width:100%">&#xA0;</div>
							<br/>
							<br/>
							<table style="width:100%;border-collapse:collapse; font-size:14px">
								<tr style="height:40px; background:#efefef">
									<td style="border:1px solid #ccc; text-align:center; width:20px;"></td>
									<td style="border:1px solid #ccc; text-align:center; font-weight:bold"><xsl:value-of select="columns/column[@id='FIO']/@caption"/></td>
									<td style="border:1px solid #ccc; text-align:center; font-weight:bold"><xsl:value-of select="columns/column[@id='DATAROZHDENIYA']/@caption"/></td>
									<td style="border:1px solid #ccc; text-align:center; font-weight:bold"><xsl:value-of select="columns/column[@id='ADRESPROZHIVANIYA']/@caption"/></td>
									<td style="border:1px solid #ccc; text-align:center; font-weight:bold"><xsl:value-of select="columns/column[@id='RNN']/@caption"/></td>
								</tr>
								<tr style="color:#444444">
									<td style="text-align:left" colspan="5">
									</td>
								</tr>
							</table>
						</div>
					</div>
		 		</div>
					</span>
					</div>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>