package com.example.springassignment1;

import org.springframework.data.repository.CrudRepository;

public interface CoursesRepository extends CrudRepository<Courses,Integer>{
    Courses findCoursesById(Integer id);
}
