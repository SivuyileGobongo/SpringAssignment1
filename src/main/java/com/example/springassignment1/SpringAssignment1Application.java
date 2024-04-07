package com.example.springassignment1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RestController
public class SpringAssignment1Application {

    @GetMapping("/courses")
    public List<String> getCourses() {
        List<String> foundationCourses = Arrays.asList("Computer Literacy", "Elementary Com programing");
        List<String> undergraduateCourses = Arrays.asList(
                "Advanced Programming",
                "Data Structures and Algorithms",
                "Database management",
                "Operating System",
                "Software Engineering"
        );
        List<String> honoursCourses = Arrays.asList(
                "Honours Course 1",
                "Honours Course 2",
                "Honours Course 3",
                "Honours Course 4"
        );

        return Arrays.asList(
                "Foundation Courses: " + foundationCourses.toString(),
                "Undergraduate Courses: " + undergraduateCourses.toString(),
                "Honours Courses: " + honoursCourses.toString()
        );
    }



public static void main(String[] args) {
        SpringApplication.run(SpringAssignment1Application.class, args);
    }

}
