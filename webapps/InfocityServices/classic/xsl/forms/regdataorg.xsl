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
					<xsl:value-of select="concat(document/captions/eis/@caption,' - ',document/captions/svedeniyaoborganizacii/@caption)"/>
				</title>
				<xsl:call-template name="cssandjs"/>
				<xsl:call-template name="markisread"/>
			</head>
			<body>
				<xsl:attribute name="onbeforeprint">javascript:printprepare()</xsl:attribute>
				<div id="docwrapper">
					<xsl:call-template name="documentheader"/>	
					<div class="formwrapper">
						<div class="formtitle">
							<div style="float:left" class="title">
								<xsl:value-of select="document/captions/svedeniyaoborganizacii/@caption"/>
							</div>
						</div>	
						<div class="button_panel">
							<span style="vertical-align:12px; float:left">
								<xsl:if test="document/actionbar/action[@id='print']/@mode = 'ON'" >
									<button class="ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only" id="btntocoordinate" style="margin-left:5px" title="{document/captions/raspechatatrezultaty/@caption}">
										<xsl:attribute name="onclick">javascript:window.print()</xsl:attribute>
										<span>
											<img src="/SharedResources/img/classic/icons/printer.png" class="button_img"/>
											<font style="font-size:12px; vertical-align:top"><xsl:value-of select="document/captions/raspechatatrezultaty/@caption"/></font>
										</span>
									</button>
								</xsl:if>
							</span>
							<span style="float:right">
				            	<xsl:call-template name="cancel"/>
				            </span>
		           		</div>
						<div style="clear:both"/>
						<div style="-moz-border-radius:0px;height:1px; width:100%; margin-top:10px;"/>
						<div style="clear:both"/>
						<div id="aboutprint" style="display:none;">
							<font style="font-size:15px; color:#111;" id="printtitle"><xsl:value-of select="document/captions/printed/@caption"/>: <xsl:value-of select="/request/@username"/></font>
							<font style="font-size:14px; color:#111;" id="printtime"></font>
						</div>
						<div id="tabs">
							<ul class="ui-tabs-nav ui-helper-reset ui-helper-clearfix ui-widget-header ui-corner-all">
								<li class="ui-state-default ui-corner-top">
									<a href="#tabs-1"><xsl:value-of select="document/captions/obschiesvadeniya/@caption"/></a>
								</li>
							</ul>
							<div class="ui-tabs-panel" id="tabs-1">
									<div display="block"  id="property" class="resulttable">
										<table width="100%" border="0" >
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="document/captions/naimenovanie/@caption"/> : 
													</font>
												</td>
												<td>
													<div class="td_noteditable" style="width:600px;">
																<xsl:value-of select="document/fields/firstName[. ne 'null']"/>&#xA0;
															</div>
												</td>
											</tr>
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="document/captions/dataregistraciivnalogovomorgane/@caption"/> : 
													</font>
												</td>
												<td>
													<div class="td_noteditable" style="width:600px;">
																<xsl:value-of select="document/fields/birthDate[. ne 'null']"/>&#xA0;
															</div>
												</td>
											</tr>
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="document/captions/rnn/@caption"/> : 
													</font>
												</td>
												<td>
													<div class="td_noteditable" style="width:600px;">
																<xsl:value-of select="document/fields/rnn[. ne 'null']"/>&#xA0;
															</div>
												</td>
											</tr>
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="document/captions/adresregistr/@caption"/> : 
													</font>
												</td>
												<td>
													<div class="td_noteditable" style="width:600px;">
																<xsl:value-of select="document/fields/regAddress[. ne 'null']"/>&#xA0;
															</div>
												</td>
											</tr>
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="document/captions/adresreal/@caption"/> : 
													</font>
												</td>
												<td>
													<div class="td_noteditable" style="width:600px;">
																<xsl:value-of select="document/fields/realAddress[. ne 'null']"/>&#xA0;
															</div>
												</td>
											</tr>
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="document/captions/dataregistraciivminyust/@caption"/> : 
													</font>
												</td>
												<td>
													<div class="td_noteditable" style="width:600px;">
																<xsl:value-of select="document/fields/regDate[. ne 'null']"/>&#xA0;
															</div>
												</td>
											</tr>
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="document/captions/viddeyatelnosti/@caption"/> : 
													</font>
												</td>
												<td>
													<div class="td_noteditable" style="width:600px;">
																<xsl:value-of select="document/fields/activityType[. ne 'null']"/>&#xA0;
															</div>
												</td>
											</tr>
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="document/captions/formaorganizacii/@caption"/> : 
													</font>
												</td>
												<td>
													<div class="td_noteditable" style="width:600px;">
																<xsl:value-of select="document/fields/orgForm[. ne 'null']"/>&#xA0;
															</div>
												</td>
											</tr>
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="document/captions/formasobstvennosti/@caption"/> : 
													</font>
												</td>
												<td>
													<div class="td_noteditable" style="width:600px;">
																<xsl:value-of select="document/fields/propForm[. ne 'null']"/>&#xA0;
															</div>
												</td>
											</tr>
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="document/captions/vidyuridicheskogolica/@caption"/> : 
													</font>
												</td>
												<td>
													<div class="td_noteditable" style="width:600px;">
																<xsl:value-of select="document/fields/personType[. ne 'null']"/>&#xA0;
															</div>
												</td>
											</tr>
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="document/captions/okpo/@caption"/> : 
													</font>
												</td>
												<td>
													<div class="td_noteditable" style="width:600px;">
																<xsl:value-of select="document/fields/okpo[. ne 'null']"/>&#xA0;
															</div>
												</td>
											</tr>
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="document/captions/organregistracii/@caption"/> : 
													</font>
												</td>
												<td>
													<div class="td_noteditable" style="width:600px;">
																<xsl:value-of select="document/fields/registryNumber[. ne 'null']"/>&#xA0;
															</div>
												</td>
											</tr>
					 					</table>
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