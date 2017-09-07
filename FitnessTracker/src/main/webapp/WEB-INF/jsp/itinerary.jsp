<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<jsp:include page="header.jsp" />
	<div class="row" style="margin-top:140px;">
	
				<div class="col-lg-2"></div>
			
				<div class="col-lg-8">
					<h2><strong>Ticket Itinerary</strong></h2>
					<table class="table">
						<tr>
							<td colspan="2">
								Flight : ${itinerary.source_id} - ${itinerary.source_name} <i class="fa fa-plane" aria-hidden="true"></i> ${itinerary.destination_id} - ${itinerary.destination_name}
							</td>
							<td colspan="2">
								${itinerary.fname} - ${itinerary.lname}
							</td>
						</tr>
						<tr>
							<td>
								Booking ID : ${itinerary.booking_id}  
								Carrier : ${itinerary.carrier_id} - ${itinerary.carrier_name}
							</td>
							<td>
								${itinerary.source_id} - ${itinerary.source_name}
							</td>
							<td><i class="fa fa-plane" aria-hidden="true" style="font-size: 20px;"></i></td>
							<td>
								${itinerary.destination_id} - ${itinerary.destination_name}
							</td>
						</tr>
						<tr>
							<td>Seat Type : ${itinerary.seat_type}</td>
							<td>Seats Booked : ${itinerary.seats}</td>
							<td>Seat Numbers : ${itinerary.seat_numbers}</td>
							<td>Total Fare : ${itinerary.total_fare}</td>
						</tr>
						<tr>
							<td colspan="4">
								<button class="btn btn-primary" onclick="window.print()">Print Ticket</button>
							</td>
						</tr>
					</table>
				</div>
			</div>
			<div class="col-lg-2"></div>

<jsp:include page="footer.jsp" />