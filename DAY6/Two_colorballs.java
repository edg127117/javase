import java.util.Arrays;

public class Two_colorballs {
    public static void main(String[] args) {
        int [] red=new int [6];
        for (int i = 0; i < red.length; i++) {
            while (true){
                int x=(int) (Math.random()*33)+1;
                boolean b=false;
                for (int r : red) {
                    if(r==x){
                        b=true;
                        break;
                    }

                }
                if(!b){
                    red[i]=x;
                    break;
                }
            }
        }
        Arrays.sort(red);
        System.out.println("红球：");
        System.out.println(Arrays.toString(red));
        int blue=(int) (Math.random()*16)+1;
        System.out.println("蓝球：");
        System.out.println(blue);
    }
}
