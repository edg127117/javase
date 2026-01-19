import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Test03 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<String> list=new ArrayList <>();
        Class<? extends ArrayList> aClass = list.getClass();
        Method method=aClass.getDeclaredMethod("add",Object.class);
        method.invoke(list,20);
        System.out.println(list);
    }
}
