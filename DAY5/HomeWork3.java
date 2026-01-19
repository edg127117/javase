public class HomeWork3 {
    public static void main(String[] args) {
        for (int i=1;i<=50;i++){
            for(int j=1;j<=50-i;j++){
                if(j+i==50 && 2*i+4*j==120)  {
                    System.out.println("鸡："+i+"兔："+j);
                }

            }
        }
    }
}
