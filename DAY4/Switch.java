import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入分数：");
        int s = sc.nextInt();
        if (s<0 || s>100) {
            System.out.println("录入错误");
        }else {
            switch (s/10) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("E");
                    break;
                case 6:
                    System.out.println("D");
                    break;
                case 7:
                    System.out.println("C");
                    break;
                case 8:
                    System.out.println("B");
                    break;
                case 9:
                case 10:
                    System.out.println("A");
                    break;
            }
        }
    }
}
