﻿<?xml version="1.0" ?>
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
							<font style="font-size:25px; color:#111; ">Налоговый комитет - регистрационные данные</font>
							<br/>
							<br/>
							<table style="border-collapse:collapse;  font-family:Arial; color:#111; margin: 45px 0px 10px;" width="620px">
								<tr>
									<td style="font-size:16px; text-align:right;">Фамилия :</td>
									<td><input type="text" style="width:300px; padding:2px;"/></td>
									<td>
										<select style="width:200px; margin-left:10px; padding:2px">
											<option>По ФИО</option>
										</select>
									</td>
								</tr>
								<tr>
									<td style="font-size:16px; text-align:right;">Имя :</td>
									<td><input type="text" style="width:300px; padding:2px;"/></td>
									<td></td>
								</tr>
								<tr>
									<td style="font-size:16px; text-align:right;">Отчество :</td>
									<td><input type="text" style="width:300px; padding:2px;"/></td>
									<td></td>
								</tr>
								<!--  <tr>
									<td style="font-size:16px; text-align:right;">ИНН :</td>
									<td><input type="text" style="width:400px; padding:3px;"/></td>
								</tr>
								<tr>
									<td style="font-size:16px; text-align:right;">РНН :</td>
									<td><input type="text" style="width:400px; padding:3px;"/></td>
								</tr>-->
								<tr>
									<td style="width:400px; padding:3px; text-align:left"></td>
									<td style="font-size:16px; text-align:right;"><br/><button class="button">Выполнить</button></td>
									<td></td>
								</tr>
							</table>
							<div style="clear:both; width:100%">&#xA0;</div>
							<br/>
							<br/>
							<table style="width:100%;border-collapse:collapse; font-size:14px">
								<tr style="height:40px; background:#efefef">
									<td style="border:1px solid #ccc; text-align:center"></td>
									<td style="border:1px solid #ccc; text-align:center; font-weight:bold ">ФИО</td>
									<td style="border:1px solid #ccc; text-align:center; font-weight:bold">Дата рождения</td>
									<td style="border:1px solid #ccc; text-align:center; font-weight:bold">Адрес проживания(регистрации)</td>
									<td style="border:1px solid #ccc; text-align:center; font-weight:bold">РНН</td>
								</tr>
								<tr style="color:#444444;height:30px;">
									<td style="border:1px solid #ccc; text-align:center"><input type="radio"/></td>
									<td style="border:1px solid #ccc; text-align:center">Троицкий Андрей Иванович</td>
									<td style="border:1px solid #ccc; text-align:center">10.10.1963</td>
									<td style="border:1px solid #ccc; text-align:center">Алматинская г.Алматы Бокейханова 123</td>
									<td style="border:1px solid #ccc; text-align:center">600500115336</td>
								</tr>
								<tr style="color:#444444;height:30px;">
									<td style="border:1px solid #ccc; text-align:center"><input type="radio"/></td>
									<td style="border:1px solid #ccc; text-align:center">Троицкий Андрей Иванович</td>
									<td style="border:1px solid #ccc; text-align:center">25.05.1988</td>
									<td style="border:1px solid #ccc; text-align:center">Алматинская г.Алматы Кунаева 56</td>
									<td style="border:1px solid #ccc; text-align:center">600500115336</td>
								</tr>
								<tr style="color:#444444;height:30px;">
									<td style="border:1px solid #ccc; text-align:center"><input type="radio"/></td>
									<td style="border:1px solid #ccc; text-align:center">Троицкий Андрей Иванович</td>
									<td style="border:1px solid #ccc; text-align:center">03.01.1976</td>
									<td style="border:1px solid #ccc; text-align:center">Алматинская г.Алматы Абая 235</td>
									<td style="border:1px solid #ccc; text-align:center">600500115336</td>
								</tr>
								<tr style="color:#444444">
									<td style="text-align:left" colspan="5">
									</td>
								</tr>
								<tr style="color:#444444">
									<td colspan="2"> Найдено : 3
									</td>
									<td style="text-align:right; padding-top:25px" colspan="3">
									
										<button class="button">Далее</button><button class="button" style="margin-left:10px">Печать</button>
									</td>
								</tr>
							</table>
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