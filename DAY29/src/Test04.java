import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test04 {
    public static void main(String[] args) {
        Object o = Utils.invokeField("com.coder.test.Student",
                new String[]{"name", "age", "gender"}
                , new Object[]{"李白", 20, "男"});
        System.out.println(o);

    }
}
class MathTest{
    public int add(int x,int y){
        return x+y;
    }
    public double mul(int x,double y){
        return x*y;
    }
}
class Utils{
    public static Object invokeMethod(String className,String methodName,Object[] args,
                                      Class<?>...params){
        try {
            Class<?> aClass = Class.forName(className);
            Object obj=aClass.getDeclaredConstructor().newInstance();
            Method method=aClass.getDeclaredMethod(methodName,params);
            method.setAccessible(true);
            return method.invoke(obj,args);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    public static Object invokeSetMethod(String className,String fieldName,
                                         Object fieldValue){
        Object obj=null;
        try {
            Class<?> aClass = Class.forName(className);
            obj=aClass.getDeclaredConstructor().newInstance();
            StringBuilder stringBuilder=new StringBuilder(fieldName);
            stringBuilder.setCharAt(0,Character.toUpperCase(fieldName.charAt(0)));
            Method method=aClass.getDeclaredMethod("set"+stringBuilder,fieldValue.getClass());
            method.invoke(obj,fieldValue);
        }catch (Exception e){
            e.printStackTrace();
        }
        return obj;

    }
    public static Object invokeField(String className,String[] fields,Object[] values){
        Object obj=null;
        try {
            Class<?> aClass = Class.forName(className);
            obj = aClass.getDeclaredConstructor().newInstance();
            for (int i = 0; i < fields.length; i++) {
                Field field=aClass.getDeclaredField(fields[i]);
                field.setAccessible(true);
                field.set(obj,values[i]);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return obj;
    }
}
