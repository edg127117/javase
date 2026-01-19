import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入第1个数");
        double x = sc.nextDouble();
        System.out.println("请录入第2个数");
        double y = sc.nextDouble();
        System.out.println("请录入操作符");
        String op = sc.next();
        double r=0.0;
        boolean z=false;
        switch(op){
            case "+":
                r=x+y;
                break;
            case "-":
                r=x-y;
                break;
            case "*":
                r=x*y;
                break;
            case "/":
                if(y!=0)
                 r=x/y;
                else
                    z=true;
                break;
        }
        if(z==true){
            System.out. println("除数不能为零");
        }else {
            int m=(int)r;
            if(m==r) {
                System.out.println(x + op + y + "=" + m);
            }else {
                System.out.println(x + op + y + "=" + r);
            }
        }
    }
}

