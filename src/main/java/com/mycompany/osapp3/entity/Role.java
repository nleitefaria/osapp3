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
@Table(name="role", schema="public")
public class Role  implements java.io.Serializable {

     private int id;
     private String name;
     @JsonIgnore
     private Set<Employee> employees = new HashSet<Employee>(0);

    public Role() {
    }

	
    public Role(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Role(int id, String name, Set<Employee> employees) {
       this.id = id;
       this.name = name;
       this.employees = employees;
    }
   
    @Id   
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
  
    @Column(name="name", nullable=false)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(fetch=FetchType.EAGER, mappedBy="role")
    public Set<Employee> getEmployees() {
        return this.employees;
    }
    
    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
}