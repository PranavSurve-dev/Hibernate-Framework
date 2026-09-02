package view;

import entity.Car;
import entity.Engine;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
	  EntityManagerFactory emf  = Persistence.createEntityManagerFactory("pranav");
	  EntityManager em = emf.createEntityManager();
	  EntityTransaction et = em.getTransaction();
	  
	  Car car = new Car();
	  car.setBrands("Audi");
	  car.setPrice(10000);
	  
	  Engine engine = new Engine();
	  engine.setType("Diesel");
	  engine.setHp(1500);
	  
	  car.setEngine(engine);
	  engine.setCar(car);
	  
	  et.begin();
	  em.persist(engine);
	  em.persist(car);
	  et.commit();
	    	
	}
}