package com.LoginAuthentication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.LoginAuthentication.entity.Credentials;
import com.LoginAuthentication.repository.UserRepository;
import com.LoginAuthentication.service.UserRepositoryImpl;
import com.mysql.cj.Session;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class ApplicationController {

	@Autowired
	UserRepositoryImpl userRepositoryImpl;

	@RequestMapping("/")
	public String login() {
		return "login";
	}

	@RequestMapping("/login")
	public String loginpage() {
		return "login";
	}

	@PostMapping("/login")
	public String saveUser(@RequestParam("unm") String unm, @RequestParam("pass") String pass) {

		Credentials user = new Credentials();
		user.setUsername(unm);
		user.setPassword(pass);

		userRepositoryImpl.saveData(user);
		// userRepository.findAll():Iterable<Credentials>;

		return "welcome"; // Redirect to a success page
	}

	@PostMapping("/success")
	public String successlogin(@RequestParam("unm") String unm, @RequestParam("pass") String pass,
			HttpServletRequest request) {
		List<String> list = userRepositoryImpl.getdata(unm, pass);
		if (list.isEmpty() || list == null) {
			return "login";
		} else {
			String uname = list.get(0);
			HttpSession hs = request.getSession();
			hs.setAttribute("unm", uname);
			return "success";
		}
	}

	@RequestMapping("/welcome")
	public String welcomepage() {
		return "welcome";
	}

	@RequestMapping("/success")
	public String successpage() {
		return "success";
	}

}