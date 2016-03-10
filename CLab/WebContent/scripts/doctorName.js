




$(function(){ //Ready Handler
	
	$("#dcode").on('keyup',function(){
		var usrId = $(this).val();
		$.ajax({
			type: 'GET', 
            url: "DATA/doctor.json",
            dataType: "json",
            success: function(data) {
                var flag = false;
                /* var docArray  = $.parseJSON(data); */ 
                for (var i=0;i<data.length;++i) {
                	if(usrId == data[i].dcode) {
                		$("#dname").val(data[i].name);
                		flag = true;
                	}
                }
                if(!flag)
                	$("#docName").val("");
            }
		});
	});
	
});


var i=3;
function addrows(){
	
	
	$('#test_table').find('tr:last').before('<tr><td><input type="text" id="tcode'+i+'" onkeydown="test('+i+')"></td><td><input id="tname'+i+'"></td><td><input id="rate'+i+'" ></td></tr> ');
	i++;
} 

