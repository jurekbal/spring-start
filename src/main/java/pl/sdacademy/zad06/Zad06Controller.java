package pl.sdacademy.zad06;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Zad06Controller {

    private final Zad06AniService animalService;

    public Zad06Controller(Zad06AniService animalService) {
        this.animalService = animalService;
    }

    @PostMapping(path = "/task06/create")
    public void createAndSaveAnimal(@RequestBody AnimalEnt animal) {
        animalService.save(animal);
    }

    @GetMapping(path = "/task06/getall")
    public List<AnimalEnt> getAllAnimals() {
        return animalService.findAll();
    }

}

