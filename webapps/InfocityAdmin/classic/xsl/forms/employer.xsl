<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:import href="../templates/form.xsl"/>
	<xsl:import href="../templates/sharedactions.xsl"/>
	<xsl:variable name="doctype"><xsl:value-of select="request/document/captions/doctypemultilang/@caption"/></xsl:variable>
	<xsl:variable name="threaddocid" select="document/@granddocid"/>
	<xsl:variable name="path" select="/request/@skin"/>
	<xsl:variable name="editmode" select="/request/document/@editmode"/>
	<xsl:variable name="status" select="/request/document/@status"/>
	<xsl:output method="html" encoding="utf-8" doctype-public="-//W3C//DTD XHTML 1.0 Transitional//EN"
		doctype-system="http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd" indent="yes"/>
	<xsl:variable name="skin" select="request/@skin"/>
	<xsl:template match="/request">
	<xsl:variable name="filename" select="document/fields/pdocrtfcontent"/>
		<html>
			<head>
				<title>
					<xsl:value-of select="concat('Администратор ЕИС &quot;Город&quot; - ', 'Пользователь')"/>
				</title>
				<xsl:call-template name="cssandjs"/>
				<xsl:call-template name="markisread"/>
			</head>
			<body>
				<div id="docwrapper">
					<xsl:call-template name="documentheader"/>	
					<div class="formwrapper">
						<div class="formtitle">
							<div style="float:left" class="title">
								Пользователь
							</div>
						</div>	
						<div class="button_panel">
							<span style="vertical-align:12px; float:left">
								<button class="ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only" id="btnsavedoc">
									<xsl:attribute name="onclick">javascript:SaveFormJquery('frm','frm',&quot;<xsl:value-of select="history/entry[@type eq 'view'][last()]"/>&amp;page=<xsl:value-of select="document/@openfrompage"/>&quot;)</xsl:attribute>
									<span>
										<img src="/SharedResources/img/classic/icons/disk.png" class="button_img"/>
										<font style="font-size:12px; vertical-align:top"><xsl:value-of select="document/captions/saveclose/@caption"/></font>
									</span>
								</button>
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
									<a href="#tabs-1">Общие сведения</a>
								</li>
								<li style="float:right; padding:0.5em 0.5em; position:absolute; right:0px; color:#000">
		                 			<div>
										<font style="font-size:11px; font-style: arial;">
											<xsl:value-of select="document/captions/status/@caption"/> :
										</font>
										<font style="font-size:11px; font-style: arial">
											<b> 
												<xsl:if test="count(/request/document/fields/role/entry) &gt; 0">
													<xsl:value-of select="document/captions/connected/@caption"/>
												</xsl:if>
												<xsl:if test="count(/request/document/fields/role/entry) = 0">
													<xsl:value-of select="document/captions/disconnected/@caption"/>
												</xsl:if>
											</b>
										</font>	
									</div>
								</li>
							</ul>
							<div class="ui-tabs-panel" id="tabs-1">
								<form action="Provider" name="frm" method="post" id="frm" enctype="application/x-www-form-urlencoded">
									<div display="block" id="property">
										<br/>
										<table width="100%" border="0">
											<tr>
												<td class="fc"><xsl:value-of select="document/captions/fullname/@caption"/><font style="color:red; text-align:center">*</font> :</td>
												<td>
													<input type="text" name="fullname" value="{document/fields/fullname}" size="45" class="td_editable" style="width:600px">
														<xsl:if test="$editmode != 'edit'">
															<xsl:attribute name="readonly">readonly</xsl:attribute>
															<xsl:attribute name="class">td_noteditable</xsl:attribute>
														</xsl:if>
													</input>
												</td>
											</tr>
											<tr>
												<td class="fc"><xsl:value-of select="document/captions/shortname/@caption"/><font style="color:red; text-align:center">*</font> :</td>
												<td>
													<input type="text" name="shortname" value="{document/fields/shortname}" style="width:400px" class="td_editable">
														<xsl:if test="$editmode != 'edit'">
															<xsl:attribute name="readonly">readonly</xsl:attribute>
															<xsl:attribute name="class">td_noteditable</xsl:attribute>
														</xsl:if>
													</input>
												</td>
											</tr>
											<tr>
												<td class="fc">UserID<font style="color:red; text-align:center">*</font> :</td>
												<td>
													<input type="text" name="userid" value="{document/fields/userid}" class="td_editable" style="width:400px">
														<xsl:if test="$editmode != 'edit'">
															<xsl:attribute name="readonly">readonly</xsl:attribute>
															<xsl:attribute name="class">td_noteditable</xsl:attribute>
														</xsl:if>
													</input>
												</td>
											</tr>
											<tr>
												<td class="fc">e-mail :</td>
												<td>
													<input type="text" name="email" value="{document/fields/email}" class="td_editable" style="width:400px" autocomplete="off">
														<xsl:if test="$editmode != 'edit'">
															<xsl:attribute name="readonly">readonly</xsl:attribute>
															<xsl:attribute name="class">td_noteditable</xsl:attribute>
														</xsl:if>
													</input>
												</td>
											</tr>
											<tr>
												<td class="fc">Старый пароль<font style="color:red; text-align:center">*</font> :</td>
												<td>
													<input type="password" value="" name="oldpassword" style="width:300px" class="td_editable" autocomplete="off">
														<xsl:if test="$editmode != 'edit'">
															<xsl:attribute name="readonly">readonly</xsl:attribute>
															<xsl:attribute name="class">td_noteditable</xsl:attribute>
														</xsl:if>
													</input>
												</td>
											</tr>
											<tr>
												<td class="fc"><xsl:value-of select="document/captions/password/@caption"/><font style="color:red; text-align:center">*</font> :</td>
												<td>
													<input type="password" value="" name="password" style="width:300px" class="td_editable" autocomplete="off">
														<xsl:if test="$editmode != 'edit'">
															<xsl:attribute name="readonly">readonly</xsl:attribute>
															<xsl:attribute name="class">td_noteditable</xsl:attribute>
														</xsl:if>
													</input>
												</td>
											</tr>
											<tr>
												<td class="fc"><xsl:value-of select="document/captions/repeatpassword/@caption"/><font style="color:red; text-align:center">*</font> :</td>
												<td>
													<input type="password" value="" name="password2" style="width:300px" class="td_editable" autocomplete="off">
														<xsl:if test="$editmode != 'edit'">
															<xsl:attribute name="readonly">readonly</xsl:attribute>
															<xsl:attribute name="class">td_noteditable</xsl:attribute>
														</xsl:if>
													</input>
												</td>
											</tr>
											<xsl:if test="$status !='new'">
												<tr>
													<td class="fc"><xsl:value-of select="document/captions/organization/@caption"/> :
													</td>
													<td>
														<table id="orgtable">
															<tr>
																<td class="td_editable" style="width:300px;">
																	<xsl:if test="$editmode != 'edit'">
																		<xsl:attribute name="readonly">readonly</xsl:attribute>
																		<xsl:attribute name="class">td_noteditable</xsl:attribute>
																	</xsl:if>
																	<xsl:value-of select="document/fields/organization"/>
																	&#xA0;
																</td>
															</tr>
														</table>
														<input type="hidden" name="organization" value="{document/fields/organization/@attrval}" size="30"/>
													</td>
												</tr>
											</xsl:if>
											<input type="hidden" name="post" value="0"/>
											<!--
											 <tr>
												<td class="fc"><xsl:value-of select="document/captions/post/@caption"/><font style="color:red; text-align:center">*</font> :</td>
												<td>
													<select name="post" class="select_editable" style="width:312px;">
														<xsl:if test="$editmode != 'edit'">
															<xsl:attribute name="disabled">disabled</xsl:attribute>
															<xsl:attribute name="class">select_noteditable</xsl:attribute>
															<option value=" ">
																<xsl:value-of select="document/fields/post "/>
															</option>
														</xsl:if>
														<xsl:variable name="post" select="document/fields/post/@attrval"/>
														<xsl:if test="$editmode = 'edit'">
															<option value="">
																<xsl:attribute name="selected">selected</xsl:attribute>
															</option>
														</xsl:if>
														<xsl:for-each select="document/glossaries/post/query/entry">
															<option value="{@docid}">
																<xsl:if test="$post=@docid">
																	<xsl:attribute name="selected">selected</xsl:attribute>
																</xsl:if>
																<xsl:value-of select="viewcontent/viewtext1"/>
															</option>
														</xsl:for-each>
													</select>
												</td>
											</tr> -->
											<tr>
												<td class="fc"><xsl:value-of select="document/captions/rank/@caption"/> :</td>
												<td>
													<input type="text" name="rank" value="{document/fields/rank}" size="20" class="td_editable" style="width:301px;">
														<xsl:if test="$editmode != 'edit'">
															<xsl:attribute name="readonly">readonly</xsl:attribute>
															<xsl:attribute name="class">td_noteditable</xsl:attribute>
														</xsl:if>
													</input>
												</td>
											</tr>
											<tr>
												<td class="fc"><xsl:value-of select="document/captions/phone/@caption"/> :</td>
												<td>
													<input type="text" name="phone" value="{document/fields/phone}" size="20" class="td_editable" style="width:301px;">
														<xsl:if test="$editmode != 'edit'">
															<xsl:attribute name="readonly">readonly</xsl:attribute>
															<xsl:attribute name="class">td_noteditable</xsl:attribute>
														</xsl:if>
													</input>
												</td>
											</tr>
											<tr>
												<td class="fc">Ограничение запросов :</td>
												<td>
													<input type="text" name="counterlimit" onkeyup="javascript:Numeric(this)" value="{document/fields/counterlimit}" size="10" class="td_editable" style="width:50px; height:19px">
														<xsl:if test="$editmode != 'edit'">
															<xsl:attribute name="readonly">readonly</xsl:attribute>
															<xsl:attribute name="class">td_noteditable</xsl:attribute>
														</xsl:if>
													</input>
													<select name="typelimit" class="select_editable" style="width:150px; margin-left:5px">
														<option value="1">
															Мегабайт
														</option>
														<option value="2">
															Запросов
														</option>
													</select>
												</td>
											</tr>
											<!-- <tr>
												<td class="fc"><xsl:value-of select="document/captions/role/@caption"/> :</td>
												<td>
													<xsl:for-each select="document/glossaries/roles/entry">
														<xsl:variable name="role" select="name"/>
														<input type="checkbox" name="role" value="{name}">
															<xsl:if test="/request/document/fields/role[entry = $role]">
																<xsl:attribute name="checked">checked</xsl:attribute>
															</xsl:if>
															<xsl:if test="/request/document/fields[role = $role]">
																<xsl:attribute name="checked">checked</xsl:attribute>
															</xsl:if>
															<xsl:value-of select="name"/>&#xA0;<font style="color:#bbbbbb; font-size:85%"><xsl:value-of select="description"/></font>
															<br/>
														</input>
													</xsl:for-each>
												</td>
											</tr> -->
											<tr>
												<td class="fc"><xsl:value-of select="document/captions/documenttoaccess/@caption"/> :</td>
												<td>
													<textarea class="textarea_editable" rows="4" value="{document/fields/comment}" name="comment" cols="45" style="width:301px;">
														<xsl:if test="$editmode != 'edit'">
															<xsl:attribute name="readonly">readonly</xsl:attribute>
															<xsl:attribute name="class">textarea_noteditable</xsl:attribute>
														</xsl:if>
														<xsl:value-of select="document/fields/comment"/>
													</textarea>
												</td>
											</tr>
											<tr>
												<td class="fc"><xsl:value-of select="document/captions/role/@caption"/> :</td>
												<td>
													<xsl:for-each select="document/glossaries/roles/entry">
														<xsl:variable name="app" select="app"/>
														<xsl:variable name="role" select="name"/>
														<input type="checkbox" name="role" value="{name}#{app}">
															<xsl:if test="/request/document/fields/role/entry[appid=$app][name = $role]">
																<xsl:attribute name="checked">checked</xsl:attribute>
															</xsl:if>
															<xsl:if test="/request/document/fields[role = $role]">
																<xsl:attribute name="checked">checked</xsl:attribute>
															</xsl:if>
															<xsl:if test="description != ''">
																&#xA0;
															</xsl:if>
															<font><xsl:value-of select="description"/>&#xA0;</font>
															<font style="color:#ababab; font-size:90%;"><xsl:value-of select="name"/></font>
															<br/>
														</input>
													</xsl:for-each>
												</td>
											</tr>
												<tr>
													<td class="fc">Группы :</td>
													<td>
														<xsl:for-each select="document/fields/group/entry">
															<font><xsl:value-of select="."/></font><br/>
														</xsl:for-each>
														<!--<xsl:for-each select="document/fields/group/entry">
															<input type="hidden" name="group" value="{.}"/>
														</xsl:for-each>
														 <xsl:if test = "not(document/fields/group/@islist)">
															<input type="hidden" name="group" value="{document/fields/group/@attrval}"/>
														</xsl:if> -->
													</td>
												</tr>
											<tr>
												<td class="fc">Включенные приложения :</td>
												<td style="padding-top:10px">
													<table>
														<tr class="QA_InfocityServices">
															<td style="padding-right:5px">
																<input type="checkbox" value="InfocityServices" name="enabledapps">
																	<xsl:if test="$status = 'new' or /request/document/fields/apps/entry/appname = 'InfocityServices'">
																		<xsl:attribute name="checked">checked</xsl:attribute>
																	</xsl:if>
																</input>
																<font style="padding:5px">InfocityServices</font>
															</td>
															<td style="padding-right:5px">
																<font style="padding:5px; font-size:12px">Login mode:&#xA0;</font>
																<select name="loginmode" onchange="javascript:selectLoginMode(this,'InfocityServices')">
																	<xsl:attribute name="id">loginmode_InfocityServices</xsl:attribute>
																	<option value="0">
																		<xsl:if test="/request/document/fields/apps/entry[appname='InfocityServices']/loginmode = 'LOGIN_AND_REDIRECT' ">
																			<xsl:attribute name="selected"></xsl:attribute>
																		</xsl:if>
																		Login and redirect
																	</option>
																	<option value="1">
																		<xsl:if test="/request/document/fields/apps/entry[appname='InfocityServices']/loginmode = 'LOGIN_AND_QUESTION'">
																			<xsl:attribute name="selected"></xsl:attribute>
																		</xsl:if>
																		Login and question
																	</option>
																	<option value="2">
																		<xsl:if test="/request/document/fields/apps/entry[appname='InfocityServices']/loginmode = 'JUST_LOGIN' or not(/request/document/fields/apps/entry[appname='InfocityServices']/loginmode)">
																			<xsl:attribute name="selected"></xsl:attribute>
																		</xsl:if>
																		Login
																	</option>
																</select>
															</td>
															<td style="padding-right:5px">
																<font style="font-size:12px">Question:&#xA0;</font>
																<input type="text" name="question_InfocityServices" size="20" value="{/request/document/fields/apps/entry[appname='InfocityServices']/entry[1]/question}">
																	<xsl:if test="/request/document/fields/apps/entry[appname eq 'InfocityServices']/loginmode = 'JUST_LOGIN' or not(/request/document/fields/apps/entry/appname = 'InfocityServices')">
																		<xsl:attribute name="readonly"></xsl:attribute>
																		<xsl:attribute name="value"></xsl:attribute>
																		<xsl:attribute name="class">td_noteditable</xsl:attribute>
																	</xsl:if>
																</input>
															</td>
															<td style="padding-right:5px">
																<font style=" font-size:12px">Answer:&#xA0;</font>
																<input type="text" name="answer_InfocityServices" size="20" value="{/request/document/fields/apps/entry[appname='InfocityServices']/entry[1]/answer}">
																	<xsl:if test="/request/document/fields/apps/entry[appname eq 'InfocityServices']/loginmode = 'JUST_LOGIN' or not(/request/document/fields/apps/entry/appname = 'InfocityServices')">
																		<xsl:attribute name="readonly"></xsl:attribute>
																		<xsl:attribute name="value"></xsl:attribute>
																		<xsl:attribute name="class">td_noteditable</xsl:attribute>
																	</xsl:if>
																</input>
																<!-- <a href="javascript:$.noop()" onclick="javascript:AddNewQuestAndAnswer(this,'InfocityServices')">
																	add
																</a> -->
															</td>
														</tr>
														<tr class="QA_InfocityAdmin">
															<td style="padding-right:5px">
																<input type="checkbox" value="InfocityAdmin" name="enabledapps">
																	<xsl:if test="/request/document/fields/apps/entry/appname = 'InfocityAdmin'">
																		<xsl:attribute name="checked">checked</xsl:attribute>
																	</xsl:if>
																</input>
																<font style="padding:5px">InfocityAdmin</font>
															</td>
															<td style="padding-right:5px">
																<font style="padding:5px; font-size:12px">Login mode:&#xA0;</font>
																<select name="loginmode" onchange="javascript:selectLoginMode(this,'InfocityAdmin')">
																	<xsl:attribute name="id">loginmode_InfocityServices</xsl:attribute>
																	<option value="0">
																		<xsl:if test="/request/document/fields/apps/entry[appname='InfocityAdmin']/loginmode = 'LOGIN_AND_REDIRECT' ">
																			<xsl:attribute name="selected"></xsl:attribute>
																		</xsl:if>
																		Login and redirect
																	</option>
																	<option value="1">
																		<xsl:if test="/request/document/fields/apps/entry[appname='InfocityAdmin']/loginmode = 'LOGIN_AND_QUESTION'">
																			<xsl:attribute name="selected"></xsl:attribute>
																		</xsl:if>
																		Login and question
																	</option>
																	<option value="2">
																		<xsl:if test="/request/document/fields/apps/entry[appname='InfocityAdmin']/loginmode = 'JUST_LOGIN' or not(/request/document/fields/apps/entry[appname='InfocityAdmin']/loginmode)">
																			<xsl:attribute name="selected"></xsl:attribute>
																		</xsl:if>
																		Login
																	</option>
																</select>
															</td>
															<td style="padding-right:5px">
																<font style="font-size:12px">Question:&#xA0;</font>
																<input type="text" name="question_InfocityAdmin" size="20" value="{/request/document/fields/apps/entry[appname='InfocityAdmin']/entry[1]/question}">
																	<xsl:if test="/request/document/fields/apps/entry[appname eq 'InfocityAdmin']/loginmode = 'JUST_LOGIN' or not(/request/document/fields/apps/entry/appname = 'InfocityAdmin')">
																		<xsl:attribute name="readonly"></xsl:attribute>
																		<xsl:attribute name="value"></xsl:attribute>
																		<xsl:attribute name="class">td_noteditable</xsl:attribute>
																	</xsl:if>
																</input>
															</td>
															<td style="padding-right:5px">
																<font style=" font-size:12px">Answer:&#xA0;</font>
																<input type="text" name="answer_InfocityAdmin" size="20" value="{/request/document/fields/apps/entry[appname='InfocityAdmin']/entry[1]/answer}">
																	<xsl:if test="/request/document/fields/apps/entry[appname eq 'InfocityAdmin']/loginmode = 'JUST_LOGIN' or not(/request/document/fields/apps/entry/appname = 'InfocityAdmin')">
																		<xsl:attribute name="readonly"></xsl:attribute>
																		<xsl:attribute name="value"></xsl:attribute>
																		<xsl:attribute name="class">td_noteditable</xsl:attribute>
																	</xsl:if>
																</input>
																<!-- <a href="javascript:$.noop()" onclick="javascript:AddNewQuestAndAnswer(this,'InfocityServices')">
																	add
																	</a> -->
															</td>
														</tr>
														<!-- <xsl:for-each select="/request/document/enabledapps/entry[appname=$app]/entry[not(position() = 1)]">
																<tr class="QA_{$app}">
																	<td style="padding-right:5px">
																	</td>
																	<td style="padding-right:5px">
																	</td>
																	<td style="padding-right:5px">
																		<font style="font-size:12px">Question:&#xA0;</font>
																		<input type="text" name="question_{$app}" size="30" value="{question}">
																			<xsl:if test="/request/document/enabledapps/entry[appname=$app]/loginmode = 'JUST_LOGIN'">
																				<xsl:attribute name="readonly"></xsl:attribute>
																				<xsl:attribute name="value"></xsl:attribute>
																				<xsl:attribute name="class">readonly</xsl:attribute>
																			</xsl:if>
																		</input>
																	</td>
																	<td style="padding-right:5px">
																		<font style=" font-size:12px">Answer:&#xA0;</font>
																		<input type="text" name="answer_{$app}" size="30" value="{answer}">
																			<xsl:if test="/request/document/enabledapps/entry[appname=$app]/loginmode = 'JUST_LOGIN'">
																				<xsl:attribute name="readonly"></xsl:attribute>
																				<xsl:attribute name="value"></xsl:attribute>
																				<xsl:attribute name="class">readonly</xsl:attribute>
																			</xsl:if>
																		</input>
																		<a href="javascript:$.noop()" onclick="javascript:AddNewQuestAndAnswer(this,'{$app}')">
																			add
																		</a>
																	</td>
																</tr>
														</xsl:for-each> -->
													</table>
												</td>
											</tr>
										</table>
									</div>
									<input type="hidden" name="type" value="save"/>
									<input type="hidden" name="id" value="employer"/>
									<input type="hidden" name="key" value="{document/@docid}"/>
									<input type="hidden" name="doctype" value="{document/@doctype}"/>
									<input type="hidden" name="parentdoctype" id="parentdoctype" value="{document/@parentdoctype}"/>
									<input type="hidden" name="parentdocid" id="parentdocid" value="{document/@parentdocid}"/>
								</form>
							</div>
           				</div>
           			<div style="height:10px"/>
			  		</div>
				</div>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>