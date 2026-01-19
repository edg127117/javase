import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Test2 {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> new Random().nextInt(100);
        List<Integer>list = test(10,supplier);
        list.forEach(System.out::println);
    }
    public static List<Integer>test(int x, Supplier<Integer>supplier){
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < x; i++) {
            list.add(supplier.get());
        }
        return list;
    }
}
