package in.sudha.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="ADDRESS_TBL")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="com_id_col")
	private Long id;
	@Column(name="addr_line1_col")
	private String line1;
	
	@Column(name="addr_line2_col")
	
	private String line2;
	@Column(name="addr_city_col")
	private String city;
	@Column(name="addr_state_col")
	private String state;
	@Column(name="addr_country_col")
	private String country;
	@Column(name="addr_pincode_col")
	private Long pincode;
	
}
