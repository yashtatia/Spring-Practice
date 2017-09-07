package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Airport;
import com.pluralsight.model.FlightSearch;
import com.pluralsight.model.FlightsReport;
import com.pluralsight.model.SeatType;

public interface FlightSearchService {

	List<FlightsReport> findAllFlights(FlightSearch flightSearch);

	List<SeatType> findAll();

	List<Airport> getFlightAjaxList(String query);


}