package org.aijie.springbootdemohelleword;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"org.aijie.springbootdemohelleword.dao"})

public class SpringbootDemoHellewordApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoHellewordApplication.class, args);
	}

}
