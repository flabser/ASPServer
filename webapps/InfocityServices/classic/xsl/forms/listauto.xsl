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
					<xsl:value-of select="concat(document/captions/eis/@caption,' - ',page/captions/spisoktransportnyhsredtsv/@caption)"/>
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
							<div style="float:left; font-size:18px" class="title">
								 <xsl:value-of select="page/captions/vladelec/@caption"/>  : <xsl:value-of select="replace(page/script_result/response/content/root/owner,'null','')"/>
							</div>
						</div>	
						<div class="button_panel">
							<xsl:if test="page/script_result/response/content/root/hasprint = 'true'">
								<span style="vertical-align:12px; float:left">
									<button class="ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only" id="btntocoordinate" style="margin-left:5px" title="{page/captions/raspechatatrezultaty/@caption}">
										<xsl:attribute name="onclick">javascript:window.print()</xsl:attribute>
										<span>
											<img src="/SharedResources/img/classic/icons/printer.png" class="button_img"/>
											<font style="font-size:12px; vertical-align:top"><xsl:value-of select="page/captions/raspechatatresultaty/@caption"/></font>
										</span>
									</button>
								</span>
							</xsl:if>
							<span style="float:right">
				            	<xsl:call-template name="cancel"/>
				            </span>
		           		</div>
						<div style="clear:both"/>
						<div style="-moz-border-radius:0px;height:1px; width:100%; margin-top:10px;"/>
						<div style="clear:both"/>
						<div id="aboutprint" style="display:none;">
							<font style="font-size:15px; color:#111;" id="printtitle">
								<xsl:value-of select="concat(document/captions/printed/@caption,':',/request/@username)"/>
							</font>
							<font style="font-size:14px; color:#111;" id="printtime"></font>
						</div>
						<div id="tabs">
							<ul class="ui-tabs-nav ui-helper-reset ui-helper-clearfix ui-widget-header ui-corner-all">
								<li class="ui-state-default ui-corner-top">
									<a href="#tabs-1"><xsl:value-of select="page/captions/spisoktransportnyhsredtsv/@caption"/></a>
								</li>
							</ul>
							<div class="ui-tabs-panel" id="tabs-1">
								<div display="block" id="property">
									<table width="100%" style="border-collapse:collapse" class="longresulttable">
										<tr style="height:30px">
											<td style="width:30px; border:1px solid #000"></td>
											<td style="border:1px solid #000; text-align:center"><xsl:value-of select="page/captions/gosnomer/@caption"/></td>
											<td style="border:1px solid #000; text-align:center"><xsl:value-of select="page/captions/marka/@caption"/></td>
											<td style="border:1px solid #000; text-align:center"><xsl:value-of select="page/captions/cvet/@caption"/></td>
											<td style="border:1px solid #000; text-align:center"><xsl:value-of select="page/captions/godvypuska/@caption"/></td>
											<td style="border:1px solid #000; text-align:center"><xsl:value-of select="page/captions/tehpassport/@caption"/></td>
											<td style="border:1px solid #000; text-align:center"><xsl:value-of select="page/captions/dataregistracii/@caption"/></td>
											<td style="border:1px solid #000; text-align:center"><xsl:value-of select="page/captions/datapostanovkinauchet/@caption"/></td>
											<td style="border:1px solid #000; text-align:center"><xsl:value-of select="page/captions/datasnyatiyasucheta/@caption"/></td>
											<td style="border:1px solid #000; text-align:center"><xsl:value-of select="page/captions/status/@caption"/></td>
										</tr>
										<xsl:for-each select="page/script_result/response/content/root/entry"> 
											<tr style="height:30px">
												<td style="width:30px; border:1px solid #000; text-align:center">
													<a href="" class="doclink">
														<xsl:attribute name="href">Provider?type=page&amp;id=udp_form_getdatabyregid&amp;srts=<xsl:value-of select="id"/></xsl:attribute>
														<xsl:value-of select="position()"/>
													</a>
												</td>
												<td style="border:1px solid #000; padding-left:5px">
													<xsl:value-of select="grnz[. ne 'null']"/>
												</td>
												<td style="border:1px solid #000; padding-left:5px">
													<a href="" class="doclink">
														<xsl:attribute name="href">Provider?type=page&amp;id=udp_form_getdatabyregid&amp;srts=<xsl:value-of select="id"/></xsl:attribute>
														<xsl:value-of select="model[. ne 'null']"/>
													</a>
												</td>
												<td style="border:1px solid #000; padding-left:5px; width:250px">
													<xsl:value-of select="color[. ne 'null']"/>
												</td>
												<td style="border:1px solid #000; padding-left:5px">
													<xsl:value-of select="year[. ne 'null']"/>
												</td>
												<td style="border:1px solid #000; padding-left:5px">
													<xsl:value-of select="srts[. ne 'null']"/>
												</td>
												<td style="border:1px solid #000; padding-left:5px; width:200px">
													<xsl:value-of select="regdate[. ne 'null']"/>
												</td>
												<td style="border:1px solid #000; padding-left:5px; width:200px">
													<xsl:value-of select="uregdate[. ne 'null']"/>
												</td>
												<td style="border:1px solid #000; padding-left:5px; width:200px">
													<xsl:value-of select="regenddate[. ne 'null']"/>
												</td>
												<td style="border:1px solid #000; padding-left:5px">
													<xsl:if test="status = '1'">
														<xsl:value-of select="/request/page/captions/register/@caption"/>
													</xsl:if>
													<xsl:if test="status = '0'">
														<xsl:value-of select="/request/page/captions/notregister/@caption"/>
													</xsl:if>
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