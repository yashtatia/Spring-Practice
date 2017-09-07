<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<jsp:include page="header.jsp" />
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<div class="container">
		<div class="card" style="max-width: 80%;" >
			<div class="card-header">
				<h2 class="card-title" align="center">Make Payment</h2>
			</div>
			<div class="card-block">
				<div class="card-body">
						<p>Carrier : ${flightSelected.airline}</p>
						<p>Total seats : ${flightSelected.seats}</p>
						<p>Seat Type : ${flightSelected.seat_class}</p>
						
						<form:form commandName="payment" class="form-horizontal" style=" padding-left: 20px;" method="POST">
							
							  <label class="radio-inline" >
							    <form:radiobutton path="payment_choice" name="payment_choice" value="1" />
							     Using Miles: ${miles_used} (Rs. ${discount}) + ${fare_with_miles}  CC payment
							     
							  </label>
							
							
							  <label class="radio-inline mx-3">
							    <form:radiobutton path="payment_choice" name="payment_choice" value="2" />
							    Without Using Miles : ${fare_without_miles}	CC payment
							  </label>
							  <label class="mx-5">
							  	(Miles Remaining : ${miles_remaining})
							  </label>
								
							<br />
							<br/>
			
							<div class="form-group row">
							    <label for="input1" class="col-xs-3 col-form-label mr-2">Name on CC</label>
							    <div class="col-sm-10">
							      <form:input path="cc_name" type="text" name="cc_name" id="cc_name" placeholder="Name on Credit Card" class="form-control" style="max-width: 50%;" />
							    </div>
							</div>
							<div class="form-group row">
							    <label for="input2" class="col-xs-3 col-form-label mr-2">CC Number</label>
							    <div class="col-sm-10">
							      <form:input path="cc_number" type="text" name="cc_number" id="cc_number" placeholder="XXXX-XXXX-XXXX" class="form-control" style="max-width: 50%;" />
							    </div>
							</div>
							<div class="form-group row">
								<div class="form-inline">
									<label class="mr-sm-2 mb-0" for="cc_cvv`">CVV</label>
										<form:input path="cc_cvv" type="password" name="cc_cvv" id="cc_cvv" placeholder="CVV"  class="form-control " />
									<label class="mr-sm-2 mb-0" for="cc_expiry">Expiry</label>
										<form:input path="cc_expiry"  type="text" class="form-control" id="cc_expiry" name="cc_expiry" placeholder="MM/YY"/>
								</div>
							</div>
							
							
							<br />
							<br />
							
							<form:hidden path="flight_id"  name="flight_id" value="${flightSelected.flight_id}" />
							<form:hidden path="seat_type" name="seat_type" value="${flightSelected.seat_class_abbrev}" />
							<form:hidden path="seats" name="seats" value="${flightSelected.seats}" />
							<form:hidden path="fare_with_miles" name="fare_with_miles" value="${fare_with_miles}" />
							<form:hidden path="fare_without_miles" name="fare_without_miles" value="${fare_without_miles}" />
							<form:hidden path="miles_used" name="miles_used" value="${miles_used}" />
							<form:hidden path="miles_remaining" name="miles_remaining" value="${miles_remaining}" />
							<form:hidden path="miles_earned" name="miles_earned" value="${miles_earned}" />
			
							<button type="submit" name="" value="Make Payment" class="btn btn-default col-lg-offset-10" >Make Payment</button>
						</form:form>		
				</div>
			
			</div>
			
			<br />


					
		</div>	
	</div>
	<br/>

<jsp:include page="footer.jsp" />
<script type="text/javascript">
		$( document ).ready(function() {
		    preProcess();
		});

		function preProcess(){
			if($('input[name=payment_choice]:checked').val() == "with_miles"){
				var cc_remaining = ${fare_with_miles};
				if(cc_remaining == 0){
					$("#cc_name").prop("disabled", true);
					$("#cc_number").prop("disabled", true);
					$("#cc_cvv").prop("disabled", true);
					$("#cc_expiry").prop("disabled", true);
				}
			}
		}

		$('input[name=payment_choice]').on('change', function() {
			if($('input[name=payment_choice]:checked').val() == "with_miles"){
				var cc_remaining = ${fare_with_miles};
				if(cc_remaining == 0){
					$("#cc_name").prop("disabled", true);
					$("#cc_number").prop("disabled", true);
					$("#cc_cvv").prop("disabled", true);
					$("#cc_expiry").prop("disabled", true);
				}
			}else{
				$("#cc_name").prop("disabled", false);
				$("#cc_number").prop("disabled", false);
				$("#cc_cvv").prop("disabled", false);
				$("#cc_expiry").prop("disabled", false);
			}
		});
	</script>