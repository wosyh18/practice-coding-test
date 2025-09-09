package num1080;

import java.util.Scanner;

public class n1087 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int n =sc.nextInt();
        int sum  = 0;
        int i = 0;
        while (sum < n) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
