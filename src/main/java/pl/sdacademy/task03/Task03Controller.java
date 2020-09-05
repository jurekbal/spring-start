package pl.sdacademy.task03;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.sdacademy.task02.Animal;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

@RestController
public class Task03Controller {

    @PostMapping("/task03")
    @ResponseStatus(HttpStatus.CREATED)
    public void getAnimal(@RequestBody Animal animal) {
        System.out.println(animal);
    }

    @PostMapping("/task03-extra")
    public ResponseEntity<Animal> extraTask(@RequestBody Animal animal) {

        Instant instant = Instant.now();
        String formatted = DateTimeFormatter.RFC_1123_DATE_TIME
                .withZone(ZoneOffset.UTC)
                .format(instant);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Last-Modified", formatted);

        return new ResponseEntity<>(animal, headers, HttpStatus.ACCEPTED);
    }

    // kod instruktora
    @PostMapping("/task03-extra2")
    public ResponseEntity<Animal> extraTask_v2(@RequestBody Animal animal) {
        return ResponseEntity
                .accepted()
                .lastModified(Instant.now())
                .body(animal);
    }

}


