package com.cylin.gracefulresponse;

import com.feiniaojin.gracefulresponse.EnableGracefulResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableGracefulResponse
public class GracefulResponseApplication {

    public static void main(String[] args) {
        SpringApplication.run(GracefulResponseApplication.class, args);
    }

}
