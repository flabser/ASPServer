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
					<xsl:value-of select="concat(document/captions/eis/@caption,' - ',document/captions/informaciyaostroenii/@caption)"/>
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
								<xsl:value-of select="document/captions/informaciyaostroenii/@caption"/>
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
									<a href="#tabs-1"><xsl:value-of select="document/captions/obschiedannye/@caption"/></a>
								</li>
							</ul>
							<div class="ui-tabs-panel" id="tabs-1">
								<div display="block"  id="property">
									<table width="100%" border="0">
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="document/captions/vladelec/@caption"/> : 
												</font>
											</td>
											<td>
												<table>
													<tr>
														<td class="td_noteditable" style="width:600px;">
															&#xA0;
														</td>
													</tr>
												</table>
											</td>
										</tr>
					 				</table>
					 				<br/>
					 				<table width="100%" border="0" style="border-collapse:collapse; text-align:center">
										<tr>
											<td rowspan="2" width="50px" style="border:1px solid black"></td>
											<td colspan="3" style="border:1px solid black">
												<xsl:value-of select="document/captions/documenty/@caption"/>
											</td>
											<td rowspan="2" style="border:1px solid black">
												<xsl:value-of select="document/captions/dataregistracii/@caption"/>
											</td>
											<td rowspan="2" style="border:1px solid black">
												<xsl:value-of select="document/captions/tipstroeniya/@caption"/>
											</td>
											<td colspan="3" style="border:1px solid black">
												<xsl:value-of select="document/captions/adresstroyeniya/@caption"/>
											</td>
										</tr>
										<tr>
											<td style="border:1px solid black">
												<xsl:value-of select="document/captions/priznak/@caption"/>
											</td>
											<td style="border:1px solid black">
												<xsl:value-of select="document/captions/tip/@caption"/>
											</td>
											<td style="border:1px solid black">
												<xsl:value-of select="document/captions/nomer/@caption"/>
											</td>
											<td style="border:1px solid black">
												<xsl:value-of select="document/captions/ulica/@caption"/>
											</td>
											<td style="border:1px solid black">
												<xsl:value-of select="document/captions/dom/@caption"/>
											</td>
											<td style="border:1px solid black">
												<xsl:value-of select="document/captions/kvartira/@caption"/>
											</td>
										</tr>
									</table>
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