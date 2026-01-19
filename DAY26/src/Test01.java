import java.util.concurrent.TimeUnit;

public class Test01 {
    public static void main(String[] args) {
        Student student=new Student();
        Thread studentThread=new Thread(student,"李白");
        Teacher teacher=new Teacher(studentThread);
        Thread teacherThread=new Thread(teacher,"王老师");
        studentThread.start();
        teacherThread.start();
    }
}
class  Student implements Runnable{
    public void run() {
        System.out.println(Thread.currentThread().getName()+"开始睡觉");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName()+"被吵醒");
        }
        System.out.println(Thread.currentThread().getName()+"开始上课");
    }
}
class  Teacher implements Runnable{
    private Thread thread;

    public Teacher(Thread thread) {
        this.thread = thread;
    }
    public void run() {
        System.out.println(Thread.currentThread().getName()+"进入教室上课");
        for(int i=1;i<=3;i++){
            System.out.println("上课");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        thread.interrupt();
    }
}