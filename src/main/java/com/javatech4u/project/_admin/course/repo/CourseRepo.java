package com.javatech4u.project._admin.course.repo;

import com.javatech4u.project.entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepo extends JpaRepository<Courses,Long> {

    @Query("select c from Courses c where c.title like %?1%")
    List<Courses> getCoursesByName(String name);
}
