package com.example.demo.serviceImpl;

import com.example.demo.entites.Project;
import com.example.demo.repos.ProjectRepo;
import com.example.demo.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    private ProjectRepo projectRepo;

    @Override
    public Project saveProject(Project p) {
        return projectRepo.save(p);
    }

    @Override
    public Project getProjectById(Long id) {
        Optional<Project> project = projectRepo.findById(id);
        return project.orElse(null);
    }

    @Override
    public List<Project> getAllProjects() {
        return projectRepo.findAll();
    }

    @Override
    public Project updateProject(Long id, Project p) {
        Optional<Project> project = projectRepo.findById(id);
        if(project.isPresent()){
            Project updateProject = project.get();
            updateProject.setProjectName(updateProject.getProjectName());
            updateProject.setEmployee(updateProject.getEmployee());
            return projectRepo.save(updateProject);
        }else{
            return null;
        }
    }

    @Override
    public void deleteProject(Long id) {
        projectRepo.deleteById(id);
    }
}
