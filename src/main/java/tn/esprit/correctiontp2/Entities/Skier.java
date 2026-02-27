package tn.esprit.correctiontp2.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
public class Skier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numSkier;

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String city;

    @ManyToMany
    private List<Piste> pistes;

    @OneToMany(mappedBy = "skier")
    private List<Registration> registrations;

    @OneToOne(mappedBy = "skier")
    private Subscription subscription;
}

