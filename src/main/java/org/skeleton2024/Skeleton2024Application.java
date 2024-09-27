package org.skeleton2024;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Skeleton2024Application {

    public static void main(String[] args) {
        SpringApplication.run(Skeleton2024Application.class, args);
    }

}
