package num1090;

import java.util.Scanner;

public class n1092 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int value = lcm(lcm(x, y), z);

        System.out.println(value);

    }

    public static int gcd(int a , int b){
        if (  b == 0 ) return a;
        return gcd(b, a % b);
        // a = b*q + r일때 a,b의 최대공약수 == b,r의 최대공약수
    }

    public static int lcm(int a , int b){
        return (a*b)/gcd(a,b);
        //a*b =gcd * a`* gcd * b`
    }
}
