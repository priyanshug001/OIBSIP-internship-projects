package com.OIBSIPPizzaDeliveryApplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "seqgen1", sequenceName = "seqgen1", initialValue = 1)
public class OrderData {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "seqgen1")
	int serialid;
	String orderid, ordername, orderprice, orderdate, unm, pass;

	public OrderData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSerialid() {
		return serialid;
	}

	public void setSerialid(int serialid) {
		this.serialid = serialid;
	}

	public String getOrderid() {
		return orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public String getOrdername() {
		return ordername;
	}

	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}

	public String getOrderprice() {
		return orderprice;
	}

	public void setOrderprice(String orderprice) {
		this.orderprice = orderprice;
	}

	public String getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(String orderdate) {
		this.orderdate = orderdate;
	}

	public String getUnm() {
		return unm;
	}

	public void setUnm(String unm) {
		this.unm = unm;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "OrderData [serialid=" + serialid + ", orderid=" + orderid + ", ordername=" + ordername + ", orderprice="
				+ orderprice + ", orderdate=" + orderdate + ", unm=" + unm + ", pass=" + pass + "]";
	}

}