import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Staff> list=Base.getStaffList();

         /*list.stream().
                map(Staff::getDept).distinct().
                forEach(System.out::println);*/
       /* Optional<Staff>min = list.stream().min(Comparator.comparing(Staff::getHireDate));
        System.out.println(min.get());*/
        /*int sum = list.stream().filter(s -> s.getDept().equals("研发部"))
                .mapToInt(Staff::getSal).sum();
        System.out.println(sum);
        OptionalDouble avg = list.stream().filter(s -> s.getDept().equals("研发部"))
                .mapToInt(Staff::getSal)
                .average();
        System.out.println(avg);*/
        /*long a = list.stream().filter(s -> s.getName().startsWith("李"))
                .count();
        System.out.println("所有姓李的员工人数 = " + a);*/
        /* list.stream().sorted(Comparator.comparingInt(Staff::getAge)
                .thenComparing(Staff::getSal)).forEach(System.out::println);*/
         /*list.stream().sorted(Comparator.comparing(Staff::getHireDate).reversed())
                .forEach(System.out::println);*/
         /*Map<String, List<Staff>> collect = list.stream().collect(Collectors.groupingBy(s -> {
            if (s.getName().length() == 2) {
                return "2个字符";
            } else {
                return "3个字符";
            }
        }));
        collect.forEach((k,v)->{
            System.out.println("字符数:"+k);
            v.forEach(System.out::println);
        });*/
         /*list.stream().filter(s->s.getDept().equals("产品部"))
                .filter(s->s.getSal()<10000)
                .map(s->{s.setSal(s.getSal()+1000);return s;})
                .forEach(System.out::println);*/
         String s = list.stream().map(Staff::getName)
                .collect(Collectors.joining(","));
        String[] c = s.split(",");
        for (String str : c ) {
            System.out.println(str);
        }
    }
}
