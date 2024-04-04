package com.OIBSIPPizzaDeliveryApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.OIBSIPPizzaDeliveryApplication.model.RegistrationData;

public interface RegistrationRepository extends JpaRepository<RegistrationData, Integer>{

}