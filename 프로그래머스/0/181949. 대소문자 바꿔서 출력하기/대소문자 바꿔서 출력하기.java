import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String value = "";
        
        for (int i = 0 ;  i < a.length(); i++){
            char A = a.charAt(i); // string에서 특정 문자 하나를 가져옴
            if (Character.isUpperCase(A)){
                value+=Character.toLowerCase(A);
            }
            else{
                value+= Character.toUpperCase(A);
            }
            //Character.to~(인자) Character의 정적메서드
        }
        
        System.out.print(value);
    }
}