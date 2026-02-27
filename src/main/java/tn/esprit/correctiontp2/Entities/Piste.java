package tn.esprit.correctiontp2.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
public class Piste {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numPiste;

    private String namePiste;

    @Enumerated(EnumType.STRING)
    private Color color;

    private int length;
    private int slope;

    @ManyToMany(mappedBy = "pistes")
    private Set<Skier> skiers;
}


