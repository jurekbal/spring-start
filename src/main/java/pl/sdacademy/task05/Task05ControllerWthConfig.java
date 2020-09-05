package pl.sdacademy.task05;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import pl.sdacademy.task02.Animal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@ConfigurationProperties(prefix="sdacademy")
// tutaj używamy prostej metody pozyskiwania parametrów przy pomocy @Value więc używamy @ConfigurationProperties
@Component
public class Task05ControllerWthConfig {
    //korzystamy z różnych profili application-$$$.properties

    private String appMode;
    private String defParameter;
    private String justForDebugBreakpoint;

    public Task05ControllerWthConfig(@Value("${sdacademy.application-mode}") String appMode,
                                     @Value("${sdacademy.otherparam}") String defParameter) {
        this.appMode = appMode;
        this.defParameter = defParameter;
        //parameter pobierany z application.properties, gdy nie jest zdefiniowany w innych profilach

        this.justForDebugBreakpoint = "Stop here";
    }
}

