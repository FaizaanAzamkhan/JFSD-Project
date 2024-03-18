package com.example.projectdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService implements AdminDAO{
	private final AdminRepository adminRepository;
	
	@Autowired
	public AdminService(AdminRepository adminRepository) {
		this.adminRepository = adminRepository;
	}
	
	public void saveAdmin(AdminDetails admindetails) {
		adminRepository.save(admindetails);
		
	}

}
