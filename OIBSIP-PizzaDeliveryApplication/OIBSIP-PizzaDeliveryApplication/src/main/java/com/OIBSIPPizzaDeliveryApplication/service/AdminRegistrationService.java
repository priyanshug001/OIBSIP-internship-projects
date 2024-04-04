package com.OIBSIPPizzaDeliveryApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OIBSIPPizzaDeliveryApplication.model.AdminRegistration;
import com.OIBSIPPizzaDeliveryApplication.repository.AdminRegistrationRepository;

@Service
public class AdminRegistrationService {

	@Autowired
	AdminRegistrationRepository adminRegistrationRepository;

	public void createuser(AdminRegistration adminRegistration) {
		adminRegistrationRepository.save(adminRegistration);
	}

	public List GetRegistrationData() {
		return adminRegistrationRepository.findAll();
	}

}
