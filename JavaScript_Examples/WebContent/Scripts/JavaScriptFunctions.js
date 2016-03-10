/**
 * 
 */

function normalFunction(){
	alert("I am a Normal Function");
}

function withArgFunction(name){
	alert("Welcome to JavaScript Functions" + name);
}

function returnFunction(name){
	return "Welcome to JavaScript Functions" + name;
}

function takeFunctionAsArg(func){
	var recvd = func;
	alert(recvd());
}

function returningFunctions(){
	return {
		addClass : function(){
			alert("Add Class Called");
		},
		removeClass : function(){
			alert("Remove Class Called");
		}
	};
}

var element = document.getElementById("button1");
element.addEventListener('click', normalFunction);

element = document.getElementById("button2");
element.addEventListener("click", function(){
	withArgFunction(" Ishika");
});

element = document.getElementById("button3");
element.addEventListener("click", function(){
		value=returnFunction(" Ishika");
		alert(value);
});

element = document.getElementById("button4");
element.addEventListener("click", function(){
	takeFunctionAsArg(withArgFunction(" Ishika"));
});

element = document.getElementById("button5");
element.addEventListener('click', function() {
	var funcList = returningFunctions();

	funcList.addClass();
	funcList.removeClass();

}); 