package in.sudha.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sudha.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Long>{

}
