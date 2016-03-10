n=1;
sum=0;
function calc(){
	
	 
	$('td').each(function() {     
		var str = "rate"+""+n;
		alert(str);
        sum += document.getElementById(str).value;  
        n++;
        alert(sum);
       
});
	document.getElementById("total").innerHTML=sum;
}