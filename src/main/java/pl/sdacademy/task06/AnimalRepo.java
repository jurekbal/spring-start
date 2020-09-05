package pl.sdacademy.task06;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sdacademy.task02.Animal;

public interface AnimalRepo extends JpaRepository<Animal, Long> {
}
