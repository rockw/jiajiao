function find_place( type, str)
{
	if (str == "" || type == "") {
		document.getElementById("txtHint").innerHTML = "";
		return;
	}
	if (window.XMLHttpRequest) {// code for IE7+, Firefox, Chrome, Opera, Safari
		xmlhttp = new XMLHttpRequest();
	} else {// code for IE6, IE5
		xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
	}
	
	
	xmlhttp.onreadystatechange = function() {country
		if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
			var text = xmlhttp.responseText;

			if(type == "country") {
				document.getElementById("country").innerHTML =text;
			} else if (type == "province") {
				document.getElementById("province").innerHTML =text;
			} else if (type == "city"){
				document.getElementById("city").innerHTML =text;
			}else if (type == "area"){
				document.getElementById("area").innerHTML =text;
			}
		}
	};
	if (type == "country") {	
		xmlhttp.open("POST", "FindCountry?=" + str, true);
	} else if (type == "province") {
		xmlhttp.open("POST", "FindeProvince?province=" + str, true);
	}else if (type == "city") {
		xmlhttp.open("POST", "FindeCity?city=" + str, true);
	}else if (type == "area") {
		xmlhttp.open("POST", "FindArea?area=" + str, true);
	}


	xmlhttp.send(null);

}
	