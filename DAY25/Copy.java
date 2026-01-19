import java.io.*;
import java.text.DecimalFormat;

public class Copy {
    public static void main(String[] args) {
        Thread t1 = new Thread(new FileCopyThread
                (new File("F:/aa/x.zip"), new File("F:/aa/y.zip")));
        Thread t2 = new Thread(new FileCopyThread
                (new File("F:/aa/x1.zip"), new File("F:/aa/y1.zip")));

        t2.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
    }

}
class FileCopyThread implements Runnable{
    private File src;
    private File dest;

    public FileCopyThread(File src, File dest) {
        this.src = src;
        this.dest = dest;
    }

    @Override
    public void run() {
        FileUtil.copyFile(src,dest);
    }
}

class FileUtil {

    public static void copyFile(File src, File dest) {
        if (!src.exists()) {
            try {
                throw new FileNotFoundException("源文件不存在");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        byte[] b = new byte[1024];
        int x;
        double d = 0;
        DecimalFormat format = new DecimalFormat("#0%");//00.01
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));
        ) {
            while ((x = bis.read(b)) != -1) {
                bos.write(b, 0, x);
                d += x;
                double y = d / src.length();
                if (y != 1)
                    if (((int) (y * 10000)) % 500 == 0)
                        System.out.println("复制文件" + src.getName() + "进度:"
                                + format.format(y));
            }
            System.out.println(src.getName() + "复制完成");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
