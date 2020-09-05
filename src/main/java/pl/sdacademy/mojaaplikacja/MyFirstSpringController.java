package pl.sdacademy.mojaaplikacja;

import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Validated // umożlia walidację danych - adnotacje takie jak @Size, @BotBlank
@RestController
public class MyFirstSpringController {

    @GetMapping(path = "/hello")
    public String hello(@NotBlank(message = "Imie nie może być puste!")
                             @Size(min = 3, max = 20)
                             @RequestParam(value = "name") String name) {

//        można zastosować walidatory np hibernate.validator zamiast if-ów
//        if (name.isBlank()) throw new IllegalArgumentException("Invalid parameter 'name'");

        // tutaj zawsze idzie 500, to się zmienia w innym miejscu

        return "Hello " + name;
    }

    @GetMapping(path = "/favourite/{number}")
    public String favorite(@PathVariable("number") String number,
                           @RequestParam(value = "name", required = false) String name){

        if (name.isEmpty() || name.isBlank()) throw new IllegalArgumentException("Invalid name parameter");

        StringBuilder sb = new StringBuilder("Hello");
        if(!StringUtils.isEmpty(name)) {
            sb.append(" ").append(name);
        }
        sb.append(", your favourite number is: ");
        sb.append(Objects.nonNull(number) && number.matches("\\d+") ? number : "NaN");
        return sb.toString();
    }
}
