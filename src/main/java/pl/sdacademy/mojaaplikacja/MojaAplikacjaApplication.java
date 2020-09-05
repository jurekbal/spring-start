package pl.sdacademy.mojaaplikacja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

//scanBasePackages - bazowy pakiet od którego Spring skanuje pakiety, defaultowo tam gdzie klasa z main
// stąd najlepiej umieszczać klasę @SpringBootApplication w głównym pakiecie
@SpringBootApplication(scanBasePackages = "pl.sdacademy")
@ConfigurationPropertiesScan(basePackages = "pl.sdacademy")
public class MojaAplikacjaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MojaAplikacjaApplication.class, args);
	}

}
