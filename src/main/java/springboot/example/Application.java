package springboot.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String home(){
        return "hello";
    }

    public static void main(String[] args) {
        System.out.println("slx");
        SpringApplication.run(Application.class,args);
    }
}
