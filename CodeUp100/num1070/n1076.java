package num1070;

import java.util.Scanner;

public class n1076 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char a = sc.next().charAt(0);
        int n = 97;
        while(n <= a){
            System.out.print((char)n+" ");
            n++;
        }
    }

}
