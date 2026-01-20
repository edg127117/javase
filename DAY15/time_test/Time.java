package Time_test;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Time {
    public static void main(String[] args) {
            Timer timer=new Timer();
            Random random=new Random();
            int bound=1000;
            timer.schedule(new  TimerTask() {
                public void run() {
                    System.out.println(getRandom(random,bound));
                }
            },0,2000);
    }
    public static int getRandom(Random random,int bound){
        return random.nextInt(bound);
    }
}
