package student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;

public class Test4 {
    public static void main(String[] args) {
        String[] names={"李白","杜甫","白居易"};
        Integer[] ages={17,15,14};
        BiFunction<String,Integer,Student>biFunction=Student::new;
        List<Student> list =test(3,names,ages,biFunction);

        list.sort(Comparator.comparingInt(Student::getAge));
        list.forEach(System.out::println);
    }
    public static List<Student> test(int x,String[] names, Integer[] ages, BiFunction<String , Integer , Student> function) {
        List<Student> list = new ArrayList<Student>(x);
        for (int i = 0; i < x; i++) {
            Student student = function.apply(names[i],ages[i]);
            list.add(student);
        }
        return list;
    }
}
