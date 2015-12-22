 
$(document).ready(function(){
$('#name').keyup(function(){
var userNameLength = $('#name').val().length;
if(userNameLength<15){
$('#spanname').text("");
}else{
$('#spanname').text("Should not exceed more than 15 characters");
}
});
  
$('#contact').keyup(function(){
var contactCheck = $('#contact').val().length;
var filter= /^[0-9]+$/; 
if(contactCheck<10 || contactCheck>10){
	$('#spancontact').text("Input type: Only Digits and Text Limt:10");
}else{
	$('#spancontact').text("");
}
});

$('#email_id').keyup(function(){
var emailValid = $('#email_id').val();
var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
if(!filter.test(emailValid)){

$('#spanemail').text("Enter Valid  Email-ID");
}else{
 
$('#spanemail').text("")
}
});
 
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
$('#spanpassword').text("");
} 
});
});