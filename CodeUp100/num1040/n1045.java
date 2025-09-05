package num1040;

import java.util.Scanner;

public class n1045 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("%d\n%d\n%d\n%d\n%d\n%.2f\n",a+b,a-b,a*b,a/b,a%b,(float)a/b);
    }
}
