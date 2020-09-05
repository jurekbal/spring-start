package pl.sdacademy.task06;

import org.springframework.web.bind.annotation.*;
import pl.sdacademy.task02.Animal;

import java.util.List;

public class Task06Controller {

    private AnimalRepo animalRepository;

    public Task06Controller(AnimalRepo animalRepository) {
        this.animalRepository = animalRepository;
    }

    @PostMapping(path="/task06/create")
    public void createAndSaveAnimal (@RequestBody Animal animal) {
        animalRepository.save(animal);
    }

    @GetMapping(path="/task06/getall")
    public List<Animal> getAllAnimals() {
        return animalRepository.findAll();
    };
}
