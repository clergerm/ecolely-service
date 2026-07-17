/*
 * Copyright (c) 2026 Ecolely. All rights reserved.
 * Unauthorized copying, modification, distribution, or use of this software is strictly prohibited.
 */

package com.ecolely.util;

import com.ecolely.dto.CourseData;

import java.util.List;
import java.util.Map;

public final class CourseUtil {

    private CourseUtil() {
        // Prevent instantiation
    }

    public static final Map<Integer, CourseData> COURSES = Map.of(
            11, new CourseData(
                    11,
                    "Mathematics",
                    "Build strong foundations in algebra, geometry, and problem solving.",
                    true
            ),
            21, new CourseData(
                    21,
                    "Science",
                    "Explore physics, chemistry, and biology through interactive learning.",
                    true
            ),
            31, new CourseData(
                    31,
                    "Computer Science",
                    "Learn programming, algorithms, and software development concepts.",
                    true
            ),
            41, new CourseData(
                    41,
                    "English Language",
                    "Improve communication, writing, and reading skills.",
                    false
            ),
            51, new CourseData(
                    51,
                    "History",
                    "Understand important events, cultures, and civilizations.",
                    false
            ),
            61, new CourseData(
                    61,
                    "Artificial Intelligence",
                    "Discover AI concepts and modern technology applications.",
                    false
            ),
            71, new CourseData(
                    71,
                    "Personal Development",
                    "Develop study habits, organization, and goal-setting skills.",
                    false
            )
    );

    public static List<CourseData> getCourses() {

        return COURSES.values()
                .stream()
                .toList();

    }

    public static List<CourseData> getFeaturedCourses() {
        return COURSES.values()
                .stream()
                .filter(CourseData::isFeatured)
                .limit(3)
                .toList();

    }
}
