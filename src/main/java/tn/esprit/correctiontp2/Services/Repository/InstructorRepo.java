package tn.esprit.correctiontp2.Services.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.correctiontp2.Entities.Instructor;

@Repository
public interface InstructorRepo extends JpaRepository<Instructor, Long> {
    // Méthodes personnalisées si besoin
}