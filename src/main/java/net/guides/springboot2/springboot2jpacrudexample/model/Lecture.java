package net.guides.springboot2.springboot2jpacrudexample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lecture")
public class Lecture {
	
	private long id;
	private String name;
	private String age;
	private String major;
	private String address;
	
	public Lecture(String name, String age, String major, String address) {
		this.name = name;
		this.age = age;
		this.major = major;
		this.address = address;
	}
	
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO ) 

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	@Column( name = "name", nullable = false )
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Column( name = "age", nullable = false )
	
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	@Column( name = "major", nullable = false )
	
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	@Column( name = "address", nullable = false )
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Lecture [id=" + id + ", name=" + name + ", age=" + age + ", major=" + major
				+ "]";
	}

	
}