package num1070;

import java.util.Arrays;
import java.util.Scanner;

public class n1071 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        너무 복잡하게 풀었음 -> while true로 무한반복 생성
//        String numsar= sc.nextLine();
//
//        String [] numsst = numsar.split(" ");
//
//        int [] nums = Arrays.stream(numsst)
//                .mapToInt(Integer::parseInt)
//                .toArray();
//
//        for (int n : nums) {
//            if (n != 0) {
//                System.out.println(n);
//            }
//            else{
//                System.exit(0);
//            }
//        }
        while (true) {
            int n = sc.nextInt();

            if (n == 0)
                break;
            System.out.println(n);
        }


    }

}
