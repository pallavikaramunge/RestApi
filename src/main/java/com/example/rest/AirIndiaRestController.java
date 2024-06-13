package com.example.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.request.PassengerInfo;
import com.example.response.TicketInfo;

@RestController
public class AirIndiaRestController {
	@PostMapping("/bbokFlightTicket")
	public ResponseEntity<TicketInfo>bookTicket(@RequestBody PassengerInfo request){
		
		TicketInfo info = new TicketInfo();
		info.setName(request.getFname()+" "+request.getLname());
		info.setFrom(request.getFrom());
		info.setTo(request.getTo());
		info.setFlightId(request.getFlightId());
		info.setTicketstatus("CONFIRMED");
		info.setTicketPrice("4500.00");
		info.setJourneyDate(request.getJourneyDate());
		
		return new ResponseEntity<>(info,HttpStatus.CREATED);
		
	}

}
