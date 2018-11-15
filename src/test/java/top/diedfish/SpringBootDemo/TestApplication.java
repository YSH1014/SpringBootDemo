package top.diedfish.SpringBootDemo;

import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication{
    @Test
    public void start(){
        SpringApplication application = new SpringApplication(Application.class);
        application.run(Application.class);
    }
}
