package tn.esprit.correctiontp2.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.correctiontp2.Entities.Instructor;
import tn.esprit.correctiontp2.Services.Interfaces.IinstructorService;

import java.util.List;

@RestController
@RequestMapping("/api/instructor")
@AllArgsConstructor
public class InstructorController {
    IinstructorService instructorService;
    @PostMapping("/addInstructor")
    Instructor addInstructor(@RequestBody Instructor instructor) {
        return instructorService.addInstructor(instructor);
    }

    @PutMapping("/updateInstructor")
    Instructor updateInstructor(@RequestBody Instructor instructor) {
        return instructorService.updateInstructor(instructor);
    }

    @DeleteMapping("/deleteInstructor/{id}")
    void deleteInstructor(@PathVariable Long id) {
        instructorService.deleteInstructor(id);
    }

    @GetMapping("/getInstructor/{id}")
    Instructor getInstructor(@PathVariable Long id) {
        return instructorService.getInstructor(id);
    }

    @GetMapping("/getInstructors")
    List<Instructor> getAllInstructors() {
        return instructorService.getAllInstructors();
    }
}


