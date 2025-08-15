package com.example.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.model.Passanger;
import com.example.model.Ticket;

@Service
public class TicketBookService {
	 
	public Ticket bookTicket(Passanger p) {
	    String providerUrl = "http://3.109.123.126:9090/bookticket";
	    RestTemplate restTemplate = new RestTemplate();
	    
	    try {
	        ResponseEntity<Ticket> response = restTemplate.postForEntity(providerUrl, p, Ticket.class);
	        return response.getBody();
	    } catch (Exception ex) {
	        ex.printStackTrace(); // or use a logger
	        return null; // or throw a custom exception
	    }
	}
	
	 public List<Ticket> getAllTickets() {
	        String providerUrl = "http://3.109.123.126:9090/getallticket";

	        RestTemplate restTemplate = new RestTemplate();

	        ResponseEntity<Ticket[]> responseEntity = restTemplate.getForEntity(providerUrl, Ticket[].class);

	        Ticket[] ticketsArray = responseEntity.getBody();

	        if (ticketsArray != null) {
	            return Arrays.asList(ticketsArray);
	        } else {
	            return new ArrayList<>();
	        }
	    }
	}

