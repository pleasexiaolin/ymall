package com.xiaolin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@MapperScan("com.xiaolin.mapper")
@ServletComponentScan //开启对Servlet组件的支持
@SpringBootApplication
public class YMallApplication {
    public static void main(String[] args) {
        SpringApplication.run(YMallApplication.class, args);
    }
}