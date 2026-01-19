import java.util.InputMismatchException;
import java.util.Scanner;

public class Temperature_Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请录入摄氏温度；");
        double c=0;
        try {
            c = sc.nextDouble();
        }catch (InputMismatchException e) {
            System.out.println("录入错误");
            return;
        }
        double h=c*9/5+32;
        System.out.println("华氏温度；"+h);
    }
}
