package com.mycompany.osapp3.entity;
// Generated 10/nov/2018 23:35:23 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Platoon generated by hbm2java
 */
@Entity
@Table(name="platoon",schema="public")
public class Platoon  implements java.io.Serializable {


     private int id;
     private String name;
     @JsonIgnore
     private Set<Employee> employees = new HashSet<Employee>(0);

    public Platoon() {
    }

	
    public Platoon(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Platoon(int id, String name, Set<Employee> employees) {
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="platoon")
    public Set<Employee> getEmployees() {
        return this.employees;
    }
    
    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }




}


