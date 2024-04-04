package com.LoginAuthentication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.LoginAuthentication.entity.Credentials;

public interface UserRepository extends CrudRepository<Credentials, String> {
	@Query(value = "SELECT * FROM credentials u WHERE u.username = :unm AND u.password = :pass", nativeQuery = true)
	public List<String> getdata(@Param("unm") String unm, @Param("pass") String pass);
}
