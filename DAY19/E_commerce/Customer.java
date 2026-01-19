package E_commerce;

import java.util.Queue;

public class Customer {
    public void search(Order order){
        Queue<String> StartProcess = order.getStartProcess();
        System.out.println(StartProcess.peek());

    }
}
