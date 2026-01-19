import java.util.concurrent.ExecutionException;

public class Sum {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println(sum1());
    }

    public static int sum1() throws InterruptedException {
        SumThread s = new SumThread(1, 500);
        Thread t1 = new Thread(s);
        SumThread s1 = new SumThread(501, 1000);
        Thread t2 = new Thread(s1);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        return s.getSum() + s1.getSum();

    }

    static class SumThread implements Runnable {
        private int min;
        private int max;
        private int sum;

        public SumThread(int min, int max) {
            this.min = min;
            this.max = max;
        }

        @Override
        public void run() {
            for (int i = min; i <= max; i++) {
                sum += i;
            }
        }

        public int getSum() {
            return sum;
        }
    }
}
