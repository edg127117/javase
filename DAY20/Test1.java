import java.util.function.BinaryOperator;

public class Test1 {
    public static void main(String[] args) {
        test(10,40,Integer::sum);
    }
    public static void test(Integer x, Integer y, BinaryOperator<Integer> test) {
        Integer apply = test.apply(x, y);
        System.out.println(apply);
    }
}
