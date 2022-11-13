package dev.fmagallanes97.backendportfolio.skill;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService {

    private final SkillRepository repository;

    public SkillService(SkillRepository repository) {
        this.repository = repository;
    }

    public Skill save(Skill skill) {
        return repository.save(skill);
    }

    public Skill findById(Long id) {
        return repository.findById(id).orElseThrow(RuntimeException::new);
    }

    public List<Skill> findAllByResumeId(Long id) {
        return repository.findAllByResumeId(id);
    }

    public Skill updateById(Long id, Skill skill) {
        Skill probableSkill = repository.findById(id).orElseThrow(RuntimeException::new);

        probableSkill.setName(skill.getName());
        probableSkill.setType(skill.getType());
        probableSkill.setResume(skill.getResume());

        return repository.save(probableSkill);
    }

    public void deleteById(Long id) {
        Skill probableSkill = repository.findById(id).orElseThrow(RuntimeException::new);
        repository.delete(probableSkill);
    }
}