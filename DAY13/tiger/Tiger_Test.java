package Tiger;

public class Tiger_Test {
    public static void main(String[] args)  {
        Tiger tiger = new Tiger(1.5,3.5);
        Tiger tiger1= (Tiger) tiger.clone();
        System.out.println(tiger.equals(tiger1)?"通过检查":"没通过检查");
    }
}
