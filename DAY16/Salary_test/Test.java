package Salary_test;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Staff staff = new Staff("李白", LocalDate.of(2018,2,4),8000);
        staff.setWorkMonths(DateUtil.betweenMonths(LocalDate.of(2018,2,4)));
        Staff staff1 = new Staff("杜甫", LocalDate.of(2012,5,6),12000);
        Staff staff2 = new Staff("白居易", LocalDate.of(2014,4,10),10000);
        Staff staff3 = new Staff("陆游", LocalDate.of(2016,10,10),9000);

        Staff[] staffs=new Staff[4];
        staffs[0]=staff;
        staffs[1]=staff1;
        staffs[2]=staff2;
        staffs[3]=staff3;
        System.out.println("员工初始信息");
        Enterprise enterprise = new Enterprise();
        enterprise.showStaffInfo(staffs);
        System.out.println("员工加薪后信息");
        enterprise.addSal(staffs);
        enterprise.showStaffInfo(staffs);
    }
}
