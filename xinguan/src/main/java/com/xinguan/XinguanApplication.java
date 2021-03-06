package com.xinguan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.xinguan.mapper")
public class XinguanApplication {

    public static void main(String[] args) {
        SpringApplication.run(XinguanApplication.class, args);
    }

}
