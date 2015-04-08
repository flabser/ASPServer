var direction;
var n;
var cfg;
var sumReloadView;
var curlangOutline;
var timeout;
var AppName = "EISAdmin" ;
var outline = {
	type:null,
	viewid:null,
	docid:null,
	element:null,
	curPage:null,
	command:null,
	curlangOutline:null,
	isLoad:false,
	sortField:null,
	sortOrder:null,
	category:null,
	project:null,
	filterid:null,
	filtercat:'',
	filterproj:'',
	filterplace:'',
	filterstatus:'',
	filterresp:'',
	filterauthor:'',
};

function addFilterActivity(){
	$("#filterform").css("display","block");
	 $('#blockWindow').css("display","block");
}

function CancelFilterActivity(){
	$("#filterform").css("display","none");
	 $('#blockWindow').css("display","none");
}

var service='';
var func='';
function OkFilterActivity(){
	users = $("#login").val();
	datefrom = $("#datefrom").val();
	dateto = $("#dateto").val();
	totalsfrom = $("#totalsfrom").val();
	totalsto =  $("#totalsto").val();
	if($("#errorsonly:checked").length == 1){
		errorsonly = $("#errorsonly").val();
	}else{
		errorsonly = '';
	}
	window.location.href ="Provider?type=view&id=monitoringservices&user="+users+"&dateto="+dateto+"&datefrom="+datefrom+"&totalsfrom="+totalsfrom+"&totalsto="+totalsto+"&errorsonly="+errorsonly+"&serviceandmethods="+service+func+"&springserver="+$("#server").val()+"&difftimefrom="+$("#difftimefrom").val()+"&difftimeto="+$("#difftimeto").val();
}

function selectServerItem(){
	service = '';
	func='';
	$("#service option:not(:first)").attr("style","display:none");
	$("#service option:first").attr("selected","selected");
	$("#func option:not(:first)").attr("style","display:none");
	$("#func option:first").attr("selected","selected");
	$("#service ."+ $("#server").val()).attr("style","display:block");
	l = $("#service ."+ $("#server").val()).length;
	$("#service ."+ $("#server").val()).each(function(index){
		service += $(this).val();
		if (l-1 != index ){
			service += "`";
		}
	});
}

function selectServiceItem(){
	func='';
	$("#func option:not(:first)").attr("style","display:none");
	service =  $("#service").val();
	$("#func ."+ $("#service").val()).attr("style","display:block");
	$("#func option:first").attr("selected","selected");
}

function selectFuncItem(){
	func ="~"+$("#func").val();
}

function selectServerLog(){
	$("#service option:not(:first)").attr("style","display:none");
	$("#service option:first").attr("selected","selected");
	$("#func option:not(:first)").attr("style","display:none");
	$("#func option:first").attr("selected","selected");
	$("#service ."+ $("#server").val()).attr("style","display:block");
}

function checkvalueinput(el){
	if ($(el).val().length == 0){
		$(el).val("Введите userid для поиска...");
		$(el).css("color","#ccc");
		$.ajax({
			type: "get",
			dataType:"html",
			url: "Provider?type=view&id=reportstatisticusers&keyword=",
			success: function(html){	
				$(".viewtable").empty();
				$(".viewtable").html($(html).find(".viewtable:first").html());
			}
		});
	}
}


function removevalinput(el){
	if( $(el).val().indexOf("Old password has not match")==-1){
		$(el).val("");
		$(el).css("color","black");
	}
}

function finduserid(el){
	$.ajax({
		type: "get",
		dataType:"html",
		url: "Provider?type=view&id=reportstatisticusers&keyword="+$(el).val(),
		success: function(html){	
			$(".viewtable").empty();
			$(".viewtable").html($(html).find(".viewtable:first").html());
		}
	});
	   
	 	
}

function checkservers(name){
	$.ajax({
		type: "get",
		url: 'Provider?type=page&id=checksrv&host='+name+"&onlyxml",
		datatype: "xml",
		beforeSend: function(){
			$("#"+name).children("td:nth-child(3)").html("<img src='classic/img/image_326405.gif'></img>");
		   },
		success: function(xml){
			report = $(xml).find("root").find("value").text();
			if (report == 'true'){
				$("#"+name).children("td:nth-child(3)").html("Доступен");
				if(name == 'NK'){
					testservicessrv("NK", "taxindservice");
					testservicessrv("NK", "taxpayservice");
				}
				if(name == 'BTI'){
					testservicessrv("BTI", "btiservice");
				}
				if(name == 'UMP'){
					testservicessrv("UMP", "humansearchservice");
					testservicessrv("UMP", "foreignersearchservice");
				}
				if(name == 'UDP'){
					testservicessrv("UDP", "udpservice");
				}
				
			}else{
				$("#"+name).children("td:nth-child(3)").html("Не доступен");
			}
		},
		complete: function(){
		// blockWaiting.destroy();
		},
		error: function(){}
	});
}

function testservicessrv(srvname, servicename){
	$.ajax({
		type: "get",
		url: 'Provider?type=page&id=testservice_'+ servicename +'&onlyxml',
		datatype: "xml",
		success: function(xml){
			html ='';
			$(xml).find("param").find("entry").each(function(){
				html += "<b>"+$(this).find("name").text()+"</b> : "+$(this).find("value").text() +"<br/>";
			});
			if ($(xml).find("param").find("entry").length == 0){
				html="<b>Сервис недоступен</b>";
			}
			$("<tr style='color:#444444; font-size:0.85em; border:1px solid #ccc'>" +
					"<td style='text-align:left;  height:25px; padding-left:25px' colspan='4'>"
						+ "<b>Проверка сервиса</b> : "+ servicename +"<br/>"
						+html+
						
					"</td></tr>").insertAfter("#"+srvname);
		},
		complete: function(){
			// blockWaiting.destroy();
		},
		error: function(){}
	});
}

function getLogService(){
	if($("#service").val()==''){
		infoDialog("Выберите сервис");
		return false;
	}
	if($("#date").val()==''){
		infoDialog("Выберите дату");
		return false;
	}
	$.ajax({
		type: "get",
		url: 'Provider?type=page&id=getlog_'+ $("#service").val() +'&date='+$("#date").val()+'&onlyxml',
		datatype: "xml",
		success: function(xml){
			$(".viewtable").empty();
			$(xml).find("content").find("root").find("param").find("entry").each(function(){
				$(".viewtable").append("<tr style='color:#444444; font-size:0.85em; border:1px solid #ccc'><td style='text-align:left;  height:25px; padding-left:25px' colspan='4'>"+$(this).find("value").text()+"</td></tr>");
			});
		},
		complete: function(){
			// blockWaiting.destroy();
		},
		error: function(){}
	});
}


function toogleUserRoles(name, action,el){
	if (action == "open"){
		$.ajax({
			type: "POST",
			url: 'Provider?type=service&operation=users_by_role&role='+name,
			datatype: "xml",
			success: function(xml){
				$(xml).find("entry[docid]").each(function(){
					$("<tr class='child' style='height:30px;  border:1px solid #ccc; color:#444; font-size:12px'>" +
							"<td colspan='2' style='text-align:left; padding-left:25px;  border:1px solid #ccc'><a class='doclink' href='Provider?type=structure&id=employer&key="+ $(this).attr("docid")+"'>"+$(this).find("viewcontent").find("viewtext1").text()+"</a></td>" +
						"</tr>").insertAfter($(el).parent("td").parent("tr"));
				});
				if($(xml).find("count").text() == '0'){
					$("<tr  class='child' style='height:30px;  border:1px solid #ccc; color:#444; font-size:12px'>" +
							"<td colspan='2' style='text-align:left; padding-left:25px;  border:1px solid #ccc'><font>Пользователей с такой ролью не найдено</font></td>" +
						"</tr>").insertAfter($(el).parent("td").parent("tr"));
				}
				$(el).attr("onclick","toogleUserRoles('"+name+"','close',this)").attr("src","/SharedResources/img/classic/1/minus.png");
			},
			complete: function(){
			// blockWaiting.destroy();
			},
			error: function(){}
		});
	}else{
		$(el).parent("td").parent("tr").nextUntil(".role").remove();
		$(el).attr("onclick","toogleUserRoles('"+name+"','open',this)").attr("src","/SharedResources/img/classic/1/plus.png");
		
	}
}

var Url = {
		encode : function (string) {
			return escape(this._utf8_encode(string));
		},
		decode : function (string) {
			return this._utf8_decode(unescape(string));
		},
		_utf8_encode : function (string) {
			string = string.replace(/\r\n/g,"\n");
			var utftext = "";
			for (var n = 0; n < string.length; n++) {
				var c = string.charCodeAt(n);
				if (c < 128) {
					utftext += String.fromCharCode(c);
				}
				else if((c > 127) && (c < 2048)) {
				 utftext += String.fromCharCode((c >> 6) | 192);
				 utftext += String.fromCharCode((c & 63) | 128);
				}
				else {
					utftext += String.fromCharCode((c >> 12) | 224);
					utftext += String.fromCharCode(((c >> 6) & 63) | 128);
					utftext += String.fromCharCode((c & 63) | 128);
				}
			}
			return utftext;
		},
		_utf8_decode : function (utftext) {
			var string = "";
			var i = 0;
			var c = c1 = c2 = 0;
			while ( i < utftext.length ) {
				c = utftext.charCodeAt(i);
				if (c < 128) {
					string += String.fromCharCode(c);
					i++;
				}
				else if((c > 191) && (c < 224)) {
					c2 = utftext.charCodeAt(i+1);
					string += String.fromCharCode(((c & 31) << 6) | (c2 & 63));
					i += 2;
				}
				else {
					c2 = utftext.charCodeAt(i+1);
					c3 = utftext.charCodeAt(i+2);
					string += String.fromCharCode(((c & 15) << 12) | ((c2 & 63) << 6) | (c3 & 63));
					i += 3;
				}
			}
			return string;
		}
};

function ToggleCategory(el){
	if ($(el).parent().next().next().is(":visible")){
		$(el).attr("src","/SharedResources/img/classic/1/plus.png");
		$(el).next("img").attr("src","/SharedResources/img/classic/1/folder_close_view.png");
		$(el).parent().next().next().slideUp("fast");
		if ($(el).parent().next().next().children(".entry").children(".viewlink_current").length != 0 ){
			$(el).parent().children("font").attr("font-weight","bold");
		}
		SavePropVisCategory($(el).parent().next().next().attr("id"),"none");
	}else{
		$(el).attr("src","/SharedResources/img/classic/1/minus.png");
		$(el).next("img").attr("src","/SharedResources/img/classic/1/folder_open_view.png");
		$(el).parent().next().next().css("visibility","visible");
		$(el).parent().next().next().slideDown("fast");
		SavePropVisCategory($(el).parent().next().next().attr("id"),"block");
	}
}

function SavePropVisCategory(id,val){
	$.cookie(AppName + "_" + id, val,{ path:"/", expires:30});	
}

function addNameToCookies(val){
	$.cookie("searchname", val,{ path:"/", expires:30});	
}
function addUserNameToCookies(val){
	$.cookie("username", val,{ path:"/", expires:30});	
}

function closepanel(){
	$( "#outline-container" ).animate({left: '-=386px'},'50'); 
	$( "#view" ).animate({left:'-=386px'},'50'); 
	$( "#resizer" ).animate({left:'-=386px'},'50'); 
	$( "#resizer" ).attr("onclick","openpanel()");
	$( "#iconresizer" ).attr("class","ui-icon ui-icon-triangle-1-e");
}
function openpanel(){
	$( "#outline-container" ).animate({left: '+=386px'},'50'); 
	$( "#view" ).animate({left:'+=386px'},'50'); 
	$( "#resizer" ).animate({left:'+=386px'},'50');
	$( "#resizer" ).attr("onclick","closepanel()");
	$( "#iconresizer" ).attr("class","ui-icon ui-icon-triangle-1-w");
}

function closeformpanel(){
	$( "#outline-container" ).animate({left: '-=305px'},'50'); 
	$( "#resizer" ).animate({left:'-=305px'},'50');
	$( ".formwrapper" ).animate({left:'-=305px'},'50'); 
	if ($(window).width()< "1280"){
		$( ".td_editable" ).animate({width: '600px'},'50'); 
		$( ".select_editable" ).animate({width: '610px'},'50'); 
		$( ".fc" ).animate({width: '+=20px'},'50'); 
	}
	$( "#resizer" ).attr("onclick","openformpanel()");
	$( "#iconresizer" ).attr("class","ui-icon ui-icon-triangle-1-e");
}
function openformpanel(){
	$( "#outline-container" ).animate({left: '+=305px'},'50'); 
	$( ".formwrapper" ).animate({left:'+=305px'},'50');
	if ($(window).width()< "1200"){
		$( ".select_editable" ).animate({width: '460px'},'50'); 
		$( ".fc" ).animate({width: '-=20px'},'50'); 
		$( ".td_editable" ).animate({width: '460px'},'50'); 
	}
	$( "#resizer" ).animate({left:'+=305px'},'50');
	$( "#resizer" ).attr("onclick","closeformpanel()");
	$( "#iconresizer" ).attr("class","ui-icon ui-icon-triangle-1-w");
}

$.fn.extend({
    notify : function(options) {
    	var defaults = { 
    		text: "",
    	  	onopen: function(){$("body").hidenotify();},
    	  	loadanimation:true
    	};
    	var opts = $.extend(defaults, options);
    	$(this).append("<div id='notifydiv'><font>"+opts.text+"</font></div>");
    	if (opts.loadanimation){
    		$("#notifydiv").append("<img src='classic/img/26.png' style='position:absolute; top:3px; right:10px'/>");
    	}
    	$("#notifydiv").animate({top: '0px'},'fast',opts.onopen);
    },
    hidenotify : function(options) {
    	var defaults = { 
        	delay: "1500",
        	onclose: function(){}
        };
        var opts = $.extend(defaults, options);
    	setTimeout(function() {
    		$("#notifydiv").animate({top: '-40px'},'fast',opts.onclose);
        }, opts.delay);
    }
});


function delGlossary(dbID,typedel){
	var ck="";
	$("input[name^='chbox']:checked").each(function(indx, element){
		  ck+=$(element).val()+"~"+$(element).attr("id")+"`";
	});
	ck =ck.substring(0 , ck.length - 1);
	$.ajax({
		type: "GET",
		datatype:"XML",
		url: "Provider",
		data: "type=delete&id=delete&ck=" + ck + "&typedel="+typedel+"&dbid=Avanti&nocache="+Math.random() * 300 ,
		success: function (msg){
			deletedcount=$(msg).find('deleted').text();
			notdeletedcount=$(msg).find('notdeleted').text();
			 var myDiv = document.createElement("DIV");
			   divhtml ="<div id='dialog-message' title='Удаление'>";
			   divhtml+="<span style='text-align:center;'>"+
			   			"<font style='font-size:13px; '>Документов удалено:"+deletedcount+"</font><br/>";
			  if(notdeletedcount !=''){ divhtml+="<font style='font-size:13px; '>Документов не удалено:"+notdeletedcount+"</font>";}
			  divhtml += "</span></div>";
			  myDiv.innerHTML = divhtml;
			  document.body.appendChild(myDiv);
			  $("#dialog").dialog("destroy");
			$( "#dialog-message" ).dialog({
				modal: true,
				buttons: {
					"Ок": function() {
						window.location.reload();
					}
				},
				beforeClose: function() { 
					window.location.reload();
				}
			});
		},
		error: function(data,status,xhr) {
			infoDialog("Ошибка удаления");
		}
	});
}

function testservice(type){
	$("#status"+type).html("<img src='classic/img/image_326405.gif'/>");
	if ($("#"+type).val() != null && $("#"+type).val().length != 0 ){
		$.ajax({
			type: "GET",
			datatype:"XML",
			url: "Provider",
			timeout:12000,
			data: "type=handler&id=testservices&typeservice="+type+"&nameservice="+ $("#"+type).val() ,
			success: function (xml){
				if ($(xml).find("response").attr("status") == "error" ){
					$("#status"+type).html("");
					infoDialog("Произошла ошибка запроса")
				}
				if ($(xml).find("message[id=answer]").text() == "true"){
					$("#status"+type).html("Сервис доступен");
				}
				if ($(xml).find("message[id=answer]").text() == "false"){
					$("#status"+type).html("Сервис не доступен");
				}
			},
			error: function(data,status,xhr) {
				$("#status"+type).html("");
				if (status = "timeout"){
					$("#status"+type).html("Сервер недоступен");
				}else{
					infoDialog("Произошла ошибка запроса")
					$("#status"+type).html("Произошла ошибка запроса");
				}
				
			}
		})
	}else{
		infoDialog("Не выбран сервис")
		$("#status"+type).html("");
	}
}
function addDocToFav(el,docid,doctype){
	$.ajax({
		type: "GET",
		datatype:"XML",
		url: "Provider",
		data: "type=service&operation=add_to_favourites&key="+docid+"&doctype="+doctype+"&dbid=Avanti&nocache="+Math.random() * 300 ,
		success: function (msg){
			$(el).attr("src","/SharedResources/img/iconset/star_full.png")
			$(el).attr("onclick","removeDocFromFav(this,"+docid+","+doctype+")")
		},
		error: function(data,status,xhr) {
			infoDialog("Ошибка добавления в избранное")
		}
	})
}

function removeDocFromFav(el,docid,doctype){
	$.ajax({
		type: "GET",
		datatype:"XML",
		url: "Provider",
		data: "type=service&operation=remove_from_favourites&key="+docid+"&doctype="+doctype+"&dbid=Avanti&nocache="+Math.random() * 300 ,
		success: function (msg){
			$(el).attr("src","/SharedResources/img/iconset/star_empty.png")
			$(el).attr("onclick","addDocToFav(this,"+docid+","+doctype+")")
		},
		error: function(data,status,xhr) {
			infoDialog("Ошибка добавления в избранное")
		}
	})
}

function undelGlossary(dbID){
	var ck="";
	$("input[name^='chbox']:checked").each(function(indx, element){
		  ck+=$(element).val()+"~"+$(element).attr("id")+"`";
	});
	ck =ck.substring(0 , ck.length - 1);
	$.ajax({
		type: "GET",
		datatype:"XML",
		url: "Provider",
		data: "type=undelete&ck=" + ck +"&dbid=Avanti&nocache="+Math.random() * 300 ,
		success: function (msg){
			restoredcount=$(msg).find('restored').text();
			notrestoredcount=$(msg).find('notrestored').text();
			var myDiv = document.createElement("DIV");
			divhtml ="<div id='dialog-message' title='Восстановление'>";
			divhtml+="<span style='text-align:center;'>";
			divhtml+="<font style='font-size:13px; '>Документов восстановлено:"+restoredcount+"</font><br/>" ;
			if(notrestoredcount !=''){ divhtml+="<font style='font-size:13px; '>Документов не восстановлено:"+notrestoredcount+"</font>";}
			divhtml += "</div>";
			myDiv.innerHTML = divhtml;
			document.body.appendChild(myDiv);
			$("#dialog").dialog("destroy");
			$( "#dialog-message" ).dialog({
				modal: true,
				buttons: {
					"Ок": function() {
						window.location.reload();
					}
				},
				beforeClose: function() { 
					window.location.reload();
				}
			});
		},
		error: function(data,status,xhr) {
			infoDialog("Ошибка восстановления")
		}
	})
}

/* функция поиска*/
function search(){
	$(".searchpan").html("");
	value=$("#searchInput").attr("value");
	if(value.length==0){
		message("Заполните строку поиска","searchInput" );
	}else{
		value = Url.encode(value)
		window.location="Provider?type=search&keyword="+value;
	}
}

function closeSearch(){
	$(".searchpan").css("display","none");
	$("#searchInput").attr("value","");
}

function openSearch(){
	$(".searchpan").css("display","block")
}

function collapsSearch(){
	$("#content").attr("style","display:none");
	$(".searchpan").css("style","height:20px");
	$("#colsearch").attr("src","/SharedResources/img/classic/open_gray.gif");
	$("#excol").attr("href","javascript:expandSearch()");
}

function expandSearch(){
	$("#content").attr("style","display:block");
	$("#colsearch").attr("src","/SharedResources/img/classic/close_gray.gif");
	$("#excol").attr("href","javascript:collapsSearch()");
	
}

function openCategoryView(id,cdoctype,pos,s) {
	$.ajax({
		  url: 'Provider?type=view&id=docsbyproject&parentdocid='+id+'&parentdoctype='+cdoctype+'&command=expand`'+id,
		  datatype:'html',
		  success: function(data) {
			 $(data).insertAfter("#category"+ id);	
		  }
	});	
	$("#a"+id).attr("href","javascript:closeCategoryView('"+id+"','"+ cdoctype+"','"+pos+"',"+s+")");
	$("#img"+id).attr("src","/SharedResources/img/classic/minus.gif");
}

function closeCategoryView(id,cdoctype,pos,s){
	$.get('Provider?type=view&id=docsbyproject&command=collaps`'+id, {})
	$("#category"+id).next(".viewtable").remove();
	$("#a"+id).attr("href","javascript:openCategoryView('"+id+"','"+ cdoctype+"','"+pos+"',"+s+")");
	$("#img"+id).attr("src","/SharedResources/img/classic/plus.gif");
}

/* открытие ответных документов в виде*/
function openParentDocView(id,cdoctype,pos,s) {
	$.ajax({
		  url: 'Provider?type=view&id=docthread&parentdocid='+id+'&parentdoctype='+cdoctype+'&command=expand`'+id+'`'+cdoctype,
		  datatype:'html',
		  success: function(data) {
			 $(data).insertAfter("."+ id );	
			$("."+id).next("tr").css("background","#fff");
			  $("."+id).next("tr").find('.font').each(function(){
				  html=$(this).html().replace("--&gt;", "<img src='/SharedResources/img/classic/arrow_blue.gif'/>");
				  $(this).html("");
				  $(this).append(html);
			  });
		  }
	});	
	$("#a"+id).attr("href","javascript:closeResponses('"+id+"','"+ cdoctype+"','"+pos+"',"+s+")");
	$("#img"+id).attr("src","/SharedResources/img/classic/minus.gif");
}

function closeResponses(id,cdoctype,pos,s){
	$.get('Provider?type=view&id=docthread&command=collaps`'+id+'`'+cdoctype, {})
	$("."+id).next("tr").replaceWith("");
	$("#a"+id).attr("href","javascript:openParentDocView('"+id+"','"+ cdoctype+"','"+pos+"',"+s+")");
	$("#img"+id).attr("src","/SharedResources/img/classic/plus.gif");
}

function openParentGlossView(id,cdoctype,pos,s) {
	$.ajax({
		url: 'Provider?type=view&id=glossthread&parentdocid='+id+'&parentdoctype='+cdoctype+'&command=expand`'+id+'`'+cdoctype,
		datatype:'html',
		success: function(data) {
			$(data).insertAfter("."+ id );	
			$("."+id).next("tr").css("background","#fff");
			$("."+id).next("tr").find('.font').each(function(){
				html=$(this).html().replace("--&gt;", "<img src='/SharedResources/img/classic/arrow_blue.gif'/>");
				$(this).html("");
				$(this).append(html);
			});
		}
	});	
	$("#a"+id).attr("href","javascript:closeGlossResponses('"+id+"','"+ cdoctype+"','"+pos+"',"+s+")");
	$("#img"+id).attr("src","/SharedResources/img/classic/minus.gif");
}

function closeGlossResponses(id,cdoctype,pos,s){
	$.get('Provider?type=view&id=glossthread&command=collaps`'+id+'`'+cdoctype, {})
	$("."+id).next("tr").replaceWith("");
	$("#a"+id).attr("href","javascript:openParentGlossView('"+id+"','"+ cdoctype+"','"+pos+"',"+s+")");
	$("#img"+id).attr("src","/SharedResources/img/classic/plus.gif");
}

function checkAll(allChbox) {
	allChbox.checked ? $("input[name=chbox]").attr("checked","true") : $("input[name=chbox]").removeAttr("checked");
}

function refresher() {
	if (timeout != null || timeout != undefined ){
		clearTimeout(timeout)
	}
	sumReloadView = 0
	if ($.cookie("refresh") !=null){
		timeval= $.cookie("refresh") * 60000;
	}else{
		timeval=360000
	}
	timeout = setTimeout("refreshAction()", timeval);
}

function refreshAction() {
	outline.sumReloadView = outline.sumReloadView + 1;
	updateView();
}

function doSearch(keyWord ,num){
	if (num != null){
		outline.curPage = num
	}
	keyWord = Url.encode(keyWord)
	$.ajax({
		url: 'Provider?type=search&keyword=' + keyWord + '&page=' + outline.curPage,
		datatype:"html",
		beforeSend: function(){
			loadingOutline()
		},
		success: function(data) {
			$('#view').html(data.split("<body>")[1].split("</body>")[0]);
			endLoadingOutline()
		},
		error: function(data,status,xhr) {
			if (xhr == "Bad Request"){
				text="Запрос не распознан";
				func = function(){window.history.back()};
				dialogAndFunction (text,func)
			}else{
			$("#noserver").css("display","block");
			$("#finddoc").css("display","none");
			}
		}
	});
}

function elemBackground(el,color){
	$(el).css("background","#"+color)
}

function flashentry(id) {
	$("#"+id).animate({backgroundColor: '#ffff99'}, 1000);
	$("#"+id).animate({backgroundColor: '#ffffff'}, 1000);
}

function updateAllCount(){
	$(".countSpan").each(function(indx, element){
		if($(element).attr("id")!=''){
			updateCount($(element).attr("id")+"_count", $(element).attr("id"))
		}
	});
	setTimeout("updateAllCount()", 960000);
}

function updateCount(query, idcount) {
	$.ajax({
		url: 'Provider?type=query&id='+query+'&rndm='+Math.random(),
		dataType:'xml',
		async:'true',
		success: function(data) {
			count = $(data).find('query').text();
			if (count == ''){
				count= 0
			}
			$("#"+ idcount).html("<font style='font-size:12px'>["+count+"]</font>")
		}
	});
}

function resetFilterView(){
	outline.filtercat = '0';
	outline.filterproj = '0';
	outline.filterplace = '0';
	outline.filterstatus = '0';
	outline.filterresp = '0';
	outline.filterauthor = '0';
	updateView(outline.type, outline.viewid, outline.page, outline.command,  outline.sortField, outline.sortOrder)
}

function openCategoryList(el, listid){
	$(".glosslisttable").css("visibility", "hidden");
	$(el).offset(function(i,val){
	  $("#"+listid).css("position", "absolute");
	  if    (IE='\v'=='v'){
		  $("#"+listid).css("top", val.top -70);
	  }else{
		  $("#"+listid).css("top", val.top - 55);
	  }
	  $("#"+listid).css("left", val.left -320);
		return {top:val.top, left:val.left};
	});
	
	$("#"+listid).css("visibility", "visible");
	$(el).attr("onclick", "closeCategoryList(this,'"+listid+"')");
    $(document).bind('click.'+listid, function(e) {
    	
       if ($(e.target).closest("#"+listid+"button").length == 0) {
    	   
          	$("#"+listid).css("visibility", "hidden");
            $(document).unbind('click.'+listid);
            $(el).attr("onclick", "openCategoryList(this,'"+listid+"')");
       }
    });
}

function hideQFilterPanel(){
	$("#QFilter").slideUp("fast");
	$( "#tablecontent" ).animate({top:'-=29px'},'fast'); 
}

function openQFilterPanel(){
	if($("#QFilter").css("display") == 'none'){
		$("#QFilter").slideDown("fast")
		$("#tablecontent").animate({top:'+=29px'},'fast'); 
	}else{
		hideQFilterPanel()
		if (outline.filtercat !='' || outline.filterproj!=''|| outline.filterplace!='' || outline.filterstatus !='' || outline.filterresp !='' || outline.filterauthor!=''){
			if (outline.filtercat !='0' || outline.filterproj!='0'|| outline.filterplace!='0' || outline.filterstatus !='0' || outline.filterresp !='0' || outline.filterauthor!='0'){
				resetFilterView()
			}
		}
	}
}

function closeCategoryList(el,listid){
	$("#"+listid).css("visibility", "hidden");
	$(el).attr("onclick", "openCategoryList(this,'"+listid+"')");
}

function updateView(type, viewid, page, command,  sortField, sortOrder){
	loadingOutline()
	category = outline.category || '';
	project = outline.project || '';
	
	if (type !=null){
		outline.type=type;
	}
	if (viewid !=null){
		outline.viewid=viewid;
	}
	if (page !=null || page !=undefined ){
		outline.curPage=page;
	}
	if (outline.filterid !=null || outline.filterid !=undefined ){
		filterid = outline.filterid;
	}
	commandPart = '';
	if (command != null){
		outline.command=command;
		commandPart = '&command=' + outline.command;
	}
	sortPart = '';
	if (sortField != null && sortOrder != null ){
		outline.sortField = sortField;
		outline.sortOrder = sortOrder;
		$.cookie("sortField", sortField,{
			path:"/",
			expires:30
		});	
		$.cookie("sortOrder", sortOrder,{
			path:"/",
			expires:30
		});	
	}
	if (outline.sortField != null && outline.sortOrder != null && $.cookie("sortField") == null && $.cookie("sortOrder") == null){
		sortPart ='&sortfield='+outline.sortField+"&order=" + outline.sortOrder;
	}
	if ($.cookie("sortField") != null && $.cookie("sortOrder") != null){
		sortPart ='&sortfield='+$.cookie("sortField")+"&order=" +$.cookie("sortOrder");
	}
	
	url= 'Provider?type=' + outline.type + '&id=' + outline.viewid + '&page=' + outline.curPage + commandPart+ sortPart+"&keyword="+category+"&filterid="+outline.filterid+"&filtercat="+outline.filtercat + "&filterproj=" + outline.filterproj+ "&filterorigin=" + outline.filterplace+ "&filterstatus=" + outline.filterstatus+ "&filterresp=" + outline.filterresp+ "&filterauthor=" + outline.filterauthor ;
	$.ajax({
		url: url,
		dataType:'HTML',
		async:'true',
		success: function(data) {
			alert(data)
			if (!data.match("viewtable")){
				text="Cессия пользователя была закрыта сервером, для продолжения работы необходима повторная авторизация";
				func=function(){window.locatiom.reload()}
				dialogAndFunction (text,func);
				checksrv()
			}else{
				$('body').html(data.split("<body>")[1].split("</body>")[0]);
				//$("body").append(data)
				 $("#searchInput").css("padding","2px")
				 endLoadingOutline();
			}
		},
		error: function(jqXHR, textStatus, errorThrown) {
			checksrv()
		}
	});
}

function checksrv(){
	$.ajax({
		url: "Provider?type=edit&element=userprofile&id=userprofile",
		dataType:'HTML',
		async:'true',
		success: function(data) {
			$("body").hidenotify({"delay":200,"onclose":function(){}, loadanimation:false})
		},
		error: function(jqXHR, textStatus, errorThrown) {
			if(errorThrown == 'Unauthorized'){
				text="Cессия пользователя была закрыта сервером, для продолжения работы необходима повторная авторизация"
				func = function(){window.location.reload()};
				dialogAndFunction (text,func);
			}else{
				if($("#notifydiv").length == 0){
					$("body").notify({"text":"Отсутствует соединение с сервером","onopen":function(){}, loadanimation:false})
				}
				setTimeout(function(){refreshAction()}, 10000);
			}
		}
	});
}

function loadingOutline(){
	$('#blockWindow').css("display","block");
	$('#loadingpage').css("display","block");
	$("body").css("cursor","wait")
}

function endLoadingOutline(){
	$('#loadingpage').css("display","none");
	$('#blockWindow').css("display","none");
	$("body").css("cursor","default")
	outline.isLoad=true;
	refresher()
}

function beforeOpenDocument(){
	$('#blockWindow').css("display","block");
	$('#loadingpage').css("display","block");
}

function subentry(id) {
	if ($("subentry" + id).style.display == "none") {
		$('subentry' + id).style.display = "block"
	} else {
		$('subentry' + id).style.display = "block"
	}
}

function openXMLdoc(){
	window.location.href=window.location +"&onlyxml"
}

function openXMLdocView(curviewid){
	window.location.href="Provider?type=view&id="+curviewid+"&onlyxml"
}