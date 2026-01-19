import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Test04 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        for (int i=1;i<=30;i++){
            Ticket ticket=new Ticket("旅客"+i+"号");
            service.execute(ticket);
        }
        service.shutdown();
    }
}
class Ticket implements Runnable{
    private static int ticketNum=10;
    private String name;
    private ReentrantLock lock;

    public Ticket(String name) {
        this.name = name;
        lock=new ReentrantLock();
    }

    @Override
    public void run() {
        System.out.println(name+":正在抢票......");
        try{
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lock.lock();
        try{
            if (ticketNum>0){
                System.out.println(name+"：抢票成功");
                ticketNum--;
                System.out.println("车票还有"+ticketNum+"张");
            }else{
                System.out.println(name+"抢票失败");
            }
        }finally {
            lock.unlock();
        }
    }
}
