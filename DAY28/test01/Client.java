package test01;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 3456);
        InputStream is = socket.getInputStream();
        BufferedReader br = new BufferedReader(
                new InputStreamReader(is)
        );
        PrintWriter pw = new PrintWriter(socket.getOutputStream());
        Scanner scanner=new Scanner(System.in);
        while (true) {
            System.out.println("请猜一个数字");
            int x=scanner.nextInt();
            pw.println(x);
            pw.flush();
            String str=br.readLine();
            System.out.println("猜的结果:"+str);
            if (str.equals("猜对了")){
                break;
            }
        }
        br.close();
        pw.close();
    }
}
