import java.util.Scanner;

public class  if_elseif_else{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个数字： ");
        int x = sc.nextInt();
        if (x%3==0 && x%5==0){
            System.out.println("乒");
        }
        else if(x%5==0){
            System.out.println("乓");
        }
        else if(x%3==0 ){
            System.out.println("乒乓");
        }
        else{
            System.out.println(x);
        }
    }
}
