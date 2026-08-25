package repository;

import java.util.List;

import entity.Employee;
import exception.EmployeeNotFoundException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class EmployeeRepository {

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("surve");
	private EntityManager em = emf.createEntityManager();
	private EntityTransaction et = em.getTransaction();
	//1
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
	//2
	public Employee findEmployee(int id) {
		Employee employee = em.find(Employee.class, id);
		if(employee!=null)
		return employee;
		else {
			throw new EmployeeNotFoundException("Employee Not Found");
		}
	}
	//3
		public Employee updateEmployee (int id) {
			Employee employee = findEmployee(id);
			double existingSalary = employee.getSalary();
			double updateSalary = existingSalary + (10.0/100*existingSalary);
			employee.setSalary(updateSalary);
			
			try{
				et.begin();
				em.merge(employee);
				et.commit();
			}catch (Exception e) {
				et.rollback();
			}
			return employee;
		}
		//4
		public void deleteEmployee (int id) {
			Employee employee = findEmployee(id);
			
			try{
				et.begin();
				em.remove(employee);
				et.commit();
				System.out.println("deleted");
			}catch (Exception e) {
				et.rollback();
			}
		}
			//5
			public List<Employee> findAllEmployee() {
				String jpql = "select e from Employee e";
				Query query = em.createQuery(jpql);
				return query.getResultList();
				
			}
		}