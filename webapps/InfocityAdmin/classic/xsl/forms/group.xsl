<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:import href="../templates/form.xsl"/>
	<xsl:import href="../templates/sharedactions.xsl"/>
	<xsl:variable name="doctype" select="request/document/captions/name/@caption"/>
	<xsl:variable name="threaddocid" select="document/@docid"/>
	<xsl:variable name="editmode" select="/request/document/@editmode"/>
	<xsl:output method="html" encoding="utf-8" doctype-public="-//W3C//DTD XHTML 1.0 Transitional//EN"
		doctype-system="http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd" indent="yes"/>
	<xsl:variable name="skin" select="request/@skin"/>
	<xsl:template match="/request">
		<html>
			<head>
				<title>
					<xsl:value-of select="concat('Администратор ЕИС &quot;Город&quot; - ',$doctype)"/>
				</title>
				<xsl:call-template name="cssandjs"/>
				<script type="text/javascript">
					$(document).ready(function(){hotkeysnav()})
   					<![CDATA[
   						function hotkeysnav() {
							$(document).bind('keydown', function(e){
			 					if (e.ctrlKey) {
			 						switch (e.keyCode) {
									   case 66:
									   		<!-- клавиша b -->
									     	e.preventDefault();
									     	$("#canceldoc").click();
									      	break;
									   case 83:
									   		<!-- клавиша s -->
									     	e.preventDefault();
									     	$("#btnsavedoc").click();
									      	break;
									   case 85:
									   		<!-- клавиша u -->
									     	e.preventDefault();
									     	window.location.href=$("#currentuser").attr("href")
									      	break;
									   case 81:
									   		<!-- клавиша q -->
									     	e.preventDefault();
									     	window.location.href=$("#logout").attr("href")
									      	break;
									   case 72:
									   		<!-- клавиша h -->
									     	e.preventDefault();
									     	window.location.href=$("#helpbtn").attr("href")
									      	break;
									   default:
									      	break;
									}
			   					}
							});
							$("#canceldoc").hotnav({keysource:function(e){ return "b"; }});
							$("#btnsavedoc").hotnav({keysource:function(e){ return "s"; }});
							$("#currentuser").hotnav({ keysource:function(e){ return "u"; }});
							$("#logout").hotnav({keysource:function(e){ return "q"; }});
							$("#helpbtn").hotnav({keysource:function(e){ return "h"; }});
						}
					]]>
				</script>
			</head>
			<body>
				<xsl:variable name="status" select="@status"/>
				<div id="docwrapper">
					<xsl:call-template name="documentheader"/>	
					<div class="formwrapper">
						<div class="formtitle">
					    	<div class="title">
					    		<xsl:call-template name="doctitleGlossary"/>								
							</div>
						</div>
						<div class="button_panel">
							<span style="float:left">
								<xsl:call-template name="showxml"/>
								<button class="ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only" id="btnsavedoc">
									<xsl:attribute name="onclick">javascript:SaveFormJquery('frm','frm',&quot;<xsl:value-of select="history/entry[@type eq 'view'][last()]"/>&amp;page=<xsl:value-of select="document/@openfrompage"/>&quot;)</xsl:attribute>
									<span>
										<img src="/SharedResources/img/classic/icons/disk.png" class="button_img"/>
										<font style="font-size:12px; vertical-align:top"><xsl:value-of select="document/captions/saveclose/@caption"/></font>
									</span>
								</button>
							</span>
							<span style="float:right; margin-right:5px">
								<xsl:call-template name="cancel"/>
							</span>
						</div>
		  				<div style="clear:both"/>
						<div style="-moz-border-radius:0px;height:1px; width:100%; margin-top:10px;"/>
						<div style="clear:both"/>
						<div id="tabs">
							<ul class="ui-tabs-nav ui-helper-reset ui-helper-clearfix ui-widget-header ui-corner-all">
								<li class="ui-state-default ui-corner-top">
									<a href="#tabs-1">
										<xsl:value-of select="document/captions/properties/@caption"/>
									</a>
								</li> 
							</ul>
							<div class="ui-tabs-panel" id="tabs-1">
								<form action="Provider" name="frm" method="post" id="frm" enctype="application/x-www-form-urlencoded">
									<div display="block"  id="property">
										<br/>
										<table width="100%" border="0" >
											<tr>
												<td class="fc"><xsl:value-of select="document/captions/name/@caption"/> :</td>
									            <td>
					                                 <input type="text" name="groupname" value="{document/fields/groupname}" size="59" class="td_editable" onkeypress="javascript:maxCountSymbols (this, 32, event, true)" style="width:350px">
					                                 	<xsl:if test="$editmode != 'edit'">
															<xsl:attribute name="readonly">readonly</xsl:attribute>
															<xsl:attribute name="class">td_noteditable</xsl:attribute>
														</xsl:if>
					                                 </input>
					                           </td>   					
											</tr>
									      	<tr>
												<td class="fc"><xsl:value-of select="document/captions/description/@caption"/> :</td>
								            	<td>
					                                 <textarea class="textarea_editable" rows="4" name="description" value="{document/fields/description}" cols="45" style="width:600px">
					                                 	<xsl:if test="$editmode != 'edit'">
															<xsl:attribute name="readonly">readonly</xsl:attribute>
															<xsl:attribute name="class">textarea_noteditable</xsl:attribute>
														</xsl:if>
					                                 	<xsl:value-of select="document/fields/description"/>
					                                 </textarea>
					                           </td>   					
											</tr> 
											<tr>
												<td class="fc"><xsl:value-of select="document/captions/ownergroup/@caption"/> :
													<xsl:if test="$editmode = 'edit'">
														<a href="">
															<xsl:attribute name="href">javascript:dialogBoxStructure('bossandemppicklist','false','ownergroup','frm', 'ownergrouptbl');</xsl:attribute>
															<img src="/SharedResources/img/iconset/report_magnify.png"/>
														</a>
													</xsl:if>
												</td>
												<td>
													<table id="ownergrouptbl">
														<tr>
															<td class="td_editable" style="width:600px;">
																<xsl:if test="$editmode != 'edit'">
																	<xsl:attribute name="class">td_noteditable</xsl:attribute>
																</xsl:if>
																<xsl:value-of select="document/fields/ownergroup"/>&#xA0;
															</td>
														</tr>
													</table>
													<input type="hidden" id="ownergroup" name="ownergroup" value="{document/fields/ownergroup/@attrval}"/>
													<input type="hidden" id="ownergroupcaption" value="{document/captions/ownergroup/@caption}"/>
												</td>
											</tr> 
											<tr>
											<td class="fc"><xsl:value-of select="document/captions/partgroup/@caption"/> :
												<xsl:if test="$editmode = 'edit'">
													<a href="">
														<xsl:attribute name="href">javascript:addMemberGroup('membersgroup','true','members','frm', 'memberstbl');</xsl:attribute>
														<img src="/SharedResources/img/iconset/report_magnify.png"/>
													</a>
												</xsl:if>
											</td>
											<td>
												<table id="memberstbl">
													<xsl:for-each select="document/fields/member/entry">
														<xsl:sort select="."/>
														<tr>
															<td class="td_editable" style="width:600px;">
																<xsl:if test="$editmode != 'edit'">
																	<xsl:attribute name="class">td_noteditable</xsl:attribute>
																</xsl:if>
																<xsl:value-of select="."/>&#xA0;
																<input type="hidden" id="members" name="members" value="{./@attrval}"/>
																<img onclick="delmember(this)" src="/SharedResources/img/iconset/cross.png" style="width:15px; height:15px; margin-right:3px; margin-top:1px; float:right; cursor:pointer">
																</img>
															</td>
														</tr>
													</xsl:for-each>
													<xsl:if test="document/@status = 'new'">
														<tr>
															<td class="td_editable" style="width:600px;">
																<xsl:if test="$editmode != 'edit'">
																	<xsl:attribute name="class">td_noteditable</xsl:attribute>
																</xsl:if>
																<xsl:value-of select="document/captions/members/@caption"/>&#xA0;
															</td>
														</tr>
													</xsl:if>
												</table>
												<!-- <xsl:for-each select="document/fields/members/entry">
													<input type="hidden" id="members" name="members" value="{./@attrval}"/>
												</xsl:for-each> -->
												<input type="hidden" id="memberscaption" value="{document/captions/partgroup/@caption}"/>
											</td>
										</tr> 
										<tr>
											<td class="fc"><xsl:value-of select="document/captions/role/@caption"/> :</td>
											<td>
												<xsl:for-each select="document/glossaries/roles/entry">
													<xsl:variable name="role" select="name"/>
													<input type="checkbox" name="role" value="{name}#{app}">
														<xsl:if test="/request/document/fields/role[entry = $role] or /request/document/fields[role = $role]">
															<xsl:attribute name="checked">checked</xsl:attribute>
														</xsl:if>
														<xsl:if test="description !=''">
															<font style="margin-left:5px"><xsl:value-of select="description"/></font>
														</xsl:if>
														<font style="color:#ababab; font-size:90%; margin-left:5px"><xsl:value-of select="name"/></font>
														<br/>
													</input>
												</xsl:for-each>
											</td>
										</tr> 
									</table>		
					       		</div>   
					       		<input type="hidden" name="type" value="save"/>
								<input type="hidden" name="id" value="Group"/>		
								<input type="hidden" name="key" value="{document/@docid}"/> 
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