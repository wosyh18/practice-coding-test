package num1090;

import java.util.Scanner;

public class n1099 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [][] arr = new int [11][11];//1based
        //입력 받기
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        //n,m은 개미의 위치
        //2가 아닌동안 진행
        int n = 2, m = 2;

        while (true) {
            //1. 현재칸
            if (arr[n][m]==0) {
                arr[n][m]=9;
            }
            else if (arr[n][m]==2){
                arr[n][m]=9;
                break;
            }

            //2. 이동 결정
            if (m+1<=10 && arr[n][m+1]!=1) {
                m++; //오른쪽 이동
            }
            else if (n+1<=10 && arr[n+1][m]!=1) {
                n++; //아래 이동
            }
            else{
                break;
            }
        }

        for(int i = 1; i <= 10; i++){
            for (int j = 1; j <= 10; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        }
    }

