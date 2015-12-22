/**
 * 
 */

$(document).ready(function(){
	$('#add').click(function(){
		 $( "#dialog" ).dialog({
			 
			 height:380,
			 width:700
		 });
	});
});

function read(input){
	
	 if (input.files && input.files[0]) {
         var reader = new FileReader();

         reader.onload = function (e) {
             $('#image')
                 .attr('src', e.target.result)
                 .width(100)
                 .height(100);
         };

         reader.readAsDataURL(input.files[0]);
     }
	
}

function display(){
	 
	 
	var display;
	display = new Object();
	display = document.getElementById('details');
	var image = document.getElementById("image").src;
	//alert(x);
	var name  = display.name.value.toString();
	//alert(name);
	var contact  = display.contact.value.toString();
	//alert(contact);
	var email  = display.email.value.toString();
	//alert(email);
	var i=name.concat(email);
	
	 $('#left').append("<div> <table border='1' > " +
	            "<tr > <td> <image src ="+image +" height=20px width=200px id='"+i+"'> </td> <td class =remv>Close</td></tr>" +
	            "<tr> <td>  Name : </td>  <td> "+ name + "</td> </tr>" +
	            "<tr> <td> Contact : </td>   <td> "+ contact + "</td> </tr>" +
	            "<tr> <td> Email : </td>   <td> "+ email + "</td> </tr>" +
	             "</table> " +
	            "</div>");
	
		$(document).on('click', '.remv', function () { 
		      $(this).closest('table').remove();
			   }); 
		
		
	 $(document).on('click', '#'+i , function () { 
		 $('#rightUpper').replaceWith(
				 "<div id='rightUpper'> <table border='1'> " +
	             "<tr > <td> <image src ="+image +" height=20px width=200px> </td> <td class=remv>Close</td></tr>" +
	             "<tr> <td>  Name : </td>   <td> "+ name + "</td> </tr>" +
	             "<tr> <td> Contact : </td>   <td> "+ contact + "</td> </tr>" +
	             "<tr> <td> Email : </td>   <td> "+ email + "</td> </tr>" +
	              "</table> " +
	             "</div>"	 
		   );
	   
	}); 
	
}

	