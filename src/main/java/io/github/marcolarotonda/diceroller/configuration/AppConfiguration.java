package io.github.marcolarotonda.diceroller.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class AppConfiguration {

    @Bean
    public Random random() {
        return new Random();
    }
}
