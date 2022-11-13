package dev.fmagallanes97.backendportfolio.contact;

import dev.fmagallanes97.backendportfolio.resume.Resume;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "contact")
public class Contact {
    @Id
    private Long id;
    private String email;
    private String github;
    private String linkedin;
    @OneToOne
    @MapsId
    @JoinColumn(name = "resume_id")
    private Resume resume;
}