package demo;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class marker {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String colour;
	private double price;
	@CreationTimestamp
	private LocalDateTime creatTime;
	@UpdateTimestamp
	private LocalDateTime updateTime;
    	
	public marker () {
		
	}
	public marker(String colour, double price) {
		super();
			
		this.colour = colour;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "marker [id=" + id + ", colour=" + colour + ", price=" + price + "]";
	}
	
}
