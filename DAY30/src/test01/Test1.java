package test01;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Test1{
public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    Class<Student> studentClass = Student.class;
    Student student = studentClass.getDeclaredConstructor().newInstance();
    Field[] fields = studentClass.getDeclaredFields();
    for (Field field : fields) {
        field.setAccessible(true);
        Value annotation = field.getAnnotation(Value.class);
        String value = annotation.value();
        if (field.getType().getSimpleName().equals("int"))
            field.set(student, Integer.parseInt(value));
        else
            field.set(student, value);
    }
    System.out.println(student);
  }
}
