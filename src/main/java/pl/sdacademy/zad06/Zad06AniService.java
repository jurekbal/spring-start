package pl.sdacademy.zad06;


import java.util.List;

public class Zad06AniService {

    private final AniRepo aniRepo;

    public Zad06AniService(AniRepo aniRepo) {
        this.aniRepo = aniRepo;
    }

    public void save(AnimalEnt animal) {
        aniRepo.save(animal);
    }

    public List<AnimalEnt> findAll() {
        return aniRepo.findAll();
    }
}
