package test02;

import java.lang.reflect.Proxy;

public class TestAccount {
    public static void main(String[] args) {
        AccountServiceImpl AccountService=new AccountServiceImpl();
        Object obj = Proxy.newProxyInstance(AccountService.getClass().getClassLoader(),
                AccountService.getClass().getInterfaces(),
                new Handler(AccountService));
        AccountService service= (AccountService) obj;
        service.accountManager();
    }
}
