package com.mycompany.osapp3.dto;

import java.util.Date;

public class EmployeeDTO 
{
	private int id;
	private String name;
    private Date startDate;
    private Integer platoonId;   
    private Integer roleId;
    
    public EmployeeDTO() 
    {		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Integer getPlatoonId() {
		return platoonId;
	}

	public void setPlatoonId(Integer platoonId) {
		this.platoonId = platoonId;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}   
}
