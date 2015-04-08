<?xml version="1.0" ?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:import href="../templates/view.xsl"/>
	<xsl:variable name="viewtype">Вид</xsl:variable>
	<xsl:output method="html" encoding="utf-8" doctype-public="-//W3C//DTD XHTML 1.0 Transitional//EN"
		doctype-system="http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd" indent="no"/>
	<xsl:variable name="skin" select="request/@skin"/>
	<xsl:variable name="useragent" select="request/@useragent"/>
	<xsl:template name="time">
		<xsl:param name="i"><xsl:number value="0" format="01"/></xsl:param>
		<xsl:param name="k"/>
		<xsl:if test="$i != $k"> 
			<option value="{$i}">
				<xsl:if test="i=00">
					<xsl:attribute name="selected"></xsl:attribute>
				</xsl:if>
				<xsl:value-of select="$i"/>
			</option>
			<xsl:call-template name="time">
				<xsl:with-param name="i"><xsl:number value="$i+1" format="01"/></xsl:with-param>
				<xsl:with-param name="k"><xsl:number value="$k"/></xsl:with-param>
			</xsl:call-template>
		</xsl:if>
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
				<script>
						$(function() {
							var dates = $( "#datefrom, #dateto" ).datepicker({
							defaultDate: "+1w",
							showOn: "button",
							buttonImage: '/SharedResources/img/iconset/calendar.png',
							buttonImageOnly: true,
							changeMonth: true,
							numberOfMonths: 1,
							onSelect: function( selectedDate ) {
								var option = this.id == "datefrom" ? "minDate" : "maxDate",
								instance = $( this ).data( "datepicker" ),
								date = $.datepicker.parseDate(
								instance.settings.dateFormat ||
								$.datepicker._defaults.dateFormat,
								selectedDate, instance.settings );
								dates.not( this ).datepicker( "option", option, date );
								}
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
								<table style="border-collapse:collapse;  font-family:Verdana,Arial,Helvetica,sans-serif !important; color:#111; margin: 45px 0px 5px;">
									<tr>
										<td  style="font-size:15px; text-align:right;">
											<font style="vertical-align:top"><xsl:value-of select="columns/column[@id='S']/@caption"/></font>
											<input type="text" style="width:120px; padding:2px; margin-left:5px; vertical-align:top" id="datefrom"/>
											<select style="width:25px; padding:2px; margin-left:15px; vertical-align:top; width:45px">
												<xsl:call-template name="time">
													<xsl:with-param name="k"><xsl:number value="24" format="1"/></xsl:with-param>
												</xsl:call-template>
											</select>
											<font style="vertical-align:top; margin-left:5px">:</font>
											<select style="width:25px; padding:2px; margin-left:5px; vertical-align:top; width:45px">
												<xsl:call-template name="time">
													<xsl:with-param name="k"><xsl:number value="60" format="1"/></xsl:with-param>
												</xsl:call-template>
											</select>
											<font style="margin-left:35px; vertical-align:top"><xsl:value-of select="columns/column[@id='PO']/@caption"/></font>
											<input type="text" style="width:120px; padding:2px; vertical-align:top; margin-left:5px" id="dateto"/>
											<select style="width:25px; padding:2px; margin-left:15px; vertical-align:top; width:45px">
												<xsl:call-template name="time">
													<xsl:with-param name="k"><xsl:number value="24" format="1"/></xsl:with-param>
												</xsl:call-template>
											</select>
											<font style="vertical-align:top; margin-left:5px">:</font> 
											<select style="width:25px; padding:2px; margin-left:5px; vertical-align:top; width:45px">
												<xsl:call-template name="time">
													<xsl:with-param name="k"><xsl:number value="60" format="1"/></xsl:with-param>
												</xsl:call-template>
											</select>
										</td>
									</tr>
									<tr>
										<td style="font-size:16px; text-align:left;"><br/><button class="button"><xsl:value-of select="columns/column[@id='SGENERIROVATOTCHET']/@caption"/></button></td>
									</tr>
								</table>
							<div style="overflow:auto;">
								<table style="width:100%;border-collapse:collapse; font-size:14px">
									<tr style="height:40px; background:#efefef">
										<td style="border:1px solid #ccc; text-align:center; font-weight:bold; width:200px "><xsl:value-of select="columns/column[@id='LOGIN']/@caption"/></td>
										<td style="border:1px solid #ccc; text-align:center; font-weight:bold; width:200px"><xsl:value-of select="columns/column[@id='FIOPOLZOVATELYA']/@caption"/></td>
										<td style="border:1px solid #ccc; text-align:center; font-weight:bold; width:200px"><xsl:value-of select="columns/column[@id='NACHALOSEANSA']/@caption"/></td>
										<td style="border:1px solid #ccc; text-align:center; font-weight:bold; width:200px"><xsl:value-of select="columns/column[@id='POSLEDNIIZAPROS']/@caption"/></td>
										<td style="border:1px solid #ccc; text-align:center; font-weight:bold; width:200px"><xsl:value-of select="columns/column[@id='PODSISTEMA']/@caption"/></td>
									</tr>
									<tr style="color:#444444">
										<td style="text-align:left" colspan="4">
										</td>
									</tr>
									<!-- <tr style="color:#444444">
										<td colspan="2"> Найдено : 0
										</td>
										<td style="text-align:right; padding-top:25px" colspan="3">
										
											<button class="button">Далее</button><button class="button" style="margin-left:10px">Печать</button>
										</td>
									</tr> -->
								</table>
								<table class="viewtable" id="viewtable" style=""/>
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