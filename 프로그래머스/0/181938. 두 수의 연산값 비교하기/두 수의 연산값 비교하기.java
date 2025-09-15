class Solution {
    public int solution(int a, int b) {
        String v1 = String.valueOf(a) + String.valueOf(b);
        int v2 = 2 * a * b;
        
        int iv1 = Integer.parseInt(v1);
        
        if (iv1 >= v2 ) return iv1;
        else return v2;
    }
}