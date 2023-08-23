package com.javatech4u.project._admin.course;

import com.javatech4u.project._admin.course.serviceImpl.CourseServiceImpl;
import com.javatech4u.project.entity.Courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class CourseController {
    @Autowired
    CourseServiceImpl courseService;

    @GetMapping("/searchcourses")
    @ResponseBody
    public List<Courses> searchcourses(@RequestParam("name") String name){
        if(name!=null && name.length()>0)
            return courseService.searchCoursesByName(name);
        else
            return null;
    }

    @GetMapping("/courses")
    public String getcourses(Model model){
        List<Courses> allCourses=courseService.getAllCourses();
        model.addAttribute("courses",allCourses);
        return "";
    }

    @PostMapping("/addcourses")
    public Courses addCourses(@ModelAttribute Courses courses){
        courseService.addCourses(courses);
        return courseService.addCourses(courses);
    }

    @PostMapping("/updateCourses")
    public Courses updateCourses(@ModelAttribute Courses courses){
        return courseService.updateCourses(courses);
    }

    @GetMapping("/deleteCourses")
    public String deleteCourses(@ModelAttribute Courses courses){
        courseService.deleteCourses(courses);
        return null;
    }


    @GetMapping("/courses/{id}")
    public Courses getCoursesByCourseId(@PathVariable("id") String id){
        return courseService.getCoursesByCourseId(id);
    }
}
