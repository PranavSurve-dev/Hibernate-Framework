package demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Studentt {
    @Id
	private int id;
    @Column(length = 10)
	private String name;
    @Column(name = "age",unique = true, nullable = false )
	private int stuAge;
	
	public Studentt() {
		
	}
	
	public Studentt(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.stuAge = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getStuAge() {
		return stuAge;
	}

	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}
	
	
}
