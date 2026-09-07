package cascading;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pranav");
		EntityManager em1 = emf.createEntityManager();
		EntityManager em2= emf.createEntityManager();
		EntityTransaction et = em1.getTransaction();
		
		Car c1 = new Car();
		c1.setBrand("TATA");
		c1.setPrice(50000);
		
		Engine e1 = new Engine();
		e1.setType("Diesel");
		e1.setHp(1200);
		
		c1.setEngine(e1);
		
		et.begin();
		em1.persist(c1); //Engine also persisted
		et.commit();
		
		
	}

}
