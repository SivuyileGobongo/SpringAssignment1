package com.example.springassignment1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RestController
public class SpringAssignment2Application {

    @GetMapping("/courses")
    public List<String> getCourses() {
        List<String> foundationCourses = Arrays.asList("Computer Literacy", "Elementary Com programing");
        List<String> undergraduateCourses = Arrays.asList(
                "1. Advanced Programming",
                "2. Data Structures and Algorithms",
                "3. Database management",
                "4. Operating System",
                "5. Software Engineering"
        );
        List<String> honoursCourses = Arrays.asList(
                "Systems Programming",
                "Computer Forensics",
                "Software Factories",
                "Data Communications"
        );

        return Arrays.asList(
                "Foundation Courses: " + foundationCourses.toString(),
                "Undergraduate Courses: " + undergraduateCourses.toString(),
                "Honours Courses: " + honoursCourses.toString()
        );
    }



public static void main(String[] args) {
        SpringApplication.run(SpringAssignment2Application.class, args);
    }

}
