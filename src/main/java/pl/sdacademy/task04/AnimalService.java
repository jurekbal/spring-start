package pl.sdacademy.task04;

import org.springframework.stereotype.Service;
import pl.sdacademy.task02.Animal;

@Service
public class AnimalService {

    public Animal getAnimal() {
        return new Animal("Cortes", 5);
    }
}
