package tn.esprit.correctiontp2.Services.Interfaces;


import tn.esprit.correctiontp2.Entities.Course;

import java.util.List;

public interface ICourseService {
    Course addCourse(Course course);
    Course updateCourse(Course course);
    void deleteCourse(Long id);
    Course getCourse(Long id);
    List<Course> getAllCourses();

}
