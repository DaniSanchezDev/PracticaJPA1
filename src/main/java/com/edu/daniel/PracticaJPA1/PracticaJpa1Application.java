package com.edu.daniel.PracticaJPA1;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.edu.daniel.PracticaJPA1.model.entities.Cliente;
import com.edu.daniel.PracticaJPA1.model.enumerated.Categoria;
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
	//	System.out.println(clienteRepo.findAll());


	// 1º Buscar por categoria VIP
	System.out.println(clienteRepo.findByCategoria(Categoria.VIP));
	// 2º Buscar por categoria VIP y mayores de 20
	// System.out.println("VIPs con más de 20 años: " + clienteRepo.findByCategoriaAndClienteGreaterThan(Categoria.VIP, LocalDate.of(2014, 12, 31)));

	
	}
	


}

	
