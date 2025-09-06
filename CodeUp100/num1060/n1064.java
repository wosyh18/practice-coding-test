package num1060;

import java.util.Scanner;

public class n1064 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int first = a > b ? b : a;
        int second = first > c ? c : first;
        System.out.println(second);
    }

}
