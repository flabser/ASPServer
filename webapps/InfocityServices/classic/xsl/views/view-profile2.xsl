<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:import href="../templates/sharedactions.xsl"/>
	<xsl:import href="../templates/form.xsl"/>
	<xsl:import href="../templates/view.xsl"/>
	<xsl:output method="html" encoding="utf-8" doctype-public="-//W3C//DTD XHTML 1.0 Transitional//EN"
		doctype-system="http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd" indent="yes"/>
	<xsl:variable name="doctype" select="request/document/captions/doctypemultilang/@caption"/>
	<xsl:variable name="skin" select="request/@skin"/>
	<xsl:template match="request">
		<xsl:variable name="path" select="/request/@skin"/>
		<html>
	  		<head>
	 			<title>Сотрудник: <xsl:value-of select="document/fields/fullname"/> - Web Technical Supervision</title>
	     		<xsl:call-template name="cssandjs"/>
	    	</head>
	    	<body>  
	    		<div id="docwrapper">
	    			<xsl:call-template name="header-view"/>
					<div class="formwrapper">
	            		<div  class="formtitle">
							<div class="title">
								<font>Личный кабинет</font>
							</div>
						</div>
		            	<div class="button_panel">
							<span style="float:left">
							</span>
							<span style="float:right; margin-right:5px">
			            		<xsl:call-template name="cancel"/>
			            	</span>
		 	         	</div>            			     
						<br/>
						<div style="clear:both"/>
						<div style="-moz-border-radius:0px;height:1px; width:100%; margin-top:10px;"/>
						<div style="clear:both"/>
						<div id="tabs">
							<form action="Provider" name="frm" method="post" id="frm" enctype="application/x-www-form-urlencoded">
							<div class="ui-tabs-panel" id="tabs-1">
							<div display="block"  id="property" width="100%">
								<br/>
	      	    				<table width="80%" border="0" style="margin-top:8px">
				 					<tr>
										<td class="fc">
											Фамилия :
										</td>
										<td>
											<table>
												<tr>
													<td class="td_editable" style="width:400px">
														Бутова
													</td>
												</tr>
											</table>
										</td>
									</tr>					
				 					<tr>
										<td class="fc">
											Имя :
										</td>
										<td>
											<table>
												<tr>
													<td class="td_editable" style="width:400px">
														Алина
													</td>
												</tr>
											</table>
										</td>
									</tr>					
				 					<tr>
										<td class="fc">
											Отчество :
										</td>
										<td>
											<table>
												<tr>
													<td class="td_editable" style="width:400px">
														Васильевна
													</td>
												</tr>
											</table>
										</td>
									</tr>					
	                 			</table>
	                 			<br/>
	                 			<table style="width:99%; margin: 30px auto; border-collapse:collapse; font-size:14px">
								<tr style="height:35px;">
									<td style="border:1px solid black; text-align:center; font-weight:bold">Дата</td>
									<td style="border:1px solid black; text-align:center; font-weight:bold ">Операция</td>
									<td style="border:1px solid black; text-align:center; font-weight:bold ">Статус выполнения</td>
									<td style="border:1px solid black; text-align:center; font-weight:bold ">Дополнительно</td>
								</tr>
								<tr style="color:#000">
									<td style="border:1px solid black; text-align:center">01-05-2012 09:01:11</td>
									<td style="border:1px solid black; text-align:center">Вход пользователя в систему</td>
									<td style="border:1px solid black; text-align:center;">выполнено</td>
									<td style="border:1px solid black; text-align:center"></td>
								</tr>
								<tr style="color:#000">
									<td style="border:1px solid black; text-align:center">01-05-2012 09:15:26</td>
									<td style="border:1px solid black; text-align:center">Поиск 568 (Налоговый комитет  Регистрационные данные  по ФИО) текст поиска: Троицкий Андрей Иванович </td>
									<td style="border:1px solid black; text-align:center;">выполнено</td>
									<td style="border:1px solid black; text-align:center">найдено: совпадений 3</td>
								</tr>
								<tr style="color:#000">
									<td style="border:1px solid black; text-align:center">01-05-2012 09:36:31</td>
									<td style="border:1px solid black; text-align:center">Поиск 575 (ДГАСК  строительство  по РНН застройщика) текст поиска: 003006888654 </td>
									<td style="border:1px solid black; text-align:center;">выполнено</td>
									<td style="border:1px solid black; text-align:center">найдено: совпадений 1</td>
								</tr>
								<tr style="color:#000">
									<td style="border:1px solid black; text-align:center">01-05-2012 09:39:03</td>
									<td style="border:1px solid black; text-align:center">Поиск 579 (ДГАСК  строительство  по РНН застройщика) текст поиска: 003006811200 </td>
									<td style="border:1px solid black; text-align:center;">выполнено</td>
									<td style="border:1px solid black; text-align:center">найдено: совпадений 0</td>
								</tr>
								<tr style="color:#000">
									<td style="border:1px solid black; text-align:center">01-05-2012 09:39:53</td>
									<td style="border:1px solid black; text-align:center">Поиск 580 (ДГАСК  строительство  по ФИО застройщика) текст поиска: Дастанов * * </td>
									<td style="border:1px solid black; text-align:center;">выполнено</td>
									<td style="border:1px solid black; text-align:center">найдено: 2 совпадения</td>
								</tr>
								<tr style="color:#000">
									<td style="border:1px solid black; text-align:center">01-05-2012 09:42:48</td>
									<td style="border:1px solid black; text-align:center">печать документа -Поиск 580 </td>
									<td style="border:1px solid black; text-align:center;">выполнено</td>
									<td style="border:1px solid black; text-align:center"></td>
								</tr>
							</table>
	           				</div>
	           			</div>
							<input type="hidden" name="type" value="save_userprofile"/>
							<input type="hidden" name="id" value="userprofile"/>
	        			</form>
	        		</div>
	        		<div style="height:10px"/>
	        	</div>
	        	</div>
	        </body>
		</html>
	</xsl:template>
</xsl:stylesheet>