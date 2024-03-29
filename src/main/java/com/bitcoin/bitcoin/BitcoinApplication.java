package com.bitcoin.bitcoin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.bitcoin.bitcoin.dao")
@EnableFeignClients
public class BitcoinApplication {

    public static void main(String[] args) {
        SpringApplication.run(BitcoinApplication.class, args);
    }

}
