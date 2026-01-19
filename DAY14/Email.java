import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请录入邮箱地址，多个地址用分号隔开");
        String emailAddr=sc.nextLine();
        String[] emails=emailAddr.split(";");
        int count=0;
        int qq=0;
        for(String email:emails){
            if (validateEmail(email)){
                System.out.println(email+"发送成功");
                count++;
                if(email.endsWith("@qq.com")){
                    qq++;
                }
            }else {
                System.out.println(email+"发送失败");
            }
        }
        System.out.println("一共成功发送了"+count+"封邮件");
        System.out.println("发送给qq邮箱一共"+qq+"封邮件");
    }
    public static boolean validateEmail(String email){
        int at=email.indexOf("@");
        int at1=email.lastIndexOf("@");
        int dot=email.lastIndexOf(".");
        return at!=-1 && at==at1 && dot>at+1 && dot!=email.length()-1;
    }
}
