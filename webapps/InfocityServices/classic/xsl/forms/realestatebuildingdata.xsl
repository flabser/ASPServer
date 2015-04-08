<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:import href="../templates/form.xsl"/>
	<xsl:import href="../templates/sharedactions.xsl"/>
	<xsl:variable name="doctype"><xsl:value-of select="request/page/captions/doctypemultilang/@caption"/></xsl:variable>
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
					<xsl:value-of select="concat(document/captions/eis/@caption,' - ',page/captions/informaciyaostroenii/@caption)"/>
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
										<a href="#tabs-1"><xsl:value-of select="page/captions/registrdannye/@caption"/></a>
									</li>
									<li class="ui-state-default ui-corner-top">
										<a href="#tabs-2"><xsl:value-of select="page/captions/kvartirapostroika/@caption"/></a>
									</li>
									<li class="ui-state-default ui-corner-top">
										<a href="#tabs-3"><xsl:value-of select="page/captions/vladelecsovladelec/@caption"/></a>
									</li>
									<li class="ui-state-default ui-corner-top">
										<a href="#tabs-4"><xsl:value-of select="page/captions/documentosnovaniye/@caption"/></a>
									</li>
								</ul>
								<div class="ui-tabs-panel" id="tabs-1">
									<div display="block"  id="property">
										<table width="100%" border="0">
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="page/captions/priznakstroeniya/@caption"/> : 
													</font>
												</td>
												<td>
													<div class="td_noteditable" style="width:600px;">
														<xsl:value-of select="page/script_result/response/content/root/bkind"/>&#xA0;
													</div>
												</td>
											</tr>
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="page/captions/nomerkvartala/@caption"/> : 
													</font>
												</td>
												<td>
													<div class="td_noteditable" style="width:600px;">
														<xsl:value-of select="page/script_result/response/content/root/landnumber"/>&#xA0;
													</div>
												</td>
											</tr>
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="page/captions/uchetnyikvartal/@caption"/> : 
													</font>
												</td>
												<td>
													<div class="td_noteditable" style="width:600px;">
														<xsl:value-of select="page/script_result/response/content/root/block"/>&#xA0;
													</div>
												</td>
											</tr>
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="page/captions/kadastrovyinomer/@caption"/> : 
													</font>
												</td>
												<td>
													<div class="td_noteditable" style="width:600px;">
														<xsl:value-of select="page/script_result/response/content/root/cadnumber"/>&#xA0;
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
														<xsl:value-of select="page/script_result/response/content/region/bkind"/>&#xA0;
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
														<xsl:value-of select="page/script_result/response/content/root/street"/>&#xA0;
													</div>
												</td>
											</tr>
											<!-- <tr>
													<td class="fc">
														<font style="vertical-align:top">
															<xsl:value-of select="page/captions/uglovayaulica/@caption"/> : 
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
											</tr> -->
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="page/captions/nomerdoma/@caption"/> : 
													</font>
												</td>
												<td>
													<div class="td_noteditable" style="width:600px;">
														<xsl:value-of select="page/script_result/response/content/root/house"/>&#xA0;
													</div>
												</td>
											</tr>
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="page/captions/godpostroiki/@caption"/> : 
													</font>
												</td>
												<td>
													<div class="td_noteditable" style="width:600px;">
														<xsl:value-of select="page/script_result/response/content/root/byear"/>&#xA0;
													</div>
												</td>
											</tr>
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="page/captions/etazhnost/@caption"/> : 
													</font>
												</td>
												<td>
													<div class="td_noteditable" style="width:600px;">
														<xsl:value-of select="page/script_result/response/content/root/floor"/>&#xA0;
													</div>
												</td>
											</tr>
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="page/captions/materialsten/@caption"/> : 
													</font>
												</td>
												<td>
													<div class="td_noteditable" style="width:600px;">
														<xsl:value-of select="page/script_result/response/content/root/walls"/>&#xA0;
													</div>
												</td>
											</tr>
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="page/captions/kolichestvokvartir/@caption"/> : 
													</font>
												</td>
												<td>
													<div class="td_noteditable" style="width:600px;">
														<xsl:value-of select="page/script_result/response/content/root/flats"/>&#xA0;
													</div>
												</td>
											</tr>
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="page/captions/ploschadobschaya/@caption"/> : 
													</font>
												</td>
												<td>
													<div class="td_noteditable" style="width:600px;">
														<xsl:value-of select="page/script_result/response/content/root/overallsquare"/>&#xA0;
													</div>
												</td>
											</tr>
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="page/captions/ploschadzhilaya/@caption"/> : 
													</font>
												</td>
												<td>
													<div class="td_noteditable" style="width:600px;">
														<xsl:value-of select="page/script_result/response/content/root/livengsquare"/>&#xA0;
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
													<xsl:value-of select="page/captions/priznakstroeniya/@caption"/> : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="page/script_result/response/content/root/apartments/partkind"/>&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="page/captions/naimenovaniestroeniya/@caption"/>  : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="page/script_result/response/content/root/apartments/partname"/>&#xA0;
												</div>
											</td>
										</tr>
										<!-- <tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="page/captions/literstroeniya/@caption"/> : 
													</font>
												</td>
												<td>
													<table>
														<tr>
															<td class="td_noteditable" style="width:600px;">
																<xsl:value-of select="page/script_result/response/content/root/partkind"/>&#xA0;
															</td>
														</tr>
													</table>
												</td>
											</tr> 
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="page/captions/nomerkvartiry/@caption"/> : 
													</font>
												</td>
												<td>
													<table>
														<tr>
															<td class="td_noteditable" style="width:600px;">
																<xsl:value-of select="page/script_result/response/content/root/partkind"/>&#xA0;
															</td>
														</tr>
													</table>
												</td>
											</tr>
											<tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="page/captions/etazh/@caption"/> : 
													</font>
												</td>
												<td>
													<table>
														<tr>
															<td class="td_noteditable" style="width:600px;">
																<xsl:value-of select="page/script_result/response/content/root/partkind"/>&#xA0;
															</td>
														</tr>
													</table>
												</td>
											</tr>-->
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="page/captions/telephon/@caption"/> : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="page/script_result/response/content/root/apartments/phone"/>&#xA0;
												</div>
											</td>
										</tr>
										<!-- <tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="page/captions/godpostroiki/@caption"/> : 
													</font>
												</td>
												<td>
													<table>
														<tr>
															<td class="td_noteditable" style="width:600px;">
																<xsl:value-of select="page/script_result/response/content/root/partkind"/>&#xA0;
															</td>
														</tr>
													</table>
												</td>
											</tr> -->
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="page/captions/materialsten/@caption"/> : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="page/script_result/response/content/root/apartments/partwalls"/>&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="page/captions/kolichestvokomnat/@caption"/> : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="page/script_result/response/content/root/apartments/rooms"/>&#xA0;
												</div>
											</td>
										</tr>
										<!-- <tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="page/captions/kolichestvopomeschenii/@caption"/> : 
													</font>
												</td>
												<td>
													<table>
														<tr>
															<td class="td_noteditable" style="width:600px;">
																<xsl:value-of select="page/script_result/response/content/root/partkind"/>&#xA0;
															</td>
														</tr>
													</table>
												</td>
											</tr> -->
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="page/captions/ploschadobschaya/@caption"/> : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="page/script_result/response/content/root/apartments/poverallsquare"/>&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="page/captions/ploschadzhilaya/@caption"/> : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="page/script_result/response/content/root/apartments/plivesquare"/>&#xA0;
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
													<xsl:value-of select="page/captions/familiya/@caption"/> : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="page/script_result/response/content/root/owner/lastname"/>&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="page/captions/imya/@caption"/>  : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="page/script_result/response/content/root/owner/firstname"/>&#xA0;
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
													<xsl:value-of select="page/script_result/response/content/root/owner/middlename"/>&#xA0;
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
													<xsl:value-of select="page/script_result/response/content/root/owner/birthdate"/>&#xA0;
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
													<xsl:value-of select="page/script_result/response/content/root/owner/iin"/>&#xA0;
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
													<xsl:value-of select="page/script_result/response/content/root/owner/rnn"/>&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="page/captions/adres/@caption"/> : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="page/script_result/response/content/root/owner/address"/>&#xA0;
												</div>
											</td>
										</tr>
										<!-- <tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="page/captions/grazhdanstvo/@caption"/> : 
													</font>
												</td>
												<td>
													<table>
														<tr>
															<td class="td_noteditable" style="width:600px;">
																<xsl:value-of select="page/script_result/response/content/root/partkind"/>&#xA0;
															</td>
														</tr>
													</table>
												</td>
											</tr> -->
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="page/captions/tipdocumenta/@caption"/> : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="page/script_result/response/content/root/owner/typeid"/>&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="page/captions/nomerdocumenta/@caption"/> : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="page/script_result/response/content/root/owner/numberid"/>&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="page/captions/vydan/@caption"/> : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="page/script_result/response/content/root/owner/authorityid"/>&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="page/captions/telephon/@caption"/>: 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="page/script_result/response/content/root/owner/phonenumber"/>&#xA0;
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
													<xsl:value-of select="page/captions/priznak/@caption"/> : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="page/script_result/response/content/root/document/dockind"/>&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="page/captions/tip/@caption"/>  : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="page/script_result/response/content/root/document/doctype"/>&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="page/captions/nomer/@caption"/> : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="page/script_result/response/content/document/docnumber"/>&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="page/captions/datavozniknoveniya/@caption"/> : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="page/script_result/response/content/document/docdate"/>&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="page/captions/datavoregistracii/@caption"/> : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="page/script_result/response/content/root/document/docregdate"/>&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="page/captions/naznacheniestroeniya/@caption"/> : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="page/script_result/response/content/root/document/propkind"/>&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="page/captions/formasobstvennosti/@caption"/> : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="page/script_result/response/content/root/document/propform"/>&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="page/captions/vidsobstvennosti/@caption"/> : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="page/script_result/response/content/root/document/purpose"/>&#xA0;
												</div>
											</td>
										</tr>
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="page/captions/organnalozhivshiiarest/@caption"/> : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="page/script_result/response/content/root/document/limitauthority"/>&#xA0;
												</div>
											</td>
										</tr>
										<!-- <tr>
												<td class="fc">
													<font style="vertical-align:top">
														<xsl:value-of select="page/captions/objektnalozheniyaobremeneniya/@caption"/> : 
													</font>
												</td>
												<td>
													<table>
														<tr>
															<td class="td_noteditable" style="width:600px;">
																<xsl:value-of select="page/script_result/response/content/root/partkind"/>&#xA0;
															</td>
														</tr>
													</table>
												</td>
											</tr> -->
										<tr>
											<td class="fc">
												<font style="vertical-align:top">
													<xsl:value-of select="page/captions/usloviyazaloga/@caption"/> : 
												</font>
											</td>
											<td>
												<div class="td_noteditable" style="width:600px;">
													<xsl:value-of select="page/script_result/response/content/root/document/limitcondition"/>&#xA0;
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