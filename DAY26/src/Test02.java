import java.util.concurrent.TimeUnit;

public class Test02 {
    public static void main(String[] args) {
        PassCave cave=new PassCave();
        new Thread(cave::pass,"李白").start();
        new Thread(cave::pass,"杜甫").start();
        new Thread(cave::pass,"李商隐").start();
    }


}

class PassCave{
    public synchronized void pass() {
        System.out.println(Thread.currentThread().getName() + "进入山洞");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "走出山洞");
    }
}
