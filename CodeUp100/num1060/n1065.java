package num1060;

import java.util.Scanner;

public class n1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] nums = {sc.nextInt(),sc.nextInt(),sc.nextInt()};

        for ( int n : nums ) {
            if ( n % 2 == 0){
                System.out.println(n);
            }
        }
    }
}


