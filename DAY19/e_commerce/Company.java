package E_commerce;

import java.util.ArrayDeque;
import java.util.Queue;

public class Company {
    public void doProcess(Order order){
        Queue<String> defaultProcess = order.getStartProcess();
        Queue<String> completedProcess = order.getEndProcess();
        if (completedProcess == null)
            completedProcess=new ArrayDeque<>();
        String peek = defaultProcess.peek();
        if (!peek.equals("已全部完成")) {
            String process = defaultProcess.poll();
            completedProcess.offer(process);
        }
    }
}
