package num1060;

import java.util.Scanner;

public class n1067 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int value = sc.nextInt();

        if (value < 0) {
            System.out.println("minus");
            if (value % 2 == 0)
                System.out.println("even");
            else
                System.out.println("odd");
        } else {
            System.out.println("plus");
            if (value % 2 == 0)
                System.out.println("even");
            else
                System.out.println("odd");
        }

    }

}
