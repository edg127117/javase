import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请求录入三个整数");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int min=a<b?a:b;
        min=min<c?min:c;
        System.out.println(min);
    }
}

