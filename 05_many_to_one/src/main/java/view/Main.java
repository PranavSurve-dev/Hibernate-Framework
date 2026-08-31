package view;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import many_to_one.Book;
import many_to_one.Library;


public class Main {

	public static void main(String[] args) {
		
		  EntityManagerFactory emf  = Persistence.createEntityManagerFactory("pranav");
		  EntityManager em = emf.createEntityManager();
		  EntityTransaction et = em.getTransaction();
		  
		  Library l1  = new Library ("abc","Thane");
		  Library l2  = new Library ("xyz","Mumbai");
		  
		  Book b1 = new Book("abc",100,l1);
		  Book b2 = new Book("abc",100,l1);
		  Book b3 = new Book("abc",100,l1);
		  Book b4 = new Book("abc",100,l1);
		  
		  et.begin();
		  em.persist(l1);
		  em.persist(l2);
		  em.persist(b1);
		  em.persist(b2);
		  em.persist(b3);
		  em.persist(b4);
		  et.commit();
	}
}
