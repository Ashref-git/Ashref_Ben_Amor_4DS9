package tn.esprit.ashref_ben_amor_4ds9.Entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChambre;
    private Long nomChambre;
    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Reservation> reservations;
    @ManyToOne
    Bloc bloc;
}

