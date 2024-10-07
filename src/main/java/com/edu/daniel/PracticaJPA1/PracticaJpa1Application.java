package com.edu.daniel.PracticaJPA1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.edu.daniel.PracticaJPA1.repositories.IClienteRepository;

@SpringBootApplication
public class PracticaJpa1Application implements CommandLineRunner{

	@Autowired
	private IClienteRepository clienteRepo;

	public static void main(String[] args) {
		SpringApplication.run(PracticaJpa1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(clienteRepo.findAll());
	}


	
}
