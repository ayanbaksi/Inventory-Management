package com.webapp.demo.Model;

import java.util.List;

import org.springframework.context.annotation.Description;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "pro")
public class Product {

	@Id
	@GeneratedValue(generator = "gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "gen", sequenceName = "seq", initialValue = 10, allocationSize = 1)
	private int id;
	private String name;
	private String Description;
	private double price;
	private int quantity;
	private String location;
	@Column(unique = true)
	private String barcode;
	@OneToMany(mappedBy = "product", cascade = CascadeType.REMOVE)
	private List<Inventory> inventory;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

}
