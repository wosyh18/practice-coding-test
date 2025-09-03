package num1020;

import java.util.Scanner;

public class n1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String[] data = x.split("\\.");
        int a = Integer.parseInt(data[0]);
        int b = Integer.parseInt(data[1]);

        System.out.printf("%d\n%d",a,b);
    }
}
