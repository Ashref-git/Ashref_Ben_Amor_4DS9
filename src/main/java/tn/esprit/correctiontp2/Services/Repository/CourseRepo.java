package tn.esprit.correctiontp2.Services.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.correctiontp2.Entities.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course, Long> {
    // Méthodes personnalisées si besoin
}
