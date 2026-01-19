package test02;

import java.lang.reflect.Proxy;

public class TestUser {
    public static void main(String[] args) {
        UserServiceImpl userService=new UserServiceImpl();
        Object obj = Proxy.newProxyInstance(userService.getClass().getClassLoader(),
                userService.getClass().getInterfaces(),
                new Handler(userService));
        UserService service= (UserService) obj;
        service.userManager();
    }
}
