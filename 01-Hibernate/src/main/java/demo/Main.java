package demo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pranavSurve");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et  = em.getTransaction();
		
//		Studentt std = new Studentt(117,"pranav",20);
//		
//		try {
//			
//			et.begin();
//			em.persist(std);
//			et.commit();
//			System.out.println("Record inserted successfully");
//			
//		} catch (Exception e) {
//			et.rollback();
//			System.out.println("Record not inserted");
//			
//		}
		
//		product p1 = new product("Laptop", 50000);

//		Studentt s = new Studentt(103,"pranav",24);
//		System.out.println(s);
		
		marker m1 = new marker("Red", 80);
		marker marker = em.find(marker.class, 1);
		
		et.begin();

			m1.setColour("Blue");

		et.commit();
	}
}
