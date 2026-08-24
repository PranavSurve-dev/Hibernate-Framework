package repository;

import entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class EmployeeRepository {

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("surve");
	private EntityManager em = emf.createEntityManager();
	private EntityTransaction et = em.getTransaction();
	
	public void addEmployee(Employee employee) {
		try {
			et.begin();
			em.persist(employee);
			et.commit();
			System.out.println("saved");
		} catch (Exception e) {
		et.rollback();
		}
	}
}
