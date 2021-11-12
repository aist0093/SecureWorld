package https;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecureWorldApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecureWorldApplication.class, args);
        System.out.println("HEllo world");
    }

}
