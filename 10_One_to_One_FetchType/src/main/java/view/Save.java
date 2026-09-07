package view;

import entity.Car;
import entity.Engine;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Save {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pranav");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		

		// Only car will be fetched
		Car car = em.find(Car.class, 101);
		
		//Now the engine will be fetched
		Engine e = car.getEngine();
		car.setBrand("porsche");
		car.setPrice(1000000);
		
		e.setType("V8");
		e.setHp(500);
		
		System.out.println(car);
		System.out.println(e);
	}

}