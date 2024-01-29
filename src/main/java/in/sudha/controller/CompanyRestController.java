package in.sudha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.sudha.entity.Company;
import in.sudha.service.CompanyService;

@RestController
@RequestMapping("/company")
public class CompanyRestController {
	
	@Autowired
	private CompanyService service;
	
	@PostMapping("/create")
	public ResponseEntity<String> createCompany(@RequestBody Company company){
		ResponseEntity<String> resp=null;
		try {
			Long id = service.createCompany(company);
     resp=ResponseEntity.ok("CREATED WITH ID :"+id);
		}catch (Exception e) {
     e.printStackTrace();		}
		return resp;
	}

}
