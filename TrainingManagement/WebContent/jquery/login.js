
$(document).ready(function(){
$('#username').keyup(function(){
var userNameLength = $('#username').val().length;
if(userNameLength<15){
$('#spanuser').text("");
}else{
$('#spanuser').text("Not exceeded than 15 characters");
 
}
});
 
$('#password').keyup(function(){
	var passwordValid = $('#password').val();
	var regex = /^[a-zA-Z0-9]+$/;
	if(regex.test(passwordValid)){
	$('#spanpassword').text("Password Contains Alphanumeric and Special Charcters");
	 
	}else{
	$('#spanpassword').text("")
	 
	}
});



if ($('#remember').attr('checked')) {
	var username = $('#username').attr("value");
	var password = $('#password').attr("value");
	alert(username);
	alert(password);
	// set cookies to expire in 14 days
	$.cookie('username', username, { expires: 14 });
	$.cookie('password', password, { expires: 14 });
	$.cookie('remember', true, { expires: 14 });
	} else {
	// reset cookies
	$.cookie('username', null);
	$.cookie('password', null);
	$.cookie('remember', null);
	}
});