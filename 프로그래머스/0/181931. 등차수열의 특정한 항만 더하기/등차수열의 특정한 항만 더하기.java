class Solution {
    public int solution(int a, int d, boolean[] included) {
        int sum = 0;
        for (int i = 1; i <=included.length; i++){
            if(included[i-1] == false) continue;
            else if (included[i-1] == true){
                sum += (a+ (i-1)*d);
            }
            //조건문 내의 true는 따로 설정하지도 않아도 됨 if(included[i-1])
        }
        return sum;
    }
}