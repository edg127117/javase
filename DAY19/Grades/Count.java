package Grades;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Count {
    public static Map<String,Double> sum(List<Student>list){
        Map<String, Double> map = new HashMap <>();
        for (Student student : list) {
            double sum = 0;
            Map<String, Double> scores = student.getGrades();
            for (Map.Entry<String, Double> entry : scores.entrySet()) {
                sum += entry.getValue();
            }
            map.put(student.getName(), sum);
        }
        return map;
    }
    public static Map<String,Double> average(List<Student> list){
        int s = list.get(0).getGrades().size();
        Map<String, Double> map = sum(list);
        Map<String, Double>avgMap = new HashMap<>();
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            avgMap.put(entry.getKey(), entry.getValue()/s);
        }
        return avgMap;
    }
    public static double sum(List<Student>list,String subject){
        double sum = 0;
        for (Student student : list) {
            Map<String, Double>scores = student.getGrades();
            for (Map.Entry<String, Double> entry : scores.entrySet()) {
                if (entry.getKey().equals(subject)) {
                    sum += entry.getValue();
                }
            }
        }
        return sum;
    }
    public static double average(List<Student>list,String subject){
        double sum = sum(list, subject);
        return sum / list.size();
    }
    public static int countNot(List<Student>list){
        int count = 0;
        for (Student student : list) {
            Map<String, Double>scores = student.getGrades();
            for (Map.Entry<String, Double> entry : scores.entrySet()) {
                if (entry.getValue()< 60) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    public static void add10(List<Student>list){
        for (Student student : list) {
            Map<String, Double> scores = student.getGrades();
            for (Map.Entry<String, Double> entry : scores.entrySet()) {
                if (entry.getValue() < 60) {
                    scores.put(entry.getKey(), entry.getValue() * 1.1);
                }
            }
        }
    }
    public static void print(List<Student>list){
        for (Student student : list) {
            System.out.println(student.getName());
            Map<String, Double> scores = student.getGrades();
            for (Map.Entry<String, Double>entry : scores.entrySet()) {
                System.out.println(entry.getKey()+":"+entry.getValue());
            }
        }
    }
}
