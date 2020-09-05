package pl.sdacademy.task05;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Task05Config {

    @Bean // dzięki temu ta klasa zostanie włączona do Springa mimo braku jakichkolwiek adnotacji w niej samej
        // - to jest metoda poprzez klasę @Configuration
    NotManagedBySpring notManagedBySpring() {
        return new NotManagedBySpring("Content string");
    }

    @Bean(name = "myStringBean") // do tej nazwy odwołujemy się w kontrolerze przy pomocy @Qualifier
    String stringBean() {
        return "String Bean";
    }
}
