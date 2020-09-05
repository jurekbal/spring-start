package pl.sdacademy.task05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sdacademy.task02.Animal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
public class Task05Controller {

    private final ApplicationContext ctx;
    private final NotManagedBySpring notManagedBySpring;
    private final MyPropertiesConfig props;

    @Qualifier("myStringBean")
    private String myInjectedString;

    public Task05Controller(ApplicationContext ctx,
                            NotManagedBySpring notManagedBySpring,
                            MyPropertiesConfig props) {
        this.ctx = ctx;
        this.notManagedBySpring = notManagedBySpring;
        this.props = props;
    }

    @GetMapping(path="/context", produces="application/json")
    public List<String> getString() {
     return Arrays.asList(ctx.getBeanDefinitionNames().clone());
    }

    @GetMapping(path="/animalsfromconfig")
    public Map<String, Animal> animalsFromProperties() {
        return props.getAnimals();
    }
}
