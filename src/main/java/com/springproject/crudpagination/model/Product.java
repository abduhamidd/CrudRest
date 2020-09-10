package com.springproject.crudpagination.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Id;
	private String name;
	private String quantity;
	private String price;
	

}
