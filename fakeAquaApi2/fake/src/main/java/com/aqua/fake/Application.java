package com.aqua.fake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan({"com.aqua.fake.configuracoes", "com.aqua.fake.controllers", "com.aqua.fake.entidades", "com.aqua.fake.repositorios" })
@ComponentScan({"com.aqua.fake.configuracoes", "com.aqua.fake.controllers", "com.aqua.fake.entidades", "com.aqua.fake.repositorios" })
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
// @EntityScan({"com.aqua.fake.entidades", "com.aqua.fake.repositorios", "com.aqua.fake.controllers", "com.aqua.fake.configuracoes" })
// @ComponentScan({"com.aqua.fake.entidades", "com.aqua.fake.repositorios", "com.aqua.fake.controllers", "com.aqua.fake.configuracoes" })
