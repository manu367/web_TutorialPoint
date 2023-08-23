package com.javatech4u.project._admin.course.service;

import com.javatech4u.project.entity.Courses;

import java.util.List;

public interface CourseService {
    Courses addCourses(Courses courses);
    Courses updateCourses(Courses courses);
    void deleteCourses(Courses courses);
    Courses getCoursesByCourseId(String id);
    List<Courses> getAllCourses();
    List<Courses> searchCoursesByName(String name);

}
