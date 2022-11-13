package dev.fmagallanes97.backendportfolio.project;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    public List<Project> findAllByResumeId(Long id);
}