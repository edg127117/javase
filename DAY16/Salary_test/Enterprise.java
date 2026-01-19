package Salary_test;

public class Enterprise {
    public void addSal(Staff[] staffs) {
        for (Staff staff : staffs) {
            if (staff.getWorkMonths() >= 100) {
                staff.setSal(staff.getSal() + 1000);
            }
        }
    }

    public void showStaffInfo(Staff[] staffs) {
        for (Staff staff : staffs) {
            System.out.println(staff);
        }
    }
}


