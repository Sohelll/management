package com.riskmanagement.model;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.riskmanagement.repo.UserRepo;

@Configuration
public class LoadData {
	
	
		
		@Bean
		CommandLineRunner initDB(UserRepo userrepo) {
			
			return args -> {
				userrepo.save(new User("akash","soni","d@gmail.com", "abcd", 23213,
						true,324124124));
				
			};
		

	}

}
