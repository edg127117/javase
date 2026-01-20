package Log_in;

import java.util.Scanner;

public class Reg {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入账号");
        String name = sc.nextLine();
        boolean b=validateName(name);
        if(!b){
            System.out.println("账号不符合要求");
            return;
        }
        System.out.println("请输入密码");
        String paw= sc.nextLine();
        boolean b1=validatePwd(paw);
        if(!b1){
            System.out.println("密码不符合要求");
            return;
        }
        System.out.println("注册成功");
    }
    public static boolean validateName(String name) {
        char[] chars = name.toCharArray();
        boolean b = true;
        for (char c : chars) {
            if (!Character.isLetter(c)) {
                b = false;
                break;
            }
        }
        return b;
    }
    public static boolean validatePwd(String pwd) {
        char[] chars=pwd.toCharArray();
        boolean hasDigit = false;
        boolean hasUpper = false;
        boolean hasLower = false;
        for (char c : chars) {
            if (Character.isDigit(c)) {
                hasDigit = true;
            }
            if (Character.isUpperCase(c)) {
                hasUpper = true;
            }else if (Character.isLowerCase(c)) {
                hasLower = true;
            }
        }
        return hasDigit && hasUpper && hasLower;
    }
}
