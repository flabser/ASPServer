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
									<a href="#tabs-1"><xsl:value-of select="document/captions/registrdannye/@caption"/></a>
								</li>
								<li class="ui-state-default ui-corner-top">
									<a href="#tabs-2"><xsl:value-of select="document/captions/kvartirapostroika/@caption"/></a>
								</li>
								<li class="ui-state-default ui-corner-top">
									<a href="#tabs-3"><xsl:value-of select="document/captions/vladelecsovladelec/@caption"/></a>
								</li>
								<li class="ui-state-default ui-corner-top">
									<a href="#tabs-4"><xsl:value-of select="document/captions/documentosnovaniye/@caption"/></a>
								</li>
							</ul>
							<div class="ui-tabs-panel" id="tabs-1">
									<div display="block"  id="property">
										<table width="100%" border="0">
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="document/captions/priznakstroeniya/@caption"/> : 
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
														<xsl:value-of select="document/captions/nomerkvartala/@caption"/> : 
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
														<xsl:value-of select="document/captions/uchetnyikvartal/@caption"/> : 
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
														<xsl:value-of select="document/captions/kadastrovyinomer/@caption"/> : 
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
														<xsl:value-of select="document/captions/oblast/@caption"/> : 
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
														<xsl:value-of select="document/captions/rayon/@caption"/> : 
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
														<xsl:value-of select="document/captions/naselennyipunkt/@caption"/> : 
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
														<xsl:value-of select="document/captions/ulica/@caption"/> : 
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
														<xsl:value-of select="document/captions/uglovayaulica/@caption"/> : 
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
														<xsl:value-of select="document/captions/nomerdoma/@caption"/> : 
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
														<xsl:value-of select="document/captions/godpostroiki/@caption"/> : 
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
														<xsl:value-of select="document/captions/etazhnost/@caption"/> : 
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
														<xsl:value-of select="document/captions/materialsten/@caption"/> : 
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
														<xsl:value-of select="document/captions/kolichestvokvartir/@caption"/> : 
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
														<xsl:value-of select="document/captions/ploschadobschaya/@caption"/> : 
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
														<xsl:value-of select="document/captions/ploschadzhilaya/@caption"/> : 
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
							<table width="100%" border="0">
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="document/captions/priznakstroeniya/@caption"/> : 
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
														<xsl:value-of select="document/captions/naimenovaniestroeniya/@caption"/>  : 
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
														<xsl:value-of select="document/captions/literstroeniya/@caption"/> : 
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
														<xsl:value-of select="document/captions/nomerkvartiry/@caption"/> : 
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
														<xsl:value-of select="document/captions/etazh/@caption"/> : 
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
														<xsl:value-of select="document/captions/godpostroiki/@caption"/> : 
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
														<xsl:value-of select="document/captions/materialsten/@caption"/> : 
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
														<xsl:value-of select="document/captions/kolichestvokomnat/@caption"/> : 
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
														<xsl:value-of select="document/captions/kolichestvopomeschenii/@caption"/> : 
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
														<xsl:value-of select="document/captions/ploschadobschaya/@caption"/> : 
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
														<xsl:value-of select="document/captions/ploschadzhilaya/@caption"/> : 
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
			           		<table width="100%" border="0">
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="document/captions/familiya/@caption"/> : 
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
														<xsl:value-of select="document/captions/imya/@caption"/>  : 
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
														<xsl:value-of select="document/captions/otchestvo/@caption"/> : 
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
														<xsl:value-of select="document/captions/datarozhdeniya/@caption"/> : 
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
														<xsl:value-of select="document/captions/rnn/@caption"/> : 
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
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="document/captions/grazhdanstvo/@caption"/> : 
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
														<xsl:value-of select="document/captions/tipdocumenta/@caption"/> : 
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
														<xsl:value-of select="document/captions/nomerdocumenta/@caption"/> : 
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
														<xsl:value-of select="document/captions/vydan/@caption"/> : 
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
														<xsl:value-of select="document/captions/telephon/@caption"/>: 
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
			           <div id="tabs-4">
			           		<table width="100%" border="0">
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="document/captions/priznak/@caption"/> : 
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
														<xsl:value-of select="document/captions/tip/@caption"/>  : 
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
														<xsl:value-of select="document/captions/nomer/@caption"/> : 
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
														<xsl:value-of select="document/captions/datavozniknoveniya/@caption"/> : 
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
														<xsl:value-of select="document/captions/datavoregistracii/@caption"/> : 
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
														<xsl:value-of select="document/captions/naznacheniestroeniya/@caption"/> : 
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
														<xsl:value-of select="document/captions/formasobstvennosti/@caption"/> : 
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
														<xsl:value-of select="document/captions/vidsobstvennosti/@caption"/> : 
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
														<xsl:value-of select="document/captions/organnalozhivshiiarest/@caption"/> : 
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
														<xsl:value-of select="document/captions/objektnalozheniyaobremeneniya/@caption"/> : 
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
														<xsl:value-of select="document/captions/usloviyazaloga/@caption"/> : 
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
           			</div>
           			<div style="height:10px"/>
			  		</div>
				</div>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>