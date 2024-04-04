package com.OIBSIPPizzaDeliveryApplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AdminLogin {
	
	String Username, Password;
	@Id
	String LoginDate;

	public AdminLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getLoginDate() {
		return LoginDate;
	}

	public void setLoginDate(String loginDate) {
		LoginDate = loginDate;
	}

	@Override
	public String toString() {
		return "AdminLogin [Username=" + Username + ", Password=" + Password + ", LoginDate=" + LoginDate
				+ "]";
	}
}
