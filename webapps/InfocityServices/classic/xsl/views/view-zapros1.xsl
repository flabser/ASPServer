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
				<title>EIS - <xsl:value-of select="/request/@title"/></title>
				<link type="text/css" rel="stylesheet" href="classic/css/outline.css"/>
				<link type="text/css" rel="stylesheet" href="classic/css/main.css"/>
				<link type="text/css" href="/SharedResources/jquery/css/base/jquery-ui-1.8.2.redmont.css" rel="stylesheet" />
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
							<font style="font-size:22px; color:#444444; margin-left:35px">Запрос данных о физическом лице</font>
							<br/>
							<br/>
							<table style="border-collapse:collapse;  font-family:Verdana; color:#444444; margin: 70px auto 10px;" width="572px">
								<tr>
									<td style="font-size:16px; text-align:right;">Фамилия :</td>
									<td><input type="text" style="width:400px; padding:3px;"/></td>
								</tr>
								<tr>
									<td style="font-size:16px; text-align:right;">Имя :</td>
									<td><input type="text" style="width:400px; padding:3px;"/></td>
								</tr>
								<tr>
									<td style="font-size:16px; text-align:right;">Отчество :</td>
									<td><input type="text" style="width:400px; padding:3px;"/></td>
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
									<td style="font-size:16px; text-align:right;"></td>
									<td style="width:400px; padding:3px; text-align:right"><br/><button class="button">Выполнить</button></td>
								</tr>
							</table>
							<div style="clear:both; width:100%">&#xA0;</div>
							<div style="width:100% ; height:1px; background:#6790B3"/>
							<table style="width:85%; margin: 10px auto; border-collapse:collapse; font-size:14px">
								<tr style="height:35px;">
									<td style="border:1px solid black; text-align:center"></td>
									<td style="border:1px solid black; text-align:center; font-weight:bold ">ФИО</td>
									<td style="border:1px solid black; text-align:center; font-weight:bold">Дата рождения</td>
									<td style="border:1px solid black; text-align:center; font-weight:bold">РНН</td>
									<td style="border:1px solid black; text-align:center; font-weight:bold">Адрес проживания(регистрации)</td>
								</tr>
								<tr style="color:#444444">
									<td style="border:1px solid black; text-align:center"><input type="radio"/></td>
									<td style="border:1px solid black; text-align:center">Иванов Иван Иванович</td>
									<td style="border:1px solid black; text-align:center">10.12.1980</td>
									<td style="border:1px solid black; text-align:center">600500156897</td>
									<td style="border:1px solid black; text-align:center">Алматинская г.Алматы Абая 12 </td>
								</tr>
								<tr style="color:#444444">
									<td style="border:1px solid black; text-align:center"><input type="radio"/></td>
									<td style="border:1px solid black; text-align:center">Иванов Иван Петрович</td>
									<td style="border:1px solid black; text-align:center">18.01.1976</td>
									<td style="border:1px solid black; text-align:center">600300158788</td>
									<td style="border:1px solid black; text-align:center">Алматинская г.Алматы Гоголя 156 </td>
								</tr>
								<tr style="color:#444444">
									<td style="border:1px solid black; text-align:center"><input type="radio"/></td>
									<td style="border:1px solid black; text-align:center">Иванов Иван Андреевич</td>
									<td style="border:1px solid black; text-align:center">01.04.1990</td>
									<td style="border:1px solid black; text-align:center">600565558775</td>
									<td style="border:1px solid black; text-align:center">Алматинская г.Алматы Суюнбая 264 </td>
								</tr>
								<tr style="color:#444444">
									<td style="border:1px solid black; text-align:center"><input type="radio"/></td>
									<td style="border:1px solid black; text-align:center">Иванов Иван Николаевич</td>
									<td style="border:1px solid black; text-align:center">01.04.1960</td>
									<td style="border:1px solid black; text-align:center">600588896775</td>
									<td style="border:1px solid black; text-align:center">Алматинская г.Алматы Серикова 12 </td>
								</tr>
								<tr style="color:#444444">
									<td style="border:1px solid black; text-align:center"><input type="radio"/></td>
									<td style="border:1px solid black; text-align:center">Иванов Иван Николаевич</td>
									<td style="border:1px solid black; text-align:center">01.04.1960</td>
									<td style="border:1px solid black; text-align:center">600588896775</td>
									<td style="border:1px solid black; text-align:center">Алматинская г.Алматы Жулдыз-2 12 </td>
								</tr>
								<tr style="color:#444444">
									<td style="border:1px solid black; text-align:center"><input type="radio"/></td>
									<td style="border:1px solid black; text-align:center">Иванов Иван Леонидович</td>
									<td style="border:1px solid black; text-align:center">01.12.1982</td>
									<td style="border:1px solid black; text-align:center">600575116775</td>
									<td style="border:1px solid black; text-align:center">Алматинская г.Алматы Алтай-1 58 </td>
								</tr>
								<tr style="color:#444444">
									<td style="border:1px solid black; text-align:center"><input type="radio"/></td>
									<td style="border:1px solid black; text-align:center">Иванов Иван Андреевич</td>
									<td style="border:1px solid black; text-align:center">01.04.1990</td>
									<td style="border:1px solid black; text-align:center">600336558994</td>
									<td style="border:1px solid black; text-align:center">Алматинская г.Алматы Гоголя 1 </td>
								</tr>
								<tr style="color:#444444">
									<td style="border:1px solid black; text-align:center"><input type="radio"/></td>
									<td style="border:1px solid black; text-align:center">Иванов Иван Валентинович</td>
									<td style="border:1px solid black; text-align:center">01.04.1956</td>
									<td style="border:1px solid black; text-align:center">600686545455</td>
									<td style="border:1px solid black; text-align:center">Алматинская г.Алматы Карасай Батыра 6 </td>
								</tr>
								<tr style="color:#444444">
									<td style="text-align:left" colspan="5">
									</td>
								</tr>
								<tr style="color:#444444">
									<td style="text-align:left; padding-top:25px" colspan="5">
										<button class="button">Далее</button><button class="button" style="margin-left:10px">Печать</button>
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