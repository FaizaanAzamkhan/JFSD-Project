package com.example.projectdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class Rest {
	StudentDAOClass sdc;
	private CounselorService counselorService;
	private PeopleService peopleService;
	private AdminService adminService;
	@Autowired
public Rest(AdminService adminService,PeopleService peopleService,CounselorService counselorService,StudentDAOClass sdc) {
		super();
		this.sdc = sdc;
		this.counselorService = counselorService;
		this.peopleService = peopleService;
		this.adminService = adminService;
	}

@GetMapping("/home")
public String home() {
	return "home";
}

@GetMapping("/aboutus")
public String aboutus() {
	return "aboutus";
}

@GetMapping("/contactus")
public String contactus() {
	return "contactus";
}
@GetMapping("/register")
public String register(Model model) {
	model.addAttribute("stud1");
	return "register";
}


@RequestMapping("/insert")
public String registerStudent(@ModelAttribute("stud2")Student user,Model model) {
   model.addAttribute("stud1",user);
   sdc.insertStudent(user);
   return "login";
}
@GetMapping("/login")
public String login() {
	return "login";
}
@RequestMapping("/insert1")
public String loginStudent(@ModelAttribute("stud2")Student user,Model model) {
	model.addAttribute("stud1",user);
	sdc.insertStudent(user);
	return "navbar";
}

@GetMapping("/navbar")
public String navbar() {
	return "navbar";
}
@GetMapping("/Student")
public String Student() {
	return "Student";
}
@GetMapping("/Admin")
public String Admin() {
	return "Admin";
}
@GetMapping("/admindetails")
public String admindetails(Model model) {
	model.addAttribute("adm1");
	return "admindetails";
}
@GetMapping("/studetails")
public String studetails(Model model) {
	model.addAttribute("cou1");
	return "studetails";
}
@GetMapping("/counsellor")
public String counsellor() {
	return "counsellor";
}
@GetMapping("/coudetails")
public String coudetails(Model model) {
	model.addAttribute("peo1");
	return "coudetails";
}
//@PostMapping("/Student")
//public String addCounselor(@RequestBody Counselor counselor, Model model) {
//    CounselorService counselorService = null;
//	counselorService.saveCounselor(counselor);
//    model.addAttribute("counselor", counselor);
//    return "coudetails"; // Assuming you have a coudetails.jsp page to display counselor details
//}
@PostMapping("/Student")
public String studetails(@ModelAttribute ("cou2")Counselor counselor, Model model) {
    // Your logic to save the counselor
    model.addAttribute("cou1", counselor);
    counselorService.saveCounselor(counselor);
    return "Studentdetailsconf"; // Assuming you have a coudetails.jsp page to display counselor details
}
@PostMapping("/Counsellor")
public String coudetails(@ModelAttribute("peo2")People people,Model model) {
	model.addAttribute("peo1", people);
	peopleService.savePeople(people);
	return "counselordetailsconf";
}
@PostMapping("/Admin")
public String admindetails(@ModelAttribute("adm2")AdminDetails admindetails,Model model) {
	model.addAttribute("adm1", admindetails);
	adminService.saveAdmin(admindetails);
	return "admindetailsconf";
}
@GetMapping("/Studentdetailsconf")
public String Studentdetailsconf() {
	return "Studentdetailsconf";
}
@GetMapping("/counselordetailsconf")
public String counselordetailsconf() {
	return "counselordetailsconf";
}

@GetMapping("/admindetailsconf")
public String admindetailsconf() {
	return "admindetailsconf";
}

}
