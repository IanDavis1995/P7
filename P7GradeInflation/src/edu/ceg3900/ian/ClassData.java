package edu.ceg3900.ian;

import java.util.ArrayList;

/** Represent a single information of class.
 */
public class ClassData {
    String countryCode;
    String yearOffered;
    String termOffered;
    String courseNumber;
    ArrayList<StudentGrade> studentGrades;

    ClassData() {
        this.studentGrades = new ArrayList<>();
    }

    ClassData(String countryCode,
                     String yearOffered,
                     String termOffered,
                     String courseNumber) {
        this.countryCode = countryCode;
        this.yearOffered = yearOffered;
        this.termOffered = termOffered;
        this.courseNumber = courseNumber;
        this.studentGrades = new ArrayList<>();
    }

    void addStudentGrade(StudentGrade studentGrade) {
        this.studentGrades.add(studentGrade);
    }
}
