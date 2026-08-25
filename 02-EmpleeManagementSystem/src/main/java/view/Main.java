package view;

import java.util.Scanner;

import entity.Employee;
import repository.EmployeeRepository;

public class Main {

	static EmployeeRepository employeeRepository = new EmployeeRepository();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Add Employee");
		System.out.println("2.Find Employee Based On Id");
		System.out.println("3.Update Employee Based On Id");
		System.out.println("4.delete Employee Based On Id");
		System.out.println("5.Add multiple Employee");
		
		System.out.println("Enter the option :");
		int option = sc.nextInt();
		switch (option) {
		case 1:
			System.out.println("Id :");
			int id = sc.nextInt();
			System.out.println("Name :");
			String name = sc.next();
			System.out.println("Salary :");
			Double salary = sc.nextDouble();
			System.out.println("Dept :");
			String dept = sc.next();
			Employee employee = new Employee(id,name,salary,dept);
			employeeRepository.addEmployee(employee);
			break;
			case 2:
				System.out.println("ID : ");
				id = sc.nextInt();
				System.out.println(employeeRepository.findEmployee(id));
				break;
				
			case 3:
				System.out.println("ID : ");
				id = sc.nextInt();
				System.out.println(employeeRepository.updateEmployee(id));
				break;

			case 4:
				System.out.println("ID : ");
				id = sc.nextInt();
				employeeRepository.deleteEmployee(id);
				break;
				
			case 5:
				System.out.println("ID : ");
				id = sc.nextInt();
				employeeRepository.findAllEmployee();
				System.out.println(employeeRepository.findAllEmployee());
				break;

		default:
			break;
		}
	}
}