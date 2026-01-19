import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("欢迎进入小游戏");
        System.out.println("请录入一个1到9之间的整数");
        int x = sc.nextInt();
        int y=x*9;
        int z=y>9?(y/10+y%10):y;
        int m=z*27+7;

        System.out.println("你的姓名是:"+m);

    }
}
