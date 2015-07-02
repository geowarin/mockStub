package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MockStubApplication {

    public static void main(String[] args) {
        SpringApplication.run(MockStubApplication.class, args);
    }

    @Bean
    public Runner runner() {
        return new Runner();
    }
}
