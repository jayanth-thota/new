package com.cts.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.project.dao.CompanyRepository;
import com.cts.project.pojos.Company;
//import com.cts.project.pojos.User;

@RestController
@RequestMapping("/Company")
public class CompanyController {
	@Autowired
	private CompanyRepository companyRepository;
	@GetMapping
	public Iterable<Company>getAllcompany()
	{
		return companyRepository.findAll();
	}
	@PostMapping("/saveCompany")
	public Company savecompany(@RequestBody Company company)
	{
		System.out.println(company);
		companyRepository.save(company);
		
		return company;
	}
	@PutMapping("/updateCompany/{companyname}")
	public Company updateCompany(@RequestBody Company company,@PathVariable("companyname") String companyname)
{
		company.setCompanyname(companyname);
System.out.println(company);
companyRepository.save(company);
return company;
}

}


