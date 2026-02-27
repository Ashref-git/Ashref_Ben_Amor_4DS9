package tn.esprit.correctiontp2.Services.Interfaces;


import tn.esprit.correctiontp2.Entities.Registration;

import java.util.List;

public interface IregistrationService {
    Registration addCourseRegistration(Registration registration);
    Registration updateRegistration(Registration registration);
    void deleteRegistration(Long id);
    Registration getRegistration(Long id);
    List<Registration> getAllRegistrations();
}
