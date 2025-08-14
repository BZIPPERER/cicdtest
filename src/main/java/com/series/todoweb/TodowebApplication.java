package com.series.todoweb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodowebApplication implements CommandLineRunner 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(TodowebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{
		// invoked on startup of application server
		System.out.println("Hello BENJAMIN forever!");
	}

}
