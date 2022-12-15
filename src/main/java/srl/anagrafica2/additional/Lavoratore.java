package srl.anagrafica2.additional;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Lavoratore {
	
	@Id
	@Column
	private Long id;
	
	@Column
	private String nome;
	
	

}
