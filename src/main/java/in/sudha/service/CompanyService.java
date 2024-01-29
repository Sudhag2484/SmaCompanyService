package in.sudha.service;

import java.util.List;

import in.sudha.entity.Company;

public interface CompanyService {
	
	Long createCompany(Company cob);
	
	void updateCompany(Company cob);
	
	List<Company> getAllCompanies();
	
	Company getOneCompany(Long id);
	
	//void deleteOneComapany();
	

}
