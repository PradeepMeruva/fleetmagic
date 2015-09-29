package com.fleetmagic.rm.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.fleetmagic.rm.domain.Rental;
import com.fleetmagic.rm.repository.RentalRepository;

@Service
public class RentalService {
	
	
	@Resource
	private RentalRepository rentalRepository;

	public void createRental(Rental rental) {
		rentalRepository.saveAndFlush(rental);
	}

	public void updateRental(Rental rental) {

	}

	public void fetchRental(Rental rental) {
	
	}
	
	
	public List<Rental> getRentals(){
		return rentalRepository.findAll();
		
	}
	
	

}
