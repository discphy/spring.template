package com.discphy.openkakao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class OpenKakaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenKakaoApplication.class, args);
    }

}
