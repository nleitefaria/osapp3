package com.mycompany.osapp3.dto;

import java.math.BigDecimal;

public class ProjectDTO 
{	
	private int id;
    private String name;
    private BigDecimal allocation;
       
    public ProjectDTO() {
		
	}
    
    public ProjectDTO(int id, String name) 
	{	
		this.id = id;
		this.name = name;
	}
    
	public ProjectDTO(int id, String name, BigDecimal allocation) 
	{	
		this.id = id;
		this.name = name;
		this.allocation = allocation;
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

	public BigDecimal getAllocation() {
		return allocation;
	}

	public void setAllocation(BigDecimal allocation) {
		this.allocation = allocation;
	}
	
    
    
    
}
