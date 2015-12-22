$(document).ready(function() {
	$("#men").click(function() {
		$("#menproduct").toggle();
		$("#womenproduct").hide();
		$("#childproduct").hide();
	});
	$("#women").click(function() {
		$("#womenproduct").toggle();
		$("#childproduct").hide();
		$("#menproduct").hide();
	});
	$("#child").click(function() {
		$("#childproduct").toggle();
		$("#menproduct").hide();
		$("#womenproduct").hide();
	});
});

$(document).ready(function() {
	$('.display').click(function() {
		var id = $(this).closest('table').attr('id');
		var cell1 = document.getElementById(id).rows[1].cells[1].innerHTML;
		var cell2 = document.getElementById(id).rows[2].cells[1].innerHTML;
		var name = document.getElementById("name");
        name.value=cell1;
        var price = document.getElementById("price");
        price.value=cell2;
        
		$('#dialog').dialog({
			height : 200,
			width : 300,
		
		});
		 $('#total').focus(function(){
			var total=document.getElementById("total");
			var quantity=document.getElementById("quantity").value;
			total.value=quantity*cell2;
		    });
	});
});

	var i=0;
	function myfunction()
	{	
		document.getElementById("spanid").innerHTML="Cart :" + (++i);
	}

	





