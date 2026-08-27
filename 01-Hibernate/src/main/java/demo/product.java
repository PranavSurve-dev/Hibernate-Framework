package demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class product {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String name;
	private double price;
	
	public product() {
		
	}
	public product(String name, double price) {
		super();
	
		this.name = name;
		this.price = price;
	}
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}
