<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

	<xsl:template name="doctitleBoss">
		<font><xsl:value-of select="$doctype"/> - <xsl:value-of select="document/fields/fullname"/></font>	
	</xsl:template>
	
	<xsl:template name="doctitleGlossary">
		<font>
			<xsl:value-of select="$doctype"/> - <xsl:value-of select="document/fields/name"/>
		</font>	
	</xsl:template>
	
	<xsl:template name="keypressactions">
		<script>
			$(document).bind('keydown', 'Ctrl+s',function (event){
				<xsl:if test="document/@editmode = 'edit'">
					if (event.ctrlKey) {
    					if (event.keyCode ==83 ){
    						javascript:SaveFormJquery('frm','frm','<xsl:value-of select="substring-after(history/entry[@type eq 'outline'][last()],'/Workflow/')"/>');
    					}
    				}
    			</xsl:if>
    			if (event.ctrlKey &amp;&amp; event.shiftKey) {
    				if (event.keyCode ==49 ){
    					javascript:openXMLdoc();
    				}
				}
			});
		</script>
	</xsl:template>
	
	<xsl:template name="htmlareaeditor">
		<script type="text/javascript">  
			$(function() {
        		//$("textarea").htmlarea(); 
	        	$("#txtDefaultHtmlArea").htmlarea({
	        	toolbar: [
			        ["html"], ["bold", "italic", "underline","strikethrough"],["subscript","superscript"],["indent","outdent"],["decreasefontsize","increasefontsize"],["orderedlist","unorderedlist"],["justifyleft","justifycenter","justifyright"],
			        ["p","h1", "h2", "h3", "h4", "h5", "h6"],["horizontalrule"]
			    ]}); // Initialize jHtmlArea's with all default values
           		$("#btnRemoveCustomHtmlArea").click(function() {
            		$("#txtCustomHtmlArea").htmlarea("dispose");
           		});
        	});
		</script>
	</xsl:template>

	<!-- Набор javascript библиотек -->
	<xsl:template name="cssandjs">
		<link type="text/css" rel="stylesheet" href="classic/css/main.css"/>
		<link type="text/css" rel="stylesheet" href="classic/css/form.css"/>
		<link type="text/css" rel="stylesheet" href="classic/css/actionbar.css"/>
		<link type="text/css" rel="stylesheet" href="classic/css/dialogs.css"/>
		<link rel="Stylesheet" type="text/css" href="/SharedResources/jquery/js/jhtmlarea/style/jHtmlArea.css"/>
		<link type="text/css" rel="stylesheet" href="/SharedResources/jquery/css/smoothness/jquery-ui-1.8.20.custom.css"/>
		<link type="text/css" rel="stylesheet" href="/SharedResources/jquery/js/hotnav/jquery.hotnav.css"/>
		<script type="text/javascript" src="/SharedResources/jquery/js/jquery-1.4.2.js"/>
		<script type="text/javascript" src="/SharedResources/jquery/js/ui/jquery.ui.core.js"/>
		<script type="text/javascript" src="/SharedResources/jquery/js/ui/jquery.effects.core.js"/>
		<script type="text/javascript" src="/SharedResources/jquery/js/ui/jquery.ui.widget.js"/>
		<script type="text/javascript" src="/SharedResources/jquery/js/ui/jquery.ui.datepicker.js"/>
		<script type="text/javascript" src="/SharedResources/jquery/js/ui/jquery.ui.datepicker-ru.js"/>
		<script type="text/javascript" src="/SharedResources/jquery/js/ui/jquery.ui.mouse.js"/>
		<script type="text/javascript" src="/SharedResources/jquery/js/ui/jquery.ui.slider.js"/>
		<script type="text/javascript" src="/SharedResources/jquery/js/ui/jquery.ui.progressbar.js"/>
		<script type="text/javascript" src="/SharedResources/jquery/js/ui/jquery.ui.autocomplete.js"/>
		<script type="text/javascript" src="/SharedResources/jquery/js/ui/jquery.ui.draggable.js"/>
		<script type="text/javascript" src="/SharedResources/jquery/js/ui/jquery.ui.position.js"/>
		<script type="text/javascript" src="/SharedResources/jquery/js/ui/jquery.ui.dialog.js"/>
		<script type="text/javascript" src="/SharedResources/jquery/js/ui/jquery.ui.tabs.js"/>
		<script type="text/javascript" src="/SharedResources/jquery/js/ui/jquery.ui.button.js"/>
		<script type="text/javascript" src="classic/scripts/form.js"/>
		<script type="text/javascript" src="classic/scripts/coord.js"/>
		<script type="text/javascript" src="classic/scripts/dialogs.js"/>
		<script type="text/javascript" src="classic/scripts/outline.js"/>
		<script type="text/javascript" src="/SharedResources/jquery/js/cookie/jquery.cookie.js"/>
		<script type="text/javascript" src="/SharedResources/jquery/js/jhtmlarea/scripts/jHtmlArea-0.7.0.js"/>
		<script type="text/javascript" src="/SharedResources/jquery/js/hotnav/jquery.hotkeys.js"/>
		<script type="text/javascript" src="/SharedResources/jquery/js/hotnav/jquery.hotnav.js"/>
		<script>
			cancelcaption='<xsl:value-of select="document/captions/cancel/@caption"/>'
			changeviewcaption='<xsl:value-of select="document/captions/changeview/@caption"/>'
			receiverslistcaption='<xsl:value-of select="document/captions/receiverslist/@caption"/>'
			commentcaption='<xsl:value-of select="document/captions/commentcaption/@caption"/>'
			correspforacquaintance='<xsl:value-of select="document/captions/correspforacquaintance/@caption"/>'
			searchcaption='<xsl:value-of select="document/captions/searchcaption/@caption"/>'
			contributorscoord='<xsl:value-of select="document/captions/contributorscoord/@caption"/>'
			type='<xsl:value-of select="document/captions/type/@caption"/>'
			parcoord='<xsl:value-of select="document/captions/parcoord/@caption"/>'
			sercoord='<xsl:value-of select="document/captions/sercoord/@caption"/>'
			waittime='<xsl:value-of select="document/captions/waittime/@caption"/>'
			coordparam='<xsl:value-of select="document/captions/coordparam/@caption"/>'
			hours='<xsl:value-of select="document/captions/hours/@caption"/>'
			yescaption='<xsl:value-of select="document/captions/yescaption/@caption"/>'
			nocaption='<xsl:value-of select="document/captions/nocaption/@caption"/>'
			warning='<xsl:value-of select="document/captions/warning/@caption"/>'
			lang='<xsl:value-of select="@lang"/>';
			redirectAfterSave = '<xsl:value-of select="history/entry[@type eq 'outline'][last()]"/>'
		</script>
		<script type="text/javascript">    
			$(function(){ 
				$("#tabs").tabs();
				$("button").button();
			});
    	</script>
	</xsl:template>

	<xsl:template name="documentheader">
		<div style="position:absolute; top:0px; left:0px; width:100%; background:url(/QC/classic/img/yellow_background.jpg); height:70px; border-bottom:1px solid #fcdd76; z-index:2">
			<span style="float:left">
				<img alt="" src ="classic/img/bigroup/logo_small.png" style="margin:5px"/>
				<font style="font-size:1.17em; vertical-align:27px; color:#555555">Автоматизированная веб-система технического надзора</font>
			</span>
			<span style="float:right; padding:5px 5px 5px 0px">
				<a target="_parent" id="currentuser" title="Посмотреть свойства текущего пользователя" href=" Provider?type=edit&amp;element=userprofile&amp;id=userprofile" style="text-decoration:none;color: #555555 ; font: 11px Tahoma; font-weight:bold">
					<font>
						<xsl:value-of select="@username"/>
					</font>
				</a>
				<a target="_parent"  id="logout" href="Logout" title="{document/captions/logout/@caption}" style="text-decoration:none;color: #555555 ; font: 11px Tahoma; font-weight:bold">
					<font style="margin-left:20px;"><xsl:value-of select="document/captions/logout/@caption"/></font> 
				</a>
				<a target="_parent"  id="helpbtn" href="Provider?type=static&amp;id=help_summary" title="Помощь" style="text-decoration:none;color: #555555 ; font: 11px Tahoma; font-weight:bold">
					<font style="margin-left:20px;">Помощь</font> 
				</a>
			</span>
		</div>
	</xsl:template>

	<xsl:template name="ECPsignFields">
		<!-- <input type="hidden" name="sign" id="sign" value="{sign}" style="width:100%;" />
		<input type="hidden" name="signedfields" id="signedfields" value="{signedfields}" style="width:100%;" />
		 <APPLET CODE="kz.gamma.TumarCSP" NAME="edsApplet"  type="application/x-java-applet" ARCHIVE="/edsApplet/lib/sign-applet.jar,/edsApplet/lib/commons-logging.jar,/edsApplet/lib/xmlsec-1.3.0.jar,/edsApplet/lib/crypto.gammaprov.jar,/edsApplet/lib/sign-applet.jar,/edsApplet/lib/crypto.tsp.jar" HEIGHT="100" WIDTH="100">
			<param name="ARCHIVE" value="/edsApplet/lib/sign-applet.jar,/edsApplet/lib/commons-logging.jar,/edsApplet/lib/xmlsec-1.3.0.jar,/edsApplet/lib/crypto.gammaprov.jar,/edsApplet/lib/sign-applet.jar,/edsApplet/lib/crypto.tsp.jar"/>
		</APPLET> 

		<xsl:if test="document/@canbesign='1111'">
			<script type="text/javascript" src="/edsApplet/js/jquery.blockUI.js" charset="utf-8"></script>
        	<script type="text/javascript" src="/edsApplet/js/crypto_object.js" charset="utf-8"></script>
        	<script type="text/javascript">
				edsApp.init();
			</script>
		</xsl:if> -->
	</xsl:template>

	<xsl:template name="markisread">
		<xsl:if test="document[@isread = 0][@status != 'new']">
			<script>
				markRead(<xsl:value-of select="document/@doctype"/>, <xsl:value-of select="document/@docid"/>);
			</script>
		</xsl:if>
	</xsl:template>
	<xsl:template name="attach">
		<div id="attach" style="display:block;">
			<table style="border:0; border-collapse:collapse" id="upltable" width="99%">
				<xsl:if test="document/@editmode = 'edit'">
					<tr>
						<td class="fc">
							<xsl:value-of select="document/captions/attachments/@caption"/> :
						</td>
						<td>
							<input type="file" size="60" border="#CCC" name="fname"/>
							&#xA0;
							<a id="upla">
								<xsl:attribute name="href">javascript:submitFile('upload', 'upltable', 'fname')</xsl:attribute>
								<font style="font-size:13px">
									<xsl:value-of select="document/captions/attach/@caption"/>
								</font>
							</a>
						</td>
						<td></td>
					</tr>
				</xsl:if>
				<xsl:variable name='docid' select="document/@docid"/>
				<xsl:variable name='doctype' select="document/@doctype"/>
				<xsl:variable name='formsesid' select="formsesid"/>
				<xsl:choose>
					<xsl:when test="document/fields/rtfcontent/@islist = 'true'">
						<xsl:for-each select="document/fields/rtfcontent/entry">
							<tr>
								<xsl:variable name='id' select='position()'/>
								<xsl:variable name='filename' select='.'/>
								<xsl:variable name="extension" select="tokenize(lower-case($filename), '\.')[last()]"/>
								<xsl:variable name="resolution">
									<script>
										return $(document).width();
									</script>
								</xsl:variable>
								<xsl:attribute name='id'>
									<xsl:value-of select='$id'/>
								</xsl:attribute>
								<td class="fc"></td>
								<td colspan="2">
									<div class="test" style="width:90%; overflow:hidden; display:inline-block">
									<xsl:choose>
										<xsl:when test="$extension = 'jpg' or $extension = 'jpeg' or $extension = 'gif'
										 or $extension = 'bmp' or $extension = 'png' or $extension = 'tif'">
											<img class="imgAtt" title="{$filename}">
												<xsl:attribute name="onload">checkImage(this)</xsl:attribute>
												<xsl:attribute name='src'>Provider?type=getattach&amp;formsesid=<xsl:value-of select="$formsesid"/>&amp;doctype=<xsl:value-of select="$doctype"/>&amp;key=<xsl:value-of select="$docid"/>&amp;field=rtfcontent&amp;file=<xsl:value-of select='$filename'/></xsl:attribute>
												<script>
													$(".imgAtt").attr("css","max-width:200px")
												</script>
											</img>
											<a href='' style="vertical-align:top; margin-left:8px">
												<xsl:attribute name='href'>javascript:deleterow(<xsl:value-of select="$formsesid"/>,'<xsl:value-of select='.' />','<xsl:value-of select="$id" />')</xsl:attribute>
												<img src="/SharedResources/img/iconset/cross.png" style="width:10px; height:10px"/>
											</a>
										</xsl:when>
										<xsl:otherwise>
											<img src="/SharedResources/img/iconset/file_extension_{$extension}.png" style="margin-right:5px">
												<xsl:attribute name="onerror">javascript:changeAttIcon(this)</xsl:attribute>
											</img>
											<a style="vertical-align:5px">
												<xsl:attribute name='href'>Provider?type=getattach&amp;formsesid=<xsl:value-of select="$formsesid"/>&amp;doctype=<xsl:value-of select="$doctype"/>&amp;key=<xsl:value-of select="$docid"/>&amp;field=rtfcontent&amp;file=<xsl:value-of select='$filename'/>	</xsl:attribute>
												<xsl:value-of select='replace($filename,"%2b","+")'/>
											</a>
											&#xA0;&#xA0;
											<xsl:if test="../../../../document/@editmode = 'edit'">
												<a href='' style="vertical-align:5px">
													<xsl:attribute name='href'>javascript:deleterow(<xsl:value-of select="$formsesid"/>,'<xsl:value-of select='.' />','<xsl:value-of select="$id"/>')</xsl:attribute>
													<img src="/SharedResources/img/classic/icons/cross.png" style="width:10px; height:10px"/>
												</a>
											</xsl:if>
										</xsl:otherwise>
									</xsl:choose>
									</div>
								</td>
							</tr>
						</xsl:for-each>
					</xsl:when>
					<xsl:when test="document/fields/rtfcontent !=''">
						<xsl:variable name="filename" select="document/fields/rtfcontent" />
						<tr>
							<xsl:variable name='id' select='position()' />
							<xsl:attribute name='id'><xsl:value-of select='$id' /></xsl:attribute>
							<xsl:variable name="extension" select="tokenize(lower-case($filename), '\.')[last()]"/>
							<td class="fc"></td>
							<td>
								<xsl:choose>
									<xsl:when test="$extension = 'jpg' or $extension = 'jpeg' or $extension = 'gif'
									 or $extension = 'bmp' or $extension = 'png' or $extension = 'tif'">
										<img style="max-width:900px; width:85%" title="{$filename}">
											<xsl:attribute name="onload">checkImage(this)</xsl:attribute>
											<xsl:attribute name='src'>Provider?type=getattach&amp;formsesid=<xsl:value-of select="$formsesid"/>&amp;doctype=<xsl:value-of select="$doctype"/>&amp;key=<xsl:value-of select="$docid"/>&amp;field=rtfcontent&amp;file=<xsl:value-of select='$filename'/></xsl:attribute>
										</img>
										<a href='' style="vertical-align:top; margin-left:8px;">
											<xsl:attribute name='href'>javascript:deleterow(<xsl:value-of select="$formsesid"/>,'<xsl:value-of select='$filename' />','<xsl:value-of select="$id" />')</xsl:attribute>
											<img src="/SharedResources/img/classic/icons/cross.png" style="width:10px; height:10px"/>
										</a>
									</xsl:when>
									<xsl:otherwise>
										<img src="" style="margin-right:5px">
											<xsl:attribute name="src">/SharedResources/img/iconset/file_extension_<xsl:value-of select="$extension"/>.png</xsl:attribute>
											<xsl:attribute name="onerror">javascript:changeAttIcon(this)</xsl:attribute>
										</img>
										<a href='' style="vertical-align:6px">
											<xsl:attribute name='href'>Provider?type=getattach&amp;formsesid=<xsl:value-of select="formsesid" />&amp;key=<xsl:value-of select="$docid" />&amp;doctype=<xsl:value-of select="$doctype" />&amp;field=rtfcontent&amp;file=<xsl:value-of select='$filename' /></xsl:attribute>
											<xsl:value-of select='document/fields/rtfcontent'/>
										</a>
										&#xA0;
										<xsl:if test="document/@editmode = 'edit'">
											<a href='' style="vertical-align:5px">
												<xsl:attribute name='href'>javascript:deleterow(<xsl:value-of select="$formsesid"/>,'<xsl:value-of select='$filename' />','<xsl:value-of select="$id" />')</xsl:attribute>
												<img src="/SharedResources/img/classic/icons/cross.png" style="width:10px; height:10px"/>
											</a>
										</xsl:if>
									</xsl:otherwise>
								</xsl:choose>
							</td>
							<td>
							</td>
						</tr>
					</xsl:when>
				</xsl:choose>
			</table>
			<br/>
			<br/>
		</div>
	</xsl:template>
</xsl:stylesheet>