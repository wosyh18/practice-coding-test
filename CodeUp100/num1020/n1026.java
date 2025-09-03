package num1020;

import java.util.Scanner;

public class n1026 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] str = sc.next().split(":");
        if (str[1].equals("00")) {
            System.out.println("0");
        }
        else {
            System.out.println(str[1]);
        }
    }

}
