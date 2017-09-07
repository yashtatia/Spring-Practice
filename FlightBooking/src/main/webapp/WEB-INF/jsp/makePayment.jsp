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
		<div class="well well-lg col-lg-offset-1" style="max-width: 80%;" >
			<h2 align="center">Make Payment</h2>
			<br />



			<p>Carrier : ></p>
			<p>Total seats : </p>
			<p>Seat Type : 
								
			</p>
			<form:form commandName="payment" class="form-horizontal" method="POST">
				<div class="radio">
				  <label >
				    <input type="radio" name="payment_choice" value="with_miles" checked>
				     Using Miles: CC payment
				     <br>(Miles Remaining : )
				  </label>
				</div>
				<div class="radio">
				  <label>
				    <input type="radio" name="payment_choice" value="without_miles" />
				    Without Using Miles :	CC payment
				  </label>
				</div>
				<br />

				<div class="form-group">
				    <label for="input1" class="col-sm-2 control-label">Name on CC</label>
				    <div class="col-sm-10">
				      <form:input path="cc_name" type="text" name="cc_name" id="cc_name" placeholder="Name on Credit Card" class="form-control" style="max-width: 50%;" />
				    </div>
				</div>
				<div class="form-group">
				    <label for="input2" class="col-sm-2 control-label">CC Number</label>
				    <div class="col-sm-10">
				      <form:input path="cc_number" type="text" name="cc_number" id="cc_number" placeholder="Credit Card Number" class="form-control" style="max-width: 50%;" />
				    </div>
				</div>
				<div class="form-group">
				    <label for="input3" class="col-sm-2 control-label">CCV</label>
				    <div class="col-sm-1">
				      <form:input path="cc_cvv" type="password" name="cc_cvv" id="cc_cvv" placeholder="CVV" class="form-control" style="width: 140%" />
				    </div>
				
				    <label for="input4" class="col-sm-2 control-label">Expiry</label>
				    <div class="col-sm-2">
				      <form:input path="cc_expiry" type="text" name="cc_expiry" id="cc_expiry" placeholder="MM/YY" class="form-control" />
				    </div>
				</div>

				<form:input path="flight_id" type="hidden" name="flight_id" value="1" />
				<form:input path="flight_class" type="hidden" name="seat_type" value="eco" />
				<form:input path="seats" type="hidden" name="seats" value="2" />

				<input  type="hidden" name="fare_with_miles" value="123" />
				<input  type="hidden" name="fare_without_miles" value="321" />
				<form:input path="miles_used" type="hidden" name="miles_used" value="123" />
				<input  type="hidden" name="miles_remaining" value="12" />
				<input  type="hidden" name="miles_earned" value="123" />

				<button type="submit" name="" value="Make Payment" class="btn btn-default col-lg-offset-10" >Make Payment</button>
			</form:form>>		
		</div>	
	</div>

<jsp:include page="footer.jsp" />