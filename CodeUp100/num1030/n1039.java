package num1030;

import java.util.Arrays;
import java.util.Scanner;

public class n1039 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long[] d = Arrays.stream(sc.nextLine().split(" "))
                .mapToLong(Long::parseLong)
                .toArray();

        System.out.print(d[0] + d[1]);

    }

}
