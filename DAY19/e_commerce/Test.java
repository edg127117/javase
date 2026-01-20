package E_commerce;

import java.util.ArrayDeque;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setID("SF123456789");
        order.setStartProcess(Test.getStartProcess());



        Customer customer = new Customer();
        customer.search(order);

        Company company = new Company();
        company.doProcess(order);
        customer.search(order);
    }

        public static Queue<String>  getStartProcess() {
            Queue<String> queue = new ArrayDeque<>();
            queue.offer("货品已出库");
            queue.offer("上门收取快递");
            queue.offer("送到快递分包中心");
            queue.offer("货物运输途中");
            queue.offer("货物已由快递员送货到小区分配中心");
            queue.offer("货物已被取走");
            queue.offer("已全部完成");
            return queue;
        }

}
