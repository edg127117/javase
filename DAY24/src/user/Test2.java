package user;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args)throws IOException, ClassNotFoundException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请录入用户名");
        String name=scanner.next();
        boolean b = Test.exists(name, "F:/users");
        if (!b){
            System.out.println("用户不存在");
        }else{
            ObjectInputStream ois=
                    new ObjectInputStream(new FileInputStream("F:/users/"+name));
            Users user=(Users)ois.readObject();
            System.out.println("请输入登录密码");
            String password=scanner.next();
            if (password.equals(user.getPassword())){
                System.out.println("登录成功，欢迎"+user.getName());

            }else{
                System.out.println("密码错误，登录失败");
            }
        }

    }

}

