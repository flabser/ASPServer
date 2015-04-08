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
								<li class="ui-state-default ui-corner-top">
									<a href="#tabs-2"><xsl:value-of select="document/captions/svedeniyaopmzh/@caption"/></a>
								</li>
							</ul>
							<div class="ui-tabs-panel" id="tabs-1">
								<div display="block"  id="property">
									<table width="100%" border="0" class="resulttable">
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="document/captions/familiya/@caption"/>  : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="document/fields/lastname[. ne 'null']"/>&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="document/captions/imya/@caption"/> : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="document/fields/firstname[. ne 'null']"/>&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="document/captions/otchestvo/@caption"/> : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="document/fields/middlename[. ne 'null']"/>&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="document/captions/iin/@caption"/> : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="document/fields/iin[. ne 'null']"/>&#xA0;
												</div>
											</td>
										</tr>
					 				</table>
					 				<br/>
								</div>
							</div>
							<div id="tabs-2">
								<table width="100%" border="0" style="border-collapse:collapse; text-align:center; font-size:10px !important" class="longresulttable">
									<tr>
										<td rowspan="2" width="50px" style="border:1px solid black">
										</td>
										<td rowspan="2" style="border:1px solid black">
											<xsl:value-of select="document/captions/otnosheniekotvetstvennomukvartirosemschiku/@caption"/>
										</td>
										<td rowspan="2" style="border:1px solid black">
											<xsl:value-of select="document/captions/tipregistracii/@caption"/>
										</td>
										<td colspan="5" style="border:1px solid black">
											<xsl:value-of select="document/captions/pmzh/@caption"/>
										</td>
										<td rowspan="2" style="border:1px solid black">
											<xsl:value-of select="document/captions/datanachalaregistracii/@caption"/>
										</td>
										<td rowspan="2" style="border:1px solid black">
											<xsl:value-of select="document/captions/dataokonchaniyaregistracii/@caption"/>
										</td>
										<td colspan="6" style="border:1px solid black">
											<xsl:value-of select="document/captions/otkudapribyl/@caption"/>
										</td>
										<td colspan="6" style="border:1px solid black">
											<xsl:value-of select="document/captions/kudaubyl/@caption"/>
										</td>
										<td rowspan="2" style="border:1px solid black">
											<xsl:value-of select="document/captions/punktregistracii/@caption"/>
										</td>
									</tr>
									<tr>
										<td style="border:1px solid black">
											<xsl:value-of select="document/captions/rayon/@caption"/>
										</td>
										<td style="border:1px solid black">
											<xsl:value-of select="document/captions/naselpunkt/@caption"/>
										</td>
										<td style="border:1px solid black">
											<xsl:value-of select="document/captions/ulica/@caption"/>
										</td>
										<td style="border:1px solid black">
											<xsl:value-of select="document/captions/dom/@caption"/>
										</td>
										<td style="border:1px solid black">
											<xsl:value-of select="document/captions/kv/@caption"/>
										</td>
										<td style="border:1px solid black">
											<xsl:value-of select="document/captions/oblast/@caption"/>
										</td>
										<td style="border:1px solid black">
											<xsl:value-of select="document/captions/rayon/@caption"/>
										</td>
										<td style="border:1px solid black">
											<xsl:value-of select="document/captions/naselpunkt/@caption"/>
										</td>
										<td style="border:1px solid black">
											<xsl:value-of select="document/captions/ulica/@caption"/>
										</td>
										<td style="border:1px solid black">
											<xsl:value-of select="document/captions/dom/@caption"/>
										</td>
										<td style="border:1px solid black">
											<xsl:value-of select="document/captions/kv/@caption"/>
										</td>
										<td style="border:1px solid black">
											<xsl:value-of select="document/captions/oblast/@caption"/>
										</td>
										<td style="border:1px solid black">
											<xsl:value-of select="document/captions/rayon/@caption"/>
										</td>
										<td style="border:1px solid black">
											<xsl:value-of select="document/captions/naselpunkt/@caption"/>
										</td>
										<td style="border:1px solid black">
											<xsl:value-of select="document/captions/ulica/@caption"/>
										</td>
										<td style="border:1px solid black">
											<xsl:value-of select="document/captions/dom/@caption"/>
										</td>
										<td style="border:1px solid black">
											<xsl:value-of select="document/captions/kv/@caption"/>
										</td>
									</tr>
									<tr>
										<td style="border:1px solid black">
											
										</td>
										<td style="border:1px solid black">
											<xsl:value-of select="document/fields/relationship[. ne 'null']"/>
										</td>
										<td style="border:1px solid black">
											<xsl:value-of select="document/fields/regtype[. ne 'null']"/>
										</td>
										<td style="border:1px solid black">
											<xsl:value-of select="document/fields/district[. ne 'null']"/>
										</td>
										<td style="border:1px solid black">
											<xsl:value-of select="document/fields/city[. ne 'null']"/>
										</td>
										<td style="border:1px solid black">
											<xsl:value-of select="document/fields/street[. ne 'null']"/>
										</td>
										<td style="border:1px solid black">
											<xsl:value-of select="document/fields/house[. ne 'null']"/>
										</td>
										<td style="border:1px solid black">
											<xsl:value-of select="document/fields/flat[. ne 'null']"/>
										</td>
										<td style="border:1px solid black">
											<xsl:value-of select="document/fields/regstartdate[. ne 'null']"/>
										</td>
										<td style="border:1px solid black">
											<xsl:value-of select="document/fields/regenddate[. ne 'null']"/>
										</td>
										<td style="border:1px solid black">
											<xsl:value-of select="document/fields/camefromregion[. ne 'null']"/>
										</td>
										<td style="border:1px solid black">
											<xsl:value-of select="document/fields/camefromdistrict[. ne 'null']"/>
										</td>
										<td style="border:1px solid black">
											<xsl:value-of select="document/fields/camefromcity[. ne 'null']"/>
										</td>
										<td style="border:1px solid black">
											<xsl:value-of select="document/fields/camefromstreet[. ne 'null']"/>
										</td>
										<td style="border:1px solid black">
											<xsl:value-of select="document/fields/camefromhouse[. ne 'null']"/>
										</td>
										<td style="border:1px solid black">
											<xsl:value-of select="document/fields/camefromflat[. ne 'null']"/>
										</td>
										<td style="border:1px solid black">
											<xsl:value-of select="document/fields/gonetoregion[. ne 'null']"/>
										</td>
										<td style="border:1px solid black">
											<xsl:value-of select="document/fields/gonetodistrict[. ne 'null']"/>
										</td>
										<td style="border:1px solid black">
											<xsl:value-of select="document/fields/gonetocity[. ne 'null']"/>
										</td>
										<td style="border:1px solid black">
											<xsl:value-of select="document/fields/gonetostreet[. ne 'null']"/>
										</td>
										<td style="border:1px solid black">
											<xsl:value-of select="document/fields/gonetohouse[. ne 'null']"/>
										</td>
										<td style="border:1px solid black">
											<xsl:value-of select="document/fields/gonetoflat[. ne 'null']"/>
										</td>
										<td style="border:1px solid black">
											<xsl:value-of select="document/fields/regoffice[. ne 'null']"/>
										</td>
									</tr>
						 		</table>
					        </div>
           				</div>
           				<div style="height:10px"/>
			  		</div>
				</div>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>