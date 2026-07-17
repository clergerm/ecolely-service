/*
 * Copyright (c) 2026 Ecolely. All rights reserved.
 * Unauthorized copying, modification, distribution, or use of this software is strictly prohibited.
 */

package com.ecolely.controller;

import com.ecolely.dto.CourseData;
import com.ecolely.service.CourseService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.ecolely.constants.EcolelyConstants.ROOT_API;
import static com.ecolely.constants.EcolelyConstants.COURSES;

@RestController
@RequestMapping(value = ROOT_API + COURSES, produces = MediaType.APPLICATION_JSON_VALUE)
public class CourseController {
    private final CourseService courseService;

    CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping()
    public ResponseEntity<List<CourseData>> getCourses() {
        List<CourseData> courseDataList =  courseService.getCourses();
        if (courseDataList.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(courseDataList);
    }

    @GetMapping("/featured")
    public ResponseEntity<List<CourseData>> getFeaturedCourses() {
        List<CourseData> courseDataList = courseService.getFeaturedCourses();
        if (courseDataList.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(courseDataList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CourseData> getCourse(@PathVariable Integer id) {
        CourseData courseData = courseService.getCourse(id);
        if (courseData == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(courseData);
    }
}