package srl.anagrafica.model;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="progetto")
public class Progetto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="listaLavoratori")
	@ElementCollection
	private List<Long> listaLavoratori;
	
	@Column(name="dataInizio")
	private LocalDate dataInizio;
	
	@Column(name="dataFine")
	private LocalDate dataFine;
	
	@Column(name="budget")
	private double budget;

	

}
