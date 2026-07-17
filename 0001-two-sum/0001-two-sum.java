//solution
class Solution {
    public int[] twoSum(int[] nums, int target) {
            int cal;
            int n =nums.length;
        for(int i = 0;i<n;i++){
            for (int j=i+1;j<n;j++){
            cal=nums[i]+nums[j];
           if(cal == target) {
           return new int[]{i,j};
               }       
           }
        }
        return null;
    }
}
