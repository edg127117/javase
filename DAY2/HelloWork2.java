import java.util.Scanner;

public class HelloWork2 {
    public static  void main(String[] args) {
       Scanner scanner= new Scanner(System.in);
        System.out.println("****************");
        System.out.println("*请使用小数保留系统*");
        System.out.println("****************");
        System.out.println("请输入一个小数：");
        double d=scanner.nextDouble();
        d=d*100;
        int a=(int) d;
        double y=a/100d;
        System.out.println("保留结果");
        System.out.println(y);
    }
}
