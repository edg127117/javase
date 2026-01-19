import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个数字：");
        int a = sc.nextInt();
        while(a<=1){
            System.out.println("请录入一个大于1的数字");
            a =sc.nextInt();
        }
        boolean b=true;
        for(int i=2;i<a;i++){
            if(a % i ==0){
                b=false;
                break;
            }
        }
        System.out.println(b?"是素数":"不是素数");


    }
}
