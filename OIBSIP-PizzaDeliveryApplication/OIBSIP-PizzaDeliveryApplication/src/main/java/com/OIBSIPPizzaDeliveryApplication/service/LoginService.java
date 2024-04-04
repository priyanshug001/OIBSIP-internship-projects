package com.OIBSIPPizzaDeliveryApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OIBSIPPizzaDeliveryApplication.model.Login;
import com.OIBSIPPizzaDeliveryApplication.repository.LoginRepository;

@Service
public class LoginService {

	@Autowired
	LoginRepository loginRepository;

	public void saveLoginData(Login loginData) {
		loginRepository.save(loginData);
	}

	public int findUsersByName(String name) {
		return loginRepository.findUsersByName(name);
	}

	public int TotalLoginUser(int id) {
		return loginRepository.TotalLoginUser(id);
	}

	public List GetLoginData() {
		return loginRepository.findAll();
	}

	public String LoginCheck(String unm, String pass) {
		return loginRepository.LoginCheck(unm, pass);
	}

	public List<String> SpecificPersonData(int id) {
		return loginRepository.SpecificPersonData(id);
	}

	public List<String> TotalLoginData() {
		return loginRepository.TotalLoginData();
	}
}