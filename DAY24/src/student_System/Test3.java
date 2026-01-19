package student_System;

import user.Users;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

public class Test3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
       Users user =  Login.login();
        if (user==null){
            System.out.println("系统登录失败");
        }else{

            Student student=new Student();
            student.setName(getInfo("student.name"));
            student.setGender(getInfo("student.gender"));
            student.setAge(Integer.parseInt(getInfo("student.age")));
            serialize(student);

            Teacher teacher=new Teacher();
            teacher.setName(getInfo("teacher.name"));
            teacher.setGender(getInfo("teacher.gender"));
            teacher.setAge(Integer.parseInt(getInfo("teacher.age")));
            saveTeacherInfo(teacher);

            log(user);
        }
    }
    public static String getInfo(String key){
        ResourceBundle bundle=ResourceBundle.getBundle("day24.src.student_System.info");
        return bundle.getString(key);
    }
    public static void serialize(Student student) throws IOException {
        ObjectOutputStream oos=
                new ObjectOutputStream(new FileOutputStream("F:/users/student"));
        oos.writeObject(student);
        oos.close();
    }
    public static void saveTeacherInfo(Teacher teacher) throws IOException {
        DataOutputStream dos=new DataOutputStream(new FileOutputStream("F:/users/teacher"));
        dos.writeUTF(teacher.getName());
        dos.writeInt(teacher.getAge());
        dos.close();
    }
    public static void log(Users user) throws IOException {
        BufferedWriter bw=new BufferedWriter(new FileWriter("d:/users/system.log"));
        bw.write("操作人:"+user.getName());
        bw.newLine();
        bw.write("系统时间:"+ LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        bw.newLine();
        File file1=new File("F:/users/student");
        File file2=new File("F:/users/teacher");
        bw.write(file1.getName()+",文件大小:"+file1.length());
        bw.newLine();
        bw.write(file2.getName()+",文件大小:"+file2.length());
        bw.newLine();
        bw.close();
    }
}
