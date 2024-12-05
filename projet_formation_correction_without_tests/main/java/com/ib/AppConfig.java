package com.ib;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
// par défaut => @ComponentScan == @ComponentScan("com.ib")
@ComponentScan
public class AppConfig {

	@Bean
	// @Scope("singleton")
	@Scope("prototype")
	public Book createBook() {
		Book b = new Book();
		b.setId(9999);
		return b;
	}

	//@Bean
	//@Scope("prototype")
	public Person createPerson() {
		Person p = new Person();
		p.setName("Goku");
		return p;
	}
}
