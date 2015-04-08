<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:import href="../templates/sharedactions.xsl"/>
	<xsl:import href="../templates/form.xsl"/>
	<xsl:output method="html" encoding="utf-8" doctype-public="-//W3C//DTD XHTML 1.0 Transitional//EN"
		doctype-system="http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd" indent="yes"/>
	<xsl:variable name="doctype" select="request/document/captions/doctypemultilang/@caption"/>
	<xsl:variable name="skin" select="request/@skin"/>
	<xsl:variable name="editmode" select="request/document/@editmode"/>
	<xsl:template match="request">
		<xsl:variable name="path" select="/request/@skin"/>
		<html>
	  		<head>
	 			<title>
	 				<xsl:value-of select="concat('Администратор ЕИС &quot;Город&quot; - ',document/captions/employer/@caption,': ',document/fields/fullname)"/>
	 			</title>
	     		<xsl:call-template name="cssandjs"/>
	     		<script type="text/javascript">
					$(document).ready(function(){
						if ($.cookie("refresh") != null){ $("[name=refresh] #"+$.cookie("refresh")).attr("selected","selected")}
						if ($.cookie("lang") != null){ $("[name=lang] #"+$.cookie("lang")).attr("selected","selected")}
						if ($.cookie("pagesize") != null){
							$("[name=countdocinview] #countdocinview"+$.cookie("pagesize")).attr("selected","selected")
						}
					});
				</script>
	    	</head>
	    	<body>  
	    		<div id="docwrapper">
	    			<xsl:call-template name="documentheader2"/>
					<div class="formwrapper">
	            		<div  class="formtitle">
							<div class="title">
								<font>
									<xsl:value-of select="concat(document/captions/employer/@caption,' - ', document/fields/shortname)"/>
								</font>
							</div>
						</div>
		            	<div class="button_panel">
							<span style="float:left">
		             			<button class="ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only" title="Сохранить и закрыть" id="btnsavedoc">
									<xsl:attribute name="onclick">javascript:saveUserProfile('<xsl:value-of select="substring-after(history/entry[@type eq 'outline'][last()],'/Workflow/')"/>')</xsl:attribute>
									<span>
										<img src="/SharedResources/img/iconset/disk.png" style="border:none; width:15px; height:15px; margin-right:3px; vertical-align:top"></img>
										<font style="font-size:12px; vertical-align:top"><xsl:value-of select="document/captions/saveandclose/@caption"/></font>
									</span>
								</button>
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
											<xsl:value-of select="document/captions/fio/@caption"/> :
										</td>
										<td>
											<table>
												<tr>
													<td class="td_noteditable" style="width:500px">
														<xsl:value-of select="document/fields/shortname"/>
													</td>
												</tr>
											</table>
										</td>
									</tr>
									<tr>
										<td class="fc">ID :</td>
										<td>
											<table>
												<tr>
													<td class="td_noteditable" style="width:500px">
														<xsl:value-of select="document/fields/userid"/>
													</td>
												</tr>
											</table>
											<input type="hidden" name="userid" value="{document/fields/userid}"/>
										</td>
									</tr>							
									<tr>
										<td class="fc"><xsl:value-of select="document/captions/oldpassword/@caption"/> :</td>
										<td>
											<input style="width:300px;" class="td_editable" id="oldpwd" name="oldpwd" type="password">
												<xsl:if test="$editmode != 'edit'">
													<xsl:attribute name="class">td_noteditable</xsl:attribute>
												</xsl:if>
											</input>
										</td>
									</tr>
									<tr>
										<td class="fc"><xsl:value-of select="document/captions/newpassword/@caption"/> :</td>
										<td>
											<input style="width:300px;" id="newpwd" name="pwd" type="password" class="td_editable">
												<xsl:if test="$editmode != 'edit'">
													<xsl:attribute name="class">td_noteditable</xsl:attribute>
												</xsl:if>
											</input>
										</td>
									</tr>
									<tr>
										<td class="fc"><xsl:value-of select="document/captions/repeatnewpassword/@caption"/> :</td>
										<td>
											<input style="width:300px;" id="newpwd2"  name="pwd2" type="password" class="td_editable">
												<xsl:if test="$editmode != 'edit'">
													<xsl:attribute name="class">td_noteditable</xsl:attribute>
												</xsl:if>
											</input>
										</td>
									</tr>
									<tr>	
							    		<td class="fc"><xsl:value-of select="document/captions/lang/@caption"/> :</td>
								   		<td width="69%">
											<select name="lang" id="lang" class="select_editable" style="width:120px">
												<xsl:variable name='chinese' select="document/captions/chinese/@caption"/>
												<xsl:variable name='currentlang' select="../@lang"/>
<!-- 												<xsl:attribute name="onchange">javascript:changeSystemSettings(this)</xsl:attribute> -->
												<xsl:for-each select="document/glossaries/langs/entry">
													<option id="{id}" value="{id}">
														<xsl:if test="$currentlang = id">
															<xsl:attribute name="selected">selected</xsl:attribute>
														</xsl:if>
														<xsl:if test="id = 'CHN'">
															<xsl:value-of select="$chinese"/>
														</xsl:if>
														<xsl:if test="id != 'CHN'">
															<xsl:value-of select="name"/>
														</xsl:if>
													</option>
												</xsl:for-each>
											</select>
										</td>
									</tr>
									<tr>	
							    		<td class="fc">
							    			<xsl:value-of select="document/fields/countdocinview/@caption"/>&#xA0;:
							    		</td>
										<td width="69%">
											<select name="pagesize" id="countdocinview" class="select_editable" style="width:85px">
												<xsl:if test="$editmode != 'edit'">
													<xsl:attribute name="class">select_noteditable</xsl:attribute>
												</xsl:if>
												<option id="countdocinview10">
													<xsl:if test="document/fields/countdocinview = '10'">
														<xsl:attribute name="selected">selected</xsl:attribute>
													</xsl:if>10
												</option>
												<option id="countdocinview20">
													<xsl:if test="document/fields/countdocinview = '20'">
														<xsl:attribute name="selected">selected</xsl:attribute>
													</xsl:if>20
												</option>
												<option id="countdocinview30">
													<xsl:if test="document/fields/countdocinview = '30'">
														<xsl:attribute name="selected">selected</xsl:attribute>
													</xsl:if>30
												</option>
												<option id="countdocinview50">
													<xsl:if test="document/fields/countdocinview = '50'">
														<xsl:attribute name="selected">selected</xsl:attribute>
													</xsl:if>50
												</option>
											</select>
										</td>
									</tr>					
	                 			</table>
	                 			<br/>
	                 			<table style="width:85%; margin: 10px auto; border-collapse:collapse; font-size:14px; display:none">
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
	        </body>
		</html>
	</xsl:template>
</xsl:stylesheet>