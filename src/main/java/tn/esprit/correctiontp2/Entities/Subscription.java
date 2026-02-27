package tn.esprit.correctiontp2.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Subscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numSub;

    private LocalDate startDate;
    private LocalDate endDate;
    private float price;

    @Enumerated(EnumType.STRING)
    private TypeSubscription typeSub;

    @OneToOne
    private Skier skier;
}
