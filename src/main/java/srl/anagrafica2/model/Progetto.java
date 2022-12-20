package srl.anagrafica2.model;

import java.time.format.DateTimeFormatter;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="progetti")
public class Progetto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="listaLavoratori")
	private List listaLavoratori;
	
	@Column(name="dataInizio")
	private DateTimeFormatter dataInizio;
	
	@Column(name="dataFine")
	private DateTimeFormatter dataFine;
	
	@Column(name="budget")
	private double budget;

	

}
