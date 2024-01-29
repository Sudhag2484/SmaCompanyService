package in.sudha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.sudha.entity.Company;
import in.sudha.exception.CompanyNotFoundException;
import in.sudha.service.CompanyService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/company")
public class CompanyRestController {
	
	@Autowired
	private CompanyService service;
	
	@PostMapping("/create")
	public ResponseEntity<String> createCompany(@RequestBody Company company){
		log.info("ENTERED INTO SAVE METHOD");
		ResponseEntity<String> resp=null;
		try {
			Long id = service.createCompany(company);
          resp=ResponseEntity.ok("CREATED WITH ID :"+id);
          log.info("COMPANY IS CREATED {} .",id);
		}catch (Exception e) {
     e.printStackTrace();	
     log.error(e.getMessage());
     }
		log.info("ABOUT TO LEAVE SAVE METHOD");
		return resp;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Company>> getAllCompanies(){
		log.info("ENTERED INTO FETCH METHOD");
		
		ResponseEntity<List<Company>> resp=null;
		try {
			List<Company> list = service.getAllCompanies();
			resp= ResponseEntity.ok(list);
	          log.info("FETCH METHOD IS SUCCESS");

		}catch (Exception e) {
			e.printStackTrace();
			
		     log.error(e.getMessage());

		}
		log.info("ABOUT TO LEAVE FETECH METHOD");

		return resp;
	}

	@GetMapping("/fetch/{id}")
	public ResponseEntity<Company> getOneCompanies(@PathVariable Long id){
		log.info("ENTERED INTO ONE FETCH METHOD");
		
		ResponseEntity<Company> resp=null;
		try {
			Company company = service.getOneCompany(id);
			resp= ResponseEntity.ok(company);
	          log.info("ONE FETCH METHOD IS SUCCESS");

		}catch (CompanyNotFoundException e) {
			//e.printStackTrace();
		     log.error(e.getMessage());
		     throw e;

		}
		log.info("ABOUT TO LEAVE ONE FETECH METHOD");

		return resp;
	}
}
