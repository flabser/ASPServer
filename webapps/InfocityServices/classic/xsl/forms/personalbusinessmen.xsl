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
					<xsl:value-of select="concat(document/captions/eis/@caption,' - ',document/captions/svedeniyaobindividualnompredprinimatele/@caption)"/>
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
								<xsl:value-of select="document/captions/svedeniyaobindividualnompredprinimatele/@caption"/>
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
							<font style="font-size:15px; color:#111;" id="printtitle"><xsl:value-of select="concat(document/captions/printed/@caption,':',/request/@username)"/></font>
							<font style="font-size:14px; color:#111;" id="printtime"></font>
						</div>
						<div id="tabs">
							<ul class="ui-tabs-nav ui-helper-reset ui-helper-clearfix ui-widget-header ui-corner-all">
								<li class="ui-state-default ui-corner-top">
									<a href="#tabs-1"><xsl:value-of select="document/captions/obschiesvadeniya/@caption"/></a>
								</li>
							</ul>
							<div class="ui-tabs-panel" id="tabs-1">
								<div display="block" id="property">
									<table width="100%" border="0" class="resulttable">
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="document/captions/familiya/@caption"/>  : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="document/fields/lastName[. ne 'null']"/>&#xA0;
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
													<xsl:value-of select="document/fields/firstName[. ne 'null']"/>&#xA0;
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
													<xsl:value-of select="document/fields/middleName[. ne 'null']"/>&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="document/captions/naimenovanienalogoplatelchsika/@caption"/> : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="document/fields/businessName[. ne 'null']"/>&#xA0;
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
													<xsl:value-of select="document/captions/iin/@caption"/> : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="document/fields/iin[. ne 'null']"/>&#xA0;
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
													<xsl:value-of select="document/fields/address[. ne 'null']"/>&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="document/captions/dataregistracii/@caption"/> : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="document/fields/licenseStartDate[. ne 'null']"/>&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="document/captions/seriyadocumenta/@caption"/> : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="document/fields/docSerial[. ne 'null']"/>&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="document/captions/nomerdocumenta/@caption"/> : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="document/fields/docNumber[. ne 'null']"/>&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="document/captions/organvydachi/@caption"/> : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="document/fields/docAuthority[. ne 'null']"/>&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="document/captions/datavydachi/@caption"/> : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="document/fields/docReleaseDate[. ne 'null']"/>&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="document/captions/vidpredprinimatelstva/@caption"/> : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="document/fields/businessType[. ne 'null']"/>&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="document/captions/vidpredprinimatelstva/@caption"/> : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="document/fields/cooperativeType[. ne 'null']"/>&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="document/captions/kolichestvochlenovsovmestnogopredprinimatelstva/@caption"/> : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="document/fields/cooperativeCount[. ne 'null']"/>&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="document/captions/vidydeyatelnosti/@caption"/> : 
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
													<xsl:value-of select="document/captions/mestoosuchsestvleniyadeyatelnosti/@caption"/> : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="document/fields/activityPlace[. ne 'null']"/>&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="document/captions/datanachaladeistviyasvid/@caption"/> : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="document/fields/licenseStartDate[. ne 'null']"/>&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="document/captions/srokdeistviyasvid/@caption"/> : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="document/fields/licenseEndDate[. ne 'null']"/>&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="document/captions/datapodachizayavleniya/@caption"/> : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="document/fields/declarationSentDate[. ne 'null']"/>&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="document/captions/datapriyemazayavleniya/@caption"/> : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="document/fields/declarationReceivedDate[. ne 'null']"/>&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="document/captions/nalogovyiorgan/@caption"/> : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="document/fields/taxingOfficeName[. ne 'null']"/>&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="document/captions/kodnalogovogoorgana/@caption"/> : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="document/fields/taxingOfficeID[. ne 'null']"/>&#xA0;
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