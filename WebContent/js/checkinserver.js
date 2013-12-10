var xmlhttp;
var flag;
function checkinserver(type, str) {	
	if (str == "" || type == "") {
		document.getElementById("txtHint").innerHTML = "";
		return;
	}
	if (window.XMLHttpRequest) {// code for IE7+, Firefox, Chrome, Opera, Safari
		xmlhttp = new XMLHttpRequest();
	} else {// code for IE6, IE5
		xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
	}
	
	
	xmlhttp.onreadystatechange = function() {
		
		if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
			var text = xmlhttp.responseText;
			if(text == "true")
			{
				if(type == "username") {
					document.getElementById("username").innerHTML ="已存在，请重新输入";
				} else if (type == "email") {
					document.getElementById("email").innerHTML ="已存在，请重新输入";
				}	
				flag = false;
			} else {
				if(type == "username") {
					document.getElementById("username").innerHTML ="可以使用";
				} else if (type == "email") {
					document.getElementById("email").innerHTML ="可以使用";
				}
				flag = true;
			}
			
		}
	};
	
	if (type == "username") {	
		xmlhttp.open("POST", "CheckServlet?username=" + str, true);
	} else if (type == "email") {
		xmlhttp.open("POST", "CheckServlet?email=" + str, true);
	}

	xmlhttp.send(null);
}


function checkForm() {
	return flag;
}

function checkLength(str) {
	if(str.length < 6) {
		flag = false;
		document.getElementById("passworderror").innerHTML = "密码长度小于6位";
	} else if(str.length > 12) {
		flag = false;
		document.getElementById("passworderror").innerHTML = "密码长度大于12位";
	} else {
		flag = true;
		document.getElementById("passworderror").innerHTML = "";
	}
}

function confirmPassword() {
	var p = document.getElementById("password").value;
	var p2 = document.getElementById("passwordConfirm").value;
	if (p != p2){
		flag = false;
		document.getElementById("confirmerror").innerHTML = "两次密码输入不一致，请重新输入";
	} else {
		flag = true;
	}
}