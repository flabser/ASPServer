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
				<link type="text/css" rel="stylesheet" href="/SharedResources/jquery/js/hotnav/jquery.hotnav.css"/>
				<script type="text/javascript" src="/SharedResources/jquery/js/jquery-1.4.2.js"/>
				<script type="text/javascript" src="/SharedResources/jquery/js/ui/jquery.ui.widget.js"/>
				<script type="text/javascript" src="/SharedResources/jquery/js/ui/jquery.ui.core.js"/>
				<script type="text/javascript" src="/SharedResources/jquery/js/ui/jquery.effects.core.js"/>
				<script type="text/javascript" src="/SharedResources/jquery/js/ui/jquery.ui.datepicker.js"/>
				<script type="text/javascript" src="/SharedResources/jquery/js/ui/jquery.ui.datepicker-ru.js"/>
				<script type="text/javascript" src="/SharedResources/jquery/js/ui/jquery.ui.mouse.js"/>
				<script type="text/javascript" src="/SharedResources/jquery/js/ui/jquery.ui.draggable.js"/>
				<script type="text/javascript" src="/SharedResources/jquery/js/ui/jquery.ui.autocomplete.js"/>
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
						SuggestionStreet()
						SuggestionHouse()
						SuggestionFlat()
						$(".inputrequest[name != house][name != street]").keyup(function(eventObject){
							if (eventObject.keyCode==13){ 
								$("#sendrequest").click();
							}
						})
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
					})
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
								<font style="font-size:25px; color:#111;" id="pagetitle"><xsl:value-of select="columns/column[@id='VIEW']/@caption"/></font>
								<div id="aboutprint" style="display:none">
									<font style="font-size:15px; color:#111;" id="printtitle">Распечатал: <xsl:value-of select="/request/@username"/></font>
									<font style="font-size:14px; color:#111;" id="printtime"></font>
								</div>
								<br/>
								<br/>
								<xsl:if test="/request/@id='citizen' or /request/@id='citizen-fio'">
									<script type="text/javascript">
					   					$(document).ready(function(){
					   						loadprevparamreq($.cookie('lastreqview'), 'fio')
										})
									</script>
									<table  id="inputstable" style="border-collapse:collapse;  font-family:Verdana,Arial,Helvetica,sans-serif !important; color:#111; margin: 45px 0px 10px;">
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
													<xsl:attribute name="onclick">javascript:UMP_getDataByFIO(1,1)</xsl:attribute>
													<xsl:value-of select="columns/column[@id='VYPOLNIT']/@caption"/>
												</button>
											</td>
										</tr>
									</table>
								</xsl:if>

								<xsl:if test="/request/@id='citizen-id'">
									<script type="text/javascript">
					   					$(document).ready(function(){
					   						loadprevparamreq($.cookie('lastreqview'), 'id')
										})
									</script>
									<table id="inputstable" style="border-collapse:collapse;  font-family:Verdana,Arial,Helvetica,sans-serif !important; color:#111; margin: 45px 0px 10px;">
										<tr>
											<td width="250px" style="font-size:15px; text-align:right;">
												<xsl:value-of select="columns/column[@id='NOMER']/@caption"/> :
											</td>
											<td width="300px">
												<input type="text" style="width:300px; padding:2px;" name="doc" class="inputrequest"/>
											</td>
										</tr>
										<tr>
											<td style="padding:3px; text-align:left"></td>
											<td style="font-size:16px; text-align:right;">
												<br/>
												<button class="button" id="sendrequest" style='margin-left:3px'>
													<xsl:attribute name="onclick">javascript:UMP_getDataByID(1,1)</xsl:attribute>
													<xsl:value-of select="columns/column[@id='VYPOLNIT']/@caption"/>
												</button>
											</td>
										</tr>
									</table>
								</xsl:if>
								<xsl:if test="/request/@id='citizen-iin'">
									<script type="text/javascript">
					   					$(document).ready(function(){
					   						loadprevparamreq($.cookie('lastreqview'), 'iin')
										})
									</script>
									<table id="inputstable" style="border-collapse:collapse;  font-family:Verdana,Arial,Helvetica,sans-serif !important; color:#111; margin: 45px 0px 10px;">
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
												<button class="button" id="sendrequest" style='margin-left:3px'>
													<xsl:attribute name="onclick">javascript:UMP_getDataByIIN()</xsl:attribute>
													<xsl:value-of select="columns/column[@id='VYPOLNIT']/@caption"/>
												</button>
											</td>
										</tr>
									</table>
								</xsl:if>
								<xsl:if test="/request/@id='citizen-addr'">
									<script type="text/javascript">
					   					$(document).ready(function(){
					   						loadprevparamreq($.cookie('lastreqview'), 'addr')
										})
									</script>
									<table id="inputstable" style="border-collapse:collapse;  font-family:Verdana,Arial,Helvetica,sans-serif !important; color:#111; margin: 45px 0px 10px;">
										<tr>
											<td width="250px" style="font-size:15px; text-align:right;">
												<xsl:value-of select="columns/column[@id='ULICA']/@caption"/> :
											</td>
											<td width="300px">
												<input type="text" id="street" style="width:300px; padding:2px;" name="street" class="inputrequest" autocomplete="off"/>
												<input type="hidden" id="streetid" style="width:300px; padding:2px;" name="streetid" class="inputrequest"/>
											</td>
										</tr>
										<tr>
											<td width="250px" style="font-size:15px; text-align:right;">
												<xsl:value-of select="columns/column[@id='DOM']/@caption"/> :
											</td>
											<td width="300px">
												<input type="text" style="width:300px; padding:2px;" name="house" id="house" class="inputrequest" autocomplete="off"/>
											</td>
										</tr>
										<tr>
											<td width="250px" style="font-size:15px; text-align:right;">
												<xsl:value-of select="columns/column[@id='KVARTIRA']/@caption"/> :
											</td>
											<td width="300px">
												<input type="text" id="flat" style="width:300px; padding:2px;" name="flat" class="inputrequest" autocomplete="off"/>
											</td>
										</tr>
										<tr>
											<td width="250px" style="font-size:15px; text-align:right;">
												<xsl:value-of select="columns/column[@id='FLATNUMBER']/@caption"/> :
											</td>
											<td width="300px">
												<input type="text" id="flatnumber" style="width:300px; padding:2px;" name="flatNumber" class="inputrequest" autocomplete="off"/>
											</td>
										</tr>
										<tr>
											<td style="padding:3px; text-align:left"></td>
											<td style="font-size:16px; text-align:right;">
												<br/>
												<button class="button" id="sendrequest" style='margin-left:3px'>
													<xsl:attribute name="onclick">javascript:UMP_getDataByAddr(1,1)</xsl:attribute>
													<xsl:value-of select="columns/column[@id='VYPOLNIT']/@caption"/>
												</button>
											</td>
										</tr>
									</table>
								</xsl:if>
							
							<div style="clear:both; width:100%">&#xA0;</div>
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
							<table id="resultHeaderDataTable" style="border-collapse:collapse; font-size:14px;  width:100%; min-width:847px">
								<tr style="height:40px; background:#efefef">
									<td style="border:1px solid #ccc; text-align:center; width:4%" id="1td"></td>
									<td style="border:1px solid #ccc; text-align:center; font-weight:bold; width:24%" id="2td">
										<xsl:value-of select="columns/column[@id='FIO']/@caption"/>
									</td>
									<td style="border:1px solid #ccc; text-align:center; font-weight:bold; width:14%" id="3td">
										<xsl:value-of select="columns/column[@id='IIN']/@caption"/>
									</td>
									<td style="border:1px solid #ccc; text-align:center; font-weight:bold; width:8%" id="4td">
										<xsl:value-of select="columns/column[@id='DATAROZHDENIYA']/@caption"/>
									</td>
									<td style="border:1px solid #ccc; text-align:center; font-weight:bold; width:12%" id="5td">
										<xsl:value-of select="columns/column[@id='POL']/@caption"/>
									</td>
									<td style="border:1px solid #ccc; text-align:center; font-weight:bold; width:18%" id="6td">
										<xsl:value-of select="columns/column[@id='NACIONALNOST']/@caption"/>
									</td>
									<td style="border:1px solid #ccc; text-align:center; font-weight:bold; width:20%" id="7td">
										<xsl:value-of select="columns/column[@id='UDOSTOVERENIE']/@caption"/>
									</td>
								</tr>
							</table>
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