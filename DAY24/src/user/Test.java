package user;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请录入用户名");
        String name=scanner.next();
        boolean b = validateName(name);
        if (!b) {
            System.out.println("帐号不符合要求，必须是英文组合");
            return;
        }
        boolean b1 = exists(name, "F:/users");
        if (b1){
            System.out.println("用户名已存在，注册失败");
        }else{
            System.out.println("请录入密码");
            String password=scanner.next();
            boolean b2 = validatePwd(password);
            if (!b2) {
                System.out.println("密码不符合要求");
                return;
            }
            System.out.println("注册成功");

            Users user=new Users();
            user.setName(name);
            user.setPassword(password);
            File dir=new File("F:/users");
            File file=new File(dir,name);
            ObjectOutputStream oos=
                    new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(user);
            oos.close();
        }
    }
    public static boolean exists(String name,String dir){
        File dirFile=new File(dir);
        dirFile.mkdirs();
        File[] files = dirFile.listFiles();
        if (files!=null) {
            for (File file : files) {
                String fileName = file.getName();
                if (name.equals(fileName)) {
                    return true;
                }
            }
        }
        return false;
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
    public static boolean validatePwd(String password) {
        char[] chars = password.toCharArray();
        boolean hasDigit = false;
        boolean hasUpper = false;
        boolean hasLower = false;
        for (char c : chars) {
            if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (Character.isLowerCase(c)) {
                hasLower = true;
            }
        }
        return hasDigit && hasUpper && hasLower;
    }
}



