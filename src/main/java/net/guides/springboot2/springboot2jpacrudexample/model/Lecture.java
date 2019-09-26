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
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO ) 
	
	@Column( name = "name", nullable = false )
	private String name;
	
	@Column( name = "age", nullable = false )
	private String age;
	
	@Column( name = "major", nullable = false )
	private String major;
	
	@Column( name = "address", nullable = false )
	private String address;
	
	public Lecture( String name, String age, String major, String address ) {
		this.name = name;
		this.age = age;
		this.major = major;
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		return "Lecture [id=" + id + ", name=" + name + ", age=" + age + ", major=" + major
				+ "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}