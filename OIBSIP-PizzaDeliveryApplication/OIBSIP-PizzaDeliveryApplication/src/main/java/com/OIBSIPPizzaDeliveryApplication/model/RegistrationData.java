package com.OIBSIPPizzaDeliveryApplication.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "RegistrationData")
@SequenceGenerator(name = "seqgen", sequenceName = "seqgen", initialValue = 1001)
public class RegistrationData {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "seqgen")
	Integer uid;

	String name, uadd, mob, email, pw, dt;

	@Column(name = "unm", unique = true, nullable = false)
	String unm;

	public RegistrationData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUadd() {
		return uadd;
	}

	public void setUadd(String uadd) {
		this.uadd = uadd;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getDt() {
		return dt;
	}

	public void setDt(String dt) {
		this.dt = dt;
	}

	public String getUnm() {
		return unm;
	}

	public void setUnm(String unm) {
		this.unm = unm;
	}

	@Override
	public String toString() {
		return "RegistrationData [uid=" + uid + ", name=" + name + ", uadd=" + uadd + ", mob=" + mob + ", email="
				+ email + ", pw=" + pw + ", dt=" + dt + ", unm=" + unm + "]";
	}

}
