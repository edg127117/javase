package Employee;

import java.util.List;

public class Account {
    public int sum(List<Staff> list,String prefix) {
        int sum = 0;
        for (Staff staff : list) {
            if (staff.getNum().startsWith(prefix)) {
                sum+=staff.getSal();
            }
        }
        return sum;
    }
    public double avg(List<Staff> list,String prefix) {
        int count=0;
        for (Staff staff : list) {
            if (staff.getNum().startsWith(prefix)) {
                count++;
            }
        }
        int sum=sum(list,prefix);
        return sum*1.0/count;
    }
}
