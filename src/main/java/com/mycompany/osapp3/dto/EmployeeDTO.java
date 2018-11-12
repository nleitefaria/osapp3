package com.mycompany.osapp3.dto;

public class EmployeeDTO 
{
	private int id;
	private String name;
    private String startDate;
    private String platoon;   
    private String role;
    
    public EmployeeDTO() 
    {		
	}

	public EmployeeDTO(int id, String name, String startDate, String platoon, String role) 
	{
		this.id = id;
		this.name = name;
		this.startDate = startDate;
		this.platoon = platoon;
		this.role = role;
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

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getPlatoon() {
		return platoon;
	}

	public void setPlatoon(String platoon) {
		this.platoon = platoon;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
