package tn.esprit.correctiontp2.Controllers;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.correctiontp2.Entities.Course;
import tn.esprit.correctiontp2.Services.Interfaces.ICourseService;

import java.util.List;

@RestController
@RequestMapping("/api/course")
@AllArgsConstructor
public class CourseController {
    ICourseService courseService;
    @PostMapping("/addCourse")
    Course addCourse(@RequestBody Course course) {
        return courseService.addCourse(course);
    }

    @PutMapping("/updateCourse")
    Course updateCourse(@RequestBody Course course) {
        return courseService.updateCourse(course);
    }

    @DeleteMapping ("/deleteCourse/{id}")
    Course deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);
        return null;
    }

    @GetMapping ("/getCourse/{id}")
    Course getCourse(@PathVariable Long id) {
        return courseService.getCourse(id);
    }

    @GetMapping ("/getCourses")
    List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

}
