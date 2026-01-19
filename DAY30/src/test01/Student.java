package test01;

public class Student {
    @Value(value="杜甫")
    private String name;
    @Value("男")
    private String gender;
    @Value("18")
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
