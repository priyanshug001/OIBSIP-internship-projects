package com.OIBSIPPizzaDeliveryApplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.OIBSIPPizzaDeliveryApplication.model.Login;

public interface LoginRepository extends CrudRepository<Login, Integer>, JpaRepository<Login, Integer> {

	@Query(value = "SELECT uid FROM registration_data u WHERE u.unm = :name", nativeQuery = true)
	public int findUsersByName(@Param("name") String name);

	@Query(value = "SELECT COUNT(*) FROM login_data u where u.id = :id", nativeQuery = true)
	public int TotalLoginUser(@Param("id") int id);

	@Query(value = "SELECT name FROM registration_data u WHERE u.unm = :unm AND u.pw = :pass", nativeQuery = true)
	public String LoginCheck(@Param("unm") String unm, @Param("pass") String pass);

	@Query(value = "SELECT * FROM login_data u WHERE u.id = :id", nativeQuery = true)
	public List<String> SpecificPersonData(@Param("id") int id);

	@Query(value = "SELECT DISTINCT *, COUNT(*) AS totaldata FROM login_data", nativeQuery = true)
	public List<String> TotalLoginData();

}

//logindetails page se name pr click hone pr id bhejni he ki kiski login detils chahiye.