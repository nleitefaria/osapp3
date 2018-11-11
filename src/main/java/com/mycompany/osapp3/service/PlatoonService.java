package com.mycompany.osapp3.service;

import java.util.List;
import com.mycompany.osapp3.entity.Platoon;

public interface PlatoonService
{	
	Long count() ;
	List<Platoon> findAll();
	
}
