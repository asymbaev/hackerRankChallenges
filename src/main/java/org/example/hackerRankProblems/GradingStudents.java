package org.example.hackerRankProblems;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> roundedGrades = new ArrayList<>();

        for(int grade: grades) {
            int roundedGrade = (grade < 39 || grade % 5 < 3) ? grade : ((grade / 5) * 5) + 5;
            roundedGrades.add(roundedGrade);
        }
        return roundedGrades;
    }
}

