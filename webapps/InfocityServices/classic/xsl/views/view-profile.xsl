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
								<font>Сотрудник - Фамилия Имя Отчество</font>
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
											ФИО :
										</td>
										<td>
											<table>
												<tr>
													<td class="td_editable" style="width:500px">
														Фамилия Имя Отчество
													</td>
												</tr>
											</table>
										</td>
									</tr>					
									<tr>
										<td class="fc">
											Департамент :
										</td>
										<td>
											<table>
												<tr>
													<td class="td_editable" style="width:500px">
														УДП
													</td>
												</tr>
											</table>
										</td>
						    		</tr>
						    		<tr>
										<td class="fc">
											Должность :
										</td>
										<td>
											<table>
												<tr>
													<td class="td_editable" style="width:500px">
														Аналитик
													</td>
												</tr>
											</table>
										</td>
									</tr>					
	                 			</table>
	                 			<br/>
	                 			<table style="width:85%; margin: 10px auto; border-collapse:collapse; font-size:14px">
								<tr style="height:35px;">
									<td style="border:1px solid black; text-align:center; font-weight:bold">Дата</td>
									<td style="border:1px solid black; text-align:center; font-weight:bold ">Действие</td>
									<td style="border:1px solid black; text-align:center; font-weight:bold ">Статус</td>
									<td style="border:1px solid black; text-align:center; font-weight:bold ">Результат</td>
									<td style="border:1px solid black; text-align:center; font-weight:bold">Примечание</td>
								</tr>
								<tr style="color:#444444">
									<td style="border:1px solid black; text-align:center">02.02.2012 15:36:48</td>
									<td style="border:1px solid black; text-align:center">Авторизация пользователя</td>
									<td style="border:1px solid black; text-align:center; color:green">выполнено</td>
									<td style="border:1px solid black; text-align:center">Вход в систему разрешен</td>
									<td style="border:1px solid black; text-align:center"></td>
								</tr>
								<tr style="color:#444444">
									<td style="border:1px solid black; text-align:center">02.02.2012 15:38:21</td>
									<td style="border:1px solid black; text-align:center">Поиск 1269 : Налоговый комитет - Регистрационные данные - по ФИО запрос: Иванов Иван * </td>
									<td style="border:1px solid black; text-align:center; color:green">выполнено</td>
									<td style="border:1px solid black; text-align:center">найдено: 8 элементов</td>
									<td style="border:1px solid black; text-align:center">время поиска : 5.26 c </td>
								</tr>
								<tr style="color:#444444">
									<td style="border:1px solid black; text-align:center">02.02.2012 15:48:03</td>
									<td style="border:1px solid black; text-align:center">Завершение работы системы</td>
									<td style="border:1px solid black; text-align:center; color:green">выполнено</td>
									<td style="border:1px solid black; text-align:center">выход из системы</td>
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
<div id="outline">
						<div id="outline-container" style="width:300px; padding-top:10px">
							<xsl:for-each select="document/outline/entry">
								<div  style="">
									<div class="treeentry" style="height:17px; padding:3px 0px 3px 0px  ; border:1px solid #F9F9F9; width:290px">								
										<img src="/SharedResources/img/classic/1/minus.png" style="margin-left:6px; cursor:pointer" alt="">
											<xsl:attribute name="onClick">javascript:ToggleCategory(this)</xsl:attribute>
										</img>
										<img src="/SharedResources/img/classic/1/folder_open_view.png" style="margin-left:5px; " alt="">
										</img>
										<font style="font-family:arial; font-size:0.9em; margin-left:4px; vertical-align:3px">											
											<xsl:value-of select="@hint"/>
										</font>
									</div>
									<div style="clear:both;"/>
									<div class="outlineEntry">
										<xsl:for-each select="entry">
											<div class="entry treeentry" style="width:290px; padding:3px 0px 3px 0px; border:1px solid #F9F9F9; ">
												<div class="viewlink" style="height:18px; ">
													<xsl:if test="@current = '1'">
														<xsl:attribute name="class">viewlink_current</xsl:attribute>										
													</xsl:if>	
													<xsl:if test="/request/@id = @id">
														<xsl:attribute name="class">viewlink_current</xsl:attribute>										
													</xsl:if>	
													<div style="float:left; ">
														<img src="/SharedResources/img/classic/1/doc_view.png" style="margin-left:42px; cursor:pointer" alt="">
														</img>	
														<a href="{@url}" style="width:90%; vertical-align:top; text-decoration:none !important">
															<xsl:if test="../@id = 'filters'">
																<xsl:attribute name="href"><xsl:value-of select="@url"/>&amp;filterid=<xsl:value-of select="@id"/></xsl:attribute>
															</xsl:if>
															<font class="viewlinktitle">	
																 <xsl:value-of select="@caption"/>
															</font>
														</a>
													</div>
													<xsl:if test="../@id = 'mydocs'">
														<span style=" text-align:left; float:right; ">
															<font class="countSpan" style="vertical-align:top">
																<xsl:if test="@id!=''">	
																	<xsl:attribute name="id" select="@id"/>
																</xsl:if>	
																<xsl:if test="string-length(@count)!=0">
																	<xsl:value-of select="@count"/>
																</xsl:if>												
															</font>
														</span>
													</xsl:if>
												</div>
											</div>
										</xsl:for-each>
									</div>
								</div>
							</xsl:for-each>
						</div>
					</div>
					<div id="resizer" style="position:absolute; top: 80px; left:1px; background:#E6E6E6; width:12px; bottom:0px; border-radius: 0 6px 6px 0; border: 1px solid #adadad; border-left: ; cursor:pointer" onclick="javascript: openformpanel()">
						<span  id="iconresizer" class="ui-icon ui-icon-triangle-1-e" style="margin-left:-2px; position:relative; top:49%"></span>
					</div>
	        </body>
		</html>
	</xsl:template>
</xsl:stylesheet>