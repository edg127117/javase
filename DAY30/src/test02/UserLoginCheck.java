package test02;

import test01.Value;

import java.lang.reflect.Field;

public class UserLoginCheck {
    public boolean login(User user) throws Exception {
        Class<? extends User> aClass = user.getClass();
        Field name = aClass.getDeclaredField("name");
        Field pwd = aClass.getDeclaredField("pwd");
        Value nameAnnotation = name.getAnnotation(Value.class);
        Value pwdAnnotation = pwd.getAnnotation(Value.class);
        String nameValue = nameAnnotation.value();
        String pwdValue = pwdAnnotation.value();
        return user.getName().equals(nameValue) && user.getPwd().equals(pwdValue);
    }
}
