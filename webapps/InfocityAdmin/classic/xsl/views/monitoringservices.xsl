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
				<div id="filterform" style="position:absolute; top:5px; left:10px; z-index:5; width:600px; height:550px; background:#ffffff; border:1px solid #cdcdcd; display:none" >
					<script>
						lt = ($(document).height() - $("#filterform").height() )/2;
						ll = ($(window).width() - $("#filterform").width() )/2;
						$("#filterform").css("top",lt).css("left",ll );
					</script>
					<div style="text-align:center; width:100%; height:20px; background: url('/SharedResources/jquery/css/smoothness/images/ui-bg_glass_75_e6e6e6_1x400.png') repeat-x scroll 50% 50% #E6E6E6; border-bottom: 1px solid #D3D3D3; color: #555555; font-weight: normal;">
						<font style="font-size:13px; line-height:19px; color:#555555;"><xsl:value-of select="columns/column[@id='REQUEST_FILTER']/@caption"/></font>
					</div>
					<div style="width:100%; height:455px">
						<table style="width:100%; margin-top:30px; font-size:14px">
							<tr>
								<td style="width:240px; text-align:right">
									<xsl:value-of select="columns/column[@id='USER_LOGIN']/@caption"/> :
								</td>
								<td style="width:360px">
									<input type="text" id="login" style="width:300px; padding:3px"></input>
								</td>
							</tr>
							<tr>
								<td style="text-align:right">
									<input type="checkbox" id="errorsonly" style="padding:2px" value="true"></input>
								</td>
								<td style="font-size:12px">
									<xsl:value-of select="columns/column[@id='REQUEST_ERROR_ONLY']/@caption"/>
								</td>
							</tr>
							<tr>
								<td style="text-align:center; padding-top:15px; color:#555555; border-bottom:1px solid #efefef" colspan="2">
									<xsl:value-of select="columns/column[@id='REQUEST_FILTER_TARGET']/@caption"/>
								</td>
							</tr>
							<tr>
								<td style="padding-top:10px; text-align:right">
									<xsl:value-of select="columns/column[@id='SERVER_SPRING']/@caption"/> :
								</td>
								<td style="padding-top:10px;">
									<select id="server" style="width:310px; padding:5px" onchange="javascript:selectServerItem()">
										<option value="">
										</option>
										<xsl:for-each select="glossaries/typeservices/entry">
											<option value="{name}">
												<xsl:value-of select="namerus"/>
											</option>
										</xsl:for-each>
									</select>
								</td>
							</tr>
							<tr>
								<td style=" text-align:right">
									<xsl:value-of select="columns/column[@id='SERVICE']/@caption"/> :
								</td>
								<td style="">
									<select id="service" style="width:310px; padding:5px" onchange="javascript:selectServiceItem()">
										<option value="">
										</option>
										<xsl:for-each select="glossaries/typeservices/entry/services/entry">
											<option class="{../../name}" value="{name}" style="display:none">
												<xsl:value-of select="viewtext"/>
											</option>
										</xsl:for-each>
									</select>
								</td>
							</tr>
							<tr>
								<td style=" text-align:right">
									<xsl:value-of select="columns/column[@id='FUNCTION']/@caption"/> :
								</td>
								<td style="">
									<select id="func" style="width:310px; padding:5px" onchange="javascript:selectFuncItem()">
										<option value="">
										</option>
										<xsl:for-each select="glossaries/typeservices/entry/services/entry/methods/entry">
											<option class="{../../name}" value="{value}"  style="display:none">
												<xsl:value-of select="name"/>
											</option>
										</xsl:for-each>
									</select>
								</td>
							</tr>
							<tr>
								<td style="text-align:center; padding-top:15px; color:#555555; border-bottom:1px solid #efefef" colspan="2">
									<xsl:value-of select="columns/column[@id='FILTER_TRAFIC']/@caption"/>
								</td>
							</tr>
							<tr>
								<td style="padding-top:10px; text-align:right">
									<xsl:value-of select="columns/column[@id='RECORD_COUNT']/@caption"/> :
								</td>
								<td style="padding-top:10px;">
									<xsl:value-of select="columns/column[@id='FOR']/@caption"/> <input type="text" id="totalsfrom" style="width:60px; padding:3px"></input> <xsl:value-of select="columns/column[@id='UP_TO']/@caption"/> <input type="text" id="totalsto" style="width:60px; padding:3px"></input>
								</td>
							</tr>
							<tr>
								<td style="text-align:center; padding-top:15px; color:#555555; border-bottom:1px solid #efefef" colspan="2">
									<xsl:value-of select="columns/column[@id='FILTER_TIME_REQUEST']/@caption"/>
								</td>
							</tr>
							 <tr>
								<td style="padding-top:10px;text-align:right;">
									<xsl:value-of select="columns/column[@id='TOTAL_TIME_REQUEST']/@caption"/> :
								</td>
								<td style="padding-top:10px;">
									<xsl:value-of select="columns/column[@id='FOR']/@caption"/> <input type="text" id="difftimefrom" style="width:60px; padding:3px"></input> <xsl:value-of select="columns/column[@id='UP_TO']/@caption"/> <input type="text" id="difftimeto" style="width:60px; padding:3px"></input> сек.
								</td>
							</tr> 
							<tr>
								<td style="text-align:center; padding-top:15px; color:#555555; border-bottom:1px solid #efefef" colspan="2">
									<xsl:value-of select="columns/column[@id='FILTER_DATE_REQUEST']/@caption"/>
								</td>
							</tr>
							<tr>
								<td style="padding-top:10px;text-align:right">
									<xsl:value-of select="columns/column[@id='REQUEST_DATE']/@caption"/> :
								</td>
								<td style="padding-top:10px">
									<xsl:value-of select="columns/column[@id='FROM']/@caption"/> <input type="text" id="datefrom" style="width:80px; padding:3px"></input> <xsl:value-of select="columns/column[@id='TO']/@caption"/> <input type="text" id="dateto" style="width:80px; padding:3px"></input> 
								</td>
							</tr>
						</table>
					</div>
					<div style="width:100%; height:40px; border-top:1px solid #cdcdcd; text-align:right;" id="filter_button_panel">
						<button title="ok" style="margin-right:5px; margin-top:7px">
							<xsl:attribute name="onclick">javascript:OkFilterActivity();</xsl:attribute>
							<font style="font-size:12px; vertical-align:top">ок</font>
						</button>
						<button title="oтмена" style="margin-right:15px; margin-top:7px">
							<xsl:attribute name="onclick">javascript:CancelFilterActivity();</xsl:attribute>
							<font style="font-size:12px; vertical-align:top"><xsl:value-of select="columns/column[@id='CANCEL']/@caption"/></font>
						</button>
						<script type="text/javascript">    
					       		$(function() {
									$( "#filter_button_panel button" ).button();
			        			});
			        			$(function() {
									var dates = $( "#datefrom, #dateto" ).datepicker({
									defaultDate: "+1w",
									changeMonth: true,
									numberOfMonths: 1,
									showOn: "button",
									buttonImage: '/SharedResources/img/iconset/calendar.png',
									buttonImageOnly: true,
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
					</div>
				</div>
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
					
					
					<xsl:for-each select="query/entry">
						<div style="position:absolute; top:5px; left:10px; z-index:5; width:650px; height:640px; background:#ffffff; border:1px solid #cdcdcd; display:none" >
							
							<xsl:attribute name="id">activityinfo<xsl:value-of select="position()"/></xsl:attribute>
							<div class='closeButton' style="float:right; margin-right:4px; margin-top:4px; cursor:pointer"><img style='width:15px; height:15px; margin-left:3px; margin-top:1px' src='/SharedResources/img/iconset/cross.png'>
								<xsl:attribute name="onclick">javascript:$("#activityinfo<xsl:value-of select='position()'/>").css("display","none"); $('#blockWindow').css("display","none");</xsl:attribute>
							</img></div>
							<script>
								lt = ($(document).height() - $("#filterform").height() )/2;
								ll = ($(window).width() - $("#filterform").width() + 35 )/2;
								$("#activityinfo<xsl:value-of select='position()'/>").css("top",lt - 30).css("left",ll );
							</script>
							<div style="text-align:center; width:100%; height:25px; background: url('/SharedResources/jquery/css/smoothness/images/ui-bg_glass_75_e6e6e6_1x400.png') repeat-x scroll 50% 50% #E6E6E6; border-bottom: 1px solid #D3D3D3; color: #555555; font-weight: normal;">
								<font style="font-size:14px; line-height:24px; color:#555555;"><xsl:value-of select="/request/columns/column[@id='REQUEST_FULL_INFO']/@caption"/></font>
							</div>
							<div style="width:100%; height:560px">
								<table style="width:100%; margin-top:10px; font-size:12px">
									<tr>
										<td style="text-align:left; padding-left:15px;  color:#555555; border-bottom:1px solid #efefef; font-size:14px" colspan="2">
											<xsl:value-of select="/request/columns/column[@id='USER_INFO']/@caption"/>
										</td>
									</tr>
									<tr>
										<td style="padding-top:10px;width:240px; text-align:right">
											<xsl:value-of select="/request/columns/column[@id='FIO']/@caption"/> :
										</td>
										<td style="padding-top:10px; width:360px">
											<xsl:value-of select="viewcontent/fio"/>
										</td>
									</tr>
									<tr>
										<td style="text-align:left; padding-left:15px;  padding-top:10px; color:#555555; border-bottom:1px solid #efefef; font-size:14px" colspan="2">
											<xsl:value-of select="/request/columns/column[@id='SESSION_INFO']/@caption"/>
										</td>
									</tr>
									<tr>
										<td style="padding-top:10px;width:240px; text-align:right">
											<xsl:value-of select="/request/columns/column[@id='START_SEANS']/@caption"/>:
										</td>
										<td style="padding-top:10px; width:360px">
											<xsl:value-of select="viewcontent/returntime"/>
										</td>
									</tr>
									<tr>
										<td style="width:240px; text-align:right">
											<xsl:value-of select="/request/columns/column[@id='SUBSYSTEM']/@caption"/>:
										</td>
										<td style="width:360px">
											<xsl:value-of select="/request/columns/column[@id='HELP_FIND_SYSTEM']/@caption"/>
										</td>
									</tr>
									<tr>
										<td style="text-align:left; padding-left:15px; padding-top:10px; color:#555555; border-bottom:1px solid #efefef; font-size:14px" colspan="2">
											<xsl:value-of select="/request/columns/column[@id='REQUEST_INFO']/@caption"/>
										</td>
									</tr>
									<tr>
										<td style="padding-top:10px;width:240px; text-align:right">
											<xsl:value-of select="/request/columns/column[@id='SERVER_SPRING']/@caption"/>:
										</td>
										<td style="padding-top:10px; width:360px">
											<xsl:value-of select="viewcontent/spring_server"/>
										</td>
									</tr>
									<tr>
										<td style="width:240px; text-align:right">
											<xsl:value-of select="/request/columns/column[@id='SERVICE']/@caption"/>:
										</td>
										<td style="width:360px">
											<xsl:value-of select="viewcontent/service_name"/>
										</td>
									</tr>
									<tr>
										<td style="width:240px; text-align:right">
											<xsl:value-of select="/request/columns/column[@id='FUNCTION']/@caption"/>:
										</td>
										<td style="width:360px">
											<xsl:value-of select="viewcontent/method_name"/>
										</td>
									</tr>
									<tr>
										<td style="width:240px; text-align:right">
											<xsl:value-of select="/request/columns/column[@id='TOTAL_TIME_REQUEST']/@caption"/>:
										</td>
										<td style="width:360px">
											<xsl:value-of select="viewcontent/returntime"/>
										</td>
									</tr>
									<tr>
										<td style="width:240px; text-align:right">
											<xsl:value-of select="/request/columns/column[@id='RECORD_COUNT']/@caption"/>:
										</td>
										<td style="width:360px">
											<xsl:value-of select="viewcontent/processed_rec"/>
										</td>
									</tr>
									<tr>
										<td style="width:240px; text-align:right">
											<xsl:value-of select="/request/columns/column[@id='PERFOMANCE_STATUS']/@caption"/>:
										</td>
										<td style="width:360px">
											<xsl:if test="viewcontent/type = '0'">
												<xsl:value-of select="/request/columns/column[@id='ERROR']/@caption"/>
											</xsl:if>
											<xsl:if test="viewcontent/type = '1'">
												<xsl:value-of select="/request/columns/column[@id='WITHOUT_ERROR']/@caption"/>
											</xsl:if>
										</td>
									</tr>
									<xsl:if test="viewcontent/type = '0'">
										<tr>
										<td style="width:240px; text-align:right">
											<xsl:value-of select="/request/columns/column[@id='ERROR_TYPE']/@caption"/>:
										</td>
										<td style="width:360px">
											<xsl:value-of select="viewcontent/comment"/>
										</td>
									</tr>
									</xsl:if>
									<tr>
										<td style="text-align:left; padding-left:15px;  padding-top:10px; color:#555555; border-bottom:1px solid #efefef; font-size:14px" colspan="2">
											<xsl:value-of select="/request/columns/column[@id='REQUEST_PART_TIME']/@caption"/>
										</td>
									</tr>
									<tr>
										<td style="padding-top:10px;width:240px; text-align:right">
											<xsl:value-of select="/request/columns/column[@id='SPRING_REQUEST_RECEIVING_TIME']/@caption"/>:
										</td>
										<td style="padding-top:10px; width:360px">
											<xsl:value-of select="viewcontent/requesttime"/>
										</td>
									</tr>
									<tr>
										<td style="width:240px; text-align:right">
											<xsl:value-of select="/request/columns/column[@id='ANSWER_REQUEST_TIME']/@caption"/>:
										</td>
										<td style="padding-top:10px; width:360px">
											<xsl:value-of select="viewcontent/returntime"/>
										</td>
									</tr>
									<tr>
										<td style="text-align:left; padding-left:15px;  padding-top:10px; color:#555555; border-bottom:1px solid #efefef; font-size:14px" colspan="2">
											<xsl:value-of select="/request/columns/column[@id='INPUT_PARAM']/@caption"/>
										</td>
									</tr>
									<tr>
										<td style="text-align:left; " colspan="2">
											<div style="border:1px solid #cdcdcd; min-height:50px; vertical-align:top; padding-left:3px; margin-top:5px">
												<xsl:value-of select="viewcontent/parameters"/>
											</div>
										</td>
									</tr>
								</table>
							</div>
							<div style="width:100%; height:40px; border-top:1px solid #cdcdcd; text-align:right;" id="activityinfo_button_panel{position()}">
								<button title="Закрыть" style="margin-right:15px; margin-top:7px">
									<xsl:attribute name="onclick">javascript:$("#activityinfo<xsl:value-of select='position()'/>").css("display","none"); $('#blockWindow').css("display","none");</xsl:attribute>
									<font style="font-size:12px; vertical-align:top"><xsl:value-of select="/request/columns/column[@id='CLOSE']/@caption"/></font>
								</button>
								<script type="text/javascript">    
									$(function() {
										$("#activityinfo_button_panel<xsl:value-of select='position()'/> button").button();
									});
								</script>
							</div>
						</div>
					</xsl:for-each>
					
					
					<span id="view" class="viewframe{outline/category[entry[@current=1]]/@id}">
						<div id="viewcontent" style="margin-left:12px;">
						<div id="viewcontent-header" style="height:100px;">
						
					</div>
					<div id="viewtablediv">
						<div id="tablecontent">
							<xsl:call-template name="viewinfo"/>
							<font style="font-size:25px; color:#111;"><xsl:value-of select="columns/column[@id='VIEW']/@caption"/></font>
								<div class="button_panel" style="">
								<script type="text/javascript">    
						       		$(function() {
										$(".button_panel button").button();
				        			});
	    						</script>
								<span style="float:left; margin-left:3px; margin-top:12px">
									<button title="{columns/column[@id='FILTER']/@caption}">
										<xsl:attribute name="onclick">javascript:addFilterActivity();</xsl:attribute>
										<font style="font-size:12px; vertical-align:top"><xsl:value-of select="columns/column[@id='FILTER']/@caption"/></font>
									</button>
									<button title="{columns/column[@id='RESET_FILTER']/@caption}" style="margin-left:5px">
										<xsl:attribute name="onclick">javascript:window.location.href="Provider?type=view&amp;id=monitoringservices&amp;users=&amp;dateto=&amp;datefrom=&amp;totalsfrom=&amp;totalsto=&amp;errorsonly=";</xsl:attribute>
										<font style="font-size:12px; vertical-align:top"><xsl:value-of select="columns/column[@id='RESET_FILTER']/@caption"/></font>
									</button>
								</span>
								<span style="float:right; padding-right:10px;"></span>
						</div>
						<br/>
						<br/>
						<div style="margin-top:5px; font-size:12px">
							<xsl:if test="count(/request/query/parameters/*[. ne ''])">
								<b><xsl:value-of select="columns/column[@id='FILTER']/@caption"/> :</b>
								<br/>
							</xsl:if>
							<xsl:if test="/request/query/parameters/datefrom != '' or /request/query/parameters/dateto != ''">
								<font style="margin-left:15px; padding:2px"><xsl:value-of select="columns/column[@id='DATE']/@caption"/>:   <xsl:value-of select="columns/column[@id='FROM']/@caption"/>  <xsl:value-of select="/request/query/parameters/datefrom"/>   <xsl:value-of select="columns/column[@id='TO']/@caption"/>  <xsl:value-of select="/request/query/parameters/dateto"/></font><br/>
							</xsl:if>
							<xsl:if test="/request/query/parameters/springserver != ''">
								<font style="margin-left:15px; padding:2px"><xsl:value-of select="columns/column[@id='SERVER_SPRING']/@caption"/> : <xsl:value-of select="/request/query/parameters/springserver"/> </font><br/>
							</xsl:if>
							<xsl:if test="/request/query/parameters/userid != ''">
								<font style="margin-left:15px; padding:2px"><xsl:value-of select="columns/column[@id='USER']/@caption"/> :  <xsl:value-of select="/request/query/parameters/userid"/></font><br/>
							</xsl:if>
							<xsl:if test="/request/query/parameters/services != ''">
								<font style="margin-left:15px; padding:2px"><xsl:value-of select="columns/column[@id='SERVICES_AND_METHODS']/@caption"/> :  <xsl:value-of select="/request/query/parameters/services"/></font><br/>
							</xsl:if>
							<xsl:if test="/request/query/parameters/difftimefrom != '' or /request/query/parameters/difftimeto !=''">
								<font style="margin-left:15px; padding:2px"><xsl:value-of select="columns/column[@id='TOTAL_TIME_REQUEST']/@caption"/>: <xsl:value-of select="columns/column[@id='FOR']/@caption"/>  <xsl:value-of select="/request/query/parameters/difftimefrom"/>  <xsl:value-of select="columns/column[@id='UP_TO']/@caption"/>  <xsl:value-of select="/request/query/parameters/difftimeto"/></font><br/>
							</xsl:if>
							<xsl:if test="/request/query/parameters/totalsfrom != '' or /request/query/parameters/totalto != ''">
								<font style="margin-left:15px; padding:2px"><xsl:value-of select="columns/column[@id='RECORD_COUNT']/@caption"/> :   <xsl:value-of select="columns/column[@id='FOR']/@caption"/>  <xsl:value-of select="/request/query/parameters/totalsfrom"/>   <xsl:value-of select="columns/column[@id='UP_TO']/@caption"/> <xsl:value-of select="/request/query/parameters/totalto"/></font><br/>
							</xsl:if>
							<xsl:if test="/request/query/parameters/errorsonly !=''">
								<font style="margin-left:15px; padding:2px"><xsl:value-of select="columns/column[@id='COME_ERROR']/@caption"/>: <xsl:if test="/request/query/parameters/errorsonly = 'true'"><xsl:value-of select="columns/column[@id='YES']/@caption"/></xsl:if><xsl:if test="/request/query/parameters/errorsonly = 'false'"><xsl:value-of select="columns/column[@id='NO']/@caption"/></xsl:if></font><br/>
							</xsl:if>
								
								
						</div>
							
							<br/>
							<div style="overflow:auto;">
								<table style="width:100%;border-collapse:collapse; font-size:14px;  margin-right:20px">
									<tr style="height:40px; background:#efefef; border:1px solid #ccc;">
										<td style="text-align:center; font-weight:bold; width:20px">
											<input type="checkbox" id="allchbox" onClick="checkAll(this);"/>	
										</td>
										<td style="text-align:center; font-weight:bold; width:160px ; padding:3px"><xsl:value-of select="columns/column[@id='DATE']/@caption"/></td>
										<td style="text-align:center; font-weight:bold;  width:160px; padding:3px"><xsl:value-of select="columns/column[@id='SERVER_SPRING']/@caption"/></td>
										<td style="text-align:center; font-weight:bold;  width:157px; padding:3px"><xsl:value-of select="columns/column[@id='USER']/@caption"/></td>
										<td style="text-align:center; font-weight:bold;  width:180px; padding:3px"><xsl:value-of select="columns/column[@id='SERVICE']/@caption"/></td>
										<td style="text-align:center; font-weight:bold; min-width:150px; padding:3px"><xsl:value-of select="columns/column[@id='METHOD']/@caption"/></td>
									</tr>
								</table>
								<div class="activiti" style="position:absolute; top:170px; bottom:0px; overflow-y:scroll; width:100%">
									<xsl:variable name ="i" select="count(/request/query/parameters/*[. ne ''])"/>
								<xsl:variable name ="i" select="if(/request/query/parameters/datefrom != '' and /request/query/parameters/dateto != '') then $i - 1 else $i"/>
								<xsl:variable name ="i" select="if(/request/query/parameters/difftimefrom != '' and /request/query/parameters/difftimeto !='') then $i - 1 else $i"/>
								<xsl:variable name ="i" select="if(/request/query/parameters/totalsfrom != '' and /request/query/parameters/totalto != '') then $i - 1 else $i"/>
									
									<xsl:if test="$i != 0">
										 	<xsl:attribute name="style">bottom:0px; overflow-y:scroll; width:100%; position:absolute; top:<xsl:number value="187 + ($i * 16)"/>px ;</xsl:attribute> 
									</xsl:if>
									<table class="viewtable" style="width:100%;border-collapse:collapse; font-size:12px;">
										<xsl:for-each select="query/entry">
											
											 <tr style="height:30px;">
												<td style="border:1px solid #ccc; text-align:center; width:20px">
													<input type="checkbox" name="chbox" id="{@docid}" value="{@doctype}"/>
												</td>
												<td  style="border:1px solid #ccc; text-align:left;  width:160px; word-wrap:break-word; padding:3px">
													<a href="javascript:$.noop()" title="{@viewtext}" class="doclink">
														<xsl:attribute name="onclick">javascript:$("#activityinfo<xsl:value-of select='position()'/>").css("display","block"); $('#blockWindow').css("display","block");</xsl:attribute>
														<xsl:if test="viewcontent/type = '0'">
													 		<xsl:attribute name="style"> color:#FF3F3F !important</xsl:attribute>
													 	</xsl:if>
														<xsl:value-of select="viewcontent/eventtime"/>
													</a>
												</td>
												<td style="border:1px solid #ccc; text-align:left;  width:160px; word-wrap:break-word; padding:3px">
													<a href="javascript:$.noop()" title="{@viewtext}" class="doclink">
														<xsl:attribute name="onclick">javascript:$("#activityinfo<xsl:value-of select='position()'/>").css("display","block"); $('#blockWindow').css("display","block");</xsl:attribute>
														<xsl:if test="viewcontent/type = '0'">
													 		<xsl:attribute name="style"> color:#FF3F3F !important</xsl:attribute>
													 	</xsl:if>
														<xsl:if test="@isread = '0'">
															<xsl:attribute name="style">font-weight:bold</xsl:attribute>
														</xsl:if>
														<xsl:value-of select="viewcontent/spring_server"/>
													</a>
												</td>
												<td  style="border:1px solid #ccc; text-align:left; width:157px; word-wrap:break-word; padding:3px">
													<a href="javascript:$.noop()" title="{@viewtext}" class="doclink">
														<xsl:attribute name="onclick">javascript:$("#activityinfo<xsl:value-of select='position()'/>").css("display","block"); $('#blockWindow').css("display","block");</xsl:attribute>
														<xsl:if test="viewcontent/type = '0'">
													 		<xsl:attribute name="style"> color:#FF3F3F !important</xsl:attribute>
													 	</xsl:if>
														<xsl:if test="@isread = '0'">
															<xsl:attribute name="style">font-weight:bold</xsl:attribute>
														</xsl:if>
														<xsl:value-of select="viewcontent/userid"/>
													</a>
												</td>
												<td style="border:1px solid #ccc; text-align:left;  width:180px; word-wrap:break-word; padding:3px">
													<a href="javascript:$.noop()" title="{@viewtext}" class="doclink">
														<xsl:attribute name="onclick">javascript:$("#activityinfo<xsl:value-of select='position()'/>").css("display","block"); $('#blockWindow').css("display","block");</xsl:attribute>
														<xsl:if test="viewcontent/type = '0'">
													 		<xsl:attribute name="style"> color:#FF3F3F !important</xsl:attribute>
													 	</xsl:if>
														<xsl:if test="@isread = '0'">
															<xsl:attribute name="style">font-weight:bold</xsl:attribute>
														</xsl:if>
														<xsl:value-of select="viewcontent/service_name"/>
													</a>
												</td>
												<td  style="border:1px solid #ccc; text-align:left; min-width:150px; word-wrap:break-word; padding:3px">
													<a href="javascript:$.noop()" title="{@viewtext}" class="doclink">
														<xsl:attribute name="onclick">javascript:$("#activityinfo<xsl:value-of select='position()'/>").css("display","block"); $('#blockWindow').css("display","block");</xsl:attribute>
														<xsl:if test="viewcontent/type = '0'">
													 		<xsl:attribute name="style"> color:#FF3F3F !important</xsl:attribute>
													 	</xsl:if>
														<xsl:if test="@isread = '0'">
															<xsl:attribute name="style">font-weight:bold</xsl:attribute>
														</xsl:if>
														<xsl:value-of select="viewcontent/method_name"/>
													</a>
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