package num1060;

import java.util.Scanner;

public class n1063 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int value = a > b ? a : b ;
        System.out.println(value);
    }
}
