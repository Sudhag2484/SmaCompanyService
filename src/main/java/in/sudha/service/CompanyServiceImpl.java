package in.sudha.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sudha.entity.Company;
import in.sudha.repo.CompanyRepository;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyRepository repo;
	@Override
	public Long createCompany(Company cob) {
		// TODO Auto-generated method stub
		return repo.save(cob).getId();
	}

	@Override
	public void updateCompany(Company cob) {
if(cob.getId()!=null && repo.existsById(cob.getId()))
	repo.save(cob);
	}

	@Override
	public List<Company> getAllCompanies() {
		return repo.findAll();
	
	}

	@Override
	public Company getOneCompany(Long id) {
Optional<Company> opt = repo.findById(id);
if(opt.isEmpty()) {
	return null;//TODO :
}else {
	return opt.get();

}
	}

}
