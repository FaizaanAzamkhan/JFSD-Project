package com.example.projectdemo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="admindb")
public class AdminDetails {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String studentName;
    private String studentId;
    private String counselorName;
    private String counselingPeriod;
    
    public AdminDetails() {
    	
    }

	public AdminDetails(Long id, String studentName, String studentId, String counselorName, String counselingPeriod) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.studentId = studentId;
		this.counselorName = counselorName;
		this.counselingPeriod = counselingPeriod;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getCounselorName() {
		return counselorName;
	}

	public void setCounselorName(String counselorName) {
		this.counselorName = counselorName;
	}

	public String getCounselingPeriod() {
		return counselingPeriod;
	}

	public void setCounselingPeriod(String counselingPeriod) {
		this.counselingPeriod = counselingPeriod;
	}
    
    
}
