package num1090;

import java.util.Scanner;

public class n1097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr [][]=new int[19][19];
        for (int i = 0 ; i < 19; i++){
            for ( int j = 0; j < 19;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        int n = sc.nextInt();

        for (int i = 0; i < n ;i++){
            int a = sc.nextInt()-1; //1based와 0based 유의하기 문제는 1based
            int b = sc.nextInt()-1;
            for (int j = 0; j < 19; j++) {
                if (arr[a][j]==0) {
                    arr[a][j]=1;
                }
                else arr[a][j]=0;
            }
            for (int j = 0; j < 19; j++) {
                if (arr[j][b]==0) {
                    arr[j][b]=1;
                }
                else arr[j][b]=0;
            }
        }
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }

}
