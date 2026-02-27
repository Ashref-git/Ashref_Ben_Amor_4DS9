package tn.esprit.correctiontp2.Services.Implementations;


import org.springframework.stereotype.Service;
import tn.esprit.correctiontp2.Entities.Instructor;
import tn.esprit.correctiontp2.Services.Interfaces.IinstructorService;
import tn.esprit.correctiontp2.Services.Repository.InstructorRepo;

import java.util.List;

@Service
public class InstructorServicelmpl implements IinstructorService {
    private final InstructorRepo instructorRepo;

    public InstructorServicelmpl(InstructorRepo instructorRepo) {
        this.instructorRepo = instructorRepo;
    }


    @Override
    public Instructor addInstructor(Instructor instructor) {
        return instructorRepo.save(instructor);
    }

    @Override
    public Instructor updateInstructor(Instructor instructor) {
        return instructorRepo.save(instructor);
    }

    @Override
    public void deleteInstructor(Long id) {
        instructorRepo.deleteById(id);
    }

    @Override
    public Instructor getInstructor(Long id) {
        return instructorRepo.findById(id).get();
    }

    @Override
    public List<Instructor> getAllInstructors() {
        return instructorRepo.findAll();
    }
}
