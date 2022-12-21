package srl.anagrafica2.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
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
	private List<Long> listaLavoratori;
	
	@Column(name="dataInizio")
	private Date dataInizio;
	
	@Column(name="dataFine")
	private Date dataFine;
	
	@Column(name="budget")
	private double budget;

	

}
