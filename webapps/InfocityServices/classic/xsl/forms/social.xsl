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
        <html>
			<head>
				<title>
					<xsl:value-of select="concat(document/captions/eis/@caption,' - ',document/captions/svedeniyaopmzh/@caption)"/>
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
								<xsl:value-of select="document/captions/svedeniyaopmzh/@caption"/>
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
									<a href="#tabs-1"><xsl:value-of select="document/captions/obschiesvedeniya/@caption"/></a>
								</li>
							</ul>
							<div class="ui-tabs-panel" id="tabs-1">
									<div display="block"  id="property">
										<table width="100%" border="0" class="resulttable">
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="document/captions/fio/@caption"/>  : 
													</font>
												</td>
												<td>
													<div class="td_noteditable" style="width:600px;">
																<xsl:value-of select="document/fields/fio[. ne 'null']"/>&#xA0;
															</div>
												</td>
											</tr>
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="document/captions/familymembers/@caption"/>  : 
													</font>
												</td>
												<td>
													<div class="td_noteditable" style="width:100px;">
																<xsl:value-of select="document/fields/familymembers[. ne 'null']"/>&#xA0;
															</div>
												</td>
											</tr>
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="document/captions/areareal/@caption"/>  : 
													</font>
												</td>
												<td>
													<div class="td_noteditable" style="width:200px;">
																<xsl:value-of select="document/fields/areareal[. ne 'null']"/>&#xA0;
															</div>
												</td>
											</tr>
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="document/captions/areastandard/@caption"/>  : 
													</font>
												</td>
												<td>
													<div class="td_noteditable" style="width:200px;">
																<xsl:value-of select="document/fields/areastandard[. ne 'null']"/>&#xA0;
															</div>
												</td>
											</tr>
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="document/captions/averageincome/@caption"/>  : 
													</font>
												</td>
												<td>
													<div class="td_noteditable" style="width:200px;">
																<xsl:value-of select="document/fields/averageincome[. ne 'null']"/>&#xA0;
															</div>
												</td>
											</tr>
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="document/captions/tenpercent/@caption"/>  : 
													</font>
												</td>
												<td>
													<div class="td_noteditable" style="width:200px;">
																<xsl:value-of select="document/fields/tenpercent[. ne 'null']"/>&#xA0;
															</div>
												</td>
											</tr>
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="document/captions/invoiceamount/@caption"/>  : 
													</font>
												</td>
												<td>
													<div class="td_noteditable" style="width:200px;">
																<xsl:value-of select="document/fields/invoiceamount[. ne 'null']"/>&#xA0;
															</div>
												</td>
											</tr>
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="document/captions/standardamount/@caption"/>  : 
													</font>
												</td>
												<td>
													<div class="td_noteditable" style="width:200px;">
																<xsl:value-of select="document/fields/standardamount[. ne 'null']"/>&#xA0;
															</div>
												</td>
											</tr>
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="document/captions/allowanceamount/@caption"/>  : 
													</font>
												</td>
												<td>
													<div class="td_noteditable" style="width:200px;">
																<xsl:value-of select="document/fields/allowanceamount[. ne 'null']"/>&#xA0;
															</div>
												</td>
											</tr>
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="document/captions/daterevalidation/@caption"/>  : 
													</font>
												</td>
												<td>
													<div class="td_noteditable" style="width:200px;">
																<xsl:value-of select="document/fields/daterevalidation[. ne 'null']"/>&#xA0;
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