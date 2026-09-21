class Solution {
    public int removeDuplicates(int[] nums) {
        int[] temp = new int[nums.length];
        temp[0]=nums[0];
         int j =0;
        for ( int i =1;i<nums.length;i++){
            if(temp[j]!=nums[i]){
                j++;
                temp[j]=nums[i];
            }
        }
        for(int i=0;i<=j;i++){
            nums[i]=temp[i];
        }
        return j+1;
    }
}