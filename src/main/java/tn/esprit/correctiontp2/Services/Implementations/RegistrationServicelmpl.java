package tn.esprit.correctiontp2.Services.Implementations;


import org.springframework.stereotype.Service;
import tn.esprit.correctiontp2.Entities.Registration;
import tn.esprit.correctiontp2.Services.Interfaces.IregistrationService;
import tn.esprit.correctiontp2.Services.Repository.RegistrationRepo;

import java.util.List;

@Service
public class RegistrationServicelmpl implements IregistrationService {
    private final RegistrationRepo registrationRepo;

    public RegistrationServicelmpl(RegistrationRepo registrationRepo) {
        this.registrationRepo = registrationRepo;
    }

    @Override
    public Registration addCourseRegistration(Registration registration) {
        return registrationRepo.save(registration);
    }

    @Override
    public Registration updateRegistration(Registration registration) {
        return registrationRepo.save(registration);
    }

    @Override
    public void deleteRegistration(Long id) {
        registrationRepo.deleteById(id);
    }

    @Override
    public Registration getRegistration(Long id) {
        return registrationRepo.findById(id).orElse(null);
    }

    @Override
    public List<Registration> getAllRegistrations() {
        return registrationRepo.findAll();
    }
}
