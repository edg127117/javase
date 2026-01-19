import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test3 {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> new Random().nextInt(100);
        List<Integer> list = test(10,supplier);
        Predicate<Integer> predicate = x -> x % 2 == 0;
        List<Integer> newlist=test1(list,predicate);
        newlist.forEach (System.out::println);

    }
    public static List<Integer>test(int x, Supplier<Integer>supplier) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < x; i++) {
            list.add(supplier.get());
        }
        return list;
    }
    public static List<Integer>test1( List<Integer> list,Predicate<Integer> predicate) {
        List<Integer> newlist=new ArrayList<>();
        for(Integer X :list){
            boolean b=predicate.test(X);
            if(b){
                newlist.add(X);
            }
        }
        return newlist;
    }
}
