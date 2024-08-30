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
import com.edu.daniel.PracticaJPA1.repositories.ILocalRepository;

@SpringBootApplication
public class PracticaJpa1Application implements CommandLineRunner{

	@Autowired
	private IClienteRepository clienteRepo;

	@Autowired
	private ILocalRepository localRepo;

	public static void main(String[] args) {
		SpringApplication.run(PracticaJpa1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	//	System.out.println(clienteRepo.findAll());
	System.out.println(clienteRepo.findByCategoria(Categoria.VIP));

	// 1º Buscar por categoria VIP
	// System.out.println(clienteRepo.findByCategoria(Categoria.VIP));
	// 2º Buscar por categoria VIP y mayores de 20
	// System.out.println("VIPs con más de 20 años: " + clienteRepo.findByCategoriaAndClienteGreaterThan(Categoria.VIP, LocalDate.of(2014, 12, 31)));
	// 3ºBuscar locales de aforo entre 50 y 100
	System.out.println(localRepo.findByAforoMaxBetween(50, 100));
	// 4º encontrar un cliente según su id y poder ver en qué locales sale de fiesta

	
	}
	


}

	
