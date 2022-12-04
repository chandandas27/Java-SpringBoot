package com.example.springboot.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.courses.bean.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
