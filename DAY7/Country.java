import java.util.Scanner;

public class Country {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个国家");
        String country = sc.nextLine();
        boolean b = isContry(country);
        System.out.println(b?"是常任理事国":"不是常任理事国");

    }
    public static boolean isContry(String country) {
        String[] countries={"中国","美国","英国","法国","俄罗斯"};
        for(String s:countries){
            if(s.equals(country)){
                return true;
            }
        }
        return false;
    }
}
