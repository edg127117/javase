package Grades;

import java.util.Map;

public class Student {
    private String name ;
    private Map<String,Double> grades ;

    public Student() {
    }

    public Student(String name, Map<String, Double> grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Double> getGrades() {
        return grades;
    }

    public void setGrades(Map<String, Double> grades) {
        this.grades = grades;
    }
}
