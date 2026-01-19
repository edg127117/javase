import java.time.LocalDate;
import java.util.Objects;

public class Staff {
    private String no;
    private String name;
    private String gender;
    private int age;
    private int sal;
    private String dept;
    private LocalDate hireDate;

    public Staff() {
    }

    public Staff(String no, String name, String gender, int age, int sal, String dept, LocalDate hireDate) {
        this.no = no;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.sal = sal;
        this.dept = dept;
        this.hireDate = hireDate;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
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

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "no='" + no + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", sal=" + sal +
                ", dept='" + dept + '\'' +
                ", hireDate=" + hireDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Staff staff = (Staff) o;
        return age == staff.age && sal == staff.sal && Objects.equals(no, staff.no) && Objects.equals(name, staff.name) && Objects.equals(gender, staff.gender) && Objects.equals(dept, staff.dept) && Objects.equals(hireDate, staff.hireDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, name, gender, age, sal, dept, hireDate);
    }
}
