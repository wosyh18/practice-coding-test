package num1020;

import java.util.Scanner;

public class n1025 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String [] oneStr = str.split("");
        int[] oneInt = new int[oneStr.length];
        for (int i = 0 ; i < oneStr.length ; i++) {
            oneInt[i]=Integer.parseInt(oneStr[i]);
        }
        int num = 10000;
        for ( int i = 0 ; i <  oneInt.length ; i++) {
            System.out.println("["+oneInt[i] * num + "]");
            num/=10;
        }

        }
    }


