package Grades;

import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        List<Student> list=Base.getList();

        Map<String, Double> map = Count.sum(list);
        for (Map.Entry<String, Double>entry : map.entrySet()) {
            System.out.println(entry.getKey()+"\t"+entry.getValue());
        }

        map = Count.average(list);
        for (Map.Entry< String, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey()+"\t"+entry.getValue());
        }

        double c = Count.sum(list, "语文");
        System.out.println("c = " + c);

        double a = Count.average(list, "语文");
        System.out.println("a = " + a);

        int i = Count.countNot(list);
        System.out.println("i = " + i);

        Count.print(list);
    }
}
