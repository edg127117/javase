public class Management {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void check(Student student) {
        System.out.println("网管"+name+"检查：");
        int age = student.getAge();
        if (age >= 18) {
            System.out.println(student.getName()+"你可以上网");
        }else {
            System.out.println(student.getName()+"你不能上网");
        }
    }
}
