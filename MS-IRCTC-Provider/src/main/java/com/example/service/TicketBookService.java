package com.example.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Passanger;
import com.example.model.Ticket;
import com.example.repo.TicketRepository;

@Service
public class TicketBookService {
	 @Autowired
		TicketRepository  ticketRepository;
	     
	    public TicketBookService(TicketRepository ticketRepository) {
			super();
			this.ticketRepository = ticketRepository;
		}

		public Ticket bookTicket( Passanger passanger) {
			Ticket ticket = new Ticket();
			Random random = new Random();
			int ticketNbr = random.nextInt(1_000_000);
			ticket.setTickerNbr(ticketNbr);
			ticket.setName(passanger.getName());
			ticket.setAge(passanger.getAge());
			ticket.setEmail(passanger.getEmail());
			ticket.setBookingStatus("Confirmed");
			return ticketRepository.save(ticket);
		}
	    
		public List<Ticket>  getAllTicket() {
			return ticketRepository.findAll();
			
		}
		
	}

