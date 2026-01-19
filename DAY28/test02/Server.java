package test02;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(2345);
        Socket clientSocket = serverSocket.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        String filename = br.readLine();
        System.out.println("客户端要上传文件:" + filename + ",是否接收?(yes/no)");
        Scanner scanner = new Scanner(System.in);
        String yn = scanner.next();
        PrintWriter pw = new PrintWriter(clientSocket.getOutputStream());
        if (yn.equalsIgnoreCase("y")) {
            File dirFile;
            while (true) {
                System.out.println("请录入要存放的路径");
                String dir = scanner.next();
                dirFile = new File(dir);
                if (dirFile.exists()) {
                    break;
                }else{
                    boolean b = dirFile.mkdirs();
                    if (b)
                        break;
                }
            }
            pw.println(yn);
            pw.flush();
            File file=new File(dirFile,filename);
            BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(file));
            BufferedInputStream bis=new BufferedInputStream(clientSocket.getInputStream());
            byte[] bytes=new byte[1024];
            int x;
            while ((x=bis.read(bytes))!=-1){
                bos.write(bytes,0,x);
            }
            bis.close();
            bos.close();
            System.out.println("文件接收成功");
        } else {
            pw.println(yn);
            pw.flush();
            System.out.println("服务器端拒绝接收");
        }
        pw.close();
        clientSocket.close();
        serverSocket.close();
    }
}
