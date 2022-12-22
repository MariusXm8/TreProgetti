package srl.anagrafica2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"srl.anagrafica2.DstechTreProgettiApplication"})
//@ComponentScan(basePackages = {"srl.anagrafica.demo.openapi.api.ProgettoApiController"})
public class DstechTreProgettiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DstechTreProgettiApplication.class, args);
	}

}
