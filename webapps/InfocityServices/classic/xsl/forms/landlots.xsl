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
					<xsl:value-of select="concat(document/captions/eis/@caption,' - ',document/captions/svedeniyaozemelnomuchastke/@caption)"/>
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
								<xsl:value-of select="document/captions/svedeniyaozemelnomuchastke/@caption"/>
							</div>
						</div>	
						<div class="button_panel">
							<span style="vertical-align:12px; float:left"></span>
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
									<a href="#tabs-1"><xsl:value-of select="document/captions/registracionnyedannye/@caption"/></a>
								</li>
								<li class="ui-state-default ui-corner-top">
									<a href="#tabs-2"><xsl:value-of select="document/captions/vladelec/@caption"/></a>
								</li>
								<li class="ui-state-default ui-corner-top">
									<a href="#tabs-3"><xsl:value-of select="document/captions/documenty/@caption"/></a>
								</li>
							</ul>
							<div class="ui-tabs-panel" id="tabs-1">
								<div display="block"  id="property">
									<table width="100%" border="0" >
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="document/captions/naimenovanieuchastka/@caption"/>  : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="document/captions/celevoenaznachenie/@caption"/>: 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="document/captions/rayon/@caption"/>  : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="document/captions/kvartal/@caption"/>  : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="document/captions/ulica/@caption"/>  : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="document/captions/dom/@caption"/>  : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="document/captions/korpus/@caption"/>  : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="document/captions/kadastrovyinomer/@caption"/>  : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="document/captions/ploschad/@caption"/>  : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="document/captions/tipnaloga/@caption"/>  : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="document/captions/priznaknaloga/@caption"/>  : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="document/captions/tipprava/@caption"/>  : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="document/captions/priznakdelimosti/@caption"/>  : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="document/captions/priznaklikvidacii/@caption"/>  : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													&#xA0;
												</div>
											</td>
										</tr>
					 				</table>
					 				<br/>
								</div>
							</div>
							<div id="tabs-2">
								<table width="100%" border="0" >
									<tr>
										<td class="fc">
											<font style="vertical-align:top">
												<xsl:value-of select="document/captions/naimenovanie/@caption"/> : 
											</font>
										</td>
										<td>
											<div class="td_noteditable" style="width:600px;">
												&#xA0;
											</div>
										</td>
									</tr>
									<tr>
										<td class="fc">
											<font style="vertical-align:top">
												<xsl:value-of select="document/captions/fiorukovoditelya/@caption"/> : 
											</font>
										</td>
										<td>
											<div class="td_noteditable" style="width:600px;">
												&#xA0;
											</div>
										</td>
									</tr>
									<tr>
										<td class="fc">
											<font style="vertical-align:top">
												<xsl:value-of select="document/captions/status/@caption"/>  : 
											</font>
										</td>
										<td>
											<div class="td_noteditable" style="width:600px;">
												&#xA0;
											</div>
										</td>
									</tr>
									<tr>
										<td class="fc">
											<font style="vertical-align:top">
												<xsl:value-of select="document/captions/rayon/@caption"/>  : 
											</font>
										</td>
										<td>
											<div class="td_noteditable" style="width:600px;">
												&#xA0;
											</div>
										</td>
									</tr>
									<tr>
										<td class="fc">
											<font style="vertical-align:top">
												<xsl:value-of select="document/captions/rnn/@caption"/>  : 
											</font>
										</td>
										<td>
											<div class="td_noteditable" style="width:600px;">
												&#xA0;
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
												&#xA0;
											</div>
										</td>
									</tr>
									<tr>
										<td class="fc">
											<font style="vertical-align:top">
												<xsl:value-of select="document/captions/telephon/@caption"/> : 
											</font>
										</td>
										<td>
											<div class="td_noteditable" style="width:600px;">
												&#xA0;
											</div>
										</td>
									</tr>
									<tr>
										<td class="fc">
											<font style="vertical-align:top">
												<xsl:value-of select="document/captions/adres/@caption"/> : 
											</font>
										</td>
										<td>
											<div class="td_noteditable" style="width:600px;">
												&#xA0;
											</div>
										</td>
									</tr>
					 			</table>
				        	</div>
							<div id="tabs-3">
								<table width="600px" border="0" style="border-collapse:collapse; text-align:center">
									<tr>
										<td width="80px" style="border:1px solid black">
										</td>
										<td colspan="3" style="border:1px solid black">
											<xsl:value-of select="document/captions/aktnapravopolzovaniya/@caption"/> :
										</td>
									</tr>
									<tr>
										<td width="80px" style="border:1px solid black">
											<xsl:value-of select="document/captions/seriya/@caption"/> :
										</td>
										<td  width="80px" style="border:1px solid black">
										</td>
										<td style="border:1px solid black">
											<xsl:value-of select="document/captions/registracionnyinomer/@caption"/> :
										</td>
										<td width="80px" style="border:1px solid black">
										</td>
									</tr>
									<tr>
										<td width="80px" style="border:1px solid black">
											<xsl:value-of select="document/captions/nomer/@caption"/> :
										</td>
										<td width="80px" style="border:1px solid black">
										</td>
										<td style="border:1px solid black">
											<xsl:value-of select="document/captions/dataregistracii/@caption"/> :
										</td>
										<td  style="border:1px solid black">
										</td>
									</tr>
									<tr>
										<td width="80px" style="border:1px solid black">
										</td>
										<td colspan="3" style="border:1px solid black">
											<xsl:value-of select="document/captions/gosudarstvennyiakt/@caption"/> :
										</td>
									</tr>
									<tr>
										<td width="80px" style="border:1px solid black">
											<xsl:value-of select="document/captions/nomer/@caption"/> :
										</td>
										<td  style="border:1px solid black">
										</td>
										<td style="border:1px solid black">
											<xsl:value-of select="document/captions/dataregistracii/@caption"/> :
										</td>
										<td  style="border:1px solid black">
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