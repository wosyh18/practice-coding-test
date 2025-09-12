package num1090;

import java.util.Scanner;

public class n1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int nums[] = new int [23];

        for( int i = 0 ; i < n ; i++){
            int x = sc.nextInt();
            nums[x-1]++;
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

}
