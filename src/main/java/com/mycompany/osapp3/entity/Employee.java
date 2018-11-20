package com.mycompany.osapp3.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="employee",schema="public")
public class Employee  implements java.io.Serializable 
{
     private int id;    
     private Platoon platoon;    
     private Role role;
     private String name;
     private Date startDate;
     @JsonIgnore
     private Set<EmployeeProject> employeeProjects = new HashSet<EmployeeProject>(0);

    public Employee() {
    }
    
    public Employee(int id, Platoon platoon, Role role, String name, Date startDate) {
        this.id = id;
        this.platoon = platoon;
        this.role = role;
        this.name = name;
        this.startDate = startDate;
    }
    
    public Employee(int id, Platoon platoon, Role role, String name, Date startDate, Set<EmployeeProject> employeeProjects) {
       this.id = id;
       this.platoon = platoon;
       this.role = role;
       this.name = name;
       this.startDate = startDate;
       this.employeeProjects = employeeProjects;
    }
   
    @Id 
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="platoon_id", nullable=false)
    public Platoon getPlatoon() {
        return this.platoon;
    }
    
    public void setPlatoon(Platoon platoon) {
        this.platoon = platoon;
    }

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="role_id", nullable=false)
    public Role getRole() {
        return this.role;
    }
    
    public void setRole(Role role) {
        this.role = role;
    }

    
    @Column(name="name", nullable=false)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="start_date", nullable=false, length=13)
    public Date getStartDate() {
        return this.startDate;
    }
    
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @OneToMany(fetch=FetchType.EAGER, mappedBy="employee")
    public Set<EmployeeProject> getEmployeeProjects() {
        return this.employeeProjects;
    }
    
    public void setEmployeeProjects(Set<EmployeeProject> employeeProjects) {
        this.employeeProjects = employeeProjects;
    }
}