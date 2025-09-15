class Solution {
    public int solution(int a, int b) {
        String v1 = String.valueOf(a)+String.valueOf(b);
        String v2 = String.valueOf(b)+String.valueOf(a);
        
        int x = Integer.parseInt(v1);
        int y = Integer.parseInt(v2);
        
        if (x>=y) return x;
        else return y;
        
    }
}