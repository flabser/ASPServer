<?xml version="1.0" encoding="windows-1251"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">	
<xsl:output method="html" encoding="windows-1251"/>
<xsl:template match="/request">
	<html>
		<head>
			<title>Nextbase - ������</title>						
			<link rel="stylesheet" href="classic/css/main.css"/>	
			<link rel="stylesheet" href="classic/css/actionbar.css"/>			
			<script>
				<![CDATA[
					function CancelForm(){
			   	  		window.history.back();
					}
					function goToLogin(){
					 	window.location = "Provider?type=static&id=start&autologin=0";					
					}
					function reloadPage(){
					 	window.location.reload()					
					}
					
					function loadXmlPage(){
			   	  		window.location.href = window.location + "&onlyxml=1"
					}
				]]>
			</script>
		</head>
		<body style="Go back...ground-image:url(/SharedResources/img/classic/f.gif); font-family:arial;">
			<table width="100%" border="0" style="margin-top:140px">
				<tr>
					<td width="20%" align="right" style="font-size:9pt;">
						<font style="font-size:1.9em;">NextBase</font>
						<div style="clear:both; height:10px"/>
						<font style="font-size:1.1em;">
							version <xsl:value-of select="error/message/version"/> &#169; Lab of the Future 2012
						</font>
						<br/>
					</td>
					<td width="1%"></td>
					<td style="height:500px" bgcolor="#CD0000" width="1"></td>
					<td>
						<table style="width:100%;  margin-left:4%">
							<tr>
								<td>
									<xsl:choose>
										<xsl:when test="error/@type = 'INTERNAL'">
											<xsl:choose>
												<xsl:when test="contains (request/error/message/errortext, 'Old password has not match')">
													<font style="font-size:2em;">����������� ��������� ���� "������ ������" </font>
												</xsl:when>
												<xsl:otherwise>
													<font style="font-size:2em;">Internal server error</font>
													<font style="font-size:1em;  "><xsl:value-of select="request/error/message/errortext"/></font>
												</xsl:otherwise>
											</xsl:choose>
										</xsl:when>
										<xsl:when test="error/@type = 'RULENOTFOUND'">
											<font style="font-size:2em;">������� �� �������</font>
										</xsl:when>
										<xsl:when test="error/@type = 'PROVIDERERROR'">
											<font style="font-size:2em;">������ �� ���������</font>
										</xsl:when>
										<xsl:when test="error/@type = 'XSLTNOTFOUND'">
											<font style="font-size:2em;">�������� XSLT �� �������</font>
										</xsl:when>
										<xsl:when test="error/@type = 'DATAENGINERROR'">
											<font style="font-size:2em;">������ ���� ������</font>
										</xsl:when>
										<xsl:when test="error/@type = 'XSLT_TRANSFORMATOR_ERROR'">
											<font style="font-size:2em;">������ XSLT ������� </font>
										</xsl:when>
										<xsl:when test="error/@type = 'DOCUMENTEXCEPTION'">
											<font style="font-size:2em;">������ ���������</font>
										</xsl:when>
										<xsl:when test="error/@type = 'resourcenotfound'">
											<font style="font-size:2em;">�������� �� ������.</font>
										</xsl:when>
										<xsl:when test="error/@type = 'CLASS_NOT_FOUND_EXCEPTION'">
											<font style="font-size:2em;">����� �� ������</font>
										</xsl:when>
										<xsl:otherwise>
											<font style="font-size:2em;">������</font>
										</xsl:otherwise>
									</xsl:choose>
								</td>
							</tr>
							<tr>
								<td>
									<br/>
										<xsl:choose>
											<xsl:when test="error/@type = 'INTERNAL'">
												<ul style="font-size:0.9em; margin-top:15px">
													<li type="square" style="margin-top:5px"><a href="javascript:CancelForm()">Go back...</a></li>
													<xsl:if test="contains (request/error/message/errortext, 'Old password has not match')">
														<li type="square" style="margin-top:5px; ">���������, ��� ������ �������� �� ��� �� �����, ��� � ��� �����������</li>
														<li type="square" style="margin-top:5px">����������, �� ����� �� [Caps Lock]</li>
													</xsl:if>
												</ul>
											</xsl:when>
											<xsl:when test="error/@type = 'PROVIDERERROR'">
												<ul style="font-size:0.9em; margin-top:15px">
													<li type="square" style="margin-top:5px"><a href="javascript:reloadPage()">Reload</a></li>
													<li type="square" style="margin-top:5px"><a href="javascript:CancelForm()">Go back...</a></li>
												</ul>
											</xsl:when>
											<xsl:when test="error/@type = 'LOGINERROR'">
												<ul style="font-size:0.9em; margin-top:15px">
													<li type="square" style="margin-top:5px"><a href="javascript:reloadPage()">Reload</a></li>
													<li type="square" style="margin-top:5px"><a href="javascript:CancelForm()">Go back...</a></li>
												</ul>
											</xsl:when>
											<xsl:when test="error/@type = 'RULENOTFOUND'">
												<ul style="font-size:0.9em; margin-top:15px">
													<li type="square" style="margin-top:5px"><a href="javascript:reloadPage()">Reload</a></li>
													<li type="square" style="margin-top:5px"><a href="javascript:CancelForm()">Go back...</a></li>
												</ul>
											</xsl:when>
											<xsl:when test="error/@type = 'XSLTNOTFOUND'">
												<ul style="font-size:0.9em; margin-top:15px">
													<li type="square" style="margin-top:5px"><a href="javascript:reloadPage()">Reload</a></li>
													<li type="square" style="margin-top:5px"><a href="javascript:CancelForm()">Go back...</a></li>
													<li type="square" style="margin-top:5px"><a href="javascript:loadXmlPage()">���������� �������� xml �������� </a></li>
												</ul>
											</xsl:when>
											<xsl:when test="error/@type = 'CLASS_NOT_FOUND_EXCEPTION'">
												<ul style="font-size:0.9em; margin-top:15px">
													<li type="square" style="margin-top:5px"><a href="javascript:reloadPage()">Reload</a></li>
													<li type="square" style="margin-top:5px"><a href="javascript:CancelForm()">Go back...</a></li>
												</ul>
											</xsl:when>
											<xsl:when test="error/@type = 'XSLT_TRANSFORMATOR_ERROR'">
												<ul style="font-size:0.9em; margin-top:15px">
													<li type="square" style="margin-top:5px"><a href="javascript:reloadPage()">Reload</a></li>
													<li type="square" style="margin-top:5px"><a href="javascript:CancelForm()">Go back...</a></li>
													<li type="square" style="margin-top:5px"><a href="javascript:loadXmlPage()">���������� �������� xml �������� </a></li>
												</ul>
											</xsl:when>
											<xsl:when test="error/@type = 'DATAENGINERROR'">
												<ul style="font-size:0.9em; margin-top:15px">
													<li type="square" style="margin-top:5px"><a href="javascript:reloadPage()">Reload</a></li>
													<li type="square" style="margin-top:5px"><a href="javascript:CancelForm()">Go back...</a></li>
												</ul>
											</xsl:when>
											<xsl:when test="error/@type = 'DOCUMENTEXCEPTION'">
												<ul style="font-size:0.9em; margin-top:15px">
													<li type="square" style="margin-top:5px"><a href="javascript:reloadPage()">Reload</a></li>
													<li type="square" style="margin-top:5px"><a href="javascript:CancelForm()">Go back...</a></li>
													
												</ul>
											</xsl:when>
											<xsl:when test="error/@type = 'resourcenotfound'">
												<ul style="font-size:0.9em; margin-top:15px">
													<li type="square" style="margin-top:5px">�������� ������ �������� ��� ������</li>
													<li type="square" style="margin-top:5px"><a href="javascript:reloadPage()">Reload</a></li>
													<li type="square" style="margin-top:5px"><a href="javascript:CancelForm()">Go back...</a></li>
													<li type="square" style="margin-top:5px"><a href="javascript:loadXmlPage()">���������� �������� XML �������� </a></li>
												</ul>
											</xsl:when>
											<xsl:otherwise>
												<ul style="font-size:0.9em; margin-top:15px">
													<li type="square" style="margin-top:5px"><a href="javascript:reloadPage()">Reload</a></li>
													<li type="square" style="margin-top:5px"><a href="javascript:CancelForm()">��������� �� ���������� ��������</a></li>
												</ul>
											</xsl:otherwise>
										</xsl:choose>
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<div style="z-index:999; margin-top:-2%; margin-left:22.5%; font-family:arial; font-size:0.71em">&#xA0;<a href="http://www.flabs.kz" target="_blank">Lab of the Future</a>&#xA0; &#8226; &#xA0;<a href="http://www.smartdoc.kz" target="_blank">Feedback</a></div>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>