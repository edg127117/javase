package Employee;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Text  {
    public static void main(String[] args) {
        List<Staff> list=Base.getList();
        Collections.sort(list, new Comparator <Staff>() {
            @Override
            public int compare(Staff o1, Staff o2) {
                LocalDate hireDate = o1.getHireDate();
                LocalDate hireDate1 = o2.getHireDate();
                int i = hireDate.compareTo(hireDate1);
                if (i==0){
                    return Integer.compare(o2.getSal(),o1.getSal());
                }
                return hireDate.compareTo(hireDate1);
            }
        });
        for (Staff staff : list) {
            System.out.println(staff);
        }
        System.out.println("");
        list=list.subList(0,3);
        for (Staff staff : list) {
            System.out.println(staff);
        }

    }
}
