

class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        for (int i = 0 ;i < num_list.length; i++){
            sum += num_list[i];
        }
        int sum_p = sum*sum;
        int x=1;
        for (int i = 0; i < num_list.length; i++){
            x *= num_list[i];
        }
         return (x < sum_p) ? 1 : 0;
    }
}