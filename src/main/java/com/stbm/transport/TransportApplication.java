package com.stbm.transport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;


/**
 * @author Administrator
 */
@SpringBootApplication
@MapperScan("com.stbm.transport.daos")
public class TransportApplication {

    public static void main(String[] args) {

        SpringApplication.run(TransportApplication.class, args);

    }

}
