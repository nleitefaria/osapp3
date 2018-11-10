package com.mycompany.osapp3.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "project", schema = "public")
public class Project implements java.io.Serializable 
{
	private int id;
	private String name;
	@JsonIgnore
	private Set<EmployeeProject> employeeProjects = new HashSet<EmployeeProject>(0);

	public Project() {
	}

	public Project(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Project(int id, String name, Set<EmployeeProject> employeeProjects) {
		this.id = id;
		this.name = name;
		this.employeeProjects = employeeProjects;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "name", nullable = false)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "project")
	public Set<EmployeeProject> getEmployeeProjects() {
		return this.employeeProjects;
	}

	public void setEmployeeProjects(Set<EmployeeProject> employeeProjects) {
		this.employeeProjects = employeeProjects;
	}
}