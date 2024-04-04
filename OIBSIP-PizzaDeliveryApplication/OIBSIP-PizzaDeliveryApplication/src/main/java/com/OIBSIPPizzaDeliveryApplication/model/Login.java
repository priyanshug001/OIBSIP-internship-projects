package com.OIBSIPPizzaDeliveryApplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Login {

	@Id
	int id;
	String Username, Password, LoginDate;

	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "Login [id=" + id + ", Username=" + Username + ", Password=" + Password + ", LoginDate=" + LoginDate
				+ "]";
	}

}
