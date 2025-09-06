package num1060;

import java.util.Scanner;

public class n1068 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        if ( value >= 90){
            System.out.println("A");
        }
        else if ( value >= 70){
            System.out.println("B");
        }
        else if ( value >= 40){
            System.out.println("C");
        }
        else{
            System.out.println("D");
        }
    }
}
