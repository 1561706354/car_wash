package com.car_wash;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan
@SpringBootApplication
public class CarWashApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarWashApplication.class, args);
    }

}
