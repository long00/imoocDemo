package com.big.king;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.biggg.king.mapper")
public class KingApplication {

    public static void main(String[] args) {
        SpringApplication.run(KingApplication.class, args);
    }

}
