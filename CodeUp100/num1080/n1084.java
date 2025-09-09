package num1080;

import java.util.Scanner;

public class n1084 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x =  sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    System.out.printf("%d %d %d\n",i,j,k);
                }
            }
        }
        System.out.println(x*y*z);
    }
}
