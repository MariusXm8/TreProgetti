package srl.anagrafica;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;


@SpringBootApplication
@OpenAPIDefinition(info=@Info(title= "Funziona?", version="9.9.9"))
public class DstechTreProgettiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DstechTreProgettiApplication.class, args);
	}

}
