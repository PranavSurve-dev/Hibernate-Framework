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
		
		Student std = new Student(123,"Rohit",10);
		
		try {
			
			et.begin();
			em.persist(std);
			et.commit();
			
		} catch (Exception e) {
			et.rollback();
			
		}
	}
}
