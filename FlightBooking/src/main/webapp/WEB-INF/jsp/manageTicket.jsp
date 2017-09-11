<jsp:include page="header.jsp" />

	<div class="container" style="margin-top:140px;">
	<div class="card">
					<div class="card-header">
						
					</div>
					<div class="card-body ">
						<div class="row row-content">
							<div class="col-6">
								<span>${ticketDetails.carrier_info}</span>
							</div>
							<div class="col-6 text-right">
								<span>${ticketDetails.booking_id}</span>
							</div>
						</div>
						<br>
						<div class="row row-content ">
							<div class="col-3">
								<div>
									<small class="text-muted">${ticketDetails.departure_time}</small>
									<div><span>${ticketDetails.departure_id}</span></div>
									<div><small class="text-muted">${ticketDetails.departure_name}</small></div>						
								</div>
							</div>
							<div class="col-6 text-center">
								<div>
									<span>${ticketDetails.duration}</span>
									<div>
										<span>----</span>
										<i class="fa fa-fighter-jet" aria-hidden="true"></i>
										<span>----</span>
									</div>
								</div>
							</div>
							<div class="col-3 text-right" >
								<div>
									<small class="text-muted">${ticketDetails.arrival_time}</small>
									<div><span>${ticketDetails.arrival_id}</span></div>
									<div><small class="text-muted">${ticketDetails.arrival_name}</small></div>							
								</div>
							</div>
						</div>
						<div class="text-center">
							<br>
							<span class="outer-line"></span>
							<i class="fa fa-plane" aria-hidden="true" style="margin:10px 0"></i>
							<span class="outer-line"></span>
							<br>
							
							<br>
						</div>
						<div class="container text-center">
							<ul class="list-group list-group-flush">
								<li class="list-group-item">
									<div class="row row-content">
										<span>
											<span>Depart:</span>
											<span>${ticketDetails.departure_name}</span>
										</span>
									</div>
									<div class="row row-content" >
											<div class="col-3">
												<span class="text-muted">Travel Date</span>
												<div><span>${ticketDetails.departure_date}</span></div>										
											</div>
											<div class="col-3">
												<span class="text-muted">Depart</span>
												<div><span>${ticketDetails.departure_time}</span></div>										
											</div>
											<div class="col-3">
												<span class="text-muted">Gate</span>
												<div><span>---</span></div>										
											</div>
											<div class="col-3">
												<span class="text-muted">terminal</span>
												<div><span>---</span></div>										
											</div>
									</div>
								</li>
								
								<li class="list-group-item">
									<div class="row row-content" >
										<span>
											<span>Arrival:</span>
											<span>${ticketDetails.arrival_name}</span>
										</span>
									</div>
										<div class="row row-content">
											<div class="col-3">
												<span class="text-muted">Travel Date</span>
												<div><span>${ticketDetails.arrival_date}</span></div>										
											</div>
											<div class="col-3">
												<span class="text-muted">Arrival</span>
												<div><span>${ticketDetails.arrival_time}</span></div>										
											</div>
											<div class="col-3">
												<span class="text-muted">Gate</span>
												<div><span>---</span></div>										
											</div>
											<div class="col-3">
												<span class="text-muted">terminal</span>
												<div><span>---</span></div>										
											</div>
									</div>
								</li>
								
								<li class="list-group-item">
									<div class="row row-content text-left" >
									
											<div class="col-6">
												<span class="text-muted">Passenger(s)</span>
											</div>
											<div class="col-6">
												<span class="text-muted">Type</span>
											</div>
										
										<div>list</div>
									</div>
								</li>					
								
								<li class="list-group-item">
									<div class="row row-content text-left" >
										<div class="col-6">
											<span class="text-muted">Transaction Amount: </span>
											<div><span>Rs. ${ticketDetails.total_cost}</span></div>									
										</div>
									</div>
								</li>
								
								<li class="list-group-item">
									<div class="row row-content " >
										<div class="col-6 text-left">
											<span class="text-muted">Payment Method: </span>
											<div><span>${ticketDetails.payment_method}</span></div>									
										</div>
										<div class="col-6 text-right">
											<span>card number encrypted</span>
										</div>
									</div>
								</li>
								
							</ul>
						</div>
					</div>
				</div>
</div>
<jsp:include page="footer.jsp" />