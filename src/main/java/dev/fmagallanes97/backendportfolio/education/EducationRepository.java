package dev.fmagallanes97.backendportfolio.education;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EducationRepository extends JpaRepository<Education, Long> {
    public List<Education> findAllByResumeId(Long id);
}
