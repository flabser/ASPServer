var direction;
var n;
var cfg;
var sumReloadView;
var curlangOutline;
var timeout;
var AppName = "EIS" ;
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


function printprepare(){
	$("#printtable").empty();
	$("#resultHeaderDataTable tr").clone().appendTo("#printtable");
	$("#resultDataTable tr").clone().appendTo("#printtable");
	var time=new Date();
	month=time.getMonth()+1;
	day=time.getDate();
	hours=time.getHours();
	minute=time.getMinutes();
	if (month< 10){month="0"+month;}
	if (day<10){day="0"+ time.getDate();}
	if (hours<10){hours="0"+time.getHours();}
	if (minute<10){minute="0"+time.getMinutes();}
	curdate=day +"."+ month + "." + time.getFullYear()+ " " + hours + ":" + minute ;
	$("#printtime").text(" " +curdate);
}

function Tax_getDataByRNN(){
	if($.trim($("input[name=rnn]").val()).length != 12){
		infoDialog("Поле 'РНН' должно содержать 12 символов");
	}else{
		if (/[a-zA-Zа-яА-Я]/.test($("input[name=rnn]").val()) ) {
			infoDialog("Поле 'РНН' может содержать только чиcловые значения");
		}else{
			$.cookie("lastreqview", "rnn",{ path:"/", expires:30});	
			$.cookie("rnn", $.trim($("input[name=rnn]").val()),{ path:"/", expires:30});	
			$("#resultDataTable tr").remove();
			$("#printtable, #page-nav, #counter, #reqtime").empty();
			loadingOutline();
			var rnn = $.trim($("input[name=rnn]").serialize());
			$.ajax({
				type: "POST",
				url: 'Provider',
				datatype: "xml",
				data: "type=page&id=tax_getdatabyrnn_pb&"+rnn+"&onlyxml",
				success: function(xml){
					$("#resultdiv").css("top",$("#fieldsdiv").height()+"px");
					$("#printbutton").css("visibility","visible");
					if ($(xml).find("response").attr("status") !='error'){
						if ($(xml).find("root").attr("count") != '0'){
							if($(xml).find("root").attr("count") < 21){
								count_elements= $(xml).find("root").attr("count")
							}else{
								count_elements= $(xml).find("root").attr("count") - ((page-1) * 20) ;
							}
							for (var i=0 ; i < count_elements && i < 20; i++){
								k=i+1;
								if ($(xml).find("businesstype"+k).text() == '1'){
									bussinestype = "Личное";
								}
								if ($(xml).find("businesstype"+k).text() == '2'){
									bussinestype = "Совместное";
								}
								getfulldataccess = $(xml).find("root").find("getfulldataccess").text();
								if (getfulldataccess == 'true'){
									firstcolumn = "<a onclick='savereqparam()' href='Provider?type=edit&id=personalbusinessmen&key=&fid="+$(xml).find("id"+k).text() +"&fstatus="+ $(xml).find("status"+k).text()+"'class='doclink' >"+k +"</a>"; 
								}else{
									firstcolumn = "<font>"+k +"</font>";
								}
								
								if (getfulldataccess == 'true'){
									secondcolumn = "<a onclick='savereqparam()' href='Provider?type=edit&id=personalbusinessmen&key=&fid="+$(xml).find("id"+k).text() +"&fstatus="+ $(xml).find("status"+k).text()+"'class='doclink' >"+$(xml).find("businessname"+k).text() +"</a>" ; 
								}else{
									secondcolumn = "<font>"+$(xml).find("businessname"+k).text() +"</font>" ;
								}
								
								$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center; width:"+ $("#1td").width()+"px'>" +
									firstcolumn	+"</td>"
								+
								"<td style='border:1px solid #ccc; word-wrap:break-word; text-align:center;padding-right:2px;  width:"+ $("#2td").width()+"px'>" +
									secondcolumn +
								"</td>" +
								"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#3td").width()+"px'>"+$(xml).find("root").find("rnn"+k).text() +"</td>" +
								"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#4td").width()+"px'>"+$(xml).find("iin"+k).text() +"</td>" +
								"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#5td").width()+"px'>"+$(xml).find("fio"+k).text() +"</td>" +
								"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#6td").width()+"px'>"+ bussinestype +"</td></tr>");
							}
						}else{
							if($(xml).find("error:contains('Connection refused: connect')").length !=0){
								infoDialog("Отсутствует соединение с сервером")
							}
							if($(xml).find("error:contains('Connection timed out: connect')").length !=0){
								infoDialog("Превышен интервал ожидания")
							}
							$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center' colspan='5'> По данному запросу ничего не найдено</td></tr>");
							$("#resultdiv").css("top",$("#fieldsdiv").height());
						}
						endLoadingOutlineNotRefresher();
					}else{
						if($(xml).find("error:contains('Connection refused: connect')").length !=0){
							infoDialog("Отсутствует соединение с сервером")
						}
						if($(xml).find("error:contains('Connection timed out: connect')").length !=0){
							infoDialog("Превышен интервал ожидания")
						}
						$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center' colspan='5'>Произошла ошибка при поиске</td></tr>");
						$("#resultdiv").css("top",$("#fieldsdiv").height());
						endLoadingOutlineNotRefresher();
					}
				},
				complete: function(){
					$("#printtable").empty();
					$("#resultHeaderDataTable tr").clone().appendTo("#printtable");
					$("#resultDataTable tr").clone().appendTo("#printtable");
				},
				error: function(){}
			});
		}
	}
}

function Tax_getDataByRNN_reg(){
	if($("input[name=rnn]").val().length != 12){
		infoDialog("Поле 'РНН' должно содержать 12 символов");
	}else{
		if (/[a-zA-Zа-яА-Я]/.test($("input[name=rnn]").val()) ) {
			infoDialog("Поле 'РНН' может содержать только чиcловые значения");
		}else{
			$.cookie("lastreqview", "rnn",{ path:"/", expires:30});	
			$.cookie("rnn", $.trim($("input[name=rnn]").val()),{ path:"/", expires:30});
			$("#resultDataTable tr").remove();
			$("#printtable, #page-nav, #counter, #reqtime").empty();
			loadingOutline();
			var rnn = $.trim($("[name=rnn]").serialize());
			$.ajax({
				type: "POST",
				url: 'Provider',
				data: "type=page&id=tax_getdatabyrnn_reg&"+rnn+"&onlyxml",
				success: function(xml){
					$("#resultdiv").css("top",$("#fieldsdiv").height()+"px");
					$("#printbutton").css("visibility","visible");
					if ($(xml).find("response").attr("status") !='error'){
						if ($(xml).find("root").attr("count") != '0'){
							if($(xml).find("root").attr("count") < 21){
								count_elements= $(xml).find("root").attr("count")
							}else{
								count_elements= $(xml).find("root").attr("count") - ((page-1) * 20) ;
							}
							for (var i=0 ; i < count_elements && i < 20; i++){
								k=i+1;
								getfulldataccess = $(xml).find("root").find("getfulldataccess").text();
								if( getfulldataccess == 'true'){
									firstcolumn = "<a onclick='savereqparam()' href='Provider?type=edit&id=regdata&key=&fid="+$(xml).find("id"+k).text() +"&fstatus="+ $(xml).find("status"+k).text()+"'class='doclink' >"+ k +"</a>";
								}else{
									firstcolumn = "<font>"+ k +"</font>";
								}
								
								if (getfulldataccess == 'true'){
									secondcolumn = "<a onclick='savereqparam()' href='Provider?type=edit&id=regdata&key=&fid="+$(xml).find("id"+k).text() +"&fstatus="+ $(xml).find("status"+k).text()+"'class='doclink' >"+ $(xml).find("fio"+k).text() +"</a>" ;
								}else{
									secondcolumn = "<font>"+ $(xml).find("fio"+k).text() +"</font>" ;
								}
								
								$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center; width:"+ $("#1td").width()+"px'>" +
											firstcolumn + 
										"</td>" +
									"<td style='border:1px solid #ccc; word-wrap:break-word; text-align:center; width:"+ $("#2td").width()+"px'>"+
										secondcolumn + 
									"</td>" +
									"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#3td").width()+"px'>"+$(xml).find("birthdate"+k).text() +"</td>" +
									"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#4td").width()+"px'>"+$(xml).find("rnn"+k).text() +"</td>" +
									"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#5td").width()+"px'>"+$(xml).find("iin"+k).text() +"</td>" +
									"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#6td").width()+"px'>"+$(xml).find("regaddress"+k).text() +"</td>"+
									"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#7td").width()+"px'>"+$(xml).find("realaddress"+k).text() +"</td></tr>");
							}
						}else{
							$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center' colspan='5'> По данному запросу ничего не найдено</td></tr>");
							$("#resultdiv").css("top",$("#fieldsdiv").height());
						}
					endLoadingOutlineNotRefresher();
					}else{
						if($(xml).find("error:contains('Connection refused: connect')").length !=0){
							infoDialog("Отсутствует соединение с сервером")
						}
						if($(xml).find("error:contains('Connection timed out: connect')").length !=0){
							infoDialog("Превышен интервал ожидания")
						}
						$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center' colspan='5'>Произошла ошибка при поиске</td></tr>");
						$("#resultdiv").css("top",$("#fieldsdiv").height());
						endLoadingOutlineNotRefresher();
					}
				},
				complete: function(){
					$("#printtable").empty();
					$("#resultHeaderDataTable tr").clone().appendTo("#printtable");
					$("#resultDataTable tr").clone().appendTo("#printtable");
				},
				error: function(){}
			});
		}
	}
}

function Tax_getDataByFIO(page){
	if($("[name=lastname]").val().length == 0 || $("[name=firstname]").val().length == 0){
		infoDialog("Поля 'Фамилия' и 'Имя' обязательны к заполнению");
	}else{
		if (/^\*/.test($.trim($("input[name=lastname]").val())) || /^\*/.test($.trim($("input[name=firstname]").val())) || /^\*/.test($.trim($("input[name=middlename]").val()))  ) {
			infoDialog("Поле запроса не должно начинаться с символа '*' ");
		}else{
			$.cookie("lastreqview", "fio",{ path:"/", expires:30});	
			$.cookie("firstname", $.trim($("input[name=firstname]").val()),{ path:"/", expires:30});
			$.cookie("middlename", $.trim($("input[name=middlename]").val()),{ path:"/", expires:30});
			$.cookie("lastname", $.trim($("input[name=lastname]").val()),{ path:"/", expires:30});
			$("#resultDataTable tr").remove();
			$("#printtable, #page-nav, #counter, #reqtime").empty();
			pagesize = 20;
			if($.cookie("pagesize") != null){
				pagesize = $.cookie("pagesize");
			}
			loadingOutline();
			var firstname = $.trim($("[name=firstname]").serialize());
			var middlename = $.trim($("[name=middlename]").serialize());
			var lastname = $.trim($("[name=lastname]").serialize());
			$.ajax({
				type: "POST",
				url: 'Provider',
				data: "type=page&id=tax_getdatabyfio_pb&"+firstname+"&"+middlename+"&"+lastname+"&page="+page+"&pagesize="+pagesize+"&onlyxml",
				success: function(xml){
					$("#resultdiv").css("top",$("#fieldsdiv").height()+"px");
					$("#printbutton").css("visibility","visible");
					if ($(xml).find("response").attr("status") !='error'){
						$("#counter").text($(xml).find("root").attr("count"));
						$("#reqtime").text($(xml).find("response").attr("elapsed_time")+" сек");
						if ($(xml).find("root").attr("count") != '0'){
							sumpage= Math.ceil($(xml).find("root").attr("count") / pagesize);
							if (sumpage != 1){
								if(page > 1){
									$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:Tax_getDataByFIO(1)'><<</a>");
								}
								if (sumpage < 11){
									for (var k=1 ; k < sumpage+1; k++){
										if(k == page){
											$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:Tax_getDataByFIO("+k+")'>"+k+"</a>");
										}else{
											$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:Tax_getDataByFIO("+k+")'>"+k+"</a>");
										}
									}
								}
								if (sumpage > 10 && page == 1){
									for (var k=1 ; k < 11; k++){
										if(k == page){
											$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:Tax_getDataByFIO("+k+")'>"+k+"</a>");
										}else{
											$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:Tax_getDataByFIO("+k+")'>"+k+"</a>");
										}
									}
								}
								if (sumpage > 10 && page != 1 && sumpage-page > 9){
									for (var k=page ; k < page+10; k++){
										if(k == page){
											$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:Tax_getDataByFIO("+k+")'>"+k+"</a>");
										}else{
											$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:Tax_getDataByFIO("+k+")'>"+k+"</a>");
										}
									}
								}
								if (sumpage > 10 && page != 1 && sumpage-page <= 9){
									for (var k=sumpage-10 ; k < sumpage+1; k++){
										if(k == page){
											$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:Tax_getDataByFIO("+k+")'>"+k+"</a>");
										}else{
											$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:Tax_getDataByFIO("+k+")'>"+k+"</a>");
										}
									}
								}
								if(page < sumpage){
									$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:Tax_getDataByFIO("+sumpage+")'>>></a>");
								}
							}
							if($(xml).find("root").attr("countelements") < 21){
								count_elements= $(xml).find("root").attr("countelements")
							}else{
								count_elements= $(xml).find("root").attr("count") - ((page-1) * 20) ;
							}
							for (var i=0 ; i < count_elements && i < 20; i++){
								k=i+1;
								var bussinestype = ' ';
								if ($(xml).find("businesstype"+k).text() == '1'){
									bussinestype = "Личное";
								}
								if ($(xml).find("businesstype"+k).text() == '2'){
									bussinestype = "Совместное";
								}
								getfulldataccess = $(xml).find("root").find("getfulldataccess").text();
								if (getfulldataccess == 'true'){
									firstcolumn = "<a onclick='savereqparam()' href='Provider?type=edit&id=personalbusinessmen&key=&fid="+$(xml).find("id"+k).text() +"&fstatus="+ $(xml).find("status"+k).text()+"'class='doclink' >"+ k +"</a>";
									secondcolumn = "<a onclick='savereqparam()' href='Provider?type=edit&id=personalbusinessmen&key=&fid="+$(xml).find("id"+k).text() +"&fstatus="+ $(xml).find("status"+k).text()+"'class='doclink' >"+ $(xml).find("businessname"+k).text() +"</a>" ;
								}else{
									firstcolumn = "<font>"+ k +"</font>";
									secondcolumn ="<font>"+ $(xml).find("businessname"+k).text() +"</font>";
								}
								
								$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center; width:"+ $("#1td").width()+"px'>" +
										 firstcolumn + 
										"</td>" +
								"<td style='border:1px solid #ccc; word-wrap: break-word; text-align:center; width:"+ $("#2td").width()+"px'>"+
									secondcolumn +
								"</td>" +
								"<td style='border:1px solid #ccc; word-wrap: break-word; width:"+ $("#3td").width()+"px'>"+$(xml).find("rnn"+k).text() +"</td>" +
								"<td style='border:1px solid #ccc; word-wrap: break-word; width:"+ $("#4td").width()+"px'>"+$(xml).find("iin"+k).text() +"</td>" +
								"<td style='border:1px solid #ccc; word-wrap: break-word; width:"+ $("#5td").width()+"px'>"+$(xml).find("fio"+k).text() +"</td>" +
								"<td style='border:1px solid #ccc; word-wrap: break-word; width:"+ $("#6td").width()+"px'>"+ bussinestype +"</td></tr>");
							}
						}else{
							$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center' colspan='5'> По данному запросу ничего не найдено</td></tr>");
							$("#resultdiv").css("top",$("#fieldsdiv").height());
						}
						endLoadingOutlineNotRefresher();
					}else{
						if($(xml).find("error:contains('Connection refused: connect')").length !=0){
							infoDialog("Отсутствует соединение с сервером")
						}
						if($(xml).find("error:contains('Connection timed out: connect')").length !=0){
							infoDialog("Превышен интервал ожидания")
						}
						$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center' colspan='5'>Произошла ошибка при поиске</td></tr>");
						$("#resultdiv").css("top",$("#fieldsdiv").height());
						endLoadingOutlineNotRefresher();
					}
				},
				complete: function(){
					$("#printtable").empty();
					$("#resultHeaderDataTable tr").clone().appendTo("#printtable");
					$("#resultDataTable tr").clone().appendTo("#printtable");
				},
				error: function(){}
			});
		}
	}
}

function Tax_getDataByFIO_reg(page){
	if($("[name=lastname]").val().length == 0 || $("[name=firstname]").val().length == 0){
		infoDialog("Поля 'Фамилия' и 'Имя' обязательны к заполнению");
	}else{
		if (/^\*/.test($.trim($("input[name=lastname]").val())) || /^\*/.test($.trim($("input[name=firstname]").val())) || /^\*/.test($.trim($("input[name=middlename]").val()))  ) {
			infoDialog("Поле запроса не должно начинаться с символа '*' ");
		}else{
			$.cookie("lastreqview", "fio",{ path:"/", expires:30});	
			$.cookie("firstname", $.trim($("input[name=firstname]").val()),{ path:"/", expires:30});
			$.cookie("middlename", $.trim($("input[name=middlename]").val()),{ path:"/", expires:30});
			$.cookie("lastname", $.trim($("input[name=lastname]").val()),{ path:"/", expires:30});
			$("#resultDataTable tr").remove();
			$("#printtable, #page-nav, #counter, #reqtime").empty();
			pagesize = 20;
			if($.cookie("pagesize") != null){
				pagesize = $.cookie("pagesize");
			}
			loadingOutline();
			var firstname = $.trim($("[name=firstname]").serialize());
			var middlename = $.trim($("[name=middlename]").serialize());
			var lastname = $.trim($("[name=lastname]").serialize());
			$.ajax({
				type: "POST",
				url: 'Provider',
				data: "type=page&id=tax_getdatabyfio_reg&"+firstname+"&"+middlename+"&"+lastname+"&page="+page+"&pagesize="+pagesize+"&onlyxml",
				success: function(xml){
					$("#resultdiv").css("top",$("#fieldsdiv").height()+"px");
					$("#printbutton").css("visibility","visible");
					if ($(xml).find("response").attr("status") !='error'){
						$("#counter").text($(xml).find("root").attr("count"));
						$("#reqtime").text($(xml).find("response").attr("elapsed_time")+" сек");
						if ($(xml).find("root").attr("count") != '0'){
							sumpage= Math.ceil($(xml).find("root").attr("count") / pagesize);
							if (sumpage != 1){
								if(page > 1){
									$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:Tax_getDataByFIO_reg(1)'><<</a>");
								}
								if (sumpage < 11){
									for (var k=1 ; k < sumpage+1; k++){
										if(k == page){
											$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:Tax_getDataByFIO_reg("+k+")'>"+k+"</a>");
										}else{
											$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:Tax_getDataByFIO_reg("+k+")'>"+k+"</a>");
										}
									}
								}
								if (sumpage > 10 && page == 1){
									for (var k=1 ; k < 11; k++){
										if(k == page){
											$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:Tax_getDataByFIO_reg("+k+")'>"+k+"</a>");
										}else{
											$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:Tax_getDataByFIO_reg("+k+")'>"+k+"</a>");
										}
									}
								}
								if (sumpage > 10 && page != 1 && sumpage-page > 9){
									for (var k=page ; k < page+10; k++){
										if(k == page){
											$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:Tax_getDataByFIO_reg("+k+")'>"+k+"</a>");
										}else{
											$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:Tax_getDataByFIO_reg("+k+")'>"+k+"</a>");
										}
									}
								}
								if (sumpage > 10 && page != 1 && sumpage-page <= 9){
									for (var k=sumpage-10 ; k < sumpage+1; k++){
										if(k == page){
											$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:Tax_getDataByFIO_reg("+k+")'>"+k+"</a>");
										}else{
											$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:Tax_getDataByFIO_reg("+k+")'>"+k+"</a>");
										}
									}
								}
								if(page < sumpage){
									$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:Tax_getDataByFIO_reg("+sumpage+")'>>></a>");
								}
							}
							if($(xml).find("root").attr("countelements") < 21){
								count_elements= $(xml).find("root").attr("countelements")
							}else{
								count_elements= $(xml).find("root").attr("count") - ((page-1) * 20) ;
							}
							for (var i=0 ; i < count_elements && i < 20; i++){
								k=i+1;
								getfulldataccess = $(xml).find("root").find("getfulldataccess").text();
								if(getfulldataccess == "true"){
									firstcolumn = "<a onclick='savereqparam()' href='Provider?type=edit&id=regdata&key=&fid="+$(xml).find("id"+k).text() +"&fstatus="+ $(xml).find("status"+k).text()+"'class='doclink' >"+k +"</a>";
									secondcolumn ="<a onclick='savereqparam()' href='Provider?type=edit&id=regdata&key=&fid="+$(xml).find("id"+k).text() +"&fstatus="+ $(xml).find("status"+k).text()+"'class='doclink' >"+$(xml).find("fio"+k).text() +"</a>" ;
								}else{
									firstcolumn ="<font>"+k +"</font>";
									secondcolumn = "<font>"+$(xml).find("fio"+k).text() +"</font>";
								}
								
								$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center; width:"+ $("#1td").width()+"px'>" +
											firstcolumn +
										"</td>" +
									"<td style='border:1px solid #ccc; word-wrap: break-word; width:"+ $("#2td").width()+"px'>"+
										secondcolumn +
									"</td>" +
									"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#3td").width()+"px'>"+$(xml).find("birthdate"+k).text() +"</td>" +
									"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#4td").width()+"px'>"+$(xml).find("rnn"+k).text() +"</td>" +
									"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#5td").width()+"px'>"+$(xml).find("iin"+k).text() +"</td>" +
									"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#6td").width()+"px'>"+$(xml).find("regaddress"+k).text() +"</td>"+
									"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#7td").width()+"px'>"+$(xml).find("realaddress"+k).text() +"</td></tr>");
							}
						}else{
							$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center' colspan='5'> По данному запросу ничего не найдено</td></tr>");
							$("#resultdiv").css("top",$("#fieldsdiv").height());
						}
					endLoadingOutlineNotRefresher();
					}else{
						if($(xml).find("error:contains('Connection refused: connect')").length !=0){
							infoDialog("Отсутствует соединение с сервером")
						}
						if($(xml).find("error:contains('Connection timed out: connect')").length !=0){
							infoDialog("Превышен интервал ожидания")
						}
						$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center' colspan='5'>Произошла ошибка при поиске</td></tr>");
						$("#resultdiv").css("top",$("#fieldsdiv").height());
						endLoadingOutlineNotRefresher();
					}
				},
				complete: function(){
					$("#printtable").empty();
					$("#resultHeaderDataTable tr").clone().appendTo("#printtable");
					$("#resultDataTable tr").clone().appendTo("#printtable");
				},
				error: function(){}
			});
		}
	}
}

function Tax_getDataByIIN_reg(){
	if($("input[name=iin]").val().length != 12){
		infoDialog("Поле 'ИИН' должно содержать 12 символов");
	}else{
		if (/[a-zA-Zа-яА-Я]/.test($("input[name=iin]").val()) ) {
			infoDialog("Поле 'ИИН' может содержать только чиcловые значения");
		}else{
			$.cookie("lastreqview", "iin",{ path:"/", expires:30});	
			$.cookie("iin", $.trim($("input[name=iin]").val()),{ path:"/", expires:30});
			$("#resultDataTable tr").remove();
			$("#printtable, #page-nav, #counter, #reqtime").empty();
			loadingOutline();
			var iin = $.trim($("[name=iin]").serialize());
			$.ajax({
				type: "POST",
				url: 'Provider',
				data: "type=page&id=tax_getdatabyiin_reg&"+iin+"&onlyxml",
				success: function(xml){
					$("#resultdiv").css("top",$("#fieldsdiv").height()+"px");
					$("#printbutton").css("visibility","visible");
					if ($(xml).find("response").attr("status") !='error'){
						if ($(xml).find("root").attr("count") != '0'){
							if($(xml).find("root").attr("count") < 21){
								count_elements= $(xml).find("root").attr("count")
							}else{
								count_elements= $(xml).find("root").attr("count") - ((page-1) * 20) ;
							}
							for (var i=0 ; i < count_elements && i < 20; i++){
								k=i+1;
								getfulldataccess = $(xml).find("root").find("getfulldataccess").text();
								if(getfulldataccess == "true"){
									firstcolumn = "<a onclick='savereqparam()' href='Provider?type=edit&id=regdata&key=&fid="+$(xml).find("id"+k).text() +"&fstatus="+ $(xml).find("status"+k).text()+"'class='doclink' >"+ k +"</a>";
									secondcolumn = "<a onclick='savereqparam()' href='Provider?type=edit&id=regdata&key=&fid="+$(xml).find("id"+k).text() +"&fstatus="+ $(xml).find("status"+k).text()+"'class='doclink' >"+$(xml).find("fio"+k).text() +"</a>" ;
								}else{
									firstcolumn = "<font>"+ k +"</font>";
									secondcolumn ="<font>"+$(xml).find("fio"+k).text() +"</font>";
								}
								$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center; width:"+ $("#1td").width()+"px'>" +
											firstcolumn +
										"</td>" +
									"<td style='border:1px solid #ccc; word-wrap:break-word; text-align:center; width:"+ $("#2td").width()+"px'>"+
										secondcolumn +
									"</td>" +
									"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#3td").width()+"px'>"+$(xml).find("birthdate"+k).text() +"</td>" +
									"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#4td").width()+"px'>"+$(xml).find("rnn"+k).text() +"</td>" +
									"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#5td").width()+"px'>"+$(xml).find("iin"+k).text() +"</td>" +
									"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#6td").width()+"px'>"+$(xml).find("regaddress"+k).text() +"</td>"+
									"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#7td").width()+"px'>"+$(xml).find("realaddress"+k).text() +"</td></tr>");
							}
						}else{
							$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center' colspan='5'> По данному запросу ничего не найдено</td></tr>");
							$("#resultdiv").css("top",$("#fieldsdiv").height());
						}
					endLoadingOutlineNotRefresher();
					}else{
						if($(xml).find("error:contains('Connection refused: connect')").length !=0){
							infoDialog("Отсутствует соединение с сервером")
						}
						if($(xml).find("error:contains('Connection timed out: connect')").length !=0){
							infoDialog("Превышен интервал ожидания")
						}
						$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center' colspan='5'>Произошла ошибка при поиске</td></tr>");
						$("#resultdiv").css("top",$("#fieldsdiv").height());
						endLoadingOutlineNotRefresher();
					}
				},
				complete: function(){
					$("#printtable").empty();
					$("#resultHeaderDataTable tr").clone().appendTo("#printtable");
					$("#resultDataTable tr").clone().appendTo("#printtable");
				},
				error: function(){}
			});
		}
		
	}
}

function Tax_getDataByOrgName_reg(page){
	if($("[name=orgname]").val().length == 0){
		infoDialog("Поле 'Организация' не заполнено");
	}else{
		$.cookie("lastreqview", "orgname",{ path:"/", expires:30});	
		$.cookie("orgname", $.trim($("input[name=orgname]").val()),{ path:"/", expires:30});
		$("#resultDataTable tr").remove();
		$("#printtable, #page-nav, #counter, #reqtime").empty();
		pagesize = 20;
		if($.cookie("pagesize") != null){
			pagesize = $.cookie("pagesize");
		}
		loadingOutline();
		var orgname = $.trim($("[name=orgname]").serialize());
		$.ajax({
			type: "POST",
			url: 'Provider',
			data: "type=page&id=tax_getdatabyorgname_reg&"+orgname+"&page="+page+"&pagesize="+pagesize+"&onlyxml",
			success: function(xml){
				$("#resultdiv").css("top",$("#fieldsdiv").height()+"px");
				$("#printbutton").css("visibility","visible");
				if ($(xml).find("response").attr("status") !='error'){
					$("#counter").text($(xml).find("root").attr("count"));
					$("#reqtime").text($(xml).find("response").attr("elapsed_time")+" сек");
					if ($(xml).find("root").attr("count") != '0'){
						sumpage= Math.ceil($(xml).find("root").attr("count") / pagesize);
						if (sumpage != 1){
							if(page > 1){
								$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:Tax_getDataByOrgName_reg(1)'><<</a>");
							}
							if (sumpage < 11){
								for (var k=1 ; k < sumpage+1; k++){
									if(k == page){
										$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:Tax_getDataByOrgName_reg("+k+")'>"+k+"</a>");
									}else{
										$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:Tax_getDataByOrgName_reg("+k+")'>"+k+"</a>");
									}
								}
							}
							if (sumpage > 10 && page == 1){
								for (var k=1 ; k < 11; k++){
									if(k == page){
										$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:Tax_getDataByOrgName_reg("+k+")'>"+k+"</a>");
									}else{
										$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:Tax_getDataByOrgName_reg("+k+")'>"+k+"</a>");
									}
								}
							}
							if (sumpage > 10 && page != 1 && sumpage-page > 9){
								for (var k=page ; k < page+10; k++){
									if(k == page){
										$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:Tax_getDataByOrgName_reg("+k+")'>"+k+"</a>");
									}else{
										$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:Tax_getDataByOrgName_reg("+k+")'>"+k+"</a>");
									}
								}
							}
							if (sumpage > 10 && page != 1 && sumpage-page <= 9){
								for (var k=sumpage-10 ; k < sumpage+1; k++){
									if(k == page){
										$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:Tax_getDataByOrgName_reg("+k+")'>"+k+"</a>");
									}else{
										$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:Tax_getDataByOrgName_reg("+k+")'>"+k+"</a>");
									}
								}
							}
							if(page < sumpage){
								$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:Tax_getDataByOrgName_reg("+sumpage+")'>>></a>");
							}
						}
						if($(xml).find("root").attr("countelements") < 21){
							count_elements= $(xml).find("root").attr("countelements")
						}else{
							count_elements= $(xml).find("root").attr("count") - ((page-1) * 20) ;
						}
						for (var i=0 ; i < count_elements && i < 20; i++){
							k=i+1;
							getfulldataccess = $(xml).find("root").find("getfulldataccess").text();
							if (getfulldataccess == "true"){
								firstcolumn = "<a onclick='savereqparam()' href='Provider?type=edit&id=regdataorg&key=&fid="+$(xml).find("id"+k).text() +"&fstatus="+ $(xml).find("status"+k).text()+"'class='doclink' >"+k +"</a>";
								secondcolumn = "<a onclick='savereqparam()' href='Provider?type=edit&id=regdataorg&key=&fid="+$(xml).find("id"+k).text() +"&fstatus="+ $(xml).find("status"+k).text()+"'class='doclink' >"+$(xml).find("fio"+k).text() +"</a>";
							}else{
								firstcolumn = "<font>"+k +"</font>";
								secondcolumn = "<font>"+$(xml).find("fio"+k).text() +"</font>";
							}
							
							$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center; width:"+ $("#1td").width()+"px'>" +
										firstcolumn +
									"</td>" +
								"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#2td").width()+"px'>"+
									secondcolumn +
								"</td>" +
								"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#3td").width()+"px'>"+$(xml).find("birthdate"+k).text() +"</td>" +
								"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#4td").width()+"px'>"+$(xml).find("rnn"+k).text() +"</td>" +
								"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#5td").width()+"px'>"+$(xml).find("regaddress"+k).text() +"</td>"+
								"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#6td").width()+"px'>"+$(xml).find("realaddress"+k).text() +"</td></tr>");
						}
					}else{
						$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center' colspan='5'> По данному запросу ничего не найдено</td></tr>");
						$("#resultdiv").css("top",$("#fieldsdiv").height());
					}
				endLoadingOutlineNotRefresher();
				}else{
					if($(xml).find("error:contains('Connection refused: connect')").length !=0){
						infoDialog("Отсутствует соединение с сервером")
					}
					if($(xml).find("error:contains('Connection timed out: connect')").length !=0){
						infoDialog("Превышен интервал ожидания")
					}
					$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center' colspan='5'>Произошла ошибка при поиске</td></tr>");
					$("#resultdiv").css("top",$("#fieldsdiv").height());
					endLoadingOutlineNotRefresher();
				}
			},
			complete: function(){
				$("#printtable").empty();
				$("#resultHeaderDataTable tr").clone().appendTo("#printtable");
				$("#resultDataTable tr").clone().appendTo("#printtable");
			},
			error: function(){}
		});
	}
}

function UDP_getDataByFIO(page){
	if($("[name=lastname]").val().length == 0 || $("[name=firstname]").val().length == 0){
		infoDialog("Поля 'Фамилия' и 'Имя' обязательны к заполнению");
	}else{
		if (/^\*/.test($.trim($("input[name=lastname]").val())) || /^\*/.test($.trim($("input[name=firstname]").val())) || /^\*/.test($.trim($("input[name=middlename]").val()))  ) {
			infoDialog("Поле запроса не должно начинаться с символа '*' ");
		}else{
			$.cookie("lastreqview", "fio",{ path:"/", expires:30});	
			$.cookie("firstname", $.trim($("input[name=firstname]").val()),{ path:"/", expires:30});
			$.cookie("middlename", $.trim($("input[name=middlename]").val()),{ path:"/", expires:30});
			$.cookie("lastname", $.trim($("input[name=lastname]").val()),{ path:"/", expires:30});
			$("#resultDataTable tr").remove();
			$("#printtable, #page-nav, #counter, #reqtime").empty();
			pagesize = 20;
			if($.cookie("pagesize") != null){
				pagesize = $.cookie("pagesize");
			}
			loadingOutline();
			var firstname = $.trim($("[name=firstname]").serialize());
			var middlename = $.trim($("[name=middlename]").serialize());
			var lastname = $.trim($("[name=lastname]").serialize());
			$.ajax({
				type: "POST",
				url: 'Provider',
				data: "type=page&id=udp_getdatabyfio&"+firstname+"&"+middlename+"&"+lastname+"&page="+page+"&pagesize="+pagesize+"&onlyxml",
				success: function(xml){
					$("#resultdiv").css("top",$("#fieldsdiv").height()+"px");
					$("#printbutton").css("visibility","visible");
					if ($(xml).find("response").attr("status") !='error'){
						$("#counter").text($(xml).find("root").attr("count"));
						$("#reqtime").text($(xml).find("response").attr("elapsed_time")+" сек");
						if ($(xml).find("root").attr("count") != '0'){
							sumpage= Math.ceil($(xml).find("root").attr("count") / pagesize);
							if (sumpage != 1){
								if(page > 1){
									$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UDP_getDataByFIO(1)'><<</a>");
								}
								if (sumpage < 11){
									for (var k=1 ; k < sumpage+1; k++){
										if(k == page){
											$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:UDP_getDataByFIO("+k+")'>"+k+"</a>");
										}else{
											$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UDP_getDataByFIO("+k+")'>"+k+"</a>");
										}
									}
								}
								if (sumpage > 10 && page == 1){
									for (var k=1 ; k < 11; k++){
										if(k == page){
											$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:UDP_getDataByFIO("+k+")'>"+k+"</a>");
										}else{
											$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UDP_getDataByFIO("+k+")'>"+k+"</a>");
										}
									}
								}
								if (sumpage > 10 && page != 1 && sumpage-page > 9){
									for (var k=page ; k < page+10; k++){
										if(k == page){
											$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:UDP_getDataByFIO("+k+")'>"+k+"</a>");
										}else{
											$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UDP_getDataByFIO("+k+")'>"+k+"</a>");
										}
									}
								}
								if (sumpage > 10 && page != 1 && sumpage-page <= 9){
									for (var k=sumpage-10 ; k < sumpage+1; k++){
										if(k == page){
											$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:UDP_getDataByFIO("+k+")'>"+k+"</a>");
										}else{
											$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UDP_getDataByFIO("+k+")'>"+k+"</a>");
										}
									}
								}
								if(page < sumpage){
									$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UDP_getDataByFIO("+sumpage+")'>>></a>");
								}
							}
							if($(xml).find("root").attr("countelements") < 21){
								count_elements= $(xml).find("root").attr("countelements")
							}else{
								count_elements= $(xml).find("root").attr("count") - ((page-1) * 20) ;
							}
							for (var i=0 ; i < count_elements && i < 20; i++){
								k=i+1; 
								getfulldataccess = $(xml).find("root").find("getfulldataccess").text();
								if(getfulldataccess == "true"){
									firstcolumn = "<a onclick='savereqparam()' href='Provider?type=page&id=udp_form_getlistautobyid&key=&fid="+$(xml).find("id"+k).text() +"&fstatus="+ $(xml).find("status"+k).text()+"'class='doclink' >"+ k +"</a>";
									secondcolumn = "<a onclick='savereqparam()' href='Provider?type=page&id=udp_form_getlistautobyid&key=&fid="+$(xml).find("id"+k).text() +"&fstatus="+ $(xml).find("status"+k).text()+"'class='doclink' >"+ $(xml).find("fio"+k).text() +"</a>";
								}else{
									firstcolumn = "<font>"+ k +"</font>";
									secondcolumn = "<font>"+ $(xml).find("fio"+k).text() +"</font>";
								}
								$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center; width:"+ $("#1td").width()+"px'>" +
											firstcolumn + 
										"</td>" +
								"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#2td").width()+"px'>"+
									secondcolumn +
								"</td>" +
								"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#3td").width()+"px'>"+$(xml).find("birthdate"+k).text() +"</td>" +
								"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#4td").width()+"px'>"+$(xml).find("address"+k).text() +"</td>" +
								"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#5td").width()+"px'>"+$(xml).find("phone"+k).text() +"</td>" +
								"</tr>");
							}
						}else{
							$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center' colspan='5'> По данному запросу ничего не найдено</td></tr>");
							$("#resultdiv").css("top",$("#fieldsdiv").height());
						}
						endLoadingOutlineNotRefresher();
					}else{
						if($(xml).find("error:contains('Connection refused: connect')").length !=0){
							infoDialog("Отсутствует соединение с сервером")
						}
						if($(xml).find("error:contains('Connection timed out: connect')").length !=0){
							infoDialog("Превышен интервал ожидания")
						}
						$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center' colspan='5'>Произошла ошибка при поиске</td></tr>");
						$("#resultdiv").css("top",$("#fieldsdiv").height());
						endLoadingOutlineNotRefresher();
					}
				},
				complete: function(){
					$("#printtable").empty();
					$("#resultHeaderDataTable tr").clone().appendTo("#printtable");
					$("#resultDataTable tr").clone().appendTo("#printtable");
				},
				error: function(){}
			});
		}
	}
}

	
function UDP_getDataByIIN(){
		if($.trim($("input[name=iin]").val()).length != 12){
			infoDialog("Поле 'ИИН' должно содержать 12 символов");
		}else{
			if (/[a-zA-Zа-яА-Я]/.test($("input[name=iin]").val()) ) {
				infoDialog("Поле 'ИИН' может содержать только чиcловые значения");
			}else{
				$.cookie("lastreqview", "iin",{ path:"/", expires:30});	
				$.cookie("iin", $.trim($("input[name=iin]").val()),{ path:"/", expires:30});
				$("#resultDataTable tr").remove();
				$("#printtable, #page-nav, #counter, #reqtime").empty();
				loadingOutline();
				var iin = $.trim($("[name=iin]").serialize());
				$.ajax({
					type: "POST",
					url: 'Provider',
					data: "type=page&id=udp_getdatabyiin&"+iin+"&onlyxml",
					success: function(xml){
						$("#resultdiv").css("top",$("#fieldsdiv").height()+"px");
						$("#printbutton").css("visibility","visible");
						if ($(xml).find("response").attr("status") !='error' && $(xml).find("response").find("error").length == 0){
							$("#counter").text($(xml).find("root").attr("count"));
							$("#reqtime").text($(xml).find("response").attr("elapsed_time")+" сек");
							if ($(xml).find("root").attr("count") != '0'){
								if($(xml).find("root").attr("count") < 21){
									count_elements= $(xml).find("root").attr("count")
								}else{
									count_elements= $(xml).find("root").attr("count") - ((page-1) * 20) ;
								}
								for (var i=0 ; i < count_elements && i < 20; i++){
									k=i+1;
									getfulldataccess = $(xml).find("root").find("getfulldataccess").text();
									if(getfulldataccess == "true"){
										firstcolumn = "<a onclick='savereqparam()' href='Provider?type=page&id=udp_form_getlistautobyid&key=&fid="+$(xml).find("id"+k).text() +"&fstatus="+ $(xml).find("status"+k).text()+"'class='doclink' >"+ k +"</a>";
										secondcolumn = "<a onclick='savereqparam()' href='Provider?type=page&id=udp_form_getlistautobyid&key=&fid="+$(xml).find("id"+k).text() +"&fstatus="+ $(xml).find("status"+k).text()+"'class='doclink' >"+ $(xml).find("fio"+k).text() +"</a>";
									}else{
										firstcolumn = "<font>"+ k +"</font>";
										secondcolumn = "<font>"+ $(xml).find("fio"+k).text() +"</font>";
									} 
									$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center; width:"+ $("#1td").width()+"px'>" +
											 firstcolumn +
											"</td>" +
									"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#2td").width()+"px'>"+
										secondcolumn +
									"</td>" +
									"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#3td").width()+"px'>"+$(xml).find("birthdate"+k).text().replace(/null/,' ') +"</td>" +
									"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#4td").width()+"px'>"+$(xml).find("address"+k).text().replace(/null/,' ') +"</td>" +
									"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#5td").width()+"px'>"+$(xml).find("phone"+k).text().replace(/null/,' ') +"</td>" +
									"</tr>");
								}
							}else{
								$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center' colspan='5'> По данному запросу ничего не найдено</td></tr>");
								$("#resultdiv").css("top",$("#fieldsdiv").height());
							}
						endLoadingOutlineNotRefresher();
						}else{
							if($(xml).find("error:contains('Connection refused: connect')").length !=0){
								infoDialog("Отсутствует соединение с сервером")
							}
							if($(xml).find("error:contains('Connection timed out: connect')").length !=0){
								infoDialog("Превышен интервал ожидания")
							}
							$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center' colspan='5'>Произошла ошибка при поиске</td></tr>");
							$("#resultdiv").css("top",$("#fieldsdiv").height());
							endLoadingOutlineNotRefresher();
						}
					},
					complete: function(){
						$("#printtable").empty();
						$("#resultHeaderDataTable tr").clone().appendTo("#printtable");
						$("#resultDataTable tr").clone().appendTo("#printtable");
						// blockWaiting.destroy();
					},
					error: function(){
						
					}
				});
			}
		}
	}


function UDP_getDataByGRNZ(page){
	if($("input[name=grnz]").val().length < 3){
		infoDialog("Поле 'Гос. номер' должно содержать не менее 3 символов");
	}else{
		$.cookie("lastreqview", "grnz",{ path:"/", expires:30});	
		$.cookie("grnz", $.trim($("input[name=grnz]").val()),{ path:"/", expires:30});
		$("#resultDataTable tr").remove();
		$("#printtable, #page-nav, #counter, #reqtime").empty();
		pagesize = 20;
		if($.cookie("pagesize") != null){
			pagesize = $.cookie("pagesize");
		}
			loadingOutline();
			var grnz = $.trim($("[name=grnz]").serialize());
			$.ajax({
				type: "POST",
				url: 'Provider',
				data: "type=page&id=udp_getdatabygrnz&"+grnz+"&page="+page+"&pagesize="+pagesize+"&onlyxml",
				success: function(xml){
					$("#resultdiv").css("top",$("#fieldsdiv").height()+"px");
					$("#printbutton").css("visibility","visible");
					if ($(xml).find("response").attr("status") !='error'){
						if ($(xml).find("root").attr("count") != '0'){
							$("#page-nav").html('');
							$("#counter").text($(xml).find("root").attr("count"));
							$("#reqtime").text($(xml).find("response").attr("elapsed_time")+" сек");
							sumpage= Math.ceil($(xml).find("root").attr("count") / pagesize);
							if (sumpage != 1){
								if(page > 1){
									$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UDP_getDataByGRNZ(1)'><<</a>");
								}
								if (sumpage < 11){
									for (var k=1 ; k < sumpage+1; k++){
										if(k == page){
											$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:UDP_getDataByGRNZ("+k+")'>"+k+"</a>");
										}else{
											$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UDP_getDataByGRNZ("+k+")'>"+k+"</a>");
										}
									}
								}
								if (sumpage > 10 && page == 1){
									for (var k=1 ; k < 11; k++){
										if(k == page){
											$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:UDP_getDataByGRNZ("+k+")'>"+k+"</a>");
										}else{
											$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UDP_getDataByGRNZ("+k+")'>"+k+"</a>");
										}
									}
								}
								if (sumpage > 10 && page != 1 && sumpage-page > 9){
									for (var k=page ; k < page+10; k++){
										if(k == page){
											$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:UDP_getDataByGRNZ("+k+")'>"+k+"</a>");
										}else{
											$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UDP_getDataByGRNZ("+k+")'>"+k+"</a>");
										}
									}
								}
								if (sumpage > 10 && page != 1 && sumpage-page <= 9){
									for (var k=sumpage-10 ; k < sumpage+1; k++){
										if(k == page){
											$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:UDP_getDataByGRNZ("+k+")'>"+k+"</a>");
										}else{
											$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UDP_getDataByGRNZ("+k+")'>"+k+"</a>");
										}
									}
								}
								if(page < sumpage){
									$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UDP_getDataByGRNZ("+sumpage+")'>>></a>");
								}
							}
							if($(xml).find("root").attr("countelements") < 21){
								count_elements= $(xml).find("root").attr("countelements")
							}else{
								count_elements= $(xml).find("root").attr("count") - ((page-1) * 20) ;
							}
							for (var i=0 ; i < count_elements && i < 20; i++){
								k=i+1;
								getfulldataccess = $(xml).find("root").find("getfulldataccess").text();
								if(getfulldataccess == "true"){
									firstcolumn = "<a onclick='savereqparam()' href='Provider?type=page&id=udp_form_getdatabyregid&key=&srts="+$(xml).find("id"+k).text()+"' class='doclink' >"+ k +"</a>";
									secondcolumn ="<a onclick='savereqparam()' href='Provider?type=page&id=udp_form_getdatabyregid&key=&srts="+$(xml).find("id"+k).text()+"' class='doclink' >"+ $(xml).find("grnz"+k).text() +"</a>";
								}else{
									firstcolumn = "<font>"+ k +"</font>";
									secondcolumn ="<font>"+ $(xml).find("grnz"+k).text() +"</font>";
								}
								$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center; width:"+ $("#1td").width()+"px'>" +
											firstcolumn +
										"</td>" +
										"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#2td").width()+"px'>"+
											secondcolumn +
										"</td>" +
										"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#3td").width()+"px'>"+$(xml).find("model"+k).text().replace(/null/,' ') +"</td>" +
										"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#4td").width()+"px'>"+$(xml).find("year"+k).text().replace(/null/,' ') +"</td>" +
										"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#5td").width()+"px'>"+$(xml).find("srts"+k).text().replace(/null/,' ') +"</td>" +
								"</tr>");
							}
						}else{
							$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center' colspan='5'> По данному запросу ничего не найдено</td></tr>");
							$("#resultdiv").css("top",$("#fieldsdiv").height());
						}
						endLoadingOutlineNotRefresher();
					}else{
						if($(xml).find("error:contains('Connection refused: connect')").length !=0){
							infoDialog("Отсутствует соединение с сервером")
						}
						if($(xml).find("error:contains('Connection timed out: connect')").length !=0){
							infoDialog("Превышен интервал ожидания")
						}
						$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center' colspan='5'>Произошла ошибка при поиске</td></tr>");
						$("#resultdiv").css("top",$("#fieldsdiv").height());
						endLoadingOutlineNotRefresher();
					}
				},
				complete: function(){
					$("#printtable").empty();
					$("#resultHeaderDataTable tr").clone().appendTo("#printtable");
					$("#resultDataTable tr").clone().appendTo("#printtable");
				},
				error: function(){}
			});
	}
}

function UDP_getDataByOrgName(page){
	if($("input[name=orgname]").val().length < 1){
		infoDialog("Поле 'наименование организации' должно содержать не менее 1 символа");
	}else{
		$.cookie("lastreqview", "orgname",{ path:"/", expires:30});	
		$.cookie("orgname", $.trim($("input[name=orgname]").val()),{ path:"/", expires:30});
		$("#resultDataTable tr").remove();
		$("#printtable, #page-nav, #counter, #reqtime").empty();
		pagesize = 20;
		if($.cookie("pagesize") != null){
			pagesize = $.cookie("pagesize");
		}
		loadingOutline();
		var orgname = $.trim($("[name=orgname]").serialize());
		$.ajax({
			type: "POST",
			url: 'Provider',
			data: "type=page&id=udp_getdatabyorgname&"+orgname+"&page="+page+"&pagesize="+pagesize+"&onlyxml",
			success: function(xml){
				$("#resultdiv").css("top",$("#fieldsdiv").height()+"px");
				$("#printbutton").css("visibility","visible");
				if ($(xml).find("response").attr("status") !='error'){
					if ($(xml).find("root").attr("count") != '0'){
						$("#page-nav").html('');
						$("#counter").text($(xml).find("root").attr("count"));
						$("#reqtime").text($(xml).find("response").attr("elapsed_time")+" сек");
						sumpage= Math.ceil($(xml).find("root").attr("count") / pagesize);
						if (sumpage != 1){
							if(page > 1){
								$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UDP_getDataByOrgName(1)'><<</a>");
							}
							if (sumpage < 11){
								for (var k=1 ; k < sumpage+1; k++){
									if(k == page){
										$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:UDP_getDataByOrgName("+k+")'>"+k+"</a>");
									}else{
										$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UDP_getDataByOrgName("+k+")'>"+k+"</a>");
									}
								}
							}
							if (sumpage > 10 && page == 1){
								for (var k=1 ; k < 11; k++){
									if(k == page){
										$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:UDP_getDataByOrgName("+k+")'>"+k+"</a>");
									}else{
										$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UDP_getDataByOrgName("+k+")'>"+k+"</a>");
									}
								}
							}
							if (sumpage > 10 && page != 1 && sumpage-page > 9){
								for (var k=page ; k < page+10; k++){
									if(k == page){
										$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:UDP_getDataByOrgName("+k+")'>"+k+"</a>");
									}else{
										$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UDP_getDataByOrgName("+k+")'>"+k+"</a>");
									}
								}
							}
							if (sumpage > 10 && page != 1 && sumpage-page <= 9){
								for (var k=sumpage-10 ; k < sumpage+1; k++){
									if(k == page){
										$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:UDP_getDataByOrgName("+k+")'>"+k+"</a>");
									}else{
										$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UDP_getDataByOrgName("+k+")'>"+k+"</a>");
									}
								}
							}
							if(page < sumpage){
								$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UDP_getDataByOrgName("+sumpage+")'>>></a>");
							}
						}
						if($(xml).find("root").attr("countelements") < 21){
							count_elements= $(xml).find("root").attr("countelements")
						}else{
							count_elements= $(xml).find("root").attr("count") - ((page-1) * 20) ;
						}
						for (var i=0 ; i < count_elements && i < 20; i++){
							k=i+1;
							getfulldataccess = $(xml).find("root").find("getfulldataccess").text();
							if(getfulldataccess == "true"){
								firstcolumn = "<a onclick='savereqparam()' href='Provider?type=page&id=udp_form_getlistautobyid&key=&fid="+$(xml).find("id"+k).text() +"&fstatus="+ $(xml).find("status"+k).text()+"'class='doclink' >"+ k +"</a>" ;
								secondcolumn = "<a onclick='savereqparam()' href='Provider?type=page&id=udp_form_getlistautobyid&key=&fid="+$(xml).find("id"+k).text() +"&fstatus="+ $(xml).find("status"+k).text()+"'class='doclink' >"+ $(xml).find("lastName"+k).text() +"</a>"; 
							}else{
								firstcolumn = "<font>"+ k +"</font>";
								secondcolumn = "<font>"+ $(xml).find("lastName"+k).text() +"</font>"; 
							}
							$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center; width:"+ $("#1td").width()+"px'>" +
										firstcolumn +
									"</td>" +
									"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#2td").width()+"px'>"+
										secondcolumn + 
									"</td>" +
									"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#3td").width()+"px'>"+$(xml).find("birthDate"+k).text().replace(/null/,' ') +"</td>" +
									"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#4td").width()+"px'>"+$(xml).find("rnn"+k).text().replace(/null/,' ') +"</td>" +
									"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#5td").width()+"px'>"+$(xml).find("address"+k).text().replace(/null/,' ') +"</td>" +
									"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#6td").width()+"px'>"+$(xml).find("phone"+k).text().replace(/null/,' ') +"</td>" +
									"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#7td").width()+"px'>"+$(xml).find("okpo"+k).text().replace(/null/,' ') +"</td>" +
							"</tr>");
						}
					}else{
						$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center' colspan='5'> По данному запросу ничего не найдено</td></tr>");
						$("#resultdiv").css("top",$("#fieldsdiv").height());
					}
					endLoadingOutlineNotRefresher();
				}else{
					if($(xml).find("error:contains('Connection refused: connect')").length !=0){
						infoDialog("Отсутствует соединение с сервером")
					}
					if($(xml).find("error:contains('Connection timed out: connect')").length !=0){
						infoDialog("Превышен интервал ожидания")
					}
					$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center' colspan='5'>Произошла ошибка при поиске</td></tr>");
					$("#resultdiv").css("top",$("#fieldsdiv").height());
					endLoadingOutlineNotRefresher();
				}
			},
			complete: function(){
				$("#printtable").empty();
				$("#resultHeaderDataTable tr").clone().appendTo("#printtable");
				$("#resultDataTable tr").clone().appendTo("#printtable");
			},
			error: function(){}
		});
	}
}

function UDP_getDataBySRTS(){
	if($("input[name=srtsnumber]").val().length != 8){
		infoDialog("Поле 'Номер' должно содержать 8 символов");
	}else{
		if($("input[name=srtsserial]").val().length != 2){
			infoDialog("Поле 'Серия' должно содержать 2 символа");
		}else{
			$.cookie("lastreqview", "srts",{ path:"/", expires:30});	
			$.cookie("srtsserial", $.trim($("input[name=srtsserial]").val()),{ path:"/", expires:30});
			$.cookie("srtsnumber", $.trim($("input[name=srtsnumber]").val()),{ path:"/", expires:30});
			$("#resultDataTable tr").remove();
			$("#printtable, #page-nav, #counter, #reqtime").empty();
			loadingOutline();
			var srtsserial = $.trim($("[name=srtsserial]").serialize());
			var srtsnumber = $.trim($("[name=srtsnumber]").serialize());
			$.ajax({
				type: "POST",
				url: 'Provider',
				data: "type=page&id=udp_getdatabysrts&"+srtsserial+"&"+srtsnumber+"&onlyxml",
				success: function(xml){
					$("#resultdiv").css("top",$("#fieldsdiv").height()+"px");
					$("#printbutton").css("visibility","visible");
					if ($(xml).find("response").attr("status") !='error'){
						if ($(xml).find("root").attr("count") != '0'){
							if($(xml).find("root").attr("count") < 21){
								count_elements= $(xml).find("root").attr("count")
							}else{
								count_elements= $(xml).find("root").attr("count") - ((page-1) * 20) ;
							}
							for (var i=0 ; i < count_elements && i < 20; i++){
								k=i+1;
								getfulldataccess = $(xml).find("root").find("getfulldataccess").text();
								if(getfulldataccess = "true"){
									firstcolumn = "<a onclick='savereqparam()' href='Provider?type=page&id=udp_form_getdatabyregid&key=&srts="+$(xml).find("id"+k).text()+"' class='doclink' >"+ k +"</a>";
									secondcolumn = "<a onclick='savereqparam()' href='Provider?type=page&id=udp_form_getdatabyregid&key=&srts="+$(xml).find("id"+k).text()+"' class='doclink' >"+ $(xml).find("grnz"+k).text() +"</a>";
								}else{
									firstcolumn = "<font>"+ k +"</font>";
									secondcolumn = "<font>"+ $(xml).find("grnz"+k).text() +"</font>";
								}
								$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center; width:"+ $("#1td").width()+"px'>" +
											firstcolumn +
										"</td>" +
										"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#2td").width()+"px'>"+
											secondcolumn +
										"</td>" +
										"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#3td").width()+"px'>"+$(xml).find("model"+k).text().replace(/null/,' ') +"</td>" +
										"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#4td").width()+"px'>"+$(xml).find("year"+k).text().replace(/null/,' ') +"</td>" +
										"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#5td").width()+"px'>"+$(xml).find("srts"+k).text().replace(/null/,' ') +"</td>" +
								"</tr>");
							}
						}else{
							$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center' colspan='5'> По данному запросу ничего не найдено</td></tr>");
							$("#resultdiv").css("top",$("#fieldsdiv").height());
						}
						endLoadingOutlineNotRefresher();
					}else{
						if($(xml).find("error:contains('Connection refused: connect')").length !=0){
							infoDialog("Отсутствует соединение с сервером")
						}
						if($(xml).find("error:contains('Connection timed out: connect')").length !=0){
							infoDialog("Превышен интервал ожидания")
						}
						$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center' colspan='5'>Произошла ошибка при поиске</td></tr>");
						$("#resultdiv").css("top",$("#fieldsdiv").height());
						endLoadingOutlineNotRefresher();
					}
				},
				complete: function(){
					$("#printtable").empty();
					$("#resultHeaderDataTable tr").clone().appendTo("#printtable");
					$("#resultDataTable tr").clone().appendTo("#printtable");
				},
				error: function(){}
			});
		}
			
	}
}

function BTI_getDataByFIO(page){
	if($.trim($("[name=lastname]").val()).length < 1 || $.trim($("[name=firstname]").val()).length < 1 ){
		infoDialog("Поля 'Фамилия' и 'Имя' обязательны к заполнению и должны содержать минимум 2 знака ");
	}else{
		if (/^\*/.test($.trim($("input[name=lastname]").val())) || /^\*/.test($.trim($("input[name=firstname]").val())) || /^\*/.test($.trim($("input[name=middlename]").val()))  ) {
			infoDialog("Поле запроса не должно начинаться с символа '*' ");
		}else{
			$.cookie("lastreqview", "fio",{ path:"/", expires:30});	
			$.cookie("firstname", $.trim($("input[name=firstname]").val()),{ path:"/", expires:30});
			$.cookie("middlename", $.trim($("input[name=middlename]").val()),{ path:"/", expires:30});
			$.cookie("lastname", $.trim($("input[name=lastname]").val()),{ path:"/", expires:30});
			$("#resultDataTable tr").remove();
			$("#printtable, #page-nav, #counter, #reqtime").empty();
			loadingOutline();
			var firstname = $.trim($("[name=firstname]").serialize());
			var middlename = $.trim($("[name=middlename]").serialize());
			var lastname = $.trim($("[name=lastname]").serialize());
			pagesize = 20;
			$.ajax({
				type: "POST",
				url: 'Provider',
				data: "type=page&id=bti_getdatabyfio&"+firstname+"&"+middlename+"&"+lastname+"&page="+page+"&pagesize="+pagesize+"&onlyxml",
				success: function(xml){
					$("#resultdiv").css("top",$("#fieldsdiv").height()+"px");
					$("#printbutton").css("visibility","visible");
					if ($(xml).find("response").attr("status") !='error'){
						$("#page-nav").html('');
						$("#counter").text($(xml).find("root").attr("count"));
						$("#reqtime").text($(xml).find("response").attr("elapsed_time")+" сек");
						sumpage= Math.ceil($(xml).find("root").attr("count") / pagesize);
						if (sumpage != 1){
							if(page > 1){
								$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:BTI_getDataByFIO(1)'><<</a>");
							}
							if (sumpage < 11){
								for (var k=1 ; k < sumpage+1; k++){
									if(k == page){
										$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:BTI_getDataByFIO("+k+")'>"+k+"</a>");
									}else{
										$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:BTI_getDataByFIO("+k+")'>"+k+"</a>");
									}
								}
							}
							if (sumpage > 10 && page == 1){
								for (var k=1 ; k < 11; k++){
									if(k == page){
										$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:BTI_getDataByFIO("+k+")'>"+k+"</a>");
									}else{
										$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:BTI_getDataByFIO("+k+")'>"+k+"</a>");
									}
								}
							}
							if (sumpage > 10 && page != 1 && sumpage-page > 9){
								for (var k=page ; k < page+10; k++){
									if(k == page){
										$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:BTI_getDataByFIO("+k+")'>"+k+"</a>");
									}else{
										$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:BTI_getDataByFIO("+k+")'>"+k+"</a>");
									}
								}
							}
							if (sumpage > 10 && page != 1 && sumpage-page <= 9){
								for (var k=sumpage-10 ; k < sumpage+1; k++){
									if(k == page){
										$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:BTI_getDataByFIO("+k+")'>"+k+"</a>");
									}else{
										$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:BTI_getDataByFIO("+k+")'>"+k+"</a>");
									}
								}
							}
							if(page < sumpage){
								$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:BTI_getDataByFIO("+sumpage+")'>>></a>");
							}
						}
						if ($(xml).find("root").attr("count") != '0'){
							
							if($(xml).find("root").attr("count") < 21){
								count_elements= $(xml).find("root").attr("count")
							}else{
								count_elements= $(xml).find("root").attr("count") - (page * 20) ;
							}
							for (var i=0 ; i < count_elements && i < 20; i++){
								k=i+1;
								getfulldataccess = $(xml).find("root").find("getfulldataccess").text();
								if($(xml).find("id"+k).length != 0){
									if(getfulldataccess =="true"){
										firstcolumn= "<a onclick='savereqparam()' href='Provider?type=page&id=bti_form_getdatabyownerid&key=&ownerid="+$(xml).find("id"+k).text() +"&ownerstatus="+ $(xml).find("status"+k).text()+"'class='doclink' >"+ k +"</a>";
										secondcolumn = "<a onclick='savereqparam()' href='Provider?type=page&id=bti_form_getdatabyownerid&key=&ownerid="+$(xml).find("id"+k).text() +"&ownerstatus="+ $(xml).find("status"+k).text()+"'class='doclink' >"+ $(xml).find("fio"+k).text() +"</a>";
									}else{
										firstcolumn = "<font onclick='savereqparam()' href='Provider?type=page&id=bti_form_getdatabyownerid&key=&ownerid="+$(xml).find("id"+k).text() +"&ownerstatus="+ $(xml).find("status"+k).text()+"'class='doclink' >"+ k +"</font>";
										secondcolumn ="<font>"+ $(xml).find("fio"+k).text() +"</font>";
									}
									$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center; width:"+ $("#1td").width()+"px'>" +
											firstcolumn +
											"</td>" +
											"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#2td").width()+"px'>"+
											secondcolumn +
											"</td>" +
											"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#3td").width()+"px'>"+$(xml).find("iin"+k).text() +"</td>" +
											"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#4td").width()+"px'>"+$(xml).find("birthdate"+k).text() +"</td>" +
											"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#5td").width()+"px'>"+$(xml).find("doctype"+k).text() +"</td>" +
											"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#6td").width()+"px'>"+$(xml).find("docnumber"+k).text() +"</td>" +
											"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#7td").width()+"px'>"+$(xml).find("address"+k).text() +"</td>" +
									"</tr>");
								}
								
							}
						}else{
							$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center' colspan='5'> По данному запросу ничего не найдено</td></tr>");
							$("#resultdiv").css("top",$("#fieldsdiv").height());
						}
						endLoadingOutlineNotRefresher();
					}else{
						if($(xml).find("error:contains('Connection refused: connect')").length !=0){
							infoDialog("Отсутствует соединение с сервером")
						}
						if($(xml).find("error:contains('Connection timed out: connect')").length !=0){
							infoDialog("Превышен интервал ожидания")
						}
						$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center' colspan='5'>Произошла ошибка при поиске</td></tr>");
						$("#resultdiv").css("top",$("#fieldsdiv").height());
						endLoadingOutlineNotRefresher();
					}
				},
				complete: function(){
					$("#printtable").empty();
					$("#resultHeaderDataTable tr").clone().appendTo("#printtable");
					$("#resultDataTable tr").clone().appendTo("#printtable");
				},
				error: function(){}
			});
		}
	}
}

function BTI_getDataByIIN(){
	if($("input[name=iin]").val().length != 12){
		infoDialog("Поле 'ИИН' должно содержать 12 символов");
	}else{
		if (/[a-zA-Zа-яА-Я]/.test($("input[name=iin]").val()) ) {
			infoDialog("Поле 'ИИН' может содержать только чиcловые значения");
		}else{
			$.cookie("lastreqview", "iin",{ path:"/", expires:30});	
			$.cookie("iin", $.trim($("input[name=iin]").val()),{ path:"/", expires:30});
			$("#resultDataTable tr").remove();
			$("#printtable, #page-nav, #counter, #reqtime").empty();
			loadingOutline();
			var iin = $.trim($("[name=iin]").serialize());
			$.ajax({
				type: "POST",
				url: 'Provider',
				data: "type=page&id=bti_getdatabyiin&"+iin+"&onlyxml",
				success: function(xml){
					$("#resultdiv").css("top",$("#fieldsdiv").height()+"px");
					$("#printbutton").css("visibility","visible");
					if ($(xml).find("response").attr("status") !='error'){
						if ($(xml).find("root").attr("count") != '0'){
							if($(xml).find("root").attr("count") < 21){
								count_elements= $(xml).find("root").attr("count")
							}else{
								count_elements= $(xml).find("root").attr("count") - ((page-1) * 20) ;
							}
							for (var i=0 ; i < count_elements && i < 20; i++){
								k=i+1;
								getfulldataccess = $(xml).find("root").find("getfulldataccess").text();
								if(getfulldataccess == "true"){
									firstcolumn= "<a onclick='savereqparam()' href='Provider?type=page&id=bti_form_getdatabyownerid&key=&ownerid="+$(xml).find("id"+k).text() +"&ownerstatus="+ $(xml).find("status"+k).text()+"'class='doclink' >"+ k +"</a>";
									secondcolumn = "<a onclick='savereqparam()' href='Provider?type=page&id=bti_form_getdatabyownerid&key=&ownerid="+$(xml).find("id"+k).text() +"&ownerstatus="+ $(xml).find("status"+k).text()+"'class='doclink' >"+ $(xml).find("fio"+k).text() +"</a>";
								}else{
									firstcolumn = "<font>"+ k +"</font>";
									secondcolumn = "<font>"+ $(xml).find("fio"+k).text() +"</font>";
								}
								$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center; width:"+ $("#1td").width()+"px'>" +
										firstcolumn +
									"</td>" +
							"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#2td").width()+"px'>"+
								secondcolumn +
							"</td>" +
							"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#3td").width()+"px'>"+$(xml).find("iin"+k).text() +"</td>" +
							"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#4td").width()+"px'>"+$(xml).find("birthdate"+k).text() +"</td>" +
							"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#5td").width()+"px'>"+$(xml).find("doctype"+k).text() +"</td>" +
							"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#6td").width()+"px'>"+$(xml).find("docnumber"+k).text() +"</td>" +
							"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#7td").width()+"px'>"+$(xml).find("address"+k).text() +"</td>" +
							"</tr>");
							}
						}else{
							$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center' colspan='5'> По данному запросу ничего не найдено</td></tr>");
							$("#resultdiv").css("top",$("#fieldsdiv").height());
						}
					endLoadingOutlineNotRefresher();
					}else{
						if($(xml).find("error:contains('Connection refused: connect')").length !=0){
							infoDialog("Отсутствует соединение с сервером")
						}
						if($(xml).find("error:contains('Connection timed out: connect')").length !=0){
							infoDialog("Превышен интервал ожидания")
						}
						$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center' colspan='5'>Произошла ошибка при поиске</td></tr>");
						$("#resultdiv").css("top",$("#fieldsdiv").height());
						endLoadingOutlineNotRefresher();
					}
				},
				complete: function(){
					$("#printtable").empty();
					$("#resultHeaderDataTable tr").clone().appendTo("#printtable");
					$("#resultDataTable tr").clone().appendTo("#printtable");
				},
				error: function(){}
			});
		}
		
	}
}

function BTI_getDataByAddr(page){
	if($("[name=street]").val().length == 0){
		infoDialog("Поле 'Улица' не заполнено");
	}else{
		if($("[name=house]").val().length == 0){
			infoDialog("Поле 'Дом' не заполнено");
		}else{
			$.cookie("lastreqview", "addr",{ path:"/", expires:30});	
			$.cookie("street", $.trim($("input[name=street]").val()),{ path:"/", expires:30});
			$.cookie("streetid", $.trim($("input[name=streetid]").val()),{ path:"/", expires:30});
			$.cookie("house", $.trim($("input[name=house]").val()),{ path:"/", expires:30});
			$.cookie("flat", $.trim($("input[name=flat]").val()),{ path:"/", expires:30});
			$("#resultDataTable tr").remove();
			$("#printtable, #page-nav, #counter, #reqtime").empty();
			pagesize = 20;
			if($.cookie("pagesize") != null){
				pagesize = $.cookie("pagesize");
			}
			loadingOutline();
			var street = $.trim($("[name=streetid]").serialize());
			var house = $.trim($("[name=house]").serialize());
			var flat = $.trim($("[name=flat]").serialize());
			var buildingkind = $.trim($("[name=buildingkind]").serialize());
				$.ajax({
					type: "POST",
					url: 'Provider',
					data: "type=page&id=bti_getdatabyaddress&"+street+"&"+house+"&"+buildingkind+"&"+flat+"&page="+page+"&pagesize="+pagesize+"&onlyxml",
					success: function(xml){
						$("#resultdiv").css("top",$("#fieldsdiv").height()+"px");
						$("#printbutton").css("visibility","visible");
						if ($(xml).find("response").attr("status") !='error'){
							$("#counter").text($(xml).find("root").attr("count"));
							$("#reqtime").text($(xml).find("response").attr("elapsed_time")+" сек");
							if ($(xml).find("root").attr("count") != '0'){
								sumpage= Math.ceil($(xml).find("root").attr("count") / pagesize);
								if (sumpage != 1){
									if(page > 1){
										$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UMP_getDataByAddr(1)'><<</a>");
									}
									if (sumpage < 11){
										for (var k=1 ; k < sumpage+1; k++){
											if(k == page){
												$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:BTI_getDataByAddr("+k+")'>"+k+"</a>");
											}else{
												$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:BTI_getDataByAddr("+k+")'>"+k+"</a>");
											}
										}
									}
									if (sumpage > 10 && page == 1){
										for (var k=1 ; k < 11; k++){
											if(k == page){
												$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:BTI_getDataByAddr("+k+")'>"+k+"</a>");
											}else{
												$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:BTI_getDataByAddr("+k+")'>"+k+"</a>");
											}
										}
									}
									if (sumpage > 10 && page != 1 && sumpage-page > 9){
										for (var k=page ; k < page+10; k++){
											if(k == page){
												$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:BTI_getDataByAddr("+k+")'>"+k+"</a>");
											}else{
												$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:BTI_getDataByAddr("+k+")'>"+k+"</a>");
											}
										}
									}
									if (sumpage > 10 && page != 1 && sumpage-page <= 9){
										for (var k=sumpage-10 ; k < sumpage+1; k++){
											if(k == page){
												$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:BTI_getDataByAddr("+k+")'>"+k+"</a>");
											}else{
												$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:BTI_getDataByAddr("+k+")'>"+k+"</a>");
											}
										}
									}
									if(page < sumpage){
										$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:BTI_getDataByAddr("+sumpage+")'>>></a>");
									}
								}
								if($(xml).find("root").attr("countelements") < 21){
									count_elements= $(xml).find("root").attr("countelements")
								}else{
									count_elements= $(xml).find("root").attr("count") - ((page-1) * 20) ;
								}
								for (var i=0 ; i < count_elements && i < 20; i++){
									k=i+1;
									getfulldataccess = $(xml).find("root").find("getfulldataccess").text();
									if(getfulldataccess == "true"){
										firstcolumn ="<a onclick='savereqparam()' href='Provider?type=page&id=bti_form_getdatabyownerid&ownerid="+$(xml).find("id"+k).text() +"&ownerstatus="+ $(xml).find("status"+k).text()+"' class='doclink' >"+ k +"</a>";
										secondcolumn = "<a onclick='savereqparam()' href='Provider?type=page&id=bti_form_getdatabyownerid&ownerid="+$(xml).find("id"+k).text() +"&ownerstatus="+ $(xml).find("status"+k).text()+"&docnumber="+"' class='doclink' >"+ $(xml).find("fio"+k).text() +"</a>";
									}else{
										firstcolumn = "<font>"+ k +"</font>";
										secondcolumn = "<font>"+ $(xml).find("fio"+k).text() +"</font>";
									}
										$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center; width:"+ $("#1td").width()+"px'>" +
													firstcolumn + 
												"</td>" +
											"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#2td").width()+"px'>"+
												secondcolumn +
											"</td>" +
											"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#3td").width()+"px'>"+$(xml).find("birthdate"+k).text() +"</td>" +
											"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#7td").width()+"px'>"+$(xml).find("docregdate"+k).text() +"</td>" +
											"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#4td").width()+"px'>"+$(xml).find("dockind"+k).text() +"</td>" +
											"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#5td").width()+"px'>"+$(xml).find("doctype"+k).text() +"</td>" +
											"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#6td").width()+"px'>"+$(xml).find("docnumber"+k).text() +"</td>" +
										"</tr>");
								}
							}else{
								$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center' colspan='5'> По данному запросу ничего не найдено</td></tr>");
								$("#resultdiv").css("top",$("#fieldsdiv").height());
							}
							endLoadingOutlineNotRefresher();
						}else{
							if($(xml).find("error:contains('Connection refused: connect')").length !=0){
								infoDialog("Отсутствует соединение с сервером")
							}
							if($(xml).find("error:contains('Connection timed out: connect')").length !=0){
								infoDialog("Превышен интервал ожидания")
							}
							$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center' colspan='5'>Произошла ошибка при поиске</td></tr>");
							$("#resultdiv").css("top",$("#fieldsdiv").height());
							endLoadingOutlineNotRefresher();
						}
					},
					complete: function(){
						$("#printtable").empty();
						$("#resultHeaderDataTable tr").clone().appendTo("#printtable");
						$("#resultDataTable tr").clone().appendTo("#printtable");
					},
					error: function(){}
				});
			}
	}
}


function BTI_getDataByDoc(page){
if($("[name=dockind]").val() == null && $("[name=dockind]").val() != ''){
		infoDialog("Поле 'Признак' не заполнено");
	}else{
		if($("[name=parentdoctype]").val() == null && $("[name=parentdoctype]").val() != ''){
			infoDialog("Поле 'Тип' не заполнено");
		}else{
			if($("[name=docnumber]").val() == null && $("[name=docnumber]").val() != ''){
				infoDialog("Поле 'Номер' не заполнено");
			}else{
			$.cookie("lastreqview", "addr",{ path:"/", expires:30});	
			$.cookie("dockind", $.trim($("input[name=dockind]").val()),{ path:"/", expires:30});
			$.cookie("parentdoctype", $.trim($("input[name=parentdoctype]").val()),{ path:"/", expires:30});
			$.cookie("docnumber", $.trim($("input[name=docnumber]").val()),{ path:"/", expires:30});
			$("#resultDataTable tr").remove();
			$("#printtable, #page-nav, #counter, #reqtime").empty();
			pagesize = 20;
			if($.cookie("pagesize") != null){
				pagesize = $.cookie("pagesize");
			}
			loadingOutline();
			var dockind = $.trim($("[name=dockind]").serialize());
			var parentdoctype = $.trim($("[name=parentdoctype]").serialize());
			var docnumber = $.trim($("[name=docnumber]").serialize());
				$.ajax({
					type: "POST",
					url: 'Provider',
					data: "type=page&id=bti_getdatabydoc&"+dockind+"&"+parentdoctype+"&"+docnumber+"&page="+page+"&pagesize="+pagesize+"&onlyxml",
					success: function(xml){
						$("#resultdiv").css("top",$("#fieldsdiv").height()+"px");
						$("#printbutton").css("visibility","visible");
						if ($(xml).find("response").attr("status") !='error'){
							$("#counter").text($(xml).find("root").attr("count"));
							$("#reqtime").text($(xml).find("response").attr("elapsed_time")+" сек");
							if ($(xml).find("root").attr("count") != '0'){
								sumpage= Math.ceil($(xml).find("root").attr("count") / pagesize);
								if (sumpage != 1){
									if(page > 1){
										$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:BTI_getDataByDoc(1)'><<</a>");
									}
									if (sumpage < 11){
										for (var k=1 ; k < sumpage+1; k++){
											if(k == page){
												$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:BTI_getDataByDoc("+k+")'>"+k+"</a>");
											}else{
												$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:BTI_getDataByDoc("+k+")'>"+k+"</a>");
											}
										}
									}
									if (sumpage > 10 && page == 1){
										for (var k=1 ; k < 11; k++){
											if(k == page){
												$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:BTI_getDataByDoc("+k+")'>"+k+"</a>");
											}else{
												$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:BTI_getDataByDoc("+k+")'>"+k+"</a>");
											}
										}
									}
									if (sumpage > 10 && page != 1 && sumpage-page > 9){
										for (var k=page ; k < page+10; k++){
											if(k == page){
												$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:BTI_getDataByDoc("+k+")'>"+k+"</a>");
											}else{
												$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:BTI_getDataByDoc("+k+")'>"+k+"</a>");
											}
										}
									}
									if (sumpage > 10 && page != 1 && sumpage-page <= 9){
										for (var k=sumpage-10 ; k < sumpage+1; k++){
											if(k == page){
												$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:BTI_getDataByDoc("+k+")'>"+k+"</a>");
											}else{
												$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:BTI_getDataByDoc("+k+")'>"+k+"</a>");
											}
										}
									}
									if(page < sumpage){
										$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:BTI_getDataByDoc("+sumpage+")'>>></a>");
									}
								}
								if($(xml).find("root").attr("countelements") < 21){
									count_elements= $(xml).find("root").attr("countelements")
								}else{
									count_elements= $(xml).find("root").attr("count") - ((page-1) * 20) ;
								}
								for (var i=0 ; i < count_elements && i < 20; i++){
									k=i+1;
									getfulldataccess = $(xml).find("root").find("getfulldataccess").text();
									if(getfulldataccess == "true"){
										firstcolumn ="<a onclick='savereqparam()' href='Provider?type=page&id=bti_form_getdatabyownerid&ownerid="+$(xml).find("id"+k).text() +"&ownerstatus="+ $(xml).find("status"+k).text()+"' class='doclink'>"+ k +"</a>";
										secondcolumn = "<a onclick='savereqparam()' href='Provider?type=page&id=bti_form_getdatabyownerid&ownerid="+$(xml).find("id"+k).text() +"&ownerstatus="+ $(xml).find("status"+k).text()+"&docnumber="+"' class='doclink'>"+ $(xml).find("fio"+k).text() +"</a>";
									}else{
										firstcolumn = "<font>"+ k +"</font>";
										secondcolumn = "<font>"+ $(xml).find("fio"+k).text() +"</font>";
									}
										$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center; width:"+ $("#1td").width()+"px'>" +
													firstcolumn + 
												"</td>" +
											"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#2td").width()+"px'>"+
												secondcolumn +
											"</td>" +
											"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#3td").width()+"px'>"+$(xml).find("birthdate"+k).text() +"</td>" +
											"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#4td").width()+"px'>"+$(xml).find("buildingkind"+k).text() +"</td>" +
											"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#5td").width()+"px'>"+$(xml).find("street"+k).text() +"</td>" +
											"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#6td").width()+"px'>"+$(xml).find("house"+k).text() +"</td>" +
											"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#7td").width()+"px'>"+$(xml).find("flat"+k).text() +"</td>" +
										"</tr>");
								}
							}else{
								$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center' colspan='5'> По данному запросу ничего не найдено</td></tr>");
								$("#resultdiv").css("top",$("#fieldsdiv").height());
							}
							endLoadingOutlineNotRefresher();
						}else{
							if($(xml).find("error:contains('Connection refused: connect')").length !=0){
								infoDialog("Отсутствует соединение с сервером")
							}
							if($(xml).find("error:contains('Connection timed out: connect')").length !=0){
								infoDialog("Превышен интервал ожидания")
							}
							$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center' colspan='5'>Произошла ошибка при поиске</td></tr>");
							$("#resultdiv").css("top",$("#fieldsdiv").height());
							endLoadingOutlineNotRefresher();
						}
					},
					complete: function(){
						$("#printtable").empty();
						$("#resultHeaderDataTable tr").clone().appendTo("#printtable");
						$("#resultDataTable tr").clone().appendTo("#printtable");
					},
					error: function(){}
				});
			}
		}
	}
}


function loadprevresult(){
	if ($.cookie("loadresult") != null && $.cookie("state") != 'newsession' ){
		$(".inputrequest").each(function(index){
			$(this).val($.cookie($(this).attr("name")));
			$.cookie($(this).attr("name"), null,{path:'/'});
			if ($(".inputrequest").length == index + 1){
				$("#sendrequest").click();
				$.cookie("loadresult", null,{path:'/'});
			}
		});
	}
	$.cookie("state", null,{path:'/'});	
}

function loadprevparamreq(prevview, currentview){
	if (prevview == currentview && $.cookie("state") != 'newsession'){
		if(currentview == "fio"){
			$("input[name=lastname]").val($.cookie("lastname"));
			$("input[name=middlename]").val($.cookie("middlename"));
			$("input[name=firstname]").val($.cookie("firstname"));
			$.cookie("lastname", null,{path:'/'});
			$.cookie("middlename", null,{path:'/'});
			$.cookie("firstname", null,{path:'/'});
		}
		if(currentview == "iin"){
			$("input[name=iin]").val($.cookie("iin"));
			$.cookie("iin", null,{path:'/'});
		}
		if(currentview == "rnn"){
			$("input[name=rnn]").val($.cookie("rnn"));
			$.cookie("rnn", null,{path:'/'});
		}
		if(currentview == "addr"){
			$("input[name=street]").val($.cookie("street"));
			$("input[name=house]").val($.cookie("house"));
			$("input[name=flat]").val($.cookie("flat"));
			$("input[name=flatNumber]").val($.cookie("flatNumber"));
			$.cookie("street", null,{path:'/'});
			$.cookie("house", null,{path:'/'});
			$.cookie("flat", null,{path:'/'});
			$.cookie("flatNumber", null,{path:'/'});
		}
		if(currentview == "orgname"){
			$("input[name=orgname]").val($.cookie("orgname"));
			$.cookie("orgname", null,{path:'/'});
		}
		$.cookie("lastreqview", "none",{ path:"/", expires:30});	
	}else{
		
	}
	if ($.cookie("loadresult") != null){
		$(".inputrequest").each(function(index){
			$(this).val($.cookie($(this).attr("name")));
			$.cookie($(this).attr("name"), null,{path:'/'});
			if ($(".inputrequest").length == index + 1){
				//$("#sendrequest").click()
				$.cookie("loadresult", null,{path:'/'});
			}
		});
		
	}
	$.cookie("state", null,{path:'/'});	
}

function savereqparam(){
	$.cookie("loadresult","true",{ path:"/", expires:30});
	$(".inputrequest").each(function(){
		$.cookie($(this).attr("name"), $.trim($(this).val()),{ path:"/", expires:30});
	});
}


function UMP_getDataByFIO(isCitizen,page){
	if($("[name=lastname]").val().length == 0 || $("[name=firstname]").val().length == 0){
		infoDialog("Поля 'Фамилия' и 'Имя' обязательны к заполнению");
	}else{
		if (/^\*/.test($.trim($("input[name=lastname]").val())) || /^\*/.test($.trim($("input[name=firstname]").val())) || /^\*/.test($.trim($("input[name=middlename]").val()))  ) {
			infoDialog("Поле запроса не должно начинаться с символа '*' ");
		}else{
			$.cookie("lastreqview", "fio",{ path:"/", expires:30});	
			$.cookie("firstname", $.trim($("input[name=firstname]").val()),{ path:"/", expires:30});
			$.cookie("middlename", $.trim($("input[name=middlename]").val()),{ path:"/", expires:30});
			$.cookie("lastname", $.trim($("input[name=lastname]").val()),{ path:"/", expires:30});
			$("#resultDataTable tr").remove();
			$("#printtable, #page-nav, #counter, #reqtime").empty();
			pagesize = 20;
			if($.cookie("pagesize") != null){
				pagesize = $.cookie("pagesize");
			}
			loadingOutline();
			var firstname = $.trim($("[name=firstname]").serialize());
			var middlename = $.trim($("[name=middlename]").serialize());
			var lastname = $.trim($("[name=lastname]").serialize());
			if (isCitizen == 1){
				$.ajax({
					type: "POST",
					url: "Provider",
					data: "type=page&id=ump_gethumanbyfio&"+firstname+"&"+middlename+"&"+lastname+"&iscitizen="+isCitizen+"&page="+page+"&pagesize="+pagesize+"&onlyxml",
					success: function(xml){
						$("#resultdiv").css("top",$("#fieldsdiv").height()+"px");
						$("#printbutton").css("visibility","visible");
						if ($(xml).find("response").attr("status") !='error'){
							$("#counter").text($(xml).find("root").attr("count"));
							$("#reqtime").text($(xml).find("response").attr("elapsed_time")+" сек");
							if ($(xml).find("root").attr("count") != '0'){
								sumpage= Math.ceil($(xml).find("root").attr("count") / pagesize);
								if (sumpage != 1){
									if(page > 1){
										$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UMP_getDataByFIO("+isCitizen+",1)'><<</a>");
									}
									if (sumpage < 11){
										for (var k=1 ; k < sumpage+1; k++){
											if(k == page){
												$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:UMP_getDataByFIO("+isCitizen+","+k+")'>"+k+"</a>");
											}else{
												$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UMP_getDataByFIO("+isCitizen+","+k+")'>"+k+"</a>");
											}
										}
									}
									if (sumpage > 10 && page == 1){
										for (var k=1 ; k < 11; k++){
											if(k == page){
												$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:UMP_getDataByFIO("+isCitizen+","+k+")'>"+k+"</a>");
											}else{
												$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UMP_getDataByFIO("+isCitizen+","+k+")'>"+k+"</a>");
											}
										}
									}
									if (sumpage > 10 && page != 1 && sumpage-page > 9){
										for (var k=page ; k < page+10; k++){
											if(k == page){
												$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:UMP_getDataByFIO("+isCitizen+","+k+")'>"+k+"</a>");
											}else{
												$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UMP_getDataByFIO("+isCitizen+","+k+")'>"+k+"</a>");
											}
										}
									}
									if (sumpage > 10 && page != 1 && sumpage-page <= 9){
										for (var k=sumpage-10 ; k < sumpage+1; k++){
											if(k == page){
												$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:UMP_getDataByFIO("+isCitizen+","+k+")'>"+k+"</a>");
											}else{
												$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UMP_getDataByFIO("+isCitizen+","+k+")'>"+k+"</a>");
											}
										}
									}
									if(page < sumpage){
										$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UMP_getDataByFIO("+isCitizen+","+sumpage+")'>>></a>");
									}
								}
								if($(xml).find("root").attr("countelements") < 21){
									count_elements= $(xml).find("root").attr("countelements")
								}else{
									count_elements= $(xml).find("root").attr("count") - ((page-1) * 20) ;
								}
								for (var i=0 ; i < count_elements && i < 20; i++){
									k=i+1;
									getfulldataccess = $(xml).find("root").find("getfulldataccess").text();
									if(getfulldataccess == "true"){
										firstcolumn = "<a onclick='savereqparam()' href='Provider?type=edit&id=citizen&key=&fid="+$(xml).find("id"+k).text() +"&fstatus="+ $(xml).find("status"+k).text()+"'class='doclink' >"+ k +"</a>";
										secondcolumn ="<a onclick='savereqparam()' href='Provider?type=edit&id=citizen&key=&fid="+$(xml).find("id"+k).text() +"&fstatus="+ $(xml).find("status"+k).text()+"'class='doclink' >"+ $(xml).find("fio"+k).text() +"</a>";
									}else{
										firstcolumn ="<font>"+ k +"</font>";
										secondcolumn = "<font>"+ $(xml).find("fio"+k).text() +"</font>";
									}
										$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center; width:"+ $("#1td").width()+"px'>" +
													firstcolumn +
												"</td>" +
										"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#2td").width()+"px'>"+
												secondcolumn +
										"</td>" +
										"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#3td").width()+"px'>"+$(xml).find("iin"+k).text() +"</td>" +
										"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#4td").width()+"px'>"+$(xml).find("birthdate"+k).text() +"</td>" +
										"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#5td").width()+"px'>"+$(xml).find("gender"+k).text() +"</td>" +
										"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#6td").width()+"px'>"+$(xml).find("nationality"+k).text() +"</td>" +
										"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#7td").width()+"px'>"+$(xml).find("numberid"+k).text() +"</td>" +
										"</tr>");
								}
							}else{
								$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center' colspan='5'> По данному запросу ничего не найдено</td></tr>");
								$("#resultdiv").css("top",$("#fieldsdiv").height());
							}
							endLoadingOutlineNotRefresher();
						}else{
							if($(xml).find("error:contains('Connection refused: connect')").length !=0){
								infoDialog("Отсутствует соединение с сервером")
							}
							if($(xml).find("error:contains('Connection timed out: connect')").length !=0){
								infoDialog("Превышен интервал ожидания")
							}
							$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center' colspan='5'>Произошла ошибка при поиске</td></tr>");
							$("#resultdiv").css("top",$("#fieldsdiv").height());
							endLoadingOutlineNotRefresher();
						}
					},
					complete: function(){
						$("#printtable").empty();
						$("#resultHeaderDataTable tr").clone().appendTo("#printtable");
						$("#resultDataTable tr").clone().appendTo("#printtable");
					},
					error: function(){}
				});
			}else{
				var firstname = $.trim($("[name=firstname]").serialize());
				var middlename = $.trim($("[name=middlename]").serialize());
				var lastname = $.trim($("[name=lastname]").serialize());
				$.ajax({
					type: "POST",
					url: "Provider",
					data:"type=page&id=ump_getforeignerbyfio&"+firstname+"&"+middlename+"&"+lastname+"&iscitizen="+isCitizen+"&page="+page+"&pagesize="+pagesize+"&onlyxml",
					success: function(xml){
						$("#resultdiv").css("top",$("#fieldsdiv").height()+"px");
						$("#printbutton").css("visibility","visible");
						if ($(xml).find("response").attr("status") !='error'){
							$("#counter").text($(xml).find("root").attr("count"));
							$("#reqtime").text($(xml).find("response").attr("elapsed_time")+" сек");
							if ($(xml).find("root").attr("count") != '0'){
								sumpage= Math.ceil($(xml).find("root").attr("count") / pagesize);
								if (sumpage != 1){
									if(page > 1){
										$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UMP_getDataByFIO("+isCitizen+",1)'><<</a>");
									}
									if (sumpage < 11){
										for (var k=1 ; k < sumpage+1; k++){
											if(k == page){
												$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:UMP_getDataByFIO("+isCitizen+","+k+")'>"+k+"</a>");
											}else{
												$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UMP_getDataByFIO("+isCitizen+","+k+")'>"+k+"</a>");
											}
										}
									}
									if (sumpage > 10 && page == 1){
										for (var k=1 ; k < 11; k++){
											if(k == page){
												$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:UMP_getDataByFIO("+isCitizen+","+k+")'>"+k+"</a>");
											}else{
												$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UMP_getDataByFIO("+isCitizen+","+k+")'>"+k+"</a>");
											}
										}
									}
									if (sumpage > 10 && page != 1 && sumpage-page > 9){
										for (var k=page ; k < page+10; k++){
											if(k == page){
												$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:UMP_getDataByFIO("+isCitizen+","+k+")'>"+k+"</a>");
											}else{
												$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UMP_getDataByFIO("+isCitizen+","+k+")'>"+k+"</a>");
											}
										}
									}
									if (sumpage > 10 && page != 1 && sumpage-page <= 9){
										for (var k=sumpage-10 ; k < sumpage+1; k++){
											if(k == page){
												$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:UMP_getDataByFIO("+isCitizen+","+k+")'>"+k+"</a>");
											}else{
												$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UMP_getDataByFIO("+isCitizen+","+k+")'>"+k+"</a>");
											}
										}
									}
									if(page < sumpage){
										$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UMP_getDataByFIO("+isCitizen+","+sumpage+")'>>></a>");
									}
								}
								if($(xml).find("root").attr("countelements") < 21){
									count_elements= $(xml).find("root").attr("countelements")
								}else{
									count_elements= $(xml).find("root").attr("count") - ((page-1) * 20) ;
								}
								for (var i=0 ; i < count_elements && i < 20; i++){
									k=i+1;
									getfulldataccess = $(xml).find("root").find("getfulldataccess").text();
									if(getfulldataccess == "true"){
										firstcolumn = "<a onclick='savereqparam()' href='Provider?type=page&id=ump_getforeignerbyid&key=&fid="+$(xml).find("id"+k).text() +"&fstatus="+ $(xml).find("status"+k).text()+"'class='doclink' >"+ k +"</a>";
										secondcolumn ="<a onclick='savereqparam()' href='Provider?type=page&id=ump_getforeignerbyid&key=&fid="+$(xml).find("id"+k).text() +"&fstatus="+ $(xml).find("status"+k).text()+"'class='doclink' >"+ $(xml).find("fio"+k).text() +"</a>";
									}else{
										firstcolumn ="<font>"+ k +"</font>";
										secondcolumn = "<font>"+ $(xml).find("fio"+k).text() +"</font>";
									}
									$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center; width:"+ $("#1td").width()+"px'>" +
											firstcolumn +
										"</td>" +
										"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#2td").width()+"px'>"+
											secondcolumn +
										"</td>" +
										"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#3td").width()+"px'>"+$(xml).find("birthdate"+k).text() +"</td>" +
										"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#4td").width()+"px'>"+$(xml).find("numberid"+k).text() +"</td>" +
										"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#5td").width()+"px'>"+$(xml).find("serialid"+k).text() +"</td>" +
										"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#6td").width()+"px'>"+$(xml).find("gender"+k).text() +"</td>" +
										"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#7td").width()+"px'>"+$(xml).find("nationality"+k).text() +"</td>" +
										"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#8td").width()+"px'>"+$(xml).find("citizenship"+k).text() +"</td>" +
									"</tr>");
								}
							}else{
								$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center' colspan='5'> По данному запросу ничего не найдено</td></tr>");
								$("#resultdiv").css("top",$("#fieldsdiv").height());
							}
							endLoadingOutlineNotRefresher();
						}else{
							if($(xml).find("error:contains('Connection refused: connect')").length !=0){
								infoDialog("Отсутствует соединение с сервером")
							}
							if($(xml).find("error:contains('Connection timed out: connect')").length !=0){
								infoDialog("Превышен интервал ожидания")
							}
							$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center' colspan='5'>Произошла ошибка при поиске</td></tr>");
							$("#resultdiv").css("top",$("#fieldsdiv").height());
							endLoadingOutlineNotRefresher();
						}
					},
					complete: function(){
						$("#printtable").empty();
						$("#resultHeaderDataTable tr").clone().appendTo("#printtable");
						$("#resultDataTable tr").clone().appendTo("#printtable");
					},
					error: function(){}
				});
			}
		
		}
	}
}

function UMP_getDataByID(isCitizen,page){
	if($("[name=doc]").val().length == 0){
		infoDialog("Поле 'Номер' не заполнено");
	}else{
		$.cookie("lastreqview", "doc",{ path:"/", expires:30});	
		$.cookie("doc", $.trim($("input[name=doc]").val()),{ path:"/", expires:30});
		$("#resultDataTable tr").remove();
		$("#printtable, #page-nav, #counter, #reqtime").empty();
		pagesize = 20;
		if($.cookie("pagesize") != null){
			pagesize = $.cookie("pagesize");
		}
		loadingOutline();
		var doc = $.trim($("[name=doc]").serialize());
		if (isCitizen == 1){
			$.ajax({
				type: "POST",
				url: 'Provider',
				data: "type=page&id=ump_gethumanbydoc&"+doc+"&iscitizen="+isCitizen+"&page="+page+"&pagesize="+pagesize+"&onlyxml",
				success: function(xml){
					$("#resultdiv").css("top",$("#fieldsdiv").height()+"px");
					$("#printbutton").css("visibility","visible");
					if ($(xml).find("response").attr("status") !='error'){
						$("#counter").text($(xml).find("root").attr("count"));
						$("#reqtime").text($(xml).find("response").attr("elapsed_time")+" сек");
						if ($(xml).find("root").attr("count") != '0'){
							sumpage= Math.ceil($(xml).find("root").attr("count") / pagesize);
							if (sumpage != 1){
								if(page > 1){
									$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UMP_getDataByID("+isCitizen+",1)'><<</a>");
								}
								if (sumpage < 11){
									for (var k=1 ; k < sumpage+1; k++){
										if(k == page){
											$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:UMP_getDataByID("+isCitizen+","+k+")'>"+k+"</a>");
										}else{
											$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UMP_getDataByID("+isCitizen+","+k+")'>"+k+"</a>");
										}
									}
								}
								if (sumpage > 10 && page == 1){
									for (var k=1 ; k < 11; k++){
										if(k == page){
											$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:UMP_getDataByID("+isCitizen+","+k+")'>"+k+"</a>");
										}else{
											$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UMP_getDataByID("+k+")'>"+k+"</a>");
										}
									}
								}
								if (sumpage > 10 && page != 1 && sumpage-page > 9){
									for (var k=page ; k < page+10; k++){
										if(k == page){
											$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:UMP_getDataByID("+isCitizen+","+k+")'>"+k+"</a>");
										}else{
											$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UMP_getDataByID("+k+")'>"+k+"</a>");
										}
									}
								}
								if (sumpage > 10 && page != 1 && sumpage-page <= 9){
									for (var k=sumpage-10 ; k < sumpage+1; k++){
										if(k == page){
											$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:UMP_getDataByID("+isCitizen+","+k+")'>"+k+"</a>");
										}else{
											$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UMP_getDataByID("+isCitizen+","+k+")'>"+k+"</a>");
										}
									}
								}
								if(page < sumpage){
									$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UMP_getDataByID("+isCitizen+","+sumpage+")'>>></a>");
								}
							}
							if($(xml).find("root").attr("countelements") < 21){
								count_elements= $(xml).find("root").attr("countelements")
							}else{
								count_elements= $(xml).find("root").attr("count") - ((page-1) * 20) ;
							}
							for (var i=0 ; i < count_elements && i < 20; i++){
								k=i+1;
								getfulldataccess = $(xml).find("root").find("getfulldataccess").text();
								if(getfulldataccess == "true"){
									firstcolumn = "<a onclick='savereqparam()' href='Provider?type=edit&id=citizen&key=&fid="+$(xml).find("id"+k).text() +"&fstatus="+ $(xml).find("status"+k).text()+"'class='doclink' >"+ k +"</a>";
									secondcolumn = "<a onclick='savereqparam()' href='Provider?type=edit&id=citizen&key=&fid="+$(xml).find("id"+k).text() +"&fstatus="+ $(xml).find("status"+k).text()+"'class='doclink' >"+ $(xml).find("fio"+k).text() +"</a>" ;
								}else{
									firstcolumn = "<font>"+ k +"</font>";
									secondcolumn = "<font>"+ $(xml).find("fio"+k).text() +"</font>";
								}
									$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center; width:"+ $("#1td").width()+"px'>" +
											firstcolumn +
											"</td>" +
										"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#2td").width()+"px'>"+
											secondcolumn + 
										"</td>" +
										"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#3td").width()+"px'>"+$(xml).find("iin"+k).text() +"</td>" +
										"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#4td").width()+"px'>"+$(xml).find("birthdate"+k).text() +"</td>" +
										"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#5td").width()+"px'>"+$(xml).find("gender"+k).text() +"</td>" +
										"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#6td").width()+"px'>"+$(xml).find("nationality"+k).text() +"</td>" +
										"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#7td").width()+"px'>"+$(xml).find("numberid"+k).text() +"</td>" +
									"</tr>");
							}
						}else{
							$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center' colspan='5'> По данному запросу ничего не найдено</td></tr>");
							$("#resultdiv").css("top",$("#fieldsdiv").height());
						}
						endLoadingOutlineNotRefresher();
					}else{
						if($(xml).find("error:contains('Connection refused: connect')").length !=0){
							infoDialog("Отсутствует соединение с сервером")
						}
						if($(xml).find("error:contains('Connection timed out: connect')").length !=0){
							infoDialog("Превышен интервал ожидания")
						}
						$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center' colspan='5'>Произошла ошибка при поиске</td></tr>");
						$("#resultdiv").css("top",$("#fieldsdiv").height());
						endLoadingOutlineNotRefresher();
					}
				},
				complete: function(){
					$("#printtable").empty();
					$("#resultHeaderDataTable tr").clone().appendTo("#printtable");
					$("#resultDataTable tr").clone().appendTo("#printtable");
				},
				error: function(){}
			});
		}else{
			$.cookie("serial", $.trim($("input[name=serial]").val()),{ path:"/", expires:30});
			var serial = $.trim($("[name=serial]").serialize());
			$.ajax({
				type: "POST",
				url: 'Provider',
				data: "type=page&id=ump_getforeignerbydoc&"+doc+"&"+serial+"&iscitizen="+isCitizen+"&page="+page+"&pagesize="+pagesize+"&onlyxml",
				success: function(xml){
					$("#resultdiv").css("top",$("#fieldsdiv").height()+"px");
					$("#printbutton").css("visibility","visible");
					if ($(xml).find("response").attr("status") !='error'){
						$("#counter").text($(xml).find("root").attr("count"));
						$("#reqtime").text($(xml).find("response").attr("elapsed_time")+" сек");
						if ($(xml).find("root").attr("count") != '0'){
							sumpage= Math.ceil($(xml).find("root").attr("count") / pagesize);
							if (sumpage != 1){
								if(page > 1){
									$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UMP_getDataByID("+isCitizen+",1)'><<</a>");
								}
								if (sumpage < 11){
									for (var k=1 ; k < sumpage+1; k++){
										if(k == page){
											$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:UMP_getDataByID("+isCitizen+","+k+")'>"+k+"</a>");
										}else{
											$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UMP_getDataByID("+isCitizen+","+k+")'>"+k+"</a>");
										}
									}
								}
								if (sumpage > 10 && page == 1){
									for (var k=1 ; k < 11; k++){
										if(k == page){
											$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:UMP_getDataByID("+isCitizen+","+k+")'>"+k+"</a>");
										}else{
											$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UMP_getDataByID("+isCitizen+","+k+")'>"+k+"</a>");
										}
									}
								}
								if (sumpage > 10 && page != 1 && sumpage-page > 9){
									for (var k=page ; k < page+10; k++){
										if(k == page){
											$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:UMP_getDataByID("+isCitizen+","+k+")'>"+k+"</a>");
										}else{
											$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UMP_getDataByID("+isCitizen+","+k+")'>"+k+"</a>");
										}
									}
								}
								if (sumpage > 10 && page != 1 && sumpage-page <= 9){
									for (var k=sumpage-10 ; k < sumpage+1; k++){
										if(k == page){
											$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:UMP_getDataByID("+isCitizen+","+k+")'>"+k+"</a>");
										}else{
											$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UMP_getDataByID("+isCitizen+","+k+")'>"+k+"</a>");
										}
									}
								}
								if(page < sumpage){
									$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UMP_getDataByID("+isCitizen+","+sumpage+")'>>></a>");
								}
							}
							if($(xml).find("root").attr("countelements") < 21){
								count_elements= $(xml).find("root").attr("countelements")
							}else{
								count_elements= $(xml).find("root").attr("count") - ((page-1) * 20) ;
							}
							for (var i=0 ; i < count_elements && i < 20; i++){
								k=i+1;
								getfulldataccess = $(xml).find("root").find("getfulldataccess").text();
								if(getfulldataccess == "true"){
									firstcolumn = "<a onclick='savereqparam()' href='Provider?type=page&id=ump_getforeignerbyid&key=&fid="+$(xml).find("id"+k).text() +"&fstatus="+ $(xml).find("status"+k).text()+"'class='doclink' >"+ k +"</a>";
									secondcolumn = "<a onclick='savereqparam()' href='Provider?type=page&id=ump_getforeignerbyid&key=&fid="+$(xml).find("id"+k).text() +"&fstatus="+ $(xml).find("status"+k).text()+"'class='doclink' >"+ $(xml).find("fio"+k).text() +"</a>";
								}else{
									firstcolumn = "<font>"+ k +"</font>";
									secondcolumn = 	"<font>"+ $(xml).find("fio"+k).text() +"</font>";
								}
								$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; width:"+ $("#1td").width()+"px'>" +
										firstcolumn + 
									"</td>" +
									"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#2td").width()+"px'>"+
										secondcolumn + 
									"</td>" +
									"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#3td").width()+"px'>"+$(xml).find("birthdate"+k).text() +"</td>" +
									"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#4td").width()+"px'>"+$(xml).find("gender"+k).text() +"</td>" +
									"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#5td").width()+"px'>"+$(xml).find("nationality"+k).text() +"</td>" +
									"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#6td").width()+"px'>"+$(xml).find("citizenship"+k).text() +"</td>" +
								"</tr>");
							}
						}else{
							$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center' colspan='5'> По данному запросу ничего не найдено</td></tr>");
							$("#resultdiv").css("top",$("#fieldsdiv").height());
						}
						endLoadingOutlineNotRefresher();
					}else{
						if($(xml).find("error:contains('Connection refused: connect')").length !=0){
							infoDialog("Отсутствует соединение с сервером")
						}
						if($(xml).find("error:contains('Connection timed out: connect')").length !=0){
							infoDialog("Превышен интервал ожидания")
						}
						$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center' colspan='5'>Произошла ошибка при поиске</td></tr>");
						$("#resultdiv").css("top",$("#fieldsdiv").height());
						endLoadingOutlineNotRefresher();
					}
				},
				complete: function(){
					$("#printtable").empty();
					$("#resultHeaderDataTable tr").clone().appendTo("#printtable");
					$("#resultDataTable tr").clone().appendTo("#printtable");
				},
				error: function(){}
			});
		}
		
	}
}

function UMP_getDataByAddr(isCitizen, page){
	if($("[name=street]").val().length == 0){
		infoDialog("Поле 'Улица' не заполнено");
	}else{
		if($("[name=house]").val().length == 0){
			infoDialog("Поле 'Дом' не заполнено");
		}else{
			$.cookie("lastreqview", "addr",{ path:"/", expires:30});	
			$.cookie("street", $.trim($("input[name=street]").val()),{ path:"/", expires:30});
			$.cookie("streetid", $.trim($("input[name=streetid]").val()),{ path:"/", expires:30});
			$.cookie("house", $.trim($("input[name=house]").val()),{ path:"/", expires:30});
			$.cookie("flat", $.trim($("input[name=flat]").val()),{ path:"/", expires:30});
			$.cookie("flatNumber", $.trim($("input[name=flatNumber]").val()),{ path:"/", expires:30});
			$("#resultDataTable tr").remove();
			$("#printtable, #page-nav, #counter, #reqtime").empty();
			pagesize = 20;
			if($.cookie("pagesize") != null){
				pagesize = $.cookie("pagesize");
			}
			loadingOutline();
			var street = $.trim($("[name=streetid]").serialize());
			var house = $.trim($("[name=house]").serialize());
			var flat = $.trim($("[name=flat]").serialize());
			var flatnumber = $.trim($("[name=flatNumber]").serialize());
			if (isCitizen == 1){
				$.ajax({
					type: "POST",
					url: 'Provider',
					data: "type=page&id=ump_gethumanbyaddr&"+street+"&"+house+"&"+flat+"&iscitizen="+isCitizen+"&page="+page+"&"+flatnumber+"&pagesize="+pagesize+"&onlyxml",
					success: function(xml){
						$("#resultdiv").css("top",$("#fieldsdiv").height()+"px");
						$("#printbutton").css("visibility","visible");
						if ($(xml).find("response").attr("status") !='error'){
							$("#counter").text($(xml).find("root").attr("count"));
							$("#reqtime").text($(xml).find("response").attr("elapsed_time")+" сек");
							if ($(xml).find("root").attr("count") != '0'){
								sumpage= Math.ceil($(xml).find("root").attr("count") / pagesize);
								if (sumpage != 1){
									if(page > 1){
										$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UMP_getDataByAddr("+isCitizen+",1)'><<</a>");
									}
									if (sumpage < 11){
										for (var k=1 ; k < sumpage+1; k++){
											if(k == page){
												$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:UMP_getDataByAddr("+isCitizen+","+k+")'>"+k+"</a>");
											}else{
												$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UMP_getDataByAddr("+isCitizen+","+k+")'>"+k+"</a>");
											}
										}
									}
									if (sumpage > 10 && page == 1){
										for (var k=1 ; k < 11; k++){
											if(k == page){
												$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:UMP_getDataByAddr("+isCitizen+","+k+")'>"+k+"</a>");
											}else{
												$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UMP_getDataByAddr("+isCitizen+","+k+")'>"+k+"</a>");
											}
										}
									}
									if (sumpage > 10 && page != 1 && sumpage-page > 9){
										for (var k=page ; k < page+10; k++){
											if(k == page){
												$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:UMP_getDataByAddr("+isCitizen+","+k+")'>"+k+"</a>");
											}else{
												$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UMP_getDataByAddr("+isCitizen+","+k+")'>"+k+"</a>");
											}
										}
									}
									if (sumpage > 10 && page != 1 && sumpage-page <= 9){
										for (var k=sumpage-10 ; k < sumpage+1; k++){
											if(k == page){
												$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:UMP_getDataByAddr("+isCitizen+","+k+")'>"+k+"</a>");
											}else{
												$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UMP_getDataByAddr("+isCitizen+","+k+")'>"+k+"</a>");
											}
										}
									}
									if(page < sumpage){
										$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UMP_getDataByAddr("+isCitizen+","+sumpage+")'>>></a>");
									}
								}
								if($(xml).find("root").attr("countelements") < 21){
									count_elements= $(xml).find("root").attr("countelements")
								}else{
									count_elements= $(xml).find("root").attr("count") - ((page-1) * 20) ;
								}
								for (var i=0 ; i < count_elements && i < 20; i++){
									k=i+1;
									getfulldataccess = $(xml).find("root").find("getfulldataccess").text();
									if(getfulldataccess == "true"){
										firstcolumn ="<a onclick='savereqparam()' href='Provider?type=edit&id=citizen&key=&fid="+$(xml).find("id"+k).text() +"&fstatus="+ $(xml).find("status"+k).text()+"'class='doclink' >"+ k +"</a>";
										secondcolumn = "<a onclick='savereqparam()' href='Provider?type=edit&id=citizen&key=&fid="+$(xml).find("id"+k).text() +"&fstatus="+ $(xml).find("status"+k).text()+"'class='doclink' >"+ $(xml).find("fio"+k).text() +"</a>";
									}else{
										firstcolumn = "<font>"+ k +"</font>";
										secondcolumn = "<font>"+ $(xml).find("fio"+k).text() +"</font>";
									}
										$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center; width:"+ $("#1td").width()+"px'>" +
													firstcolumn + 
												"</td>" +
											"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#2td").width()+"px'>"+
												secondcolumn +
											"</td>" +
											"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#3td").width()+"px'>"+$(xml).find("iin"+k).text() +"</td>" +
											"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#4td").width()+"px'>"+$(xml).find("birthdate"+k).text() +"</td>" +
											"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#5td").width()+"px'>"+$(xml).find("gender"+k).text() +"</td>" +
											"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#6td").width()+"px'>"+$(xml).find("nationality"+k).text() +"</td>" +
											"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#7td").width()+"px'>"+$(xml).find("numberid"+k).text() +"</td>" +
										"</tr>");
								}
							}else{
								$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center' colspan='5'> По данному запросу ничего не найдено</td></tr>");
								$("#resultdiv").css("top",$("#fieldsdiv").height());
							}
							endLoadingOutlineNotRefresher();
						}else{
							if($(xml).find("error:contains('Connection refused: connect')").length !=0){
								infoDialog("Отсутствует соединение с сервером")
							}
							if($(xml).find("error:contains('Connection timed out: connect')").length !=0){
								infoDialog("Превышен интервал ожидания")
							}
							$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center' colspan='5'>Произошла ошибка при поиске</td></tr>");
							$("#resultdiv").css("top",$("#fieldsdiv").height());
							endLoadingOutlineNotRefresher();
						}
					},
					complete: function(){
						$("#printtable").empty();
						$("#resultHeaderDataTable tr").clone().appendTo("#printtable");
						$("#resultDataTable tr").clone().appendTo("#printtable");
					},
					error: function(){}
				});
			
			}else{
				$.ajax({
					type: "POST",
					url: 'Provider',
					data: "type=page&id=ump_getforeignerbyaddr&"+street+"&"+house+"&"+flat+"&iscitizen="+isCitizen+"&page="+page+"&pagesize="+pagesize+"&onlyxml",
					success: function(xml){
						$("#resultdiv").css("top",$("#fieldsdiv").height()+"px");
						$("#printbutton").css("visibility","visible");
						if ($(xml).find("response").attr("status") !='error'){
							$("#counter").text($(xml).find("root").attr("count"));
							$("#reqtime").text($(xml).find("response").attr("elapsed_time")+" сек");
							if ($(xml).find("root").attr("count") != '0'){
								sumpage= Math.ceil($(xml).find("root").attr("count") / pagesize);
								if (sumpage != 1){
									if(page > 1){
										$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UMP_getDataByAddr("+isCitizen+",1)'><<</a>");
									}
									if (sumpage < 11){
										for (var k=1 ; k < sumpage+1; k++){
											if(k == page){
												$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:UMP_getDataByAddr("+isCitizen+","+k+")'>"+k+"</a>");
											}else{
												$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UMP_getDataByAddr("+isCitizen+","+k+")'>"+k+"</a>");
											}
										}
									}
									if (sumpage > 10 && page == 1){
										for (var k=1 ; k < 11; k++){
											if(k == page){
												$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:UMP_getDataByAddr("+isCitizen+","+k+")'>"+k+"</a>");
											}else{
												$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UMP_getDataByAddr("+isCitizen+","+k+")'>"+k+"</a>");
											}
										}
									}
									if (sumpage > 10 && page != 1 && sumpage-page > 9){
										for (var k=page ; k < page+10; k++){
											if(k == page){
												$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:UMP_getDataByAddr("+isCitizen+","+k+")'>"+k+"</a>");
											}else{
												$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UMP_getDataByAddr("+isCitizen+","+k+")'>"+k+"</a>");
											}
										}
									}
									if (sumpage > 10 && page != 1 && sumpage-page <= 9){
										for (var k=sumpage-10 ; k < sumpage+1; k++){
											if(k == page){
												$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:UMP_getDataByAddr("+isCitizen+","+k+")'>"+k+"</a>");
											}else{
												$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UMP_getDataByAddr("+isCitizen+","+k+")'>"+k+"</a>");
											}
										}
									}
									if(page < sumpage){
										$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:UMP_getDataByAddr("+isCitizen+","+sumpage+")'>>></a>");
									}
								}
								if($(xml).find("root").attr("countelements") < 21){
									count_elements= $(xml).find("root").attr("countelements")
								}else{
									count_elements= $(xml).find("root").attr("count") - ((page-1) * 20) ;
								}
								for (var i=0 ; i < count_elements && i < 20; i++){
									k=i+1; 
									getfulldataccess = $(xml).find("root").find("getfulldataccess").text();
									if(getfulldataccess == "true"){
										firstcolumn = "<a href='Provider?type=edit&id=foreigner&key=&fid="+$(xml).find("id"+k).text() +"&fstatus="+ $(xml).find("status"+k).text()+"'class='doclink' >"+ k +"</a>";
										secondcolumn = "<a href='Provider?type=edit&id=foreigner&key=&fid="+$(xml).find("id"+k).text() +"&fstatus="+ $(xml).find("status"+k).text()+"'class='doclink' >"+ $(xml).find("fio"+k).text() +"</a>";
									}else{
										firstcolumn = "<font>"+ k +"</font>";
										secondcolumn= "<font>"+ $(xml).find("fio"+k).text() +"</font>";
									}
										$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; width:"+ $("#1td").width()+"px'>" +
												firstcolumn + 
												"</td>" +
											"<td style='border:1px solid #ccc; width:"+ $("#2td").width()+"px'>"+
												secondcolumn + 
											"</td>" +
											"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#3td").width()+"px'>"+$(xml).find("birthdate"+k).text() +"</td>" +
											"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#4td").width()+"px'>"+$(xml).find("gender"+k).text() +"</td>" +
											"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#5td").width()+"px'>"+$(xml).find("nationality"+k).text() +"</td>" +
											"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#6td").width()+"px'>"+$(xml).find("numberid"+k).text() +"</td>" +
										"</tr>");
								}
							}else{
								$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center' colspan='5'> По данному запросу ничего не найдено</td></tr>");
								$("#resultdiv").css("top",$("#fieldsdiv").height());
							}
							endLoadingOutlineNotRefresher();
						}else{
							if($(xml).find("error:contains('Connection refused: connect')").length !=0){
								infoDialog("Отсутствует соединение с сервером")
							}
							if($(xml).find("error:contains('Connection timed out: connect')").length !=0){
								infoDialog("Превышен интервал ожидания")
							}
							$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center' colspan='5'>Произошла ошибка при поиске</td></tr>");
							$("#resultdiv").css("top",$("#fieldsdiv").height());
							endLoadingOutlineNotRefresher();
						}
					},
					complete: function(){
						$("#printtable").empty();
						$("#resultHeaderDataTable tr").clone().appendTo("#printtable");
						$("#resultDataTable tr").clone().appendTo("#printtable");
					},
					error: function(){}
				});
			}
			}

	}
}

function UMP_getDataByIIN(){
	if($("input[name=iin]").val().length != 12){
		infoDialog("Поле 'ИИН' должно содержать 12 символов");
	}else{
		if (/[a-zA-Zа-яА-Я]/.test($("input[name=iin]").val()) ) {
			infoDialog("Поле 'ИИН' может содержать только чиcловые значения");
		}else{
			$.cookie("lastreqview", "iin",{ path:"/", expires:30});	
			$.cookie("iin", $.trim($("input[name=iin]").val()),{ path:"/", expires:30});
			$("#resultDataTable tr").remove();
			$("#printtable, #page-nav, #counter, #reqtime").empty();
			loadingOutline();
			var iin = $.trim($("[name=iin]").serialize());
			$.ajax({
				type: "POST",
				url: 'Provider',
				data: "type=page&id=ump_getcitizenbyiin&"+iin+"&onlyxml",
				success: function(xml){
					$("#resultdiv").css("top",$("#fieldsdiv").height()+"px");
					$("#printbutton").css("visibility","visible");
					if ($(xml).find("response").attr("status") !='error'){
						if ($(xml).find("root").attr("count") != '0'){
							if($(xml).find("root").attr("count") < 21){
								count_elements= $(xml).find("root").attr("count")
							}else{
								count_elements= $(xml).find("root").attr("count") - ((page-1) * 20) ;
							}
							for (var i=0 ; i < count_elements && i < 20; i++){
								k=i+1;
								getfulldataccess = $(xml).find("root").find("getfulldataccess").text();
								if(getfulldataccess == "true"){
									firstcolumn = "<a onclick='savereqparam()' href='Provider?type=edit&id=citizen&key=&fid="+$(xml).find("id"+k).text() +"&fstatus="+ $(xml).find("status"+k).text()+"'class='doclink' >"+ k +"</a>";
									secondcolumn = "<a onclick='savereqparam()' href='Provider?type=edit&id=citizen&key=&fid="+$(xml).find("id"+k).text() +"&fstatus="+ $(xml).find("status"+k).text()+"'class='doclink' >"+ $(xml).find("fio"+k).text() +"</a>";
								}else{
									firstcolumn = "<font>"+ k +"</font>";
									secondcolumn = "<font>"+ $(xml).find("fio"+k).text() +"</font>";
								}
								$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center; width:"+ $("#1td").width()+"px'>" +
											firstcolumn +
										"</td>" +
										"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#2td").width()+"px'>"+
											secondcolumn +
										"</td>" +
										"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#3td").width()+"px'>"+$(xml).find("iin"+k).text() +"</td>" +
										"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#4td").width()+"px'>"+$(xml).find("birthdate"+k).text() +"</td>" +
										"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#5td").width()+"px'>"+$(xml).find("gender"+k).text() +"</td>" +
										"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#6td").width()+"px'>"+$(xml).find("nationality"+k).text() +"</td>" +
										"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#7td").width()+"px'>"+$(xml).find("numberid"+k).text() +"</td>" +
								"</tr>");
							}
						}else{
							$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center' colspan='5'> По данному запросу ничего не найдено</td></tr>");
							$("#resultdiv").css("top",$("#fieldsdiv").height());
						}
					endLoadingOutlineNotRefresher();
					}else{
						if($(xml).find("error:contains('Connection refused: connect')").length !=0){
							infoDialog("Отсутствует соединение с сервером")
						}
						if($(xml).find("error:contains('Connection timed out: connect')").length !=0){
							infoDialog("Превышен интервал ожидания")
						}
						$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center' colspan='5'>Произошла ошибка при поиске</td></tr>");
						$("#resultdiv").css("top",$("#fieldsdiv").height());
						endLoadingOutlineNotRefresher();
					}
				},
				complete: function(){
					$("#printtable").empty();
					$("#resultHeaderDataTable tr").clone().appendTo("#printtable");
					$("#resultDataTable tr").clone().appendTo("#printtable");
				},
				error: function(){
					$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center' colspan='5'> По данному запросу ничего не найдено</td></tr>");
					$("#resultdiv").css("top",$("#fieldsdiv").height());
				}
			});
		}
		
	}
}

function formKadastrNumber(){
	var myDiv = document.createElement("DIV");
	divhtml ="<div id='dialog-message' title='Формирование кадастрового номера участка'>";
	divhtml+="<span style='height:40px; width:100%; text-align:center;'>";
	divhtml+="<table width='100%'><tr><td style='font-weight:bold; text-align:right'>Область:</td><td style='text-align:left'><input type='text' style='width:190px'/></td></tr>" ;
	divhtml+="<tr><td style='font-weight:bold; text-align:right'>Район:</td><td style='text-align:left'>";
	divhtml+="<select style='width:196px'><option>Алмалинский</option><option>Турксибский</option><option>Алатауский</option><option>Ауэзовский район</option>" ;
	divhtml+="<option>Бостандыкский район</option><option>Жетысуский район</option><option>Медеуский район</option></select></td></tr>" ;
	divhtml+="<tr><td style='font-weight:bold; text-align:right'>Квартал:</td><td style='text-align:left'><input type='text' style='width:190px'/><button type=''button>>></button></td></tr>" ;
	divhtml+="<tr><td style='font-weight:bold; text-align:right'>Номер участка:</td><td style='text-align:left'><input type='text' style='width:190px'/></td></tr>" ;
	divhtml+="</table>";
	divhtml+="</span>";
	divhtml += "</div>";
	myDiv.innerHTML = divhtml;
	document.body.appendChild(myDiv);
	$("#dialog").dialog("destroy");
	$( "#dialog-message" ).dialog({
		modal: true,
		width: "400px",
		buttons: {
			"Ok": function() {
				$( this ).dialog( "close" );
				$( this ).remove();
			},
			"Закрыть": function() {
				$( this ).dialog( "close" );
				$( this ).remove();
			}
		}
	});
	$( ".ui-dialog button" ).focus();
}


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

function closepanel(){
	$( "#outline-container" ).animate({left: '-=266px'},'50'); 
	$( "#view" ).animate({left:'-=266px'},'50'); 
	$( "#resizer" ).animate({left:'-=266px'},'50'); 
	$( "#resizer" ).attr("onclick","openpanel()");
	$( "#iconresizer" ).attr("class","ui-icon ui-icon-triangle-1-e");
}
function openpanel(){
	$( "#outline-container" ).animate({left: '+=266px'},'50'); 
	$( "#view" ).animate({left:'+=266px'},'50'); 
	$( "#resizer" ).animate({left:'+=266px'},'50');
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
		data: "type=delete&ck=" + ck + "&typedel="+typedel+"&dbid=Avanti&nocache="+Math.random() * 300 ,
		success: function (msg){
			deletedcount=$(msg).find('deleted').text();
			notdeletedcount=$(msg).find('notdeleted').text();
			 var myDiv = document.createElement("DIV");
			   divhtml ="<div id='dialog-message' title='Удаление'>";
			   divhtml+="<span style='text-align:center;'>"+
			   			"<font style='font-size:13px; '>Документов удалено:"+deletedcount+"</font><br/>" ;
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

function addDocToFav(el,docid,doctype){
	$.ajax({
		type: "GET",
		datatype:"XML",
		url: "Provider",
		data: "type=service&operation=add_to_favourites&key="+docid+"&doctype="+doctype+"&dbid=Avanti&nocache="+Math.random() * 300 ,
		success: function (msg){
			$(el).attr("src","/SharedResources/img/iconset/star_full.png");
			$(el).attr("onclick","removeDocFromFav(this,"+docid+","+doctype+")");
		},
		error: function(data,status,xhr) {
			infoDialog("Ошибка добавления в избранное");
		}
	});
}

function removeDocFromFav(el,docid,doctype){
	$.ajax({
		type: "GET",
		datatype:"XML",
		url: "Provider",
		data: "type=service&operation=remove_from_favourites&key="+docid+"&doctype="+doctype+"&dbid=Avanti&nocache="+Math.random() * 300 ,
		success: function (msg){
			$(el).attr("src","/SharedResources/img/iconset/star_empty.png");
			$(el).attr("onclick","addDocToFav(this,"+docid+","+doctype+")");
		},
		error: function(data,status,xhr) {
			infoDialog("Ошибка добавления в избранное");
		}
	});
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
			infoDialog("Ошибка восстановления");
		}
	});
}

/* функция поиска*/
function search(){
	$(".searchpan").html("");
	value=$("#searchInput").attr("value");
	if(value.length==0){
		message("Заполните строку поиска","searchInput" );
	}else{
		value = Url.encode(value);
		window.location="Provider?type=search&keyword="+value;
	}
}

function closeSearch(){
	$(".searchpan").css("display","none");
	$("#searchInput").attr("value","");
}

function openSearch(){
	$(".searchpan").css("display","block");
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
	$.get('Provider?type=view&id=docsbyproject&command=collaps`'+id, {});
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
	$.get('Provider?type=view&id=docthread&command=collaps`'+id+'`'+cdoctype, {});
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
	$.get('Provider?type=view&id=glossthread&command=collaps`'+id+'`'+cdoctype, {});
	$("."+id).next("tr").replaceWith("");
	$("#a"+id).attr("href","javascript:openParentGlossView('"+id+"','"+ cdoctype+"','"+pos+"',"+s+")");
	$("#img"+id).attr("src","/SharedResources/img/classic/plus.gif");
}

function checkAll(allChbox) {
	allChbox.checked ? $("input[name=chbox]").attr("checked","true") : $("input[name=chbox]").removeAttr("checked");
}

function refresher() {
	if (timeout != null || timeout != undefined ){
		clearTimeout(timeout);
	}
	sumReloadView = 0;
	if ($.cookie("refresh") !=null){
		timeval= $.cookie("refresh") * 60000;
	}else{
		timeval=360000;
	}
	timeout = setTimeout("refreshAction()", timeval);
}

function refreshAction() {
	outline.sumReloadView = outline.sumReloadView + 1;
	updateView();
}

function doSearch(keyWord ,num){
	if (num != null){
		outline.curPage = num;
	}
	keyWord = Url.encode(keyWord);
	$.ajax({
		url: 'Provider?type=search&keyword=' + keyWord + '&page=' + outline.curPage,
		datatype:"html",
		beforeSend: function(){
			loadingOutline();
		},
		success: function(data) {
			$('#view').html(data.split("<body>")[1].split("</body>")[0]);
			endLoadingOutline();
		},
		error: function(data,status,xhr) {
			if (xhr == "Bad Request"){
				text="Запрос не распознан";
				func = function(){window.history.back()};
				dialogAndFunction (text,func);
			}else{
			$("#noserver").css("display","block");
			$("#finddoc").css("display","none");
			}
		}
	});
}

function elemBackground(el,color){
	$(el).css("background","#"+color);
}

function flashentry(id) {
	$("#"+id).animate({backgroundColor: '#ffff99'}, 1000);
	$("#"+id).animate({backgroundColor: '#ffffff'}, 1000);
}

function updateAllCount(){
	$(".countSpan").each(function(indx, element){
		if($(element).attr("id")!=''){
			updateCount($(element).attr("id")+"_count", $(element).attr("id"));
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
				count= 0;
			}
			$("#"+ idcount).html("<font style='font-size:12px'>["+count+"]</font>");
		}
	});
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




function closeCategoryList(el,listid){
	$("#"+listid).css("visibility", "hidden");
	$(el).attr("onclick", "openCategoryList(this,'"+listid+"')");
}

function updateView(type, viewid, page, command,  sortField, sortOrder){
	loadingOutline();
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
	if ($.cookie("lang")=="RUS" || $.cookie("lang") == null){
		text="Cессия пользователя была закрыта, для продолжения работы необходима повторная авторизация"
	}else if($.cookie("lang")=="ENG"){
		text="User session was closed by the server, in order to proceed re-authorization is required";
	}else if ($.cookie("lang")=="KAZ"){
		text="Пайдаланушының сессиясы сервермен жабылды, жұмысты жалғастыру үшін қайта авторлану керек";
	}
	$.ajax({
		url: url,
		dataType:'HTML',
		async:'true',
		success: function(data) {
			if (!data.match("viewtable")){
				text="Cессия пользователя была закрыта сервером, для продолжения работы необходима повторная авторизация";
				func= function(){window.location.reload()}
				dialogAndFunction (text,func);
				checksrv();
			}else{
				$('body').html(data.split("<body>")[1].split("</body>")[0]);
				//$("body").append(data)
				 $("#searchInput").css("padding","2px");
				 endLoadingOutline();
			}
		},
		error: function(jqXHR, textStatus, errorThrown) {
			checksrv();
		}
	});
}

function Social_getDataByFIO(page){
	if($("[name=lastname]").val().length == 0 || $("[name=firstname]").val().length == 0){
		infoDialog("Поля 'Фамилия' и 'Имя' обязательны к заполнению");
	}else{
		if (/^\*/.test($.trim($("input[name=lastname]").val())) || /^\*/.test($.trim($("input[name=firstname]").val())) || /^\*/.test($.trim($("input[name=middlename]").val()))  ) {
			infoDialog("Поле запроса не должно начинаться с символа '*' ");
		}else{
			$.cookie("lastreqview", "fio",{ path:"/", expires:30});	
			$.cookie("firstname", $.trim($("input[name=firstname]").val()),{ path:"/", expires:30});
			$.cookie("middlename", $.trim($("input[name=middlename]").val()),{ path:"/", expires:30});
			$.cookie("lastname", $.trim($("input[name=lastname]").val()),{ path:"/", expires:30});
			$("#resultDataTable tr").remove();
			$("#printtable, #page-nav, #counter, #reqtime").empty();
			pagesize = 20;
			if($.cookie("pagesize") != null){
				pagesize = $.cookie("pagesize");
			}
			loadingOutline();
			var firstname = $.trim($("[name=firstname]").serialize());
			var middlename = $.trim($("[name=middlename]").serialize());
			var lastname = $.trim($("[name=lastname]").serialize());
			$.ajax({
				type: "POST",
				url: 'Provider',
				data: "type=page&id=social_getdatabyfio&"+firstname+"&"+middlename+"&"+lastname+"&page="+page+"&pagesize="+pagesize+"&onlyxml",
				success: function(xml){
					$("#resultdiv").css("top",$("#fieldsdiv").height()+"px");
					$("#printbutton").css("visibility","visible");
					if ($(xml).find("response").attr("status") !='error'){
						$("#counter").text($(xml).find("root").attr("count"));
						$("#reqtime").text($(xml).find("response").attr("elapsed_time")+" сек");
						if ($(xml).find("root").attr("count") != '0'){
							sumpage= Math.ceil($(xml).find("root").attr("count") / pagesize);
							if (sumpage != 1){
								if(page > 1){
									$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:Social_getDataByFIO(1)'><<</a>");
								}
								if (sumpage < 11){
									for (var k=1 ; k < sumpage+1; k++){
										if(k == page){
											$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:Social_getDataByFIO("+k+")'>"+k+"</a>");
										}else{
											$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:Social_getDataByFIO("+k+")'>"+k+"</a>");
										}
									}
								}
								if (sumpage > 10 && page == 1){
									for (var k=1 ; k < 11; k++){
										if(k == page){
											$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:Social_getDataByFIO("+k+")'>"+k+"</a>");
										}else{
											$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:Social_getDataByFIO("+k+")'>"+k+"</a>");
										}
									}
								}
								if (sumpage > 10 && page != 1 && sumpage-page > 9){
									for (var k=page ; k < page+10; k++){
										if(k == page){
											$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:Social_getDataByFIO("+k+")'>"+k+"</a>");
										}else{
											$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:Social_getDataByFIO("+k+")'>"+k+"</a>");
										}
									}
								}
								if (sumpage > 10 && page != 1 && sumpage-page <= 9){
									for (var k=sumpage-10 ; k < sumpage+1; k++){
										if(k == page){
											$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:Social_getDataByFIO("+k+")'>"+k+"</a>");
										}else{
											$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:Social_getDataByFIO("+k+")'>"+k+"</a>");
										}
									}
								}
								if(page < sumpage){
									$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:Social_getDataByFIO("+sumpage+")'>>></a>");
								}
							}
							if($(xml).find("root").attr("count") < 21){
								count_elements= $(xml).find("root").attr("count")
							}else{
								count_elements= $(xml).find("root").attr("count") - ((page-1) * 20) ;
							}
							for (var i=0 ; i < count_elements && i < 20; i++){
								k=i+1;
								getfulldataccess = $(xml).find("root").find("getfulldataccess").text();
								if($(xml).find("idPerson"+k).length != 0){
									if (getfulldataccess == 'true'){
										firstcolumn = "<a onclick='savereqparam()' href='Provider?type=edit&id=social&key=&humanid="+$(xml).find("idPerson"+k).text() +"'class='doclink' >"+ k +"</a>";
										secondcolumn = "<a onclick='savereqparam()' href='Provider?type=edit&id=social&key=&humanid="+$(xml).find("idPerson"+k).text() +"'class='doclink' >"+ $(xml).find("fio"+k).text() +"</a>" ;
									}else{
										firstcolumn = "<font>"+ k +"</font>";
										secondcolumn ="<font>"+ $(xml).find("fio"+k).text() +"</font>";
									}
									$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center; width:"+ $("#1td").width()+"px'>" +
											 firstcolumn + 
											"</td>" +
									"<td style='border:1px solid #ccc; word-wrap: break-word; text-align:center; width:"+ $("#2td").width()+"px'>"+
										secondcolumn +
									"</td>" +
									"<td style='border:1px solid #ccc; word-wrap: break-word; width:"+ $("#3td").width()+"px'>"+$(xml).find("address"+k).text() +"</td>" +
									"</tr>");
								}
							}
						}else{
							$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center' colspan='5'> По данному запросу ничего не найдено</td></tr>");
							$("#resultdiv").css("top",$("#fieldsdiv").height());
						}
						endLoadingOutlineNotRefresher();
					}else{
						if($(xml).find("error:contains('Connection refused: connect')").length !=0){
							infoDialog("Отсутствует соединение с сервером")
						}
						if($(xml).find("error:contains('Connection timed out: connect')").length !=0){
							infoDialog("Превышен интервал ожидания")
						}
						$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center' colspan='5'>Произошла ошибка при поиске</td></tr>");
						$("#resultdiv").css("top",$("#fieldsdiv").height());
						endLoadingOutlineNotRefresher();
					}
				},
				complete: function(){
					$("#printtable").empty();
					$("#resultHeaderDataTable tr").clone().appendTo("#printtable");
					$("#resultDataTable tr").clone().appendTo("#printtable");
				},
				error: function(){}
			});
		}
	}
}

function Social_getDataByAddr(page){
	if($("[name=street]").val().length == 0){
		infoDialog("Поле 'Улица' не заполнено");
	}else{
		if($("[name=house]").val().length == 0){
			infoDialog("Поле 'Дом' не заполнено");
		}else{
			$.cookie("lastreqview", "addr",{ path:"/", expires:30});	
			$.cookie("street", $.trim($("input[name=street]").val()),{ path:"/", expires:30});
			$.cookie("streetid", $.trim($("input[name=streetid]").val()),{ path:"/", expires:30});
			$.cookie("house", $.trim($("input[name=house]").val()),{ path:"/", expires:30});
			$.cookie("flat", $.trim($("input[name=flat]").val()),{ path:"/", expires:30});
			$("#resultDataTable tr").remove();
			$("#printtable, #page-nav, #counter, #reqtime").empty();
			pagesize = 20;
			if($.cookie("pagesize") != null){
				pagesize = $.cookie("pagesize");
			}
			loadingOutline();
			var street = $.trim($("[name=streetid]").serialize());
			var house = $.trim($("[name=house]").serialize());
			var flat = $.trim($("[name=flat]").serialize());
			$.ajax({
					type: "POST",
					url: 'Provider',
					data: "type=page&id=social_getdatabyaddress&"+street+"&"+house+"&"+flat+"&page="+page+"&pagesize="+pagesize+"&onlyxml",
					success: function(xml){
						$("#resultdiv").css("top",$("#fieldsdiv").height()+"px");
						$("#printbutton").css("visibility","visible");
						if ($(xml).find("response").attr("status") !='error'){
							$("#counter").text($(xml).find("root").attr("count"));
							$("#reqtime").text($(xml).find("response").attr("elapsed_time")+" сек");
							if ($(xml).find("root").attr("count") != '0'){
								sumpage= Math.ceil($(xml).find("root").attr("count") / pagesize);
								if (sumpage != 1){
									if(page > 1){
										$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:Social_getDataByAddr(1)'><<</a>");
									}
									if (sumpage < 11){
										for (var k=1 ; k < sumpage+1; k++){
											if(k == page){
												$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:Social_getDataByAddr("+k+")'>"+k+"</a>");
											}else{
												$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:Social_getDataByAddr("+k+")'>"+k+"</a>");
											}
										}
									}
									if (sumpage > 10 && page == 1){
										for (var k=1 ; k < 11; k++){
											if(k == page){
												$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:Social_getDataByAddr("+k+")'>"+k+"</a>");
											}else{
												$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:Social_getDataByAddr("+k+")'>"+k+"</a>");
											}
										}
									}
									if (sumpage > 10 && page != 1 && sumpage-page > 9){
										for (var k=page ; k < page+10; k++){
											if(k == page){
												$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:Social_getDataByAddr("+k+")'>"+k+"</a>");
											}else{
												$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:Social_getDataByAddr("+k+")'>"+k+"</a>");
											}
										}
									}
									if (sumpage > 10 && page != 1 && sumpage-page <= 9){
										for (var k=sumpage-10 ; k < sumpage+1; k++){
											if(k == page){
												$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:Social_getDataByAddr("+k+")'>"+k+"</a>");
											}else{
												$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:Social_getDataByAddr("+k+")'>"+k+"</a>");
											}
										}
									}
									if(page < sumpage){
										$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:Social_getDataByAddr("+sumpage+")'>>></a>");
									}
								}
								if($(xml).find("root").attr("count") < 21){
									count_elements= $(xml).find("root").attr("count")
								}else{
									count_elements= $(xml).find("root").attr("count") - ((page-1) * 20) ;
								}
								for (var i=0 ; i < count_elements && i < 20; i++){
									k=i+1;
									getfulldataccess = $(xml).find("root").find("getfulldataccess").text();
									if($(xml).find("idPerson"+k).length != 0){
										if(getfulldataccess == "true"){
											firstcolumn ="<a onclick='savereqparam()' href='Provider?type=edit&id=social&key=&humanidid="+$(xml).find("idPerson"+k).text() +"'class='doclink'>"+ k +"</a>";
											secondcolumn = "<a onclick='savereqparam()' href='Provider?type=edit&id=social&key=&humanid="+$(xml).find("idPerson"+k).text() +"'class='doclink'>"+ $(xml).find("fio"+k).text() +"</a>";
										}else{
											firstcolumn = "<font>"+ k +"</font>";
											secondcolumn = "<font>"+ $(xml).find("fio"+k).text() +"</font>";
										}
											$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center; width:"+ $("#1td").width()+"px'>" +
														firstcolumn + 
													"</td>" +
												"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#2td").width()+"px'>"+
													secondcolumn +
												"</td>" +
												"<td style='border:1px solid #ccc; word-wrap:break-word; width:"+ $("#3td").width()+"px'>"+$(xml).find("address"+k).text() +"</td>" +
											"</tr>");
									}
								}
							}else{
								$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center' colspan='5'> По данному запросу ничего не найдено</td></tr>");
								$("#resultdiv").css("top",$("#fieldsdiv").height());
							}
							endLoadingOutlineNotRefresher();
						}else{
							if($(xml).find("error:contains('Connection refused: connect')").length !=0){
								infoDialog("Отсутствует соединение с сервером")
							}
							if($(xml).find("error:contains('Connection timed out: connect')").length !=0){
								infoDialog("Превышен интервал ожидания")
							}
							$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center' colspan='5'>Произошла ошибка при поиске</td></tr>");
							$("#resultdiv").css("top",$("#fieldsdiv").height());
							endLoadingOutlineNotRefresher();
						}
					},
					complete: function(){
						$("#printtable").empty();
						$("#resultHeaderDataTable tr").clone().appendTo("#printtable");
						$("#resultDataTable tr").clone().appendTo("#printtable");
					},
					error: function(){}
				});
			
			
			}

	}
}


function Social_getDataByDistrict(page){
	$.cookie("lastreqview", "fio",{ path:"/", expires:30});	
	$.cookie("district", $.trim($("input[name=district]").val()),{ path:"/", expires:30});
	$("#resultDataTable tr").remove();
	$("#printtable, #page-nav, #counter, #reqtime").empty();
	pagesize = 20;
	if($.cookie("pagesize") != null){
		pagesize = $.cookie("pagesize");
	}
	loadingOutline();
	var district = $.trim($("[name=district]").serialize());
	$.ajax({
		type: "POST",
		url: 'Provider',
		data: "type=page&id=social_getdatabydistrict&"+district+"&page="+page+"&pagesize="+pagesize+"&onlyxml",
		success: function(xml){
			$("#resultdiv").css("top",$("#fieldsdiv").height()+"px");
			$("#printbutton").css("visibility","visible");
					if ($(xml).find("response").attr("status") !='error'){
						$("#counter").text($(xml).find("root").attr("count"));
						$("#reqtime").text($(xml).find("response").attr("elapsed_time")+" сек");
						if ($(xml).find("root").attr("count") != '0'){
							sumpage= Math.ceil($(xml).find("root").attr("count") / pagesize);
							if (sumpage != 1){
								if(page > 1){
									$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:Social_getDataByDistrict(1)'><<</a>");
								}
								if (sumpage < 11){
									for (var k=1 ; k < sumpage+1; k++){
										if(k == page){
											$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:Social_getDataByDistrict("+k+")'>"+k+"</a>");
										}else{
											$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:Social_getDataByDistrict("+k+")'>"+k+"</a>");
										}
									}
								}
								if (sumpage > 10 && page == 1){
									for (var k=1 ; k < 11; k++){
										if(k == page){
											$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:Social_getDataByDistrict("+k+")'>"+k+"</a>");
										}else{
											$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:Social_getDataByDistrict("+k+")'>"+k+"</a>");
										}
									}
								}
								if (sumpage > 10 && page != 1 && sumpage-page > 9){
									for (var k=page ; k < page+10; k++){
										if(k == page){
											$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:Social_getDataByDistrict("+k+")'>"+k+"</a>");
										}else{
											$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:Social_getDataByDistrict("+k+")'>"+k+"</a>");
										}
									}
								}
								if (sumpage > 10 && page != 1 && sumpage-page <= 9){
									for (var k=sumpage-10 ; k < sumpage+1; k++){
										if(k == page){
											$("#page-nav").append("<a style='font-weight:bold; padding:0px 3px; font-size:18px; text-decoration:none; color:#444' href='javascript:Social_getDataByDistrict("+k+")'>"+k+"</a>");
										}else{
											$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:Social_getDataByDistrict("+k+")'>"+k+"</a>");
										}
									}
								}
								if(page < sumpage){
									$("#page-nav").append("<a style='padding:0px 3px; font-size:15px; text-decoration:none; color:#444' href='javascript:Social_getDataByDistrict("+sumpage+")'>>></a>");
								}
							}
							if($(xml).find("root").attr("count") < 21){
								count_elements= $(xml).find("root").attr("count")
							}else{
								count_elements= $(xml).find("root").attr("count") - ((page-1) * 20) ;
							}
							for (var i=0 ; i < count_elements && i < 20; i++){
								k=i+1;
								getfulldataccess = $(xml).find("root").find("getfulldataccess").text();
								if($(xml).find("idPerson"+k).length != 0){
									if (getfulldataccess == 'true'){
										firstcolumn = "<a onclick='savereqparam()' href='Provider?type=edit&id=social&key=&humanid="+$(xml).find("idPerson"+k).text() +"'class='doclink'>"+ k +"</a>";
										secondcolumn = "<a onclick='savereqparam()' href='Provider?type=edit&id=social&key=&humanid="+$(xml).find("idPerson"+k).text() +"'class='doclink'>"+ $(xml).find("fio"+k).text() +"</a>" ;
									}else{
										firstcolumn = "<font>"+ k +"</font>";
										secondcolumn ="<font>"+ $(xml).find("fio"+k).text() +"</font>";
									}
									
									$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center; width:"+ $("#1td").width()+"px'>" +
											 firstcolumn + 
											"</td>" +
									"<td style='border:1px solid #ccc; word-wrap: break-word; text-align:center; width:"+ $("#2td").width()+"px'>"+
										secondcolumn +
									"</td>" +
									"<td style='border:1px solid #ccc; word-wrap: break-word; width:"+ $("#3td").width()+"px'>"+$(xml).find("address"+k).text() +"</td>" +
									"</tr>");
								}
							}
						}else{
							$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center' colspan='5'> По данному запросу ничего не найдено</td></tr>");
							$("#resultdiv").css("top",$("#fieldsdiv").height());
						}
						endLoadingOutlineNotRefresher();
					}else{
						if($(xml).find("error:contains('Connection refused: connect')").length !=0){
							infoDialog("Отсутствует соединение с сервером")
						}
						if($(xml).find("error:contains('Connection timed out: connect')").length !=0){
							infoDialog("Превышен интервал ожидания")
						}
						$("#resultDataTable").append("<tr style='color:#444444'><td style='border:1px solid #ccc; text-align:center' colspan='5'>Произошла ошибка при поиске</td></tr>");
						$("#resultdiv").css("top",$("#fieldsdiv").height());
						endLoadingOutlineNotRefresher();
					}
				},
				complete: function(){
					$("#printtable").empty();
					$("#resultHeaderDataTable tr").clone().appendTo("#printtable");
					$("#resultDataTable tr").clone().appendTo("#printtable");
				},
				error: function(){}
			});
		
	
}

function checksrv(){
	$.ajax({
		url: "Provider?type=edit&element=userprofile&id=userprofile",
		dataType:'HTML',
		async:'true',
		success: function(data) {
			$("body").hidenotify({"delay":200,"onclose":function(){}, loadanimation:false});
		},
		error: function(jqXHR, textStatus, errorThrown) {
			if(errorThrown == 'Unauthorized'){
				text="Cессия пользователя была закрыта сервером, для продолжения работы необходима повторная авторизация";
				func = function(){window.location.reload()};
				dialogAndFunction (text,func);
			}else{
				if($("#notifydiv").length == 0){
					$("body").notify({"text":"Отсутствует соединение с сервером","onopen":function(){}, loadanimation:false});
				}
				setTimeout(function(){refreshAction();}, 10000);
			}
		}
	});
}


function loadingOutline(){
	$('#blockWindow').css("display","block");
	$('#loadingpage').css("display","block");
	$("body").css("cursor","wait");
}

function endLoadingOutline(){
	$('#loadingpage').css("display","none");
	$('#blockWindow').css("display","none");
	$("body").css("cursor","default");
	outline.isLoad=true;
	refresher();
}

function endLoadingOutlineNotRefresher(){
	$('#loadingpage').css("display","none");
	$('#blockWindow').css("display","none");
	$("body").css("cursor","default");
	outline.isLoad=true;
}

function beforeOpenDocument(){
	$('#blockWindow').css("display","block");
	$('#loadingpage').css("display","block");
}

function subentry(id) {
	if ($("subentry" + id).style.display == "none") {
		$('subentry' + id).style.display = "block";
	} else {
		$('subentry' + id).style.display = "block";
	}
}

function openXMLdoc(){
	window.location.href=window.location +"&onlyxml";
}

function openXMLdocView(curviewid){
	window.location.href="Provider?type=view&id="+curviewid+"&onlyxml";
}