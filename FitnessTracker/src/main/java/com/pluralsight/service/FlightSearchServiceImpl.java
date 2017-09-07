package com.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Airport;
import com.pluralsight.model.FlightSearch;
import com.pluralsight.model.FlightsReport;
import com.pluralsight.model.SeatType;
import com.pluralsight.repository.AirportSearchRepository;
import com.pluralsight.repository.FlightSearchRepository;
import com.pluralsight.repository.SeatSearchRepository;

@Service("flightSearchServiceImpl")
public class FlightSearchServiceImpl implements FlightSearchService {

	@Autowired
	private FlightSearchRepository flightSearchRepository;
	
	@Autowired
	private SeatSearchRepository seatSearchRepository;
	
	@Autowired
	private AirportSearchRepository airportSearchRepository;
	
	Airport a = new Airport();
	
	@Override
	public List<FlightsReport> findAllFlights(FlightSearch flightSearch) {
		System.out.println("source: " + flightSearch.getSource_airport());
		
		String[] source_split = flightSearch.getSource_airport().split(" - ");
		String source_airport = source_split[0];
		
		String[] destination_split = flightSearch.getDestination_airport().split(" - ");
		String destination_airport = destination_split[0];
	
		List<FlightsReport> flightlist =  flightSearchRepository.findAllFlights(source_airport, destination_airport, flightSearch.getFlight_date(), flightSearch.getSeat_class(), flightSearch.getSeats());
		for (FlightsReport flightsReport : flightlist) {
			System.out.println("ye:" + flightsReport.getDeparture());
			flightsReport.setPrice(flightsReport.getPrice() * flightSearch.getSeats());
		}
		return flightlist;
//		return flightSearchRepository.findAllFlights("GOI", flightSearch.getDestination_airport(), flightSearch.getFlight_date(), "eco", 1);
	}
	
	@Override
	public List<SeatType> findAll() {
		return seatSearchRepository.findAll();
	}

	@Override
	public List<Airport> getFlightAjaxList(String query) {
		return airportSearchRepository.findAllFlights(query);
	}
}
