package pl.sdacademy.task02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class Task02Controller {

    //Zad2 Po zrobeniu zad2.1 czyli po ściągnięciu libki konwertera xml trzeba jawnie określić typ zwracany json
    @GetMapping(path = "/animal", produces = "application/json")
    public Animal animalResponser() {
        return new Animal("Burek", 6);
    }

    //Zad 2.1 XML
    // Po ściągnięciu libki konwertera xml staje się on domyślnym konwerterem
    // więc tutaj produces nie jest potrzebny
    @GetMapping(path = "/animalxml", produces = "application/xml")
    public Animal AnimalXML() {
        return new Animal("Jogi", 11);
    }

    @GetMapping(path = "/task02.3")
    public Animal AnimalAcceptHeader(@RequestHeader("Accept") String acceptHeader,
                                     @RequestHeader Map<String,String> headers) {

        System.out.println("Accept header value: " + acceptHeader);

        System.out.println("All headers:");
        headers.forEach((key, value) ->
                System.out.println(key + ": " + value));

        return new Animal("Django", 3);
    }
}
