package num1090;

import java.util.Scanner;

public class n1094 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[]nums = new int[n];

        for (int i = n-1; i >= 0; i--) {
            nums[i] = sc.nextInt();
        }
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
