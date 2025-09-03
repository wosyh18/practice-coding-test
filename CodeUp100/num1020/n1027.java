package num1020;

import java.util.Arrays;
import java.util.Scanner;

public class n1027 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] a = Arrays.stream(sc.next().split("\\."))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.printf("%02d-%02d-%04d",a[2],a[1],a[0]);

    }

}
