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
				<link type="text/css" rel="stylesheet" href="/SharedResources/jquery/js/hotnav/jquery.hotnav.css"/>
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
						$(".button").button();
 						loadprevresult()
						$(".inputrequest").keyup(function(eventObject){
							if (eventObject.keyCode==13){ 
								$("#sendrequest").click();
							}
						})
					})
				</script>
				<script type="text/javascript">
					$(document).ready(function(){
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
							<div id="viewcontent-header" style="height:100px;">
								<div class="button_panel" style="margin-top:1px">
									<span style="float:right; padding-right:10px;">
									</span>
								</div>
							</div>
							<div id="viewtablediv">
								<div id="tablecontent">
									<div id="fieldsdiv" style="margin-right:16px">
											<font style="font-size:25px; color:#111; ">
												<xsl:value-of select="columns/column[@id='VIEW']/@caption"/>
											</font>
											<br/>
											<br/>
											<xsl:if test="/request/@id='transport' or /request/@id='transport-organization'">
												<script type="text/javascript">
								   					$(document).ready(function(){
								   						loadprevparamreq($.cookie('lastreqview'), 'orgname')
													})
												</script>
												<table style="border-collapse:collapse;  font-family:Verdana,Arial,Helvetica,sans-serif !important; color:#111; margin: 45px 0px 10px;">
													<tr>
														<td width="250px" style="font-size:15px; text-align:right;">
															<xsl:value-of select="columns/column[@id='NAIMENOVANIEORGANIZACII']/@caption"/> :
														</td>
														<td width="300px">
															<input type="text" style="width:300px; padding:2px;" name="orgname" class="inputrequest"/>
														</td>
													</tr>
													<tr>
														<td style="padding:3px; text-align:left"></td>
														<td style="font-size:16px; text-align:right;">
															<br/>
															<button class="button" id="sendrequest" style='margin-left:3px'>
																<xsl:attribute name="onclick">javascript:UDP_getDataByOrgName(1)</xsl:attribute>
																<xsl:value-of select="columns/column[@id='VYPOLNIT']/@caption"/>
															</button>
														</td>
													</tr>
												</table>
											</xsl:if>
											<xsl:if test="/request/@id='transport-gos-number'">
												<script type="text/javascript">
								   					$(document).ready(function(){
								   						loadprevparamreq($.cookie('lastreqview'), 'grnz')
													})
												</script>
												<table style="border-collapse:collapse;  font-family:Verdana,Arial,Helvetica,sans-serif !important; color:#111; margin: 45px 0px 10px;">
													<tr>
														<td width="250px" style="font-size:15px; text-align:right;">
															<xsl:value-of select="columns/column[@id='GOSNOMER']/@caption"/> :
														</td>
														<td>
															<input type="text" style="width:300px; padding:2px;" name="grnz" class="inputrequest"/>
														</td>
													</tr>
													<tr>
														<td style="padding:3px; text-align:left"></td>
														<td style="font-size:16px; text-align:right;"><br/>
															<button class="button" id="sendrequest" style='margin-left:3px'>
																<xsl:attribute name="onclick">javascript:UDP_getDataByGRNZ(1)</xsl:attribute>
																<xsl:value-of select="columns/column[@id='VYPOLNIT']/@caption"/>
															</button>
														</td>
													</tr>
												</table>
											</xsl:if>
											<xsl:if test="/request/@id='transport-fio'">
												<script type="text/javascript">
								   					$(document).ready(function(){
								   						loadprevparamreq($.cookie('lastreqview'), 'fio')
													})
												</script>
												<table style="border-collapse:collapse;  font-family:Verdana,Arial,Helvetica,sans-serif !important; color:#111; margin: 45px 0px 10px;">
													<tr>
														<td width="250px" style="font-size:15px; text-align:right;">
															<xsl:value-of select="columns/column[@id='FAMILIYA']/@caption"/> :
														</td>
														<td width="300px">
															<input type="text" style="width:300px; padding:2px;" name="lastname" class="inputrequest"/>
														</td>
													</tr>
													<tr>
														<td style="font-size:15px; text-align:right;">
															<xsl:value-of select="columns/column[@id='IMYA']/@caption"/> :
														</td>
														<td>
															<input type="text" style="width:300px; padding:2px;" name="firstname" class="inputrequest"/>
														</td>
													</tr>
													<tr>
														<td style="font-size:15px; text-align:right;">
															<xsl:value-of select="columns/column[@id='OTCHESTVO']/@caption"/> :
														</td>
														<td>
															<input type="text" style="width:300px; padding:2px;" name="middlename" class="inputrequest"/>
														</td>
													</tr>
													<tr>
														<td style="padding:3px; text-align:left"></td>
														<td style="font-size:16px; text-align:right;"><br/>
															<button class="button" id="sendrequest" style='margin-left:3px'>
																<xsl:attribute name="onclick">javascript:UDP_getDataByFIO(1)</xsl:attribute>
																<xsl:value-of select="columns/column[@id='VYPOLNIT']/@caption"/>
															</button>
														</td>
													</tr>
												</table>
											</xsl:if>
											<xsl:if test="/request/@id='transport-iin'">
												<script type="text/javascript">
								   					$(document).ready(function(){
								   						loadprevparamreq($.cookie('lastreqview'), 'iin')
													})
												</script>
												<table style="border-collapse:collapse;  font-family:Verdana,Arial,Helvetica,sans-serif !important; color:#111; margin: 45px 0px 10px;">
													<tr>
														<td width="250px" style="font-size:15px; text-align:right;">
															<xsl:value-of select="columns/column[@id='IIN']/@caption"/> :
														</td>
														<td width="300px">
															<input type="text" style="width:300px; padding:2px;" name="iin" class="inputrequest">
																<xsl:attribute name="onkeydown">javascript:Numeric(this)</xsl:attribute>
															</input>
														</td>
													</tr>
													<tr>
														<td style="padding:3px; text-align:left"></td>
														<td style="font-size:16px; text-align:right;"><br/>
															<button class="button ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only" id="sendrequest" style='margin-left:3px'>
																<xsl:attribute name="onclick">javascript:UDP_getDataByIIN()</xsl:attribute>
																<xsl:value-of select="columns/column[@id='VYPOLNIT']/@caption"/>
															</button>
														</td>
													</tr>
												</table>
											</xsl:if>
											<xsl:if test="/request/@id='transport-teh-passport'">
												<script type="text/javascript">
								   					$(document).ready(function(){
								   						loadprevparamreq($.cookie('lastreqview'), 'srts')
													})
												</script>
												<table style="border-collapse:collapse;  font-family:Verdana,Arial,Helvetica,sans-serif !important; color:#111; margin: 45px 0px 10px;">
													<tr>
														<td width="250px" style="font-size:15px; text-align:right;">
															<xsl:value-of select="columns/column[@id='SERIYA']/@caption"/> :
														</td>
														<td width="300px">
															<input type="text" style="width:300px; padding:2px;" name="srtsserial" class="inputrequest"/>
														</td>
													</tr>
													<tr>
														<td style="font-size:15px; text-align:right;">
															<xsl:value-of select="columns/column[@id='NOMER']/@caption"/> :
														</td>
														<td>
															<input type="text" style="width:300px; padding:2px;" name="srtsnumber" class="inputrequest"/>
														</td>
													</tr>
													<tr>
														<td style="padding:3px; text-align:left"></td>
														<td style="font-size:16px; text-align:right;"><br/>
															<button class="button" id="sendrequest" style='margin-left:3px'>
																<xsl:attribute name="onclick">javascript:UDP_getDataBySRTS()</xsl:attribute>
																<xsl:value-of select="columns/column[@id='VYPOLNIT']/@caption"/>
															</button>
														</td>
													</tr>
												</table>
											</xsl:if>
											<table id="printtable" style="display:none"/>
											<br/>
											<div style="height:35px; text-align:center; width:100%; font-size:12px; color:#444">
												<font style="float:left">
												  <xsl:value-of select="columns/column[@id='TOTALFOUND']/@caption"/>:<b id="counter"></b>
												</font>
												<font id="page-nav">
												
												</font>
												<xsl:if test="action[.='PRINT']/@enable = 'true'">
													<button class="button ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only" id="printbutton" style="margin-left:10px; visibility:hidden; float:left; margin-top:0px" title="{columns/column[@id='PRINT']/@caption}">
														<xsl:attribute name="onclick">javascript:window.print()</xsl:attribute>
														<img src="/SharedResources/img/classic/icons/printer.png" class="button_img"/>
														<font style="font-size:12px; vertical-align:top"><xsl:value-of select="columns/column[@id='PRINT']/@caption"/></font>
													</button>
												</xsl:if>
												<font style="float:right">
												 <xsl:value-of select="columns/column[@id='SEARCHTIME']/@caption"/>:<b id="reqtime"></b>
												</font>
											</div>
											<xsl:if test="/request/@id = 'transport-teh-passport' or /request/@id = 'transport-gos-number'">
												<table id="resultHeaderDataTable" style="border-collapse:collapse; font-size:14px;  width:100%; min-width:847px">
													<tr style="height:40px; background:#efefef">
														<td style="border:1px solid #ccc; text-align:center; width:2%"  id="1td"></td>
														<td style="border:1px solid #ccc; text-align:center; font-weight:bold; width:14%" id="2td">
															<xsl:value-of select="columns/column[@id='GOSNOMER']/@caption"/>
														</td>
														<td style="border:1px solid #ccc; text-align:center; font-weight:bold; width:18%" id="3td">
															<xsl:value-of select="columns/column[@id='MARKATS']/@caption"/>
														</td>
														<td style="border:1px solid #ccc; text-align:center; font-weight:bold; width:14%" id="4td">
															<xsl:value-of select="columns/column[@id='GODVYPUSKATS']/@caption"/>
														</td>
														<td style="border:1px solid #ccc; text-align:center; font-weight:bold; width:12%" id="5td">
															<xsl:value-of select="columns/column[@id='SRTS']/@caption"/>
														</td>
													</tr>
												</table>
											</xsl:if>
											<xsl:if test="/request/@id = 'transport-iin' or /request/@id = 'transport-fio'">
												<table id="resultHeaderDataTable" style="border-collapse:collapse; font-size:14px;  width:100%; min-width:847px">
													<tr style="height:40px; background:#efefef">
														<td style="border:1px solid #ccc; text-align:center; width:2%" id="1td"></td>
														<td style="border:1px solid #ccc; text-align:center; font-weight:bold; width:22%" id="2td">
															<xsl:value-of select="columns/column[@id='FIO']/@caption"/>
														</td>
														<td style="border:1px solid #ccc; text-align:center; font-weight:bold; width:6%" id="3td">
															<xsl:value-of select="columns/column[@id='DATAROZHDENIYA']/@caption"/>
														</td>
														<td style="border:1px solid #ccc; text-align:center; font-weight:bold; width:19%" id="4td">
															<xsl:value-of select="columns/column[@id='ADRESPROZHIVANIYA']/@caption"/>
														</td>
														<td style="border:1px solid #ccc; text-align:center; font-weight:bold; width:11%" id="5td">
															<xsl:value-of select="columns/column[@id='TELEPHON']/@caption"/>
														</td>
													</tr>
												</table>
											</xsl:if>
											<xsl:if test="/request/@id = 'transport' or /request/@id = 'transport-organization'">
												<table id="resultHeaderDataTable" style="border-collapse:collapse; font-size:14px;  width:100%; min-width:847px">
													<tr style="height:45px; background:#efefef">
														<td style="border:1px solid #ccc; text-align:center; width:4%"  id="1td"></td>
														<td style="border:1px solid #ccc; text-align:center; font-weight:bold; width:22%" id="2td">
															<xsl:value-of select="columns/column[@id='NAIMENOVANIE']/@caption"/>
														</td>
														<td style="border:1px solid #ccc; text-align:center; font-weight:bold; width:10%" id="3td">
															<xsl:value-of select="columns/column[@id='DATAREGISTRACII']/@caption"/>
														</td>
														<td style="border:1px solid #ccc; text-align:center; font-weight:bold; width:14%" id="4td">
															<xsl:value-of select="columns/column[@id='RNN']/@caption"/>
														</td>
														<td style="border:1px solid #ccc; text-align:center; font-weight:bold; width:12%" id="5td">
															<xsl:value-of select="columns/column[@id='YURIDICHESKIIADRES']/@caption"/>
														</td>
														<td style="border:1px solid #ccc; text-align:center; font-weight:bold; width:18%" id="6td">
															<xsl:value-of select="columns/column[@id='TELEPHON']/@caption"/>
														</td>
														<td style="border:1px solid #ccc; text-align:center; font-weight:bold; width:20%" id="7td">
															<xsl:value-of select="columns/column[@id='OKPO']/@caption"/>
														</td>
													</tr>
												</table>
											</xsl:if>
										</div>
										<div id="resultdiv" style="overflow-y:scroll; overflow-x:hidden; width:100%; position:absolute; bottom:0px;  min-width:847px; right:0px; left:0px">
											<table id="resultDataTable" style="width:100%; table-layout: fixed; border-collapse:collapse; font-size:14px;"></table>
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