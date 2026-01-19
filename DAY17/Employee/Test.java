package Employee;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        //Base.showStaffInfo();
        Account account = new Account();
        List<Staff> list = Base.getList();
        /*int a=account.sum(list,"C");
        System.out.println(a);
        int b=account.sum(list,"T");
        System.out.println(b);
        double c=account.avg(list,"C");
        System.out.println(c);
        double d=account.avg(list,"T");
        System.out.println(d);
        Personnel personnel = new Personnel();
        personnel.fire(list,"上海市");
        Base.showStaffInfo();*/
        Personnel personnel = new Personnel();
        personnel.addSal(list,70);
        Base.showStaffInfo();


    }
}
