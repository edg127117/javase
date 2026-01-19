package Salary_test;

import java.time.LocalDate;

public class Staff {
    private String name;
    private int sal;
    private LocalDate hireDate;
    private int workMonths;

    public Staff() {
    }

    public Staff(String name, LocalDate hireDate,int sal ) {
        this.name = name;
        this.sal = sal;
        this.hireDate = hireDate;
        this.workMonths = workMonths;
        setWorkMonths(DateUtil.betweenMonths(hireDate));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public int getWorkMonths() {
        return workMonths;
    }

    public void setWorkMonths(int workMonths) {
        this.workMonths = workMonths;
    }
    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", hireDate=" + hireDate +
                ", workMonths=" + workMonths +
                '}';
    }
}
