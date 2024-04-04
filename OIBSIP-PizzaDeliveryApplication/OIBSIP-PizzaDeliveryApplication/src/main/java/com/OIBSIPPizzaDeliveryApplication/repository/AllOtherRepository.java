package com.OIBSIPPizzaDeliveryApplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.OIBSIPPizzaDeliveryApplication.model.OrderData;

public interface AllOtherRepository extends CrudRepository<OrderData, Integer>, JpaRepository<OrderData, Integer> {

	@Query(value = "SELECT * FROM order_data u WHERE u.unm = :unm AND u.pass = :pass", nativeQuery = true)
	public List<String> FindOrder(@Param("unm") String unm, @Param("pass") String pass);

	@Query(value = "SELECT * FROM order_data", nativeQuery = true)
	public List<String> findAllOrder();
}
