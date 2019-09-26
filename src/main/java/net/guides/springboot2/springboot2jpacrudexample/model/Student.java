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
	private String nama_Student;
	private String semester_Student;
    private String alamat_Student;
    private String jurusan_Student;
	
	public Student() {
		
	}
	
	public Student(String nama_studen, String lastName, String emailId) {
		
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
		return "Student [id=" + id + ", nama Student=" + nama_Student + ", semester Student=" + semester_Student + ", alamat Student=" + alamat_Student + ", Jurusan Student=" + jurusan_Student 
				+ "]";
	}
	
}
