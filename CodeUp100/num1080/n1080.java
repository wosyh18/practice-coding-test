package num1080;

import java.util.Scanner;

public class n1080 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        int i = 0;
        while (true) {
            sum+=i;
            if (sum >= n) {
                break;
            }
            i++;

        }
        System.out.println(i);
    }
}
