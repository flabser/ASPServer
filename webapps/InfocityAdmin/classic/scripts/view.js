function message(text,elID){
	 var myDiv = document.createElement("DIV");
	   divhtml ="<div id='dialog-message' title='Предупреждение'  >";
	   divhtml+="<span style='height:50px; margin-top:4%; width:100%; text-align:center'>"+
	   			"<font style='font-size:13px; '>"+ text +"</font>"+"</span>";
	   divhtml += "</div>";
	   myDiv.innerHTML = divhtml;
	   document.body.appendChild(myDiv);
	   $("#dialog").dialog("destroy");
	   $( "#dialog-message" ).dialog({
		height:140,
		modal: true,
		buttons: {
			"Ок": function() {
				$( this ).dialog( "close" );
				$( this ).remove();
				if (elID !=null){
					$("#"+elID).focus()
				}
			}
		}
	});
}

function getReportUsers() {
	window.location.href= 'Provider?type=page&id=get_report_users'
}

function getReportWorkUsers() {
	var datefrom = $("#datefrom").val();
	var dateto = $("#dateto").val();
	var userid = $("#userid").val();
	if(datefrom !='' && dateto != '' && userid != ''){
		window.location.href= 'Provider?type=page&id=get_report_workusers&userid='+userid+'&fromdate='+datefrom+"&todate="+dateto;
	}else{
		infoDialog("Заполните все необходимые поля")
	}
}

function getReportServices() {
	var service = $("#service").val();
	var datefrom = $("#datefrom").val();
	var dateto = $("#dateto").val();
	if(service !='' && datefrom !='' && dateto != ''){
		window.location.href= 'Provider?type=page&id=get_report_services&server='+service+'&fromdate='+datefrom+"&todate="+dateto;
	}else{
		infoDialog("Заполните все необходимые поля")
	}
}