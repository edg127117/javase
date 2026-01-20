public class Test01 {
    public static void main(String[] args) {
        Student student = new Student("李白",17);
        Management management = new Management();
        management.setName("白居易");
        management.check(student);
    }
}
