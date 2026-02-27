package tn.esprit.correctiontp2.Services.Implementations;


import org.springframework.stereotype.Service;
import tn.esprit.correctiontp2.Entities.Course;
import tn.esprit.correctiontp2.Services.Interfaces.ICourseService;
import tn.esprit.correctiontp2.Services.Repository.CourseRepo;

import java.util.List;

@Service
public class CourseServiceImpl implements ICourseService {
    private final CourseRepo courseRepo;

    public CourseServiceImpl(CourseRepo courseRepo) {
        this.courseRepo = courseRepo;
    }

    @Override
    public Course addCourse(Course course) {

        return courseRepo.save(course);

    }

    @Override
    public Course updateCourse(Course course) {
        return courseRepo.save(course);
    }

    @Override
    public void deleteCourse(Long id) {
        courseRepo.deleteById(id);
    }

    @Override
    public Course getCourse(Long id) {
        //  to do
        return courseRepo.findById(id).orElse(null);
    }
    @Override
    public List<Course> getAllCourses() {
        return courseRepo.findAll();
    }
}
