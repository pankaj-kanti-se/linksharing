package com.springbootjpa;

import com.springbootjpa.domain.User;
import com.springbootjpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Arrays;
import java.util.Optional;


@SpringBootApplication
public class SpringbootjpaApplication{


	public static void main(String[] args) {
		SpringApplication.run(SpringbootjpaApplication.class, args);
	}

}
