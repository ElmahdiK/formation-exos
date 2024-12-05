package com.ib;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Book book = ctx.getBean(Book.class);
		book.setId(95468);
		book.setName("Spring In Action");
		System.out.println(book);

		Person person = ctx.getBean(Person.class);
		person.setName("Mario");
		System.out.println(person);
		
		Person p1 = ctx.getBean(Person.class);
		p1.setName("Luigi");
		System.out.println(p1);
	}

}
