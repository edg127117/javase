import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String[] ids ={"1111111111111","2222222222222","3333333333333"};
        Scanner sc = new Scanner(System.in);
        System.out.println("请放身份证");
        String id = sc.nextLine();
        boolean b = false;
        for(String s : ids){
            if(id.equals(s)){
               b=true;
               try{
                   throw new IdException(s+"身份证号码产生异常，可能是逃犯");
               }catch(IdException e){
                   e.printStackTrace();
               }
            }
        }
        if (b==false){
            System.out.println("办理入住成功");
        }
    }
}
