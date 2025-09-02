package num1020;

import java.util.Scanner;

public class n1019 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b[] = a.split("\\.");

        int year = Integer.parseInt(b[0]);
        int month = Integer.parseInt(b[1]);
        int day = Integer.parseInt(b[2]);

        System.out.printf("%04d.%02d.%02d",year,month,day);
    }
}
