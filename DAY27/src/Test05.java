import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Test05 {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(3);
        service.schedule(() -> {
            try {
                FileInputStream fis = new FileInputStream("F:/aa/hello.txt");
                FileOutputStream fos = new FileOutputStream("F:/aa/hello_1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(fis));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
                String str;
                while ((str = br.readLine()) != null) {
                    bw.write(str);
                    bw.newLine();
                }
                br.close();
                bw.close();

            }catch (IOException e) {
                e.printStackTrace();
            }
        }, 120, TimeUnit.SECONDS);

        service.schedule(() -> {
            String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            System.out.println(time);
        }, 30, TimeUnit.SECONDS);
        service.scheduleAtFixedRate(() -> {
            System.out.println("读取文件");
            File file = new File("F:/aa/hello_1.txt");
            if (file.exists()) {
                try (
                        BufferedReader br = new BufferedReader(new FileReader(file));
                ) {
                    String str;
                    while ((str=br.readLine())!=null){
                        System.out.println(str);
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                System.exit(0);
            }else{
                System.out.println("文件不存在");
            }

        }, 60, 30, TimeUnit.SECONDS);
        service.awaitTermination(200, TimeUnit.SECONDS);
        service.shutdown();
    }
}
