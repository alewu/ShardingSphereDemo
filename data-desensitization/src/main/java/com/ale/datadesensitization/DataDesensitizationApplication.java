package com.ale.datadesensitization;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ale.datadesensitization.mapper")
public class DataDesensitizationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataDesensitizationApplication.class, args);
	}

}
