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
					<xsl:value-of select="concat(document/captions/eis/@caption,' - ',document/captions/documentynavladeniestroeniem/@caption)"/>
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
								<xsl:value-of select="page/captions/vladelec/@caption"/> :  <xsl:value-of select="page/script_result/response/content/root/owner"/>
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
									<a href="#tabs-1"><xsl:value-of select="page/captions/documentynanedvizhimost/@caption"/></a>
								</li>
							</ul>
							<div class="ui-tabs-panel" id="tabs-1">
								<div display="block"  id="property">
									<table width="100%" style="border-collapse:collapse; font-size:12px !important" class="longresulttable">
										<tr style="height:30px">
											<td style="width:30px; border:1px solid #000" rowspan="2"></td>
											<td style="border:1px solid #000; text-align:center" colspan="3">
												<xsl:value-of select="page/captions/documenty/@caption"/>
											</td>
											<td style="border:1px solid #000; text-align:center" rowspan="2">
												<xsl:value-of select="page/captions/dataregistracii/@caption"/>
											</td>
											<td style="border:1px solid #000; text-align:center" rowspan="2">
												<xsl:value-of select="page/captions/tipstroeniya/@caption"/>
											</td>
											<td style="border:1px solid #000; text-align:center" colspan="3">
												<xsl:value-of select="page/captions/adresstroeniya/@caption"/>
											</td>
										</tr>
										<tr style="height:30px">
											<td style="border:1px solid #000; text-align:center">
												<xsl:value-of select="page/captions/priznak/@caption"/>
											</td>
											<td style="border:1px solid #000; text-align:center">
												<xsl:value-of select="page/captions/tip/@caption"/>
											</td>
											<td style="border:1px solid #000; text-align:center">
												<xsl:value-of select="page/captions/nomer/@caption"/>
											</td>
											<td style="border:1px solid #000; text-align:center">
												<xsl:value-of select="page/captions/ulica/@caption"/>
											</td>
											<td style="border:1px solid #000; text-align:center">
												<xsl:value-of select="page/captions/dom/@caption"/>
											</td>
											<td style="border:1px solid #000; text-align:center">
												<xsl:value-of select="page/captions/kvartira/@caption"/>
											</td>
										</tr>
										<xsl:for-each select="/request/page/script_result/response/content/root/buildings/entry"> 
											<tr style="height:30px">
												<td style="width:30px; border:1px solid #000; text-align:center">
													<a href="" class="doclink">
														<xsl:attribute name="href">Provider?type=page&amp;id=bti_form_getbuildfulldata&amp;ownerid=<xsl:value-of select="ownerid"/>&amp;ownerstatus=<xsl:value-of select="ownerstatus"/>&amp;docid=<xsl:value-of select="docid"/></xsl:attribute>
														<xsl:value-of select="position()"/>
													</a>
												</td>
												<td style="border:1px solid #000; padding-left:5px">
													<xsl:value-of select="dkind[. ne 'null']"/>
												</td>
												<td style="border:1px solid #000; padding-left:5px">
													<xsl:value-of select="dtype[. ne 'null']"/>
												</td>
												<td style="border:1px solid #000; padding-left:5px">
													<xsl:value-of select="dnumber[. ne 'null']"/>
												</td>
												<td style="border:1px solid #000; padding-left:5px">
													<xsl:value-of select="dregdate[. ne 'null']"/>
												</td>
												<td style="border:1px solid #000; padding-left:5px">
													<xsl:value-of select="bkind[. ne 'null']"/>
												</td>
												<td style="border:1px solid #000; padding-left:5px">
													<xsl:value-of select="bstreet[. ne 'null']"/>
												</td>
												<td style="border:1px solid #000; padding-left:5px">
													<xsl:value-of select="bhouse[. ne 'null']"/>
												</td>
												<td style="border:1px solid #000; padding-left:5px">
													<xsl:value-of select="bflat[. ne 'null']"/>
												</td>
											</tr>
										</xsl:for-each>
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