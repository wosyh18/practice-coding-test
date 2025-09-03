package num1010;

import java.util.Scanner;

public class n1020 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] data = a.split("-");

        int x = Integer.parseInt(data[0]);
        int y = Integer.parseInt(data[1]);

        System.out.printf("%06d%07d",x,y);
    }
}
