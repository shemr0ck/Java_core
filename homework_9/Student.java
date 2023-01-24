package com.company.homework_9;

import java.util.List;


public class Student {
    private String name;
    List<Course> courseList;

    public Student(String name, List<Course> courseList) {
        this.name = name;
        this.courseList = courseList;
    }

    public String getName() {
        return name;
    }


    public List<Course> getCourseList() {
        return courseList;
    }
}
