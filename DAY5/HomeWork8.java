public class HomeWork8 {
    public static void main(String[] args) {
        for (int i = 1; i <=9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i == 5 || j==5 ||(i+j)==10 || i==j) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}
