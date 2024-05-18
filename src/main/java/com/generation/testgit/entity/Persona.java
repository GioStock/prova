package com.generation.testgit.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int personaId;
	
	@Column(name = "nome")
	private String nome;
	private String cognome;
	private String indirizzo;
	private int civico;
	
	private Date data;
	
}

