package com.mycompany.osapp3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.osapp3.entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {

}
