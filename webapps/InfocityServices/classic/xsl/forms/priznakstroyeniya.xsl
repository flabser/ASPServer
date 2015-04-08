<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:import href="../templates/form.xsl"/>
	<xsl:import href="../templates/sharedactions.xsl"/>
	<xsl:variable name="doctype"><xsl:value-of select="request/document/captions/doctypemultilang/@caption"/></xsl:variable>
	<xsl:variable name="threaddocid" select="document/@granddocid"/>
	<xsl:variable name="path" select="/request/@skin"/>
	<xsl:variable name="editmode" select="/request/document/@editmode"/>
	<xsl:output method="html" encoding="utf-8" doctype-public="-//W3C//DTD XHTML 1.0 Transitional//EN"
		doctype-system="http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd" indent="yes"/>
	<xsl:variable name="skin" select="request/@skin"/>
	<xsl:template match="/request">
	<xsl:variable name="filename" select="document/fields/pdocrtfcontent"/>
		<html>
			<head>
				<title>
					<xsl:value-of select="concat(document/captions/eis/@caption,' - ',document/captions/priznakstroeniya/@caption)"/>
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
								<xsl:value-of select="document/captions/priznakstroeniya/@caption"/>
							</div>
						</div>	
						<div class="button_panel">
							<span style="vertical-align:12px; float:left">
								<button class="ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only" title="Сохранить и закрыть" id="btnsavedoc">
									<xsl:attribute name="onclick">javascript:SaveFormJquery('frm','frm',&quot;<xsl:value-of select="history/entry[@type='outline'][last()]"/>&quot;)</xsl:attribute>
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
									<a href="#tabs-1"><xsl:value-of select="document/captions/properties/@caption"/></a>
								</li>
							</ul>
							<div class="ui-tabs-panel" id="tabs-1">
								<form action="Provider" name="frm" method="post" id="frm" enctype="application/x-www-form-urlencoded">
									<div display="block"  id="property">
										<table width="100%" border="0" >
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="document/captions/name/@caption"/> : 
													</font>
												</td>
												<td>
													<input type="text" name="name" value="{document/fields/name}" size="30" class="td_editable" style="width:300px">
								                      	<xsl:if test="$editmode != 'edit'">
															<xsl:attribute name="readonly">readonly</xsl:attribute>
															<xsl:attribute name="class">td_noteditable</xsl:attribute>
														</xsl:if>
								                    </input>
												</td>
											</tr>
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="document/captions/namekaz/@caption"/> : 
													</font>
												</td>
												<td>
													<input type="text" name="kazname" value="{document/fields/kazname}" size="30" class="td_editable" style="width:300px">
								                      	<xsl:if test="$editmode != 'edit'">
															<xsl:attribute name="readonly">readonly</xsl:attribute>
															<xsl:attribute name="class">td_noteditable</xsl:attribute>
														</xsl:if>
								                    </input>
												</td>
											</tr>
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="document/captions/code/@caption"/> : 
													</font>
												</td>
												<td>
													<input type="text" name="code" value="{document/fields/code}" size="30" class="td_editable" style="width:300px">
								                      	<xsl:if test="$editmode != 'edit'">
															<xsl:attribute name="readonly">readonly</xsl:attribute>
															<xsl:attribute name="class">td_noteditable</xsl:attribute>
														</xsl:if>
								                    </input>
												</td>
											</tr>
					 					</table>
					 				<br/>
								</div>
								<input type="hidden" name="type" value="save"/>
									<input type="hidden" name="id" value="priznakstroyeniya"/>		
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