package com.OIBSIPPizzaDeliveryApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OIBSIPPizzaDeliveryApplication.model.RegistrationData;
import com.OIBSIPPizzaDeliveryApplication.repository.RegistrationRepository;

@Service
public class RegistrationService {
	@Autowired
	private RegistrationRepository registrationRepository;

	public void createuser(RegistrationData registrationData) {
		registrationRepository.save(registrationData);
	}
	
	public List GetRegistrationData() {
		return registrationRepository.findAll();
	}
}
