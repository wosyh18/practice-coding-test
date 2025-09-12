package num1090;

import java.util.Scanner;

public class n1095 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();

        int nums[] = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int min = nums[0];

        for (int i = 0; i < n-1; i++) {
            if (min > nums[i+1]) min = nums[i+1];
        }
        System.out.println(min);
    }
}
