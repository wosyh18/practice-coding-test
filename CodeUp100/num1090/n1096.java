package num1090;

import java.util.Scanner;

public class n1096 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] arr = new int [19][19];
        int n =sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a =  sc.nextInt();
            int b = sc.nextInt();
            arr[a-1][b-1] = 1;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
