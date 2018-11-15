package top.diedfish.SpringBootDemo;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.*;
import top.diedfish.SpringBootDemo.Model.Users;

@SpringBootApplication
public class Application {
    public  static void main(String[] args){
        SpringApplication application = new SpringApplication(Application.class);
        System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(Application.class,args);

    }
}
