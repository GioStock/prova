package com.generation.testgit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="editoreee")
public class Editori {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
}
