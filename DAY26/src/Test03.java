public class Test03 {
    static final Object LOCK=new Object();
    static boolean b=false;
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            synchronized (LOCK){
                while (!b){
                    System.out.println("没有超级兵产生");
                    try {
                        LOCK.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+":攻击防御塔");
            }
        },"攻击防御塔线程");
        Thread t2=new Thread(()->{
            synchronized (LOCK){
                System.out.println(Thread.currentThread().getName()+":生产超级兵");
                b=true;
                LOCK.notify();
            }
        },"生产超级兵线程");
        t1.start();
        t2.start();
    }
}
