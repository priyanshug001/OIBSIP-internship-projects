package com.LoginAuthentication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LoginAuthentication.entity.Credentials;
import com.LoginAuthentication.repository.UserRepository;

@Service
public class UserRepositoryImpl {

	@Autowired
	UserRepository userRepository;

	public void saveData(Credentials cd) {
		userRepository.save(cd);
	}
	
    public List<String> getdata(String unm,String pass){
    	return userRepository.getdata(unm,pass);
    }
}
