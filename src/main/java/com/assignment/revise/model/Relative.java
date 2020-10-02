package com.assignment.revise.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="relative")
public class Relative implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1650291777143760531L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "relation_id")
	private Long rId;
	
	@Column(name="relative_name")
	private String rName;
	
	
	@Column(name="relation")
	private String relation;
	
	@ManyToOne(fetch= FetchType.EAGER,cascade=CascadeType.ALL)
    @JoinColumn(name = "student_id")
	@JsonBackReference
	private Student student;


	public Long getrId() {
		return rId;
	}


	public void setrId(Long rId) {
		this.rId = rId;
	}


	public String getrName() {
		return rName;
	}


	public void setrName(String rName) {
		this.rName = rName;
	}


	public String getRelation() {
		return relation;
	}


	public void setRelation(String relation) {
		this.relation = relation;
	}


	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	} 
	

}
 