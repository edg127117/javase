import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入身份证号码：");
        String id = sc.next();
        int len=id.length();
        if(len!=18){
            System.out.println("身份证长度错误");
        }else{
            boolean b=true;
            for(int i=0;i<(id.length()-1);i++){
                char c=id.charAt(i);
                if (!Character.isDigit(c)) {
                    b=false;
                    break;
                }
            }
            if(b){
                char c=id.charAt(id.length()-1);
                if(c=='X'||Character.isDigit(c)){
                    System.out.println("有效的身份证");
                }else{
                    System.out.println("最好一位错误");
                }
            }else{
                System.out.println("前17位有非数字");
            }
        }
    }
}
