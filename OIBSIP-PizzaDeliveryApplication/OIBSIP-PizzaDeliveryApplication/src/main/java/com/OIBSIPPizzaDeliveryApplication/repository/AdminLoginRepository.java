package com.OIBSIPPizzaDeliveryApplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.OIBSIPPizzaDeliveryApplication.model.AdminLogin;

public interface AdminLoginRepository extends CrudRepository<AdminLogin, String>, JpaRepository<AdminLogin, String> {

	@Query(value = "SELECT name FROM admin_registration u WHERE u.unm = :unm AND u.pw = :pass", nativeQuery = true)
	public String LoginCheck(@Param("unm") String unm, @Param("pass") String pass);

	@Query(value = "SELECT uid FROM admin_registration u WHERE u.unm = :name", nativeQuery = true)
	public int findUsersByName(@Param("name") String name);

	@Query(value = "SELECT COUNT(*) FROM admin_login u where u.id = :id", nativeQuery = true)
	public int TotalLoginUser(@Param("id") int id);

	@Query(value = "SELECT * FROM admin_login u WHERE u.id = :id", nativeQuery = true)
	public List<String> SpecificPersonData(@Param("id") int id);

	@Query(value = "SELECT DISTINCT *, COUNT(*) AS totaldata FROM admin_login", nativeQuery = true)
	public List<String> TotalLoginData();
}
