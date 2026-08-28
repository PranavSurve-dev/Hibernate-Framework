package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String brands;
	private double price;
	@OneToOne
	private Engine engine;
	public Car () {
		
	}
	public Car(String brands, double price, Engine engine) {
		
		this.brands = brands;
		this.price = price;
		this.engine = engine;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrands() {
		return brands;
	}
	public void setBrands(String brands) {
		this.brands = brands;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", brands=" + brands + ", price=" + price + ", engine=" + engine + "]";
	}
	
	
}