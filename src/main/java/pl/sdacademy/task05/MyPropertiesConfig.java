package pl.sdacademy.task05;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import pl.sdacademy.task02.Animal;

import java.util.HashMap;
import java.util.Map;

@Data
@ConfigurationProperties(prefix="sdacademy")
public class MyPropertiesConfig {

    @NestedConfigurationProperty
    private Map<String, Animal> animals = new HashMap<>();
}
