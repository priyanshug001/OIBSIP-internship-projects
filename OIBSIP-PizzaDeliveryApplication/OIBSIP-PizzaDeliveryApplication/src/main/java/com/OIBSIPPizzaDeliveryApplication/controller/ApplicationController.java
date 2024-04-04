package com.OIBSIPPizzaDeliveryApplication.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.OIBSIPPizzaDeliveryApplication.model.AdminLogin;
import com.OIBSIPPizzaDeliveryApplication.model.AdminRegistration;
import com.OIBSIPPizzaDeliveryApplication.model.Login;
import com.OIBSIPPizzaDeliveryApplication.model.OrderData;
import com.OIBSIPPizzaDeliveryApplication.model.RegistrationData;
import com.OIBSIPPizzaDeliveryApplication.service.AdminLoginService;
import com.OIBSIPPizzaDeliveryApplication.service.AdminRegistrationService;
import com.OIBSIPPizzaDeliveryApplication.service.AllOtherService;
import com.OIBSIPPizzaDeliveryApplication.service.LoginService;
import com.OIBSIPPizzaDeliveryApplication.service.RegistrationService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class ApplicationController {

	@Autowired
	AllOtherService allOtherService;

	@Autowired
	LoginService loginService;

	@Autowired
	AdminLoginService adminLoginService;

	@Autowired
	RegistrationService registrationService;

	@Autowired
	AdminRegistrationService adminRegistrationService;

	String unm = null, pd = null;

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/menu")
	public String hello() {
		return "menu";
	}

	@RequestMapping("/index")
	public String indexpage() {
		return "index";
	}

	@RequestMapping("/adminlogin")
	public String adminloginpage() {
		return "adminlogin";
	}

	@PostMapping("/adminlogin")
	public ModelAndView adminlogin(@RequestParam("unm") String uname, @RequestParam("pass") String pass,
			HttpServletRequest req) {

		ModelAndView mv = new ModelAndView();

		AdminLogin al = new AdminLogin();
		al.setUsername(uname);
		al.setPassword(pass);
		String dt = LocalDateTime.now().toString();
		al.setLoginDate(dt);

		String list = adminLoginService.LoginCheck(uname, pass);
		if (list == null) {
			mv.setViewName("index");
		} else {
			adminLoginService.saveLoginData(al);
			String ld1 = adminLoginService.LoginCheck(uname, pass);
			HttpSession hs = req.getSession(true);
			hs.setAttribute("adminunm", ld1);
			mv.setViewName("admin");
		}
		return mv;
	}

	@RequestMapping("/adminlogindata")
	public ModelAndView adminlogindata() {
		ModelAndView mv = new ModelAndView();
		List ld = adminLoginService.GetLoginData();
		mv.addObject("admindata", ld);
		mv.setViewName("adminlogindata");
		System.out.println(ld);
		return mv;
	}

	// Registration Part

	@RequestMapping("/adminregistration")
	public String adminregistration() {
		return "adminregistration";
	}

	@PostMapping("/adminregistration")
	public String adminregistration(@RequestParam("fnm") String fnm, @RequestParam("adds") String add,
			@RequestParam("mno") String mob, @RequestParam("eml") String email, @RequestParam("unm") String unm,
			@RequestParam("pass") String pass) {

		AdminRegistration user = new AdminRegistration();
		user.setName(fnm);
		user.setUadd(add);
		user.setMob(mob);
		user.setEmail(email);
		user.setUnm(unm);
		user.setPw(pass);
		String dt = LocalDateTime.now().toString();
		user.setDt(dt);

		adminRegistrationService.createuser(user);

		return "index";
	}

	@RequestMapping("/adminregistrationdata")
	public String adminregistrationdata(HttpServletRequest req, Model model) {

		List ld = adminRegistrationService.GetRegistrationData();
		model.addAttribute("admindataall", ld);
		System.out.println(ld);
		return "adminregistrationdata";
	}

	@RequestMapping("/order")
	public String order(HttpServletRequest request) {
		List<String> order = allOtherService.GetOrderData(unm, pd);
		HttpSession hs = request.getSession(false);
		hs.setAttribute("order", order);
		return "order";
	}

	@GetMapping("/order/{pizza}/{price}")
	public String orderpage(@PathVariable String pizza, @PathVariable String price) {

		OrderData order = new OrderData();
		order.setOrderid(pizza);
		String dt = LocalDateTime.now().toString();
		order.setOrderdate(dt);
		order.setUnm(unm);
		order.setPass(pd);
		switch (pizza) {
		case "1": {

			order.setOrdername("Margherita Pizza");
			order.setOrderprice(price);
			break;
		}
		case "2": {

			order.setOrdername("Pepperoni Pizza");
			order.setOrderprice(price);
			break;
		}
		case "3": {

			order.setOrdername("Double Cheese Margherita Pizza");
			order.setOrderprice(price);
			break;
		}
		case "4": {

			order.setOrdername("Farmhouse Pizza");
			order.setOrderprice(price);
			break;
		}
		case "5": {

			order.setOrdername("Peppy Paneer Pizza");
			order.setOrderprice(price);
			break;
		}
		case "6": {

			order.setOrdername("Mexican Green Wave Pizza");
			order.setOrderprice(price);
			break;
		}
		}

		allOtherService.SaveOrderData(order);

		return "menu";
	}

	// Login Part

	@RequestMapping("/login")
	public String login() {
		return "login";
	}

	@PostMapping("/login")
	public ModelAndView login(@RequestParam("unm") String uname, @RequestParam("pass") String pass,
			HttpServletRequest req) {

		unm = uname;
		pd = pass;

		ModelAndView mv = new ModelAndView();

		Login ld = new Login();
		ld.setUsername(unm);
		ld.setPassword(pd);
		String dt = LocalDateTime.now().toString();
		ld.setLoginDate(dt);
		int x = loginService.findUsersByName(unm);
		ld.setId(x);

		String list = loginService.LoginCheck(unm, pd);
		if (list == null) {
			mv.setViewName("registration");
		} else {
			loginService.saveLoginData(ld);
			String ld1 = loginService.LoginCheck(unm, pd);
			HttpSession hs = req.getSession(false);
			hs.setAttribute("unm", ld1);
			mv.setViewName("index");
		}
		return mv;
	}

	@RequestMapping("/logindata")
	public ModelAndView logindata() {
		ModelAndView mv = new ModelAndView();
		List ld = loginService.GetLoginData();
//			req.setAttribute("data", ld);
		mv.addObject("data", ld);
		mv.setViewName("logindata");
		System.out.println(ld);
		return mv;
	}

	// Registration Part

	@RequestMapping("/registration")
	public String registration() {
		return "registration";
	}

	@PostMapping("/registration")
	public String registration(@RequestParam("fnm") String fnm, @RequestParam("adds") String add,
			@RequestParam("mno") String mob, @RequestParam("eml") String email, @RequestParam("unm") String unm,
			@RequestParam("pass") String pass) {

		// Create a User object and set the values
		RegistrationData user = new RegistrationData();
		user.setName(fnm);
		user.setUadd(add);
		user.setMob(mob);
		user.setEmail(email);
		user.setUnm(unm);
		user.setPw(pass);
		String dt = LocalDateTime.now().toString();
		user.setDt(dt);

		// Save the user to the database
		registrationService.createuser(user);

		// Redirect to the login page after successful registration
		return "login";
	}

	@RequestMapping("/registrationdata")
	public String registrationdata(HttpServletRequest req, Model model) {

		List ld = registrationService.GetRegistrationData();
		model.addAttribute("dataall", ld);
		System.out.println(ld);
		return "registrationdata";
	}

	@RequestMapping("/admin")
	public String adminpage() {
		return "adminpage";
	}

	@RequestMapping("/about")
	public String about() {
		return "about";
	}
}
