package com.example.springassignment1;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="Courses")
public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    @NotBlank(message = "Course name is required")
    @Size(max = 250, message = "Course name must be at most 250 characters")
    @Column(name = "Course name")

    private String courseName;
    @NotNull
    @NotBlank(message = "Course catalogue is required")
    @Size(max = 40, message = "Course catalogue must be at most 250 characters")
    @Column(name = "CourseCatalogue")
    private String courseCatalogue;

    public Courses(){

    }
        public Courses(String courseName, String courseCatalogue){
           this.courseName=courseName;
           this.courseCatalogue=courseCatalogue;
        }


    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id=id;
    }
    public String getCourseName(){
        return courseName;
    }
    public void setCourseName(String courseName){
        this.courseName=courseName;
    }
    public String getCourseCatalogue(){
        return courseCatalogue;
    }
    public void setCourseCatalogue(String courseCatalogue){
        this.courseCatalogue=courseCatalogue;
    }
}
