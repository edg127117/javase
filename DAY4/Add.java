import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入年份");
        int year = sc.nextInt();
        System.out.println("请录入月份");
        int month = sc.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(year+"年"+month+"月；31天");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(year+"年"+month+"月；30天");
                break;
            case 2:
                boolean b=(year%4==0 && year%100!=0 || year%400==0);
                if(b==true){
                    System.out.println(year+"年"+month+"月；29天");
                }else {
                    System.out.println(year+"年"+month+"月；28天");
                }
                break;
                default:
                    System.out.println("月份录入错误");

        }
    }
}
