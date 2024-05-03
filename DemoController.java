package com.example.springassignment1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {
    @Autowired
    private CoursesRepository coursesRepository;

    @PostMapping("/add")
    public String addCourses(@RequestParam String course,@RequestParam String catalogue){
        Courses courses=new Courses();
        courses.setCourseName(course);
        courses.setCourseCatalogue(catalogue);
        coursesRepository.save(courses);
        return "Added new course to repo!";
    }
    @GetMapping("/list")
    public Iterable<Courses> getCourses(){
        return coursesRepository.findAll();
    }
    @GetMapping("/find/{id}")
    public Courses findCoursesById(@PathVariable Integer id){
        return coursesRepository.findCoursesById(id);
    }
}
