package com.example.demo.serviceImpl;

import com.example.demo.entites.Project;
import com.example.demo.repos.ProjectRepo;
import com.example.demo.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectRepo projectRepo;


    @Override
    public Project saveProject(Project project) {
        return projectRepo.save(project);
    }
}
