import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Test01 {
    static final ReentrantLock LOCK=new ReentrantLock();
    static boolean b=false;
    static Condition condition=LOCK.newCondition();
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            try{
                LOCK.lock();
                while (!b){
                    try {
                        condition.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("攻击防御塔");
            } finally {
                LOCK.unlock();
            }
        });
        TimeUnit.SECONDS.sleep(1);
        Thread t2=new Thread(()->{
            try{
                LOCK.lock();
                System.out.println("生产超级兵");
                b=true;
                condition.signal();
            }finally {
                LOCK.unlock();
            }
        });
        t1.start();
        t2.start();
    }
}
