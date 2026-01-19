import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请录入身份证号码：");
        String id=sc.next();
       if(validate(id)){
           String s=showNumber(id);
           System.out.println("有效的身份证:"+s);
           System.out.println("欢迎"+getGender(id));
       }else{
           System.out.println("无效的身份证");
       }
    }
    public static boolean validate(String id){
        String regex="\\d{17}[\\d{1}x]";
        return id.matches(regex);
    }
    public static String showNumber(String id){
        StringBuffer buffer=new StringBuffer(id);
        buffer.replace(6,14,"********");
        return buffer.toString();
    }
    public static String getGender(String id){
        char c=id.charAt(id.length()-2);
        int x=Integer.parseInt(String.valueOf(c));
        return x%2==0?"女士":"先生";
    }
}
