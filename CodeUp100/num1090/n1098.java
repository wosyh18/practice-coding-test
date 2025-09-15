package num1090;

import java.util.Scanner;

public class n1098 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];

        int r = sc.nextInt();
        for (int i = 0; i < r; i++) {
            int l = sc.nextInt();
            int d = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (d == 0) {
                for (int j = 0; j < l; j++) { //길이
                    arr[x-1][y-1]=1;
                    y++;
                }
            }
            else{
                for (int j = 0; j < l; j++) {
                    arr[x-1][y-1]=1;
                    x++;
                }
            }
        }

        for ( int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }

}
