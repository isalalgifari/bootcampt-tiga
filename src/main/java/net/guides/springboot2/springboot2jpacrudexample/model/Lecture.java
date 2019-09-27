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
<<<<<<< HEAD
	private String major;
	private String address;
	
	public Lecture(String name, String age, String major, String address) {
		this.name = name;
		this.age = age;
		this.major = major;
		this.address = address;
	}
=======
    private String major;
    private String address;
>>>>>>> 7f6cf6f307d9c482ba24437ad34b6b1bd979a569
	
		
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
	
	@Column(name = "name", nullable = false)
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	
	@Column(name = "age", nullable = false)
	public String getage() {
		return age;
	}
	public void setage(String age) {
		this.age = age;
	}

    @Column(name = "major", nullable = false)
	public String getmajor() {
		return major;
	}
	public void setmajor(String major) {
		this.major = major;
	}


    @Column(name = "address", nullable = false)
	public String getaddress() {
		return address;
	}
	public void setaddress(String address) {
		this.address = address;
	}
    

	@Override
	public String toString() {
		return "Student [id=" + id + ", Nama Lecture=" + name + ", Age Lecture=" + age + 
			   ", Major Lucture="	+ major + ", address Lecture=" + address + "]";
	}
	
}
