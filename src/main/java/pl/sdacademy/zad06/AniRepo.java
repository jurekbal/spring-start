package pl.sdacademy.zad06;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AniRepo extends JpaRepository <AnimalEnt, Long> {
}
