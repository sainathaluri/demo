package com.example.demo.service;

import com.example.demo.entites.Project;

import java.util.List;

public interface ProjectService {
    Project saveProject(Project p);

    Project getProjectById(Long id);

    List<Project> getAllProjects();

    Project updateProject(Long id, Project p);

    void deleteProject(Long id);

}
