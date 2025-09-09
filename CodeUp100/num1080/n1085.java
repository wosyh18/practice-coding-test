package num1080;

import java.util.Scanner;

public class n1085 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long x = sc.nextLong();
        long y = sc.nextLong();
        long z = sc.nextLong();
        long k =  sc.nextLong();

        double value = ( x * y * z * k ) / Math.pow(2, 3) / Math.pow(2,10) / Math.pow(2,10) ;

        System.out.printf("%.1f MB",value);
    }
}
