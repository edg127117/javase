package Employee;

import java.time.LocalDate;

public class Staff {
    private String num;
    private String name;
    private String gender;
    private int age;
    private LocalDate hireDate;
    private int sal;
    private String location;

    public Staff() {
    }

    public Staff(String num, String name, String gender, int age, LocalDate hireDate, int sal, String location) {
        this.num = num;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.hireDate = hireDate;
        this.sal = sal;
        this.location = location;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "num='" + num + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", hireDate=" + hireDate +
                ", sal=" + sal +
                ", location='" + location + '\'' +
                '}';
    }
}
