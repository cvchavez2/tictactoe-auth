package com.carlosgroup.tictactoeauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;


@SpringBootApplication
@EnableResourceServer
@EnableAuthorizationServer
public class TictactoeAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(TictactoeAuthApplication.class, args);
	}

}
