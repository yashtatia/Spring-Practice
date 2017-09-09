<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<jsp:include page="header.jsp" />
	
	<header class="jumbotron" style="background-color: white;">
	</header>
	
	<div class="container">
		<div class="card" style="max-width: 80rem;">
			<div class="card-header">
				Bookings
			</div>
			<c:forEach items="${myBookingsReport}" var="booking">
			
			<div class="card-block">
					<label>
					<i class="fa fa-plane" aria-hidden="true"></i>
				</label>		
					<div class="row row-content">
						
						
						
											
						<div class="col-md-2 col-sm-2 col-xs-12">
								<div class="row row-content">
									<div class="col-md-5 padding-left nopadding-right text-right padding-down" ><label style="font-size: 50px;">${booking.day}</label></div>
									<div class="col-md-7 nopadding">
										<span class="align-top"><h3></h3></span>
										<span class="align-middle">${booking.weekday}</span>
										<span class="align-bottom">${booking.month}'${booking.year}</span>
									</div>
								</div>
								
								
									
									
								
							
						</div>
						<div class="col-md-5 col-sm-5 col-xs-12 text-center padding-top" style="height: 50%" >
							<label>${booking.source.airport_name} <i class="fa fa-fighter-jet" aria-hidden="true"></i> ${booking.destination.airport_name}</label>
						</div>
						<div class="col-md-5 col-sm-5 col-xs-12">
							<div><label>${booking.booking_status}</label></div>
							<div><label>Booking Id: ${booking.booking_id}</label></div>
							<div><label>Booked on: ${booking.booked_on}</label></div>									
								
							
						</div>
					</div>
				</div>
				<div class="card-footer text-muted">
						<a href="manageTicket.html?bookingId=${booking.booking_id}" class="btn btn-secondary">MANAGE BOOKING</a>
						<a href="#" class="btn btn-secondary">PRINT TICKET</a>
						<button onclick="cancel(${booking.booking_id})" class="btn btn-danger">Cancel Ticket</button>
				</div>	
						
								
							</c:forEach>
			
				
					<c:if test="${myBookingsReport.size() == 0 }">
					<div class="header">
						<h1>No Bookings</h1>
					</div>
					</c:if>
					
		</div>
	
	</div>
	<br/>
	<div class="container" style="max-height: 300px;">
						<div class="row row-content float-right padding-right">
							
								<a href="index.jsp" class="btn btn-large btn-primary" id="ye">Book flight</a>
								
						</div>			  
					</div>

<jsp:include page="footer.jsp" />