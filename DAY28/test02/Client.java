package test02;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 2345);
        Scanner scanner = new Scanner(System.in);
        File file;
        while (true) {
            System.out.println("请录入要上传的文件名:");
            String fileName = scanner.nextLine();
            file = new File(fileName);
            if (file.exists()){
                break;
            }
            System.out.println("文件不存在");
        }
        PrintWriter pw=new PrintWriter(socket.getOutputStream());
        pw.println(file.getName());
        pw.flush();

        BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String yn=br.readLine();
        if (yn.equalsIgnoreCase("y")){
            FileInputStream fis=new FileInputStream(file);
            BufferedInputStream bis=new BufferedInputStream(fis);
            BufferedOutputStream bos=new BufferedOutputStream(socket.getOutputStream());
            byte[] bytes=new byte[1024];
            int x;
            while ((x=bis.read(bytes))!=-1){
                bos.write(bytes,0,x);
            }
            bis.close();
            bos.close();
            System.out.println("文件上传成功");
        }else{
            System.out.println("服务器拒绝接收文件");
        }
        pw.close();
        socket.close();
    }
}
