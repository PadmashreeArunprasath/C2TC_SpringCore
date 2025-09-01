package com.tnsif.Project.Project_01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Load Spring configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("book.xml");

        // Get Library bean
        Library library = (Library) context.getBean("library");

        // Display books
        library.displayBooks();
	}

}
