

function test(n){
	
	
$(function(){ //Ready Handler
	
	$("#tcode"+n).on('keyup',function(){
		var usrId = $(this).val();
		//alert(n);

		$.ajax({
			type: 'GET', 
            url: "DATA/test.json",
            dataType: "text",
            success: function(data) {
                var flag = false;
                var docArray=$.parseJSON(data)
                  for (var i=0;i<data.length;++i)
                  {
                	if(usrId == docArray[i].tcode)
                	{
                		$("#tname"+n).val(docArray[i].name);
                		$("#rate"+n).val(docArray[i].rate);
                		
                     
           
                		
                		flag = true;
                		
                	}
                	
                }
                
                if(!flag){
                	$("#tname"+n).val("");
                	$("#rate"+n).val();}
                	
              
            }
		
		
		});
	});
	
});
}
