package net.guides.springboot2.springboot2jpacrudexample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	private long id;
	private String id_Student;
	private String nama_Student;
	private String semester_Student;
    private String alamat_Student;
    private String jurusan_Student;
	
	public Student() {
		
	}
	
	public Student(String firstName, String lastName, String emailId) {
		this.id_Student = id_Student;
		this.nama_Student = nama_Student;
		this.semester_Student = semester_Student;
        this.alamat_Student = alamat_Student;
        this.jurusan_Student = jurusan_Student;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "id_Student", nullable = false)
	public String getid_Student() {
		return id_Student;
	}
	public void setid_Student(String id_Student) {
		this.id_Student = id_Student;
	}
	
	@Column(name = "nama_Student", nullable = false)
	public String getnama_Student() {
		return nama_Student;
	}
	public void setnama_Student(String nama_Student) {
		this.nama_Student = nama_Student;
	}
	
	@Column(name = "semester_Student", nullable = false)
	public String getsemester_Student() {
		return semester_Student;
	}
	public void setsemester_Student(String semester_Student) {
		this.semester_Student = semester_Student;
	}

    @Column(name = "alamat_Student", nullable = false)
	public String getalamat_Student() {
		return alamat_Student;
	}
	public void setalamat_Student(String alamat_Student) {
		this.alamat_Student = alamat_Student;
	}


    @Column(name = "jurusan_Student", nullable = false)
	public String getjurusan_Student() {
		return jurusan_Student;
	}
	public void setjurusan_Student(String jurusan_Student) {
		this.jurusan_Student = jurusan_Student;
	}
    

	@Override
	public String toString() {
		return "Student [id=" + id + ", id_Student=" + id_Student + ", nama_Student=" + nama_Student + ", semester_Student=" + semester_Student
				+ "alamat_Student="+ alamat_Student+ "jurusan_Student="+ jurusan_Student  +"]";
	}
	
}
