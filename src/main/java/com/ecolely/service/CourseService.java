/*
 * Copyright (c) 2026 Ecolely. All rights reserved.
 * Unauthorized copying, modification, distribution, or use of this software is strictly prohibited.
 */

package com.ecolely.service;

import com.ecolely.dto.CourseData;
import com.ecolely.util.CourseUtil;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    public CourseData getCourse(Integer id) {
        return CourseUtil.COURSES.get(id);
    }

    public List<CourseData> getCourses() {
        return CourseUtil.getCourses();
    }

    public List<CourseData> getFeaturedCourses() {
        return CourseUtil.getFeaturedCourses();
    }
}
