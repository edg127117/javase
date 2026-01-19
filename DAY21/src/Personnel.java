import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Personnel {
    public void test(List<Staff> staffList){
        boolean b=staffList.stream()
         .filter(s->s.getDept().equals("产品部")).allMatch(s->s.getSal()>=10000);
        System.out.println("产品部是否所有员工工资都超过10000元="+b);
    }
    public void test1(List<Staff>staffList) {
        boolean b = staffList.stream().filter(s -> s.getDept().equals("研发部"))
                .allMatch(s -> s.getGender().equals("男"));
        System.out.println("研发部是否所有员工都是男性=" + b);
    }
    public void test3(List<Staff> staffList) {
        staffList.stream().filter(s -> s.getDept().equals("研发部"))
                .filter(s -> s.getSal() >= 10000)
                .filter(staff -> {
                    LocalDate now = LocalDate.now();
                    LocalDate hireDate = staff.getHireDate();
                    long year = ChronoUnit.YEARS.between(hireDate, now);
                    return year >= 5;
                }).forEach(System.out::println);
    }
    public void test4(List<Staff> staffList){
        long count = staffList.stream()
                .filter(s -> !s.getDept().equals("项目部")).count();
        System.out.println("不是项目部的员工数量= " + count);
    }
    public void test5(List<Staff> staffList){
        Optional<Staff> max = staffList.stream()
                .filter(s->ChronoUnit.YEARS.between(s.getHireDate(),LocalDate.now())>=5)
                .max(Comparator.comparingInt(Staff::getSal));
        System.out.println("入职 5 年以上的员工的最高工资="+max.get().getSal());
    }
    public void test6(List<Staff> staffList){
        Optional<Staff> min = staffList.stream().filter(s -> s.getDept().equals("研发部"))
                .min(Comparator.comparingInt(Staff::getAge));
        System.out.println("研发部年龄最小的员工信息"+min.get());
    }
    public void test7(List<Staff> staffList){
        Optional<Staff> staff = staffList.stream().
                filter(s -> s.getDept().equals("研发部"))
                .findAny();

        String no = staff.get().getNo();
        System.out.println(no.charAt(0));
    }

}
