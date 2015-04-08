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
					<xsl:value-of select="concat(document/captions/eis/@caption,' - ',page/captions/svedeniyaoregistracii/@caption)"/>
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
								<xsl:value-of select="page/captions/svedeniyaoregistracii/@caption"/>
							</div>
						</div>	
						<div class="button_panel">
							<span style="vertical-align:12px; float:left">
								<xsl:if test="page/script_result/response/content/root/hasprint = 'true'">
									<button class="ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only" id="btntocoordinate" style="margin-left:5px" title="{page/captions/raspechatatrezultaty/@caption}">
										<xsl:attribute name="onclick">javascript:window.print()</xsl:attribute>
										<span>
											<img src="/SharedResources/img/classic/icons/printer.png" class="button_img"/>
											<font style="font-size:12px; vertical-align:top"><xsl:value-of select="page/captions/raspechatatrezultaty/@caption"/></font>
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
							<font style="font-size:15px; color:#111;" id="printtitle">
								<xsl:value-of select="concat(document/captions/printed/@caption,':', /request/@username)"/>
							</font>
							<font style="font-size:14px; color:#111;" id="printtime"></font>
						</div>
						<div id="tabs">
							<ul class="ui-tabs-nav ui-helper-reset ui-helper-clearfix ui-widget-header ui-corner-all">
								<li class="ui-state-default ui-corner-top">
									<a href="#tabs-1"><xsl:value-of select="page/captions/obschiesvedeniya/@caption"/></a>
								</li>
								<li class="ui-state-default ui-corner-top">
									<a href="#tabs-2"><xsl:value-of select="page/captions/svedeniyaovizitah/@caption"/></a>
								</li>
							</ul>
							<div class="ui-tabs-panel" id="tabs-1">
								<div display="block"  id="property">
									<table width="100%" border="0" class="resulttable">
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="page/captions/familya/@caption"/>  : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="page/script_result/response/content/root/lastname[. ne 'null']"/>&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="page/captions/imya/@caption"/> : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="page/script_result/response/content/root/firstname[. ne 'null']"/>&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="page/captions/otchestvo/@caption"/> : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="/request/page/script_result/response/content/root/middlename[. ne 'null']"/>&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="page/captions/datarozhdeniya/@caption"/> : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="page/script_result/response/content/root/birthdate[. ne 'null']"/>&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="page/captions/docnumber/@caption"/> : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="page/script_result/response/content/root/docnumber[. ne 'null']"/>&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="page/captions/docserial/@caption"/> : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="page/script_result/response/content/root/docserial[. ne 'null']"/>&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="page/captions/pol/@caption"/>  : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="page/script_result/response/content/root/gender[. ne 'null']"/>&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="page/captions/nacionalnost/@caption"/> : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="page/script_result/response/content/root/nationality[. ne 'null']"/>&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="page/captions/stranarozhdeniya/@caption"/> : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="page/script_result/response/content/root/origin[. ne 'null']"/>&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="page/captions/stranagrazhdanstva/@caption"/> : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="page/script_result/response/content/root/citizenship[. ne 'null']"/>&#xA0;
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
										<td rowspan="2" width="40px" style="border:1px solid black">
										</td>
										<td colspan="3" style="border:1px solid black">
											<xsl:value-of select="page/captions/svedeniyaovremennoiregistracii/@caption"/>
										</td>
										<td rowspan="2" style="border:1px solid black">
											<xsl:value-of select="page/captions/celvizita/@caption"/>
										</td>
										<td rowspan="2" style="border:1px solid black">
											<xsl:value-of select="page/captions/kolvodetei/@caption"/>
										</td>
										<td colspan="7" style="border:1px solid black">
											<xsl:value-of select="page/captions/svedeniyaovize/@caption"/>
										</td>
										<td colspan="4" style="border:1px solid black">
											<xsl:value-of select="page/captions/adresprozhivaniya/@caption"/>
										</td>
									</tr>
									<tr>
										<td  style="border:1px solid black">
											<xsl:value-of select="page/captions/nomersvidregistracii/@caption"/>
										</td>
										<td  style="border:1px solid black">
											<xsl:value-of select="page/captions/datanachala/@caption"/>
										</td>
										<td  style="border:1px solid black">
											<xsl:value-of select="page/captions/dataokonchaniya/@caption"/>
										</td>
										<td  style="border:1px solid black">
											<xsl:value-of select="page/captions/seriya/@caption"/>
										</td>
										<td  style="border:1px solid black">
											<xsl:value-of select="page/captions/nomer/@caption"/>
										</td>
										<td  style="border:1px solid black">
											<xsl:value-of select="page/captions/kratn/@caption"/>
										</td>
										<td  style="border:1px solid black">
											<xsl:value-of select="page/captions/datavydachi/@caption"/>
										</td>
										<td  style="border:1px solid black">
											<xsl:value-of select="page/captions/datanachaladeistviya/@caption"/>
										</td>
										<td  style="border:1px solid black">
											<xsl:value-of select="page/captions/dataokonchaniyadeistviya/@caption"/>
										</td>
										<td  style="border:1px solid black">
											<xsl:value-of select="page/captions/vydavshayaorganizaciya/@caption"/>
										</td>
										<td  style="border:1px solid black">
											<xsl:value-of select="page/captions/ulica/@caption"/>
										</td>
										<td  style="border:1px solid black">
											<xsl:value-of select="page/captions/dom/@caption"/>
										</td>
										<td  style="border:1px solid black">
											<xsl:value-of select="page/captions/kvartira/@caption"/>
										</td>
										<td  style="border:1px solid black">
											<xsl:value-of select="page/captions/mestoprozhivaniya/@caption"/>
										</td>
									</tr>
									<xsl:for-each select="/request/page/script_result/response/content/root/visit/entry">
										<tr>
											<td style="border:1px solid black">
												<xsl:value-of select="position()"/>
											</td>
											<td style="border:1px solid black">
												<xsl:value-of select="tmpregnumber[. ne 'null']"/>
											</td>
											<td style="border:1px solid black">
												<xsl:value-of select="regstartdate[. ne 'null']"/>
											</td>
											<td style="border:1px solid black">
												<xsl:if test="regstartdate != regenddate">
													<xsl:value-of select="regenddate[. ne 'null']"/>
												</xsl:if>
											</td>
											<td  style="border:1px solid black">
												<xsl:value-of select="visitpurpose[. ne 'null']"/>
											</td>
											<td  style="border:1px solid black">
												<xsl:value-of select="numofchildren[. ne 'null']"/>
											</td>
											<td style="border:1px solid black">
												<xsl:value-of select="visaserial[. ne 'null']"/>
											</td>
											<td style="border:1px solid black">
												<xsl:value-of select="visanumber[. ne 'null']"/>
											</td>
											<td style="border:1px solid black">
												<xsl:value-of select="visarecurrence[. ne 'null']"/>
											</td>
											<td style="border:1px solid black">
												<xsl:value-of select="visagetday[. ne 'null']"/>
											</td>
											<td style="border:1px solid black">
												<xsl:value-of select="visastartdate[. ne 'null']"/>
											</td>
											<td style="border:1px solid black">
												<xsl:value-of select="visaenddate[. ne 'null']"/>
											</td>
											<td style="border:1px solid black">
												<xsl:value-of select="visaissuer[. ne 'null']"/>
											</td>
											<td style="border:1px solid black">
												<xsl:value-of select="street[. ne 'null']"/>
											</td>
											<td style="border:1px solid black">
												<xsl:value-of select="house[. ne 'null']"/>
											</td>
											<td style="border:1px solid black">
												<xsl:value-of select="flat[. ne 'null']"/>
											</td>
											<td style="border:1px solid black">
												<xsl:value-of select="livingplace[. ne 'null']"/>
											</td>
										</tr>
									</xsl:for-each>
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