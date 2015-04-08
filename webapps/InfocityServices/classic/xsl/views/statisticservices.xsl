<?xml version="1.0" ?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:import href="../templates/view.xsl"/>
	<xsl:variable name="viewtype">Вид</xsl:variable>
	<xsl:output method="html" encoding="utf-8" doctype-public="-//W3C//DTD XHTML 1.0 Transitional//EN"
		doctype-system="http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd" indent="no"/>
	<xsl:variable name="skin" select="request/@skin"/>
	<xsl:variable name="useragent" select="request/@useragent"/>
	<xsl:template match="/request">
		<html>
			<head>
				<title>
					<xsl:call-template name="viewtitle"/>
				</title>
				<link type="text/css" rel="stylesheet" href="classic/css/outline.css"/>
				<link type="text/css" rel="stylesheet" href="classic/css/main.css"/>
				<link type="text/css" href="/SharedResources/jquery/css/base/jquery-ui-1.8.2.redmont.css" rel="stylesheet" />
				<link type="text/css" rel="stylesheet" href="/SharedResources/jquery/js/visualize/css/visualize.css"/>
				<link type="text/css" rel="stylesheet" href="/SharedResources/jquery/js/visualize/css/basic.css"/>
				<script type="text/javascript" src="/SharedResources/jquery/js/jquery-1.4.2.js"/>
				<script type="text/javascript" src="/SharedResources/jquery/js/ui/jquery.ui.widget.js"/>
				<script type="text/javascript" src="/SharedResources/jquery/js/ui/jquery.ui.core.js"/>
				<script type="text/javascript" src="/SharedResources/jquery/js/ui/jquery.effects.core.js"/>
				<script type="text/javascript" src="/SharedResources/jquery/js/ui/jquery.ui.datepicker.js"/>
				<script type="text/javascript" src="/SharedResources/jquery/js/ui/jquery.ui.datepicker-ru.js"/>
				<script type="text/javascript" src="/SharedResources/jquery/js/ui/jquery.ui.mouse.js"/>
				<script type="text/javascript" src="/SharedResources/jquery/js/ui/jquery.ui.draggable.js"/>
				<script type="text/javascript" src="/SharedResources/jquery/js/ui/jquery.ui.position.js"/>
				<script type="text/javascript" src="/SharedResources/jquery/js/ui/jquery.ui.button.js"/>
				<script type="text/javascript" src="/SharedResources/jquery/js/ui/jquery.ui.dialog.js"/>
				<script type="text/javascript" src="/SharedResources/jquery/js/cookie/jquery.cookie.js"/>
				<script type="text/javascript" src="/SharedResources/jquery/js/visualize/js/visualize.jQuery.js"/>
				<script type="text/javascript" src="classic/scripts/outline.js"/>
				<script type="text/javascript" src="classic/scripts/view.js"/>
				<script type="text/javascript" src="classic/scripts/form.js"/>
				<script type="text/javascript">
					$(document).ready(function(){
							$('table').visualize({"width": $(window).width() - 555, "height": $(window).height() - 310,"barMargin":"80", "lineWeight":"10" });
					});
				</script>

			</head>			
			<body>
				<div id="blockWindow" style="display:none"/>
				<div id="wrapper">
					<div id='loadingpage' style='position:absolute; display:none'>
						<script>
							lw = $("#loadingpage").width();
							lh = $("#loadingpage").height();
							lt = ($(window).height() - lh )/2;
							ll = ($(window).width() - lw )/2;
							$("#loadingpage").css("top",lt);
							$("#loadingpage").css("left",ll + 95);
							$("#loadingpage").css("z-index",1);
						</script>
						<img src='/SharedResources/img/classic/4(4).gif'/>
					</div>	
					<xsl:call-template name="header-view"/>
					<xsl:call-template name="outline-menu-view"/>
					<span id="view" class="viewframe{outline/category[entry[@current=1]]/@id}" style="position:absolute; left:320px;  margin-top:30px; right:0px">
						<div id="viewcontent" style="margin-left:12px;">
							<div id="viewcontent-header" style="height:130px;">
						<div class="button_panel" style="margin-top:1px">
							<script type="text/javascript">    
					       		$(function() {
									$( ".button_panel button" ).button();
			        			});
    						</script>
							<span style="float:right; padding-right:10px;">
							</span>
						</div>
						
						<div style="clear:both"/>
						<div style="clear:both"/>
						<div id="tableheader" style="width:100%; padding:0px 40px 0px 40px">
							<table  id="statistic_table">
								<caption><xsl:value-of select="columns/column[@id='STATISTIKAZAPROSOVINFORMACII']/@caption"/></caption>
								<thead>
									<tr>
										<td></td>
										<th><xsl:value-of select="columns/column[@id='VSEZAPROSY']/@caption"/> %</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<th><xsl:value-of select="columns/column[@id='POKADASTROVOMUNOMERU']/@caption"/></th>
										<td>54</td>
									</tr>
									<tr>
										<th><xsl:value-of select="columns/column[@id='POTRANSPROTNOMUSREDSTVU']/@caption"/></th>
										<td>60</td>
									</tr>
									<tr>
										<th><xsl:value-of select="columns/column[@id='DANNYEOFIZICHESKOMLICE']/@caption"/></th>
										<td>90</td>
									</tr>
									<tr>
										<th><xsl:value-of select="columns/column[@id='OSOSTOYANIINALOGOVYHPLATEZHEI']/@caption"/></th>
										<td>38</td>
									</tr>
								</tbody>
							</table>
						
						</div>
					</div>
					<div id="viewtablediv" style="width:100%">
					</div>
		 		</div>
					</span>
					</div>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>