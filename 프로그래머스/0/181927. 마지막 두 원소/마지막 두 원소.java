class Solution {
    public int[] solution(int[] num_list) {
         
        int k = num_list.length-1;
        int [] new_num_list = new int[k+2];
        
        for (int i = 0; i < k+1;i++ ){
                new_num_list[i] = num_list[i];
            }
        
        new_num_list[k+1] = num_list[k]>num_list[k-1] ? (num_list[k]-num_list[k-1]) : (num_list[k]*2);
        return new_num_list;
    }
}