package in.ashokit.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table
public class Contact {

	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int contact_id;
	private String contact_name;
	private String contact_email;
	private long phn_number;
	private String activeSw;
	
}
