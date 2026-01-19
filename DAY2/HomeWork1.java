import com.sun.corba.se.impl.orbutil.ObjectUtility;

import java.util.Scanner;


public class HomeWork1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("******************");
        System.out.println("*欢迎使用数字转换系统*");
        System.out.println("******************");
        System.out.println("请输入要转换的三位数");
        int x=scanner.nextInt();

        int b=x/100;
        int s=x%100/10;
        int g=x%10;
        System.out.println("转换的结果是：");
        System.out.print(g);
        System.out.print(s);
        System.out.println(b);
    }
}
