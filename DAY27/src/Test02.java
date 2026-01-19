import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Test02 {
    public static void main(String[] args) throws InterruptedException {
        ReentrantLock lock=new ReentrantLock();
        BuyGoods buyGoods=new BuyGoods(3,lock);
        Condition buy_condition=lock.newCondition();
        Condition pay_condition=lock.newCondition();
        Condition score_condition=lock.newCondition();
        new Thread(()->{
            buyGoods.doBuyGoods("完成用户积分",score_condition,buy_condition);
        },"积分").start();
        new Thread(()->{
            buyGoods.doBuyGoods("用户微信支付",pay_condition,score_condition);
        },"支付").start();
        new Thread(()->{
            buyGoods.doBuyGoods("购买商品订单",buy_condition,pay_condition);
        },"购买").start();
        TimeUnit.SECONDS.sleep(1);
        lock.lock();
        try{
            buy_condition.signal();
        }finally {
            lock.unlock();
        }
    }
}

class BuyGoods {
    private int num;
    private ReentrantLock lock;
    public BuyGoods(int num, ReentrantLock lock) {
        this.num = num;
        this.lock=lock;
    }

    public void doBuyGoods(String opName, Condition currentCondition, Condition nextCondition){
        for (int i = 1; i <= num; i++) {
            lock.lock();
            try{
                currentCondition.await();
                System.out.println("操作流程："+opName);
                nextCondition.signal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }
}
