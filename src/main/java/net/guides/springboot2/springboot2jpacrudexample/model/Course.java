package net.guides.springboot2.springboot2jpacrudexample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course {

	private long id;
	private String nameCourse;

	
	
	
	public Course(String nameCourse) {
		this.nameCourse = nameCourse;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "nama_course", nullable = false)
	public String getnameCourse() {
		return nameCourse;
	}
	public void setnameCourse(String nameCourse) {
		this.nameCourse = nameCourse;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", nameCourse=" + nameCourse + "]";
	}
	
}