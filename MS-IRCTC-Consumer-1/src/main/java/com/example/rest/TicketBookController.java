package com.example.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.example.model.Passanger;
import com.example.model.Ticket;
import com.example.service.TicketBookService;

@Controller
public class TicketBookController {
		
		@Autowired
		TicketBookService ticketBookService;

		public TicketBookController(TicketBookService ticketBookService) {
			super();
			this.ticketBookService = ticketBookService;
		}
		
		
		@GetMapping("/")
		public String showAllTickets(Model model) {
		    List<Ticket> tickets = ticketBookService.getAllTickets();
		    model.addAttribute("tickets", tickets);
		    return "index";
		}
		
		 //create empty form
		@GetMapping("/book-ticket")
		public String getForm(Model model) {
			model.addAttribute("p", new Passanger());
			return "bookTicket";
		}
		
		@PostMapping("/ticket")
		public String  bookTicket(@ModelAttribute("p") Passanger p ,Model model) {
			Ticket bticket = ticketBookService.bookTicket(p);
			model.addAttribute("msg", "Your Ticket Booked..");
			return "bookticket";
		}
	}

