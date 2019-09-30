package io.ikka.demoproducts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DemoProductsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoProductsApplication.class, args);
    }

}
