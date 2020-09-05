package pl.sdacademy.zad06;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class zad06Config {

    @Bean
    public Zad06AniService zad06Ani(AniRepo aniRepo) {
        return new Zad06AniService(aniRepo);
    }

}
