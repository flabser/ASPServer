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
					<xsl:value-of select="concat(document/captions/eis/@caption,' - ',page/captions/svedeniyaotransportnomsredstve/@caption)"/>
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
								<xsl:value-of select="page/captions/svedeniyaotransportnomsredstve/@caption"/>
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
							<font style="font-size:15px; color:#111;" id="printtitle"><xsl:value-of select="document/captions/printed/@caption"/>: <xsl:value-of select="/request/@username"/></font>
							<font style="font-size:14px; color:#111;" id="printtime"></font>
						</div>
						<div id="tabs">
							<ul class="ui-tabs-nav ui-helper-reset ui-helper-clearfix ui-widget-header ui-corner-all">
								<li class="ui-state-default ui-corner-top">
									<a href="#tabs-1"><xsl:value-of select="page/captions/dannyepots/@caption"/></a>
								</li>
								<li class="ui-state-default ui-corner-top">
									<a href="#tabs-2"><xsl:value-of select="page/captions/vladelec/@caption"/></a>
								</li>
								<li class="ui-state-default ui-corner-top">
									<a href="#tabs-3"><xsl:value-of select="page/captions/tehosmotr/@caption"/></a>
								</li>
								<li class="ui-state-default ui-corner-top">
									<a href="#tabs-4"><xsl:value-of select="page/captions/nalogilgoty/@caption"/></a>
								</li>
								<li class="ui-state-default ui-corner-top">
									<a href="#tabs-5"><xsl:value-of select="page/captions/doverennosti/@caption"/></a>
								</li>
							</ul>
							<div class="ui-tabs-panel" id="tabs-1">
									<div display="block"  id="property">
										<table width="100%" border="0" class="resulttable">
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="page/captions/gosnomer/@caption"/> : 
													</font>
												</td>
												<td>
													<div class="td_noteditable" style="width:600px;">
																<xsl:value-of select="page/script_result/response/content/root/grnz[. ne 'null']"/>&#xA0;
															</div>
												</td>
											</tr>
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="page/captions/tehpassport/@caption"/> : 
													</font>
												</td>
												<td>
													<div class="td_noteditable" style="width:600px;">
																<xsl:value-of select="page/script_result/response/content/root/srts[. ne 'null']"/>&#xA0;
															</div>
												</td>
											</tr>
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="page/captions/model/@caption"/> : 
													</font>
												</td>
												<td>
													<div class="td_noteditable" style="width:600px;">
																<xsl:value-of select="page/script_result/response/content/root/model[. ne 'null']"/>&#xA0;
															</div>
												</td>
											</tr>
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="page/captions/cvet/@caption"/> : 
													</font>
												</td>
												<td>
													<div class="td_noteditable" style="width:600px;">
																<xsl:value-of select="page/script_result/response/content/root/color[. ne 'null']"/>&#xA0;
															</div>
												</td>
											</tr>
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="page/captions/godvypuska/@caption"/> : 
													</font>
												</td>
												<td>
													<div class="td_noteditable" style="width:600px;">
																<xsl:value-of select="page/script_result/response/content/root/year[. ne 'null']"/>&#xA0;
															</div>
												</td>
											</tr>
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="page/captions/status/@caption"/> : 
													</font>
												</td>
												<td>
													<div class="td_noteditable" style="width:600px;">
																<xsl:if test="page/script_result/response/content/root/status = '1'">
																	Стоит на учете
																</xsl:if>
																<xsl:if test="page/script_result/response/content/root/status = '0'">
																	Снята с учета
																</xsl:if>&#xA0;
															</div>
												</td>
											</tr>
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="page/captions/dataregistracii/@caption"/> : 
													</font>
												</td>
												<td>
													<div class="td_noteditable" style="width:600px;">
																<xsl:value-of select="page/script_result/response/content/root/regdate[. ne 'null']"/>&#xA0;
															</div>
												</td>
											</tr>
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="page/captions/datasnyatiyasucheta/@caption"/> : 
													</font>
												</td>
												<td>
													<div class="td_noteditable" style="width:600px;">
																<xsl:if test="page/script_result/response/content/root/status = '0'">
																	<xsl:value-of select="page/script_result/response/content/root/regenddate[. ne 'null']"/>
																</xsl:if>
																&#xA0;
															</div>
												</td>
											</tr>
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="page/captions/osobyeotmetki/@caption"/> : 
													</font>
												</td>
												<td>
													<div class="td_noteditable" style="width:600px;">
																<xsl:value-of select="page/script_result/response/content/root/comments[. ne 'null']"/>&#xA0;
															</div>
												</td>
											</tr>
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="page/captions/prezhniigosnomer/@caption"/> : 
													</font>
												</td>
												<td>
													<div class="td_noteditable" style="width:600px;">
																<xsl:value-of select="page/script_result/response/content/root/prevgrnz[. ne 'null']"/>&#xA0;
															</div>
												</td>
											</tr>
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="page/captions/prezhniitehpassport/@caption"/> : 
													</font>
												</td>
												<td>
													<div class="td_noteditable" style="width:600px;">
																<xsl:value-of select="page/script_result/response/content/root/prevsrts[. ne 'null']"/>&#xA0;
															</div>
												</td>
											</tr>
											<!-- <tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="page/captions/nomerkuzova/@caption"/> : 
													</font>
												</td>
												<td>
													<table>
														<tr>
															<td class="td_noteditable" style="width:600px;">
																<xsl:value-of select="page/script_result/response/content/root/bodyno[. ne 'null']"/>&#xA0;
															</td>
														</tr>
													</table>
												</td>
											</tr>
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="page/captions/nomershassi/@caption"/> : 
													</font>
												</td>
												<td>
													<table>
														<tr>
															<td class="td_noteditable" style="width:600px;">
																<xsl:value-of select="page/script_result/response/content/root/chassisno"/>&#xA0;
															</td>
														</tr>
													</table>
												</td>
											</tr>
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="page/captions/nomerdvigatelya/@caption"/> : 
													</font>
												</td>
												<td>
													<table>
														<tr>
															<td class="td_noteditable" style="width:600px;">
																<xsl:value-of select="page/script_result/response/content/root/engineno"/>&#xA0;
															</td>
														</tr>
													</table>
												</td>
											</tr> -->
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="page/captions/obem/@caption"/> : 
													</font>
												</td>
												<td>
													<div class="td_noteditable" style="width:600px;">
																<xsl:value-of select="page/script_result/response/content/root/volume[. ne 'null']"/>&#xA0;
															</div>
												</td>
											</tr>
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="page/captions/moschnost/@caption"/> : 
													</font>
												</td>
												<td>
													<div class="td_noteditable" style="width:600px;">
																<xsl:value-of select="page/script_result/response/content/root/hp[. ne 'null']"/>&#xA0;
															</div>
												</td>
											</tr>
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="page/captions/gruzopodemnost/@caption"/>  : 
													</font>
												</td>
												<td>
													<div class="td_noteditable" style="width:600px;">
																<xsl:value-of select="page/script_result/response/content/root/load[. ne 'null']"/>&#xA0;
															</div>
												</td>
											</tr>
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="page/captions/kolvoposadochnyhmest/@caption"/> : 
													</font>
												</td>
												<td>
													<div class="td_noteditable" style="width:600px;">
																<xsl:value-of select="page/script_result/response/content/root/seats[. ne 'null']"/>&#xA0;
															</div>
												</td>
											</tr>
					 					</table>
					 				<br/>
								</div>
						</div>
								<div class="ui-tabs-panel" id="tabs-2">
										<div display="block"  id="property">
											<table width="100%" border="0" class="resulttable">
												<tr>
													<td class="fc">
														<font style="vertical-align:top">
															<xsl:value-of select="page/captions/familiya/@caption"/> : 
														</font>
													</td>
													<td>
														<div class="td_noteditable" style="width:600px;">
																	<xsl:value-of select="page/script_result/response/content/root/owner/lastname[. ne 'null']"/>&#xA0;
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
																	<xsl:value-of select="page/script_result/response/content/root/owner/firstname[. ne 'null']"/>&#xA0;
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
																	<xsl:value-of select="page/script_result/response/content/root/owner/middlename[. ne 'null']"/>&#xA0;
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
																	<xsl:value-of select="page/script_result/response/content/root/owner/birthdate[. ne 'null']"/>&#xA0;
																</div>
													</td>
												</tr>
												<tr>
													<td class="fc">
														<font style="vertical-align:top">
															<xsl:value-of select="page/captions/rnn/@caption"/> : 
														</font>
													</td>
													<td>
														<div class="td_noteditable" style="width:600px;">
																	<xsl:value-of select="page/script_result/response/content/root/owner/rnn[. ne 'null']"/>&#xA0;
																</div>
													</td>
												</tr>
												<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="page/captions/iin/@caption"/> : 
													</font>
												</td>
												<td>
													<div class="td_noteditable" style="width:600px;">
																<xsl:value-of select="page/script_result/response/content/root/owner/iin[. ne 'null']"/>&#xA0;
															</div>
												</td>
											</tr>
												<tr>
													<td class="fc">
														<font style="vertical-align:top">
															<xsl:value-of select="page/captions/oblast/@caption"/> : 
														</font>
													</td>
													<td>
														<div class="td_noteditable" style="width:600px;">
																	<xsl:value-of select="page/script_result/response/content/root/owner/region[. ne 'null']"/>&#xA0;
																</div>
													</td>
												</tr>
												<tr>
													<td class="fc">
														<font style="vertical-align:top">
															<xsl:value-of select="page/captions/rayon/@caption"/> : 
														</font>
													</td>
													<td>
														<div class="td_noteditable" style="width:600px;">
																	<xsl:value-of select="page/script_result/response/content/root/owner/district[. ne 'null']"/>&#xA0;
																</div>
													</td>
												</tr>
												<tr>
													<td class="fc">
														<font style="vertical-align:top">
															<xsl:value-of select="page/captions/naselennyipunkt/@caption"/> : 
														</font>
													</td>
													<td>
														<div class="td_noteditable" style="width:600px;">
																	<xsl:value-of select="page/script_result/response/content/root/owner/city[. ne 'null']"/>&#xA0;
																</div>
													</td>
												</tr>
												<tr>
													<td class="fc">
														<font style="vertical-align:top">
															<xsl:value-of select="page/captions/ulica/@caption"/> : 
														</font>
													</td>
													<td>
														<div class="td_noteditable" style="width:600px;">
																	<xsl:value-of select="page/script_result/response/content/root/owner/street[. ne 'null']"/>&#xA0;
																</div>
													</td>
												</tr>
												<tr>
													<td class="fc">
														<font style="vertical-align:top">
															<xsl:value-of select="page/captions/dom/@caption"/>  : 
														</font>
													</td>
													<td>
														<div class="td_noteditable" style="width:600px;">
																	<xsl:value-of select="page/script_result/response/content/root/owner/house[. ne 'null']"/>&#xA0;
																</div>
													</td>
												</tr>
												<tr>
													<td class="fc">
														<font style="vertical-align:top">
															<xsl:value-of select="page/captions/kvartira/@caption"/> : 
														</font>
													</td>
													<td>
														<div class="td_noteditable" style="width:600px;">
																	<xsl:value-of select="page/script_result/response/content/root/owner/flat[. ne 'null']"/>&#xA0;
																</div>
													</td>
												</tr>
						 					</table>
						 				<br/>
									</div>
							</div>
							<xsl:if test="/request/@id='transport-organization'">
								<div class="ui-tabs-panel" id="tabs-2">
										<div display="block"  id="property">
											<table width="100%" border="0" class="longresulttable">
												<tr>
													<td class="fc">
														<font style="vertical-align:top">
															<xsl:value-of select="page/captions/naimenovanie/@caption"/>  : 
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
															<xsl:value-of select="page/captions/fiorukovoditelya/@caption"/> : 
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
															<xsl:value-of select="page/captions/okpo/@caption"/> : 
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
															<xsl:value-of select="page/captions/dataregistracii/@caption"/> : 
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
															<xsl:value-of select="page/captions/rnn/@caption"/> : 
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
															<xsl:value-of select="page/captions/oblast/@caption"/> : 
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
															<xsl:value-of select="page/captions/rayon/@caption"/> : 
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
															<xsl:value-of select="page/captions/naselennyipunkt/@caption"/> : 
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
															<xsl:value-of select="page/captions/ulica/@caption"/> : 
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
															<xsl:value-of select="page/captions/dom/@caption"/>  : 
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
						</xsl:if>
							<div class="ui-tabs-panel" id="tabs-3">
									<div display="block"  id="property">
					 				<br/>
					 				<table width="100%" border="0" style="border-collapse:collapse; text-align:center" class="longresulttable">
										<tr>
											<td style="border:1px solid black">
												<xsl:value-of select="page/captions/tipto/@caption"/>
											</td>
											<td style="border:1px solid black">
												<xsl:value-of select="page/captions/dataprohozhdeniya/@caption"/>
											</td>
											<td style="border:1px solid black">
												<xsl:value-of select="page/captions/punkt/@caption"/>
											</td>
											<td style="border:1px solid black">
												<xsl:value-of select="page/captions/fioinspektora/@caption"/>
											</td>
											<td style="border:1px solid black">
												<xsl:value-of select="page/captions/talon/@caption"/>
											</td>
											<td style="border:1px solid black">
												<xsl:value-of select="page/captions/svidetelstvo/@caption"/>
											</td>
											<td style="border:1px solid black">
												<xsl:value-of select="page/captions/nomeredk/@caption"/>
											</td>
										</tr>
										<xsl:for-each select="page/script_result/response/content/root/sheckups/entry">
											<tr>
												<td style="border:1px solid black">
													<xsl:value-of select="type[. ne 'null']"/>
												</td>
												<td style="border:1px solid black">
													<xsl:value-of select="date[. ne 'null']"/>
												</td>
												<td style="border:1px solid black">
													<xsl:value-of select="place[. ne 'null']"/>
												</td>
												<td style="border:1px solid black">
													<xsl:value-of select="checker[. ne 'null']"/>
												</td>
												<td style="border:1px solid black">
													<xsl:value-of select="ticketno[. ne 'null']"/>
												</td>
												<td style="border:1px solid black">
													<xsl:value-of select="certno[. ne 'null']"/>
												</td>
												<td style="border:1px solid black">
													<xsl:value-of select="edkno[. ne 'null']"/>
												</td>
											</tr>
										</xsl:for-each>
									</table>
								</div>
						</div>
							<div class="ui-tabs-panel" id="tabs-4">
									<div display="block"  id="property">
					 				<br/>
					 				<table width="100%" border="0" style="border-collapse:collapse; text-align:center" class="longresulttable">
										<tr>
											<td style="border:1px solid black">
												<xsl:value-of select="page/captions/tiplgoty/@caption"/>
											</td>
											<td style="border:1px solid black">
												<xsl:value-of select="page/captions/seriyalgotnogoudostovereniya/@caption"/>
											</td>
											<td style="border:1px solid black">
												<xsl:value-of select="page/captions/nomerlgotnogoudostovereniya/@caption"/>
											</td>
											<td style="border:1px solid black">
												<xsl:value-of select="page/captions/datalgoty/@caption"/>
											</td>
											<td style="border:1px solid black">
												<xsl:value-of select="page/captions/dataokonchaniyadeistviya/@caption"/>
											</td>
										</tr>
										<xsl:for-each select="page/script_result/response/content/root/tax/entry">
											<tr>
												<td style="border:1px solid black">
													<xsl:value-of select="privtype[. ne 'null']"/>
												</td>
												<td style="border:1px solid black">
													<xsl:value-of select="docserial[. ne 'null']"/>
												</td>
												<td style="border:1px solid black">
													<xsl:value-of select="docnumber[. ne 'null']"/>
												</td>
												<td style="border:1px solid black">
													<xsl:value-of select="startdate[. ne 'null']"/>
												</td>
												<td style="border:1px solid black">
													<xsl:value-of select="enddate[. ne 'null']"/>
												</td>
											</tr>
										</xsl:for-each>
									</table>
								</div>
						</div>
							<div class="ui-tabs-panel" id="tabs-5">
									<div display="block"  id="property">
					 				<br/>
					 				<table width="100%" border="0" style="border-collapse:collapse; text-align:center" class="longresulttable">
										<tr>
											<td style="border:1px solid black">
												<xsl:value-of select="page/captions/tip/@caption"/>
											</td>
											<td style="border:1px solid black">
												<xsl:value-of select="page/captions/seriyanomer/@caption"/>
											</td>
											<td style="border:1px solid black">
												<xsl:value-of select="page/captions/dataregistracii/@caption"/>
											</td>
											<td style="border:1px solid black">
												<xsl:value-of select="page/captions/dataokonchaniya/@caption"/>
											</td>
											<td style="border:1px solid black">
												<xsl:value-of select="page/captions/fiodoverennogolica/@caption"/>
											</td>
											<td style="border:1px solid black">
												<xsl:value-of select="page/captions/adresdoverennogolica/@caption"/>
											</td>
										</tr>
										<xsl:for-each select="page/script_result/response/content/root/trust/entry">
											<tr>
												<td style="border:1px solid black">
													<xsl:value-of select="type[. ne 'null']"/>
												</td>
												<td style="border:1px solid black">
													<xsl:value-of select="number[. ne 'null']"/>
												</td>
												<td style="border:1px solid black">
													<xsl:value-of select="startdate[. ne 'null']"/>
												</td>
												<td style="border:1px solid black">
													<xsl:value-of select="enddate[. ne 'null']"/>
												</td>
												<td style="border:1px solid black">
													<xsl:value-of select="fio[. ne 'null']"/>
												</td>
												<td style="border:1px solid black">
													<xsl:value-of select="address[. ne 'null']"/>
												</td>
											</tr>
										</xsl:for-each>
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