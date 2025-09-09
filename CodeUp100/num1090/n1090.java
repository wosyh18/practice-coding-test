package num1090;

import java.util.Scanner;

public class n1090 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();
        double value = a*(Math.pow(r,(n-1)));
        System.out.println((long)value); //값이 클 때는 long으로
    }

}
