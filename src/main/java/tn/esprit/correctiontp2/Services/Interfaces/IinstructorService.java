package tn.esprit.correctiontp2.Services.Interfaces;


import tn.esprit.correctiontp2.Entities.Instructor;

import java.util.List;

public interface IinstructorService {
    Instructor addInstructor(Instructor instructor);
    Instructor updateInstructor(Instructor instructor);
    void deleteInstructor(Long id);
    Instructor getInstructor(Long id);
    List<Instructor> getAllInstructors();
}
