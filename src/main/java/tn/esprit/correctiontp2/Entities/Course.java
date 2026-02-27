package tn.esprit.correctiontp2.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numCourse;

    private int level;

    @Enumerated(EnumType.STRING)
    private TypeCourse typeCourse;

    @Enumerated(EnumType.STRING)
    private Support support;

    private float price;
    private int timeSlot;

    @OneToMany(mappedBy = "course")
    private List<Registration> registrations;

    @ManyToOne
    private Instructor instructor;
}
