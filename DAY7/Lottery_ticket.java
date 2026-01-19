import java.util.Scanner;

public class Lottery_ticket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("选择彩票类型 3.3D彩票 5.5D彩票");
        int a = sc.nextInt();
        while(true){
            if(a==3 || a==5){
                break;
            }
            System.out.println("录入的类型错误");
            a = sc.nextInt();
        }
        System.out.println("请录入要购买的注数");
        int b = sc.nextInt();
        int[][] x=lottery(a,b);
        print(x);

    }
    public static int[][] lottery(int a,int b) {
        int [][] x = new int[b][a];
        for(int i=0;i< x.length;i++){
            for(int j=0;j<x[i].length;j++){
               x[i][j]=(int)(Math.random()*10);
            }
        }
        return x;
    }
    public static void print(int[][] x){
        for (int[] c : x) {
            for (int i : c) {
                System.out.print(i + "\t");
            }
            System.out.println();
            
        }
    }
}
