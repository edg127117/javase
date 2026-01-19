package test01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(3456);
        Socket clientSocket=serverSocket.accept();

        Random random=new Random();
        int i = random.nextInt(100) + 1;
        BufferedReader br=new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter pw=new PrintWriter(clientSocket.getOutputStream());
        boolean b=true;
        while (b){
            String str=br.readLine();
            int j=Integer.parseInt(str);
            if (i==j){
                pw.println("猜对了");
                pw.flush();
                break;
            }else if (i>j){
                pw.println("猜小了");
            }else{
                pw.println("猜大了");
            }
            pw.flush();
        }
        br.close();
        pw.close();
    }
}
