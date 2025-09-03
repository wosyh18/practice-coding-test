package num1020;

import java.util.Scanner;

public class n1024 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String data=sc.next();
        String[] a = data.split("");
        for(String x : a){
            System.out.println("\'"+x+"\'");
        }
    }

}
