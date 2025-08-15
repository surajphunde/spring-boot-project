package com.example.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Passanger;
import com.example.model.Ticket;
import com.example.service.TicketBookService;

@RestController
public class TicketBookController {
		
		@Autowired
		TicketBookService ticketBookService;

		public TicketBookController(TicketBookService ticketBookService) {
			super();
			this.ticketBookService = ticketBookService;
		}
		
		@PostMapping("/bookticket")
		public Ticket  bookTicket(@RequestBody Passanger passanger) {
			Ticket ticket = ticketBookService.bookTicket(passanger);
			return ticket;
		}
		
		@GetMapping("/getallticket")
		public List<Ticket>  getAllTicket() {
			return ticketBookService.getAllTicket();
		}

	}

