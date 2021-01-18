package com.doctor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.doctor.entity.Patient;
import com.doctor.service.DoctorService;
import com.doctor.utility.PdfGenerator;
import java.util.List;

@Controller
@ComponentScan(value="com.doctor.service,com.doctor.utility")

public class CommonController {
	@Autowired
	public DoctorService service;
	
	@Autowired
	public PdfGenerator pdf;
	
	@RequestMapping("/register-form")
	public String returnRegisterForm() {
		return "register"; // it returns registration form to the browser
	}


	@RequestMapping("/register")
	public String register(@ModelAttribute Patient p, Model model) {
		System.out.println("Start");
		boolean isTrue = service.isInsertedSuccessfully(p);
		if (isTrue) {
			model.addAttribute("msg", "Patient registration is Succesful");
		} else
			model.addAttribute("msg", "Patient registration isn't Succesful");
		return "register";// returns login form to the browser when registration of
						// the Patient is successful
	}
	@RequestMapping("/pdf")
	public String getPatientRecord(@RequestParam("mobile") long mobile,Model model){
		List<Patient> p=service.getPatientRecord(mobile);
		pdf.generatePDF(p);
		model.addAttribute("msg","PDF Generated Successfully");
		return "register";
	}
	
}
