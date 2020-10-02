package com.assignment.revise.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "student")
public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9057474635790205594L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id")
	private Integer sId;

	@Column(name = "student_name")
	private String sName;

	@Column(name = "student_marks")
	private Integer sMarks;

	@OneToMany(cascade = CascadeType.ALL,mappedBy = "student", fetch = FetchType.LAZY)
	@JsonManagedReference
	private List<Relative> relatives=new ArrayList<Relative>();

	public Integer getsId() {
		return sId;
	}

	public void setsId(Integer sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public Integer getsMarks() {
		return sMarks;
	}

	public void setsMarks(Integer sMarks) {
		this.sMarks = sMarks;
	}

	public List<Relative> getRelatives() {
		return relatives;
	}

	public void setRelatives(List<Relative> relatives) {
		this.relatives = relatives;
	}


	
}
