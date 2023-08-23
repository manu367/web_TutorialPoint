package com.javatech4u.project._admin.course.serviceImpl;

import com.javatech4u.project._admin.course.repo.CourseRepo;
import com.javatech4u.project._admin.course.service.CourseService;
import com.javatech4u.project.entity.Courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    CourseRepo courseRepo;

    @Override
    public Courses addCourses(Courses courses) {
        return courseRepo.save(courses);
    }

    @Override
    public Courses updateCourses(Courses courses) {
        Optional<Courses> optionalCourses = courseRepo.findById(courses.getCourse_id());
        if (optionalCourses.isPresent()) {
            Courses courses1 = optionalCourses.get();
            courses1.setDescription(courses.getDescription());
            courses1.setThumbnail_url(courses.getThumbnail_url());
            courses1.setTitle(courses.getTitle());
            courses1.setPrice(courses.getPrice());
            courses1.setDiscount_price(courses.getDiscount_price());
            courses1.setDiscount_percentage(courses.getDiscount_percentage());
            courses1.setUpdatedBy("admin");
            courses1.setUpdatedDate(new Date().toString());
            return courseRepo.save(courses1);
        }
        return null;
    }

    @Override
    public void deleteCourses(Courses courses) {
        courseRepo.delete(courses);
    }

    @Override
    public Courses getCoursesByCourseId(String id) {
        return courseRepo.findById(Long.parseLong(id)).get();
    }

    @Override
    public List<Courses> getAllCourses() {
        return courseRepo.findAll();
    }

    @Override
    public List<Courses> searchCoursesByName(String name) {
        courseRepo.getCoursesByName(name);
        return courseRepo.getCoursesByName(name);
    }
}
