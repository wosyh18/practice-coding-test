package num1030;

import java.util.Arrays;
import java.util.Scanner;

public class n1038 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long[] n = Arrays.stream(sc.nextLine().split(" "))
                .mapToLong(Long::parseLong)
                .toArray();
        System.out.println(n[0]+n[1]);
    }
}
