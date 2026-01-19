import java.util.Random;
import java.util.concurrent.TimeUnit;

public class The_Tortoise_and_the_Hare {
    public static void main(String[] args) throws InterruptedException {
        RunThread r1=new RunThread(1,3);
        RunThread r2=new RunThread(3,5);
        Thread t1=new Thread(r1,"乌龟");
        Thread t2=new Thread(r2,"兔子");
        t1.start();
        t2.start();
        t1.join();
        t2.join();

    }
}
class RunThread implements Runnable{
    private int min;
    private int max;
    private Random random;
    private boolean isRest;
    public RunThread(int min,int max){
        this.min=min;
        this.max=max;
        random=new Random();
    }


    @Override
    public void run() {
        int length = 0;
        while (length <= 100) {
            int i = random.nextInt(max - min + 1) + min;
            length += i;
            String name = Thread.currentThread().getName();
            if (name.equals("兔子")) {
                if (length >= 70 && !isRest) {
                    try {
                        System.out.println("兔子跑了70米，休息一会");
                        isRest = true;
                        TimeUnit.MILLISECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            System.out.println(name + "跑到" + length + "米");
        }
    }
}

