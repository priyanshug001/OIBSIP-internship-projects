package com.OIBSIPPizzaDeliveryApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OIBSIPPizzaDeliveryApplication.model.OrderData;
import com.OIBSIPPizzaDeliveryApplication.repository.AllOtherRepository;

@Service
public class AllOtherService {

	@Autowired
	AllOtherRepository allOtherRepository;

	public void SaveOrderData(OrderData ct) {
		allOtherRepository.save(ct);
	}

	public List<String> GetOrderData(String unm, String pass) {
		return allOtherRepository.FindOrder(unm, pass);
	}

	public List<String> GetAllOrderData() {
		return allOtherRepository.findAllOrder();
	}
}
