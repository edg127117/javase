public class HomeWork5 {
    public static void main(String[] args) {
            for(int x=1;x<100;x++){
                int sum=0;
                for(int i=1;i<x;i++){
                    if(x % i==0){
                        sum+=i;
                    }
                }
                if(x==sum){
                    System.out.println(x);
                }
            }

    }
}
