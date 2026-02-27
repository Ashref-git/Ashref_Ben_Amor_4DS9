package tn.esprit.correctiontp2.Services.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.correctiontp2.Entities.Registration;

@Repository
public interface RegistrationRepo extends JpaRepository<Registration, Long> {
}