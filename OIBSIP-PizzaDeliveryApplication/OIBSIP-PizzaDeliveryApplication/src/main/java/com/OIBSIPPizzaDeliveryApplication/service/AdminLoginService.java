package com.OIBSIPPizzaDeliveryApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OIBSIPPizzaDeliveryApplication.model.AdminLogin;
import com.OIBSIPPizzaDeliveryApplication.model.Login;
import com.OIBSIPPizzaDeliveryApplication.repository.AdminLoginRepository;

@Service
public class AdminLoginService {

	@Autowired
	AdminLoginRepository adminloginrepository;

	public void saveLoginData(AdminLogin adminlogin) {
		adminloginrepository.save(adminlogin);
	}

	public int findUsersByName(String name) {
		return adminloginrepository.findUsersByName(name);
	}

	public int TotalLoginUser(int id) {
		return adminloginrepository.TotalLoginUser(id);
	}

	public List GetLoginData() {
		return adminloginrepository.findAll();
	}

	public String LoginCheck(String unm, String pass) {
		return adminloginrepository.LoginCheck(unm, pass);
	}

	public List<String> SpecificPersonData(int id) {
		return adminloginrepository.SpecificPersonData(id);
	}

	public List<String> TotalLoginData() {
		return adminloginrepository.TotalLoginData();
	}
}
