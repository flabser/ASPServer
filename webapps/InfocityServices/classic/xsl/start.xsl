<?xml version="1.0" encoding="windows-1251"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="html" encoding="utf-8" doctype-public="-//W3C//DTD XHTML 1.0 Transitional//EN"
	 doctype-system="http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd" indent="yes"/>
	<xsl:template match="/request/history"></xsl:template>
	<xsl:template match="/request/content">
		<html>
			<head>
				<title>Единая Информационная Система "Город"</title>
				<link rel="stylesheet" href="classic/css/start.css" />
				<link type="text/css" href="/SharedResources/jquery/css/base/jquery-ui-1.8.2.redmont.css" rel="stylesheet" />
				<script type="text/javascript" src="/SharedResources/jquery/js/jquery-1.4.2.js"></script>
				<script type="text/javascript" src="/SharedResources/jquery/js/cookie/jquery.cookie.js"></script>
				<script type="text/javascript" src="/SharedResources/jquery/js/ui/jquery.ui.widget.js"></script>
				<script type="text/javascript" src="/SharedResources/jquery/js/ui/jquery.ui.button.js"></script>
				<script type="text/javascript" src="/SharedResources/jquery/js/ui/jquery.ui.core.js"></script>
				<script type="text/javascript" src="/SharedResources/jquery/js/ui/jquery.effects.core.js"></script>
				<script type="text/javascript" src="/SharedResources/jquery/js/ui/jquery.ui.mouse.js"></script>
				<script type="text/javascript" src="/SharedResources/jquery/js/ui/jquery.ui.draggable.js"></script>
				<script type="text/javascript" src="/SharedResources/jquery/js/ui/jquery.ui.position.js"></script>
				<script type="text/javascript" src="/SharedResources/jquery/js/ui/jquery.ui.dialog.js"></script>
				<script type="text/javascript" src="/SharedResources/jquery/js/cookie/jquery.cookie.js"></script>
				<script type="text/javascript" src="classic/scripts/start.js"></script>
				<script type="text/javascript" src="classic/scripts/form.js"></script>
				<script type="text/javascript">    
					$(document).ready(function(){
						$("#login, #pwd").removeAttr("disabled");
						$.cookie("state", "newsession",{ path:"/", expires:30});
						$.cookie("lastreqview", "none",{ path:"/", expires:30});
						$.cookie("loadresult", null,{path:'/'});	
						$(function(){$("button").button();});
						$(function(){$("#step2").button({disabled:true});});
						$("#login, #pwd").keyup(function(eventObject){
							if (eventObject.keyCode==13){ 
								ourSubmit("default");
							}
						})
						$("#answer").keyup(function(eventObject){
							if (eventObject.keyCode==13){ 
								submitAnswerForm();
							}
						})
					})
    			</script>
			</head>
			<body>
					<div id="wrapper">
						<div style="width:1024px;  margin: 250px auto">
							<div style="width:500px; float:left; border-right: #6790b3 2px solid; text-align:right; height:350px; padding:10px">
								<div style="margin:70px auto; height:50px">
									<font style="font-size: 22px;"><xsl:value-of select="captions/eis/@caption"/></font><br/><br/>
									<img  style="width:500px" src="classic/img/LogoCIS.png"/>
								</div>
							</div>
							<div style="width:500px; text-align:left; display:inline-block; float:left">
								<form method="post" id="frm" name="form">
									<div style="margin-top:20px; text-align:center; width:100%"><font style="font-size:20px">Авторизация</font></div>
									<table style="width:100%; margin-top:55px">
										<tr>
											<td style="width:140px; text-align:right">
												<font class="sh" style="font-size:10.2pt">
													<xsl:value-of select="captions/user/@caption"/> :
												</font>
												</td>
												<td>
													<input type="text" name="login" id="login" value="" style="width:200px; height: 16px; padding: 3px 3px 3px 5px;"/>
												</td>
											</tr>
											<tr>
												<td style="width:140px; text-align:right">
													<font class="sh" style="font-size:10.2pt">
														<xsl:value-of select="captions/password/@caption"/> :
													</font>
												</td>
												<td>
													<input type="password" name="pwd"  value="" id="pwd" style="width:200px; margin-top:7px; height: 16px; padding: 3px 3px 3px 5px;"/>
													<input type="hidden" name="nohash" value="1"/>
												</td>
											</tr>
											<tr>
												<td style="width:200px;">
												</td>
												<td style="padding-top:8px">
													<button type="button" id="step1">
														<xsl:attribute name="onclick">javascript:ourSubmit("default")</xsl:attribute>												
														<font class="button" style="margin-right:5; font-family:verdana; vertical-align:3px; font-size:10pt">
															<xsl:value-of select="captions/login/@caption"/>
														</font>	
													</button>
													<span id="ok_auth" style="display:none;  margin-left:5px">
														<img src="/SharedResources/img/iconset/tick_small.png"/>	
													</span>	
													<span id="cancel_auth" style="display:none; margin-left:5px">
														<img src="/SharedResources/img/iconset/cross.png" style="width:16px; height:16px"/>	
													</span>	
												</td>
											</tr>
										</table>
									</form>
									<!-- <form action="Login" method="post" id="ans" name="ans">
										<table style="width:100%; margin-top:35px">
											<tr>
												<td style="width:140px; text-align:right; vertical-align:top">
													<font class="sh" style="font-size:10.2pt">
														Контрольный вопрос :
													</font>
													<input type="hidden" name="qid" value="" id="qid"/>
												</td>
												<td>
													<div style="border:1px solid #AFAFAF; width:200px; min-height:16px; padding: 3px 3px 3px 5px; word-wrap:break-word">
														<font id="questiontitle"></font>
													</div>
												</td>
											</tr>
											<tr>
												<td style="width:140px; text-align:right">
													<font class="sh" style="font-size:10.2pt">
														Ответ :
													</font>
												</td>
												<td>
													<input type="text" name="answer" disabled="true" value=" " id="answer" style="width:200px; margin-top:7px; height: 16px; padding: 3px 3px 3px 5px;" autocomplete="off">
														<xsl:attribute name="onkeydown">javascript:if(13==event.keyCode){return false}</xsl:attribute>
													</input>
												</td>
											</tr>
											<tr>
												<td style="width:200px;">
												 	<div id="atemptcount" style="text-align:right; padding-right:5px"></div>
												</td>
												<td style="padding-top:8px">
													<button type="button" id="step2">
														<xsl:attribute name="onclick">javascript:submitAnswerForm()</xsl:attribute>												
														<font class="button" style="margin-right:5; font-family:verdana; vertical-align:3px; font-size:10pt">Шаг 2</font>	
													</button>
													<span id="ok_auth_control" style="display:none; margin-left:5px">
														<img src="/SharedResources/img/iconset/tick_small.png"></img>	
													</span>
													<span id="cancel_auth_control" style="display:none;  margin-left:5px">
														<img src="/SharedResources/img/iconset/cross.png" style="width:16px; height:16px"></img>	
													</span>	
												</td>
											</tr>
										</table>
									</form> -->
							</div>
						</div>
					</div>
					<form action="Login" method="post" id="hk" name="hk"></form>
					<input type="hidden" name="type" value="login" />
					<div id="footer">
						<span style=" float:left; margin-left:5px">
							<font style="vertical-align:5px">Единая Информационная Система "Город"  </font>
							<font style="vertical-align:5px">&#xA0;&#169;&#xA0;2012&#xA0;</font>							
							<a title="Справка" style="margin-left:1em; ">
								<xsl:attribute name="href">Provider?type=static&amp;id=help_summary</xsl:attribute>
						   		<img src="/SharedResources/img/classic/help.png" style="border:none;"></img>										
				        	</a>&#xA0;&#xA0;
						</span>		
						<span style=" float:right; margin-right:5px">
							<font><xsl:value-of select="captions/lang/@caption"/>&#xA0;:</font>	
						<select name="lang" id="lang" style="font-size: 8pt;"  >
						<xsl:variable name='chinese' select="captions/chinese/@caption"/>
							<xsl:variable name='currentlang' select="../@lang"/>
							<xsl:attribute name="onchange">javascript:changeSystemSettings(this)</xsl:attribute>
							<xsl:for-each select="glossaries/langs/entry">
								<option>
									<xsl:attribute name="value"><xsl:value-of select="id"/></xsl:attribute>
									<xsl:if test="$currentlang = id">
										<xsl:attribute name="selected">selected</xsl:attribute>
									</xsl:if>
									<xsl:if test="id = 'CHN'">
										<xsl:value-of select="$chinese"/>
									</xsl:if>
									<xsl:if test="id != 'CHN'">
										<xsl:value-of select="name"/>
									</xsl:if>
								</option>
							</xsl:for-each>
						</select>&#xA0;
						<font> <xsl:value-of select="captions/skin/@caption"/>&#xA0;:</font>
						<select name="skin" id="skin" style="font-size: 8pt;">
							<xsl:variable name='currentskin' select="../@skin"/>
							<xsl:attribute name="onchange">javascript:changeSystemSettings(this)</xsl:attribute>
							<xsl:for-each select="glossaries/skins/entry">
								<option>
									<xsl:attribute name="value"><xsl:value-of select="id"/></xsl:attribute>
									<xsl:if test="$currentskin = id">
										<xsl:attribute name="selected">selected</xsl:attribute>
									</xsl:if>
									
									<xsl:value-of select="name"/>
								</option>
							</xsl:for-each>
						</select>
					</span>									
							</div>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>
