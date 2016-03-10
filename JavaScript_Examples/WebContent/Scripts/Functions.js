/**
 * 
 */

function init()
{
	var item = {"itemName" : "Television",
				"itemImage" : "images/tv.jpg",
				showItem : function(){
					console.log('show Item called');
					var ele = document.getElementById("itemName");
					ele.innerHTML = this.itemName;
					document.getElementsByTagName("img")[0].src=this.itemImage;
				}
};
	console.log("Init called");
	console.log(item.itemName);
	item.showItem();
}
(function(){
	init();
})();