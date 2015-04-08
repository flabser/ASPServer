<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:import href="../templates/form.xsl"/>
	<xsl:import href="../templates/sharedactions.xsl"/>
	<xsl:variable name="doctype"><xsl:value-of select="request/document/captions/doctypemultilang/@caption"/></xsl:variable>
	<xsl:variable name="threaddocid" select="document/@granddocid"/>
	<xsl:variable name="path" select="/request/@skin"/>
	<xsl:output method="html" encoding="utf-8" doctype-public="-//W3C//DTD XHTML 1.0 Transitional//EN"
		doctype-system="http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd" indent="yes"/>
	<xsl:variable name="skin" select="request/@skin"/>
	<xsl:template match="/request">
	<xsl:variable name="filename" select="document/fields/pdocrtfcontent"/>
		<html>
			<head>
				<title>
					<xsl:value-of select="concat('Администратор ЕИС &quot;Город&quot; - ', 'Статистика сервиса')"/>
				</title>
				<xsl:call-template name="cssandjs"/>
				<xsl:call-template name="markisread"/>
				<script type="text/javascript">
   					$(document).ready(function(){
						findStatisticServices()
					})
				</script>
			</head>
			<body>
				<div id="docwrapper">
					<xsl:call-template name="documentheader"/>	
					<div class="formwrapper">
						<div class="formtitle">
							<div style="float:left" class="title">
								Статистика сервиса
							</div>
						</div>	
						<div class="button_panel">
							<span style="vertical-align:12px; float:left">
							</span>
							<span style="float:right">
				            	<xsl:call-template name="cancel"/>
				            </span>
		           		</div>
						<div style="clear:both"/>
						<div style="-moz-border-radius:0px;height:1px; width:100%; margin-top:10px;"/>
						<div style="clear:both"/>
						<div id="tabs">
							<ul class="ui-tabs-nav ui-helper-reset ui-helper-clearfix ui-widget-header ui-corner-all">
								<li class="ui-state-default ui-corner-top">
									<a href="#tabs-1">Активность</a>
								</li>
							</ul>
							<div class="ui-tabs-panel" id="tabs-1">
								
									<div display="block"  id="property">
											<div id="navigate" style="margin-top:10px">
												<xsl:variable name="currentpage" select="page/script_result/response/content/root/@currentpage"/>
												<xsl:variable name="maxpage" select="page/script_result/response/content/root/@maxpage"/>
												<xsl:variable name="userid" select="page/script_result/response/content/root/@user"/>
												<xsl:if test="$maxpage &gt; 1">
													<xsl:if test="$currentpage != 1">
														<a href="" class="doclink" style="margin-left:5px; font-size:1em">
															<xsl:attribute name="href">Provider?type=page&amp;id=reportstatistics&amp;element=document&amp;userid=<xsl:value-of select="$userid"/>&amp;key=&amp;page=1</xsl:attribute>
															&lt;&lt;
														</a>
														<a href="" class="doclink" style="margin-left:5px; font-size:1em">
															<xsl:attribute name="href">Provider?type=page&amp;id=reportstatistics&amp;element=document&amp;userid=<xsl:value-of select="$userid"/>&amp;key=&amp;page=<xsl:value-of select="$currentpage - 1"/></xsl:attribute>
															&lt;
														</a>
													</xsl:if>
													<xsl:if test="$maxpage &gt; 9"> 
														<xsl:if test="$maxpage - $currentpage &gt; 4"> 
															<xsl:if test="$currentpage &lt; 5"> 
																<xsl:for-each select="1 to 9">
																	<a href="" class="doclink" style="margin-left:5px; font-size:1em">
																		<xsl:if test="position() = $currentpage">
																			<xsl:attribute name="style">margin-left:5px; font-size:1.2em; font-weight:bold</xsl:attribute>
																		</xsl:if>
																		<xsl:attribute name="href">Provider?type=page&amp;id=reportstatistics&amp;element=document&amp;userid=<xsl:value-of select="$userid"/>&amp;key=&amp;page=<xsl:value-of select="position()"/></xsl:attribute>
																		<xsl:value-of select="position()"/>
																	</a>
																</xsl:for-each>
															</xsl:if>
															<xsl:if test="$currentpage &gt; 4"> 
																<xsl:for-each select="1 to 9">
																	<a href="" class="doclink" style="margin-left:5px; font-size:1em">
																		<xsl:if test="($currentpage - 4) + position() - 1 = $currentpage">
																			<xsl:attribute name="style">margin-left:5px; font-size:1.2em; font-weight:bold</xsl:attribute>
																		</xsl:if>
																		<xsl:attribute name="href">Provider?type=page&amp;id=reportstatistics&amp;element=document&amp;userid=<xsl:value-of select="$userid"/>&amp;key=&amp;page=<xsl:value-of select="($currentpage - 4) + position() - 1"/></xsl:attribute>
																		<xsl:value-of select="($currentpage - 4) + position() - 1"/>
																	</a>
																</xsl:for-each>
															</xsl:if>
														</xsl:if>
														<xsl:if test="$maxpage - $currentpage &lt; 5"> 
															<!-- 	начинаем отсчет с maxpage - 8 -->
															<xsl:for-each select="1 to 9">
																<a href="" class="doclink" style="margin-left:5px; font-size:1em">
																	<xsl:if test="($maxpage - 8) + position() - 1  = $currentpage">
																		<xsl:attribute name="style">margin-left:5px; font-size:1.2em; font-weight:bold</xsl:attribute>
																	</xsl:if>
																	<xsl:attribute name="href">Provider?type=page&amp;id=reportstatistics&amp;element=document&amp;userid=<xsl:value-of select="$userid"/>&amp;key=&amp;page=<xsl:value-of select="($maxpage -8) + position() - 1"/></xsl:attribute>
																	<xsl:value-of select="($maxpage - 8) + position() - 1"/>
																</a>
															</xsl:for-each>
														</xsl:if>
													</xsl:if>
													<xsl:if test="$maxpage &lt; 9"> 
														<xsl:for-each select="1 to $maxpage">
															<a href="" class="doclink" style="margin-left:5px; font-size:1em">
																<xsl:if test="position() = $currentpage">
																	<xsl:attribute name="style">margin-left:5px; font-size:1.2em; font-weight:bold</xsl:attribute>
																</xsl:if>
																<xsl:attribute name="href">Provider?type=page&amp;id=reportstatistics&amp;element=document&amp;userid=<xsl:value-of select="$userid"/>&amp;key=&amp;page=<xsl:value-of select="position()"/></xsl:attribute>
																<xsl:value-of select="position()"/>
															</a>
														</xsl:for-each>
													</xsl:if>
													<xsl:if test="$currentpage != $maxpage">
														<a href="" class="doclink" style="margin-left:5px; font-size:1em">
															<xsl:attribute name="href">Provider?type=page&amp;id=reportstatistics&amp;element=document&amp;userid=<xsl:value-of select="$userid"/>&amp;key=&amp;page=<xsl:value-of select="$currentpage + 1"/></xsl:attribute>
															&gt;
														</a>
														<a href="" class="doclink" style="margin-left:5px; font-size:1em">
															<xsl:attribute name="href">Provider?type=page&amp;id=reportstatistics&amp;element=document&amp;userid=<xsl:value-of select="$userid"/>&amp;key=&amp;page=<xsl:value-of select="$maxpage"/></xsl:attribute>
															&gt;&gt;
														</a>
													</xsl:if>
												</xsl:if>
											</div>
											<table id="actiontable" style="width:98%; border-collapse:collapse; font-size:13px; margin-top:20px; margin-right:20px">
												<tr style="height:35px; background:#efefef; border:1px solid #ccc;">
													<td style="text-align:center; font-weight:bold; width:200px; border:1px solid #ccc">Дата</td>
													<td style="text-align:center; font-weight:bold; width:200px; border:1px solid #ccc">Запрос</td>
													<td style="text-align:center; font-weight:bold; width:200px; border:1px solid #ccc">Вызванный метод</td>
													<td style="text-align:center; font-weight:bold; width:200px; border:1px solid #ccc">Пользователь</td>
													<td style="text-align:center; font-weight:bold; width:200px; border:1px solid #ccc">Параметры</td>
												</tr>
												<xsl:for-each select="page/script_result/response/content/root/entry">
													<tr style="height:35px;  border:1px solid #ccc; color:#444; font-size:12px">
														<td style="text-align:center;  width:200px; border:1px solid #ccc">
															<xsl:value-of select="time"/>
														</td>
														<td style="text-align:center;  width:200px; border:1px solid #ccc">
															<xsl:value-of select="type"/>
														</td>
														<td style="text-align:center;  width:200px; border:1px solid #ccc">
															<xsl:value-of select="dbid"/>
														</td>
														<td style="text-align:center; width:200px; border:1px solid #ccc">
															<xsl:value-of select="viewtext"/>
														</td>
													</tr>
												</xsl:for-each>
						 					</table>
						 				<xsl:if test="document/fields/error">
						 					<div style="width:100%;  font-size:13px; margin-top:20px; margin-right:20px; text-align:center">Произошла ошибка <xsl:if test="document/fields/error !=''"><font style="color:red">(<xsl:value-of select="document/fields/error"/>)</font></xsl:if></div>
						 					<script>
						 						infoDialog(&quot;Произошла ошибка <xsl:if test="document/fields/error !=''">: <xsl:value-of select="document/fields/error"/></xsl:if>&quot;)
						 					</script>
						 				</xsl:if>
					 				<br/>
								</div>
						</div>
           			</div>
           			<div style="height:10px"/>
			  		</div>
				</div>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>