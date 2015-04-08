var app ={
	name:null
}
function changeSystemSettings(el){
	valCookie=$(el).val();
	$.cookie($(el).attr("id"), valCookie,{
		path:"/",
		expires:30
	});
	window.location.reload();
}

function makeCookie(){
	username="";
	password="";
	expireAt= new Date;
	expireAt.setMonth(expireAt.getMonth() + 1);
	username=$("#login").val();
	password=$("#pwd").val();
	document.cookie=app.name+"="+username+"$"+password+"; path=/; expires="+expireAt.toGMTString();
}

function key(event){
	if (event.keyCode==13){ 
		ourSubmit();
	}
}

function entKeyFormQuestion(event){
	if (event.keyCode==13){ 
		submitAnswerForm();
	}
}

function entKeyFormLogin(event){
	if (event.keyCode==13){ 
		ourSubmit("default");
	}
}

function getCookie(name) {
	if($.cookie('lang') == null){
		$.cookie('lang', "RUS",{
			path:"/",
			expires:30
		});
	}
	if($.cookie('skin') == null){
		$.cookie('skin', "classic",{
			path:"/",
			expires:30
		});
	}
    var dc = document.cookie;
    var prefix = name + "=";
    var begin = dc.indexOf("; " + prefix);
    if (begin == -1) {
        begin = dc.indexOf(prefix);
        if (begin != 0) return null;
    } else {
        begin += 2;
    }
    var end = document.cookie.indexOf(";", begin);
    if (end == -1) {
        end = dc.length;
    }
    text=unescape(dc.substring(begin + prefix.length, end));
    document.form.login.value=text.split("$")[0];
    document.form.pwd.value=text.split("$")[1];
}

function ourSubmit(type){
	$("#cancel_auth").css("display","none");
	$("#cancel_auth_control").css("display","none");
	$("#ok_auth").css("display","none");
	$("#ok_auth_control").css("display","none");
	if($("#login").val() == ""){
		infoDialog("Введите имя пользователя")
		return;
	}else{
		if($("#pwd").val() =="" && type=="default"){
			infoDialog("Заполните пароль")
			return;
		}else{
			var formData = $("#frm").serialize();
			$.ajax({
				type: "POST",
				url: 'Login',
				data: formData,
				success:function (xml){
					if($(xml).find("response").attr("type") == "SUPPLY_LOGIN_QUESTION"){
						idq = $(xml).find("response").find("message[id=qid]").text()
						quest = $(xml).find("response").find("message[id=qq]").text()
						answerquest(quest,idq)
					}else{
						$("#ok_auth").css("display","inline-block");
						window.location.href=$(xml).find("response").find("redirect").text();
					}
				},
				error:function (xhr, ajaxOptions, thrownError){
					if (xhr.status == 400){
						$("body").children().wrapAll("<div id='doerrorcontent' style='display:none'></div>")
						$("body").append("<div id='errordata'>"+xhr.responseText+"</div>")
						$("li[type='square'] > a").attr("href","javascript:backtocontent()")
					}else{
						$("#cancel_auth").css("display","inline-block");
					}
				}    
			});
	}
		
}}

function answerquest(quest,idq){
	//$("#answerform").css("display","block")
	$("#step2").button({disabled:false});
	//$("#step1").button({disabled:true});
	$("#questiontitle").html(quest);
	$("#cancel_auth").css("display","none");
	$("#ok_auth").css("display","inline-block");
	$("input[name=answer]").prop("disabled","");
	$("input[name=answer]").focus();
	$("input[name=login]").prop("disabled","true");
	$("input[name=pwd]").prop("disabled","true");
	$("#qid").val(idq);
}

function submitAnswerForm(){
	$("#cancel_auth_control").css("display","none");
	$("#ok_auth_control").css("display","none");
	if($("#answer").val() == ""){
		infoDialog("Вы не ответили на контрольный вопрос")
		return;
	}else{
		var formData = $("#ans").serialize();
		$.ajax({
			type: "POST",
			url: 'Login',
			data: formData,
			success:function (xml){
				$("#ok_auth_control").css("display","inline-block");
				window.location.href=$(xml).find("message[id=1]").text();
			},
			error:function (xhr, ajaxOptions, thrownError){
				if (xhr.status == 400){
					$("#cancel_auth_control").css("display","inline-block");
				}
				if (xhr.status == 401){
					if($(xhr.responseXML).find("message[id=warn]").text() == "login session has been invalidated"){
						infoDialog("Вы превысили количество попыток ввода ответа на контрольный вопрос")
						$("#cancel_auth_control").css("display","none");
						$("#ok_auth_control").css("display","none");
						$("#cancel_auth").css("display","none");
						$("#ok_auth").css("display","none");
						$("input[name=answer]").prop("disabled","true");
						$("input[name=login]").prop("disabled","");
						$("input[name=pwd]").prop("disabled","");
						$("input[name=answer]").val("");
						$("input[name=login]").val("");
						$("input[name=pwd]").val("");
						$("input[name=login]").focus();
						$("#atemptcount").text("")
						$("#questiontitle").text("")
					}else{
						$("#cancel_auth_control").css("display","inline-block");
						$("#atemptcount").text("осталось попыток : "+ $(xhr.responseXML).find("message[id=attempt_count]").text() )
					}
						
						
				}
			}    
		});
	}
		
}