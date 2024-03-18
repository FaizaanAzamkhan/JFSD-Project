package com.example.projectdemo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="peopledb")
public class People {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String studentName;
	    private String studentId;
	    private String branch;
	    private double cgpa;
	    private int backlogs;
	    private String feedback;
	    
	    public People() {
	    	
	    }

		public People(Long id, String studentName, String studentId, String branch, double cgpa, int backlogs,
				String feedback) {
			super();
			this.id = id;
			this.studentName = studentName;
			this.studentId = studentId;
			this.branch = branch;
			this.cgpa = cgpa;
			this.backlogs = backlogs;
			this.feedback = feedback;
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

		public String getBranch() {
			return branch;
		}

		public void setBranch(String branch) {
			this.branch = branch;
		}

		public double getCgpa() {
			return cgpa;
		}

		public void setCgpa(double cgpa) {
			this.cgpa = cgpa;
		}

		public int getBacklogs() {
			return backlogs;
		}

		public void setBacklogs(int backlogs) {
			this.backlogs = backlogs;
		}

		public String getFeedback() {
			return feedback;
		}

		public void setFeedback(String feedback) {
			this.feedback = feedback;
		}
	
	
}
