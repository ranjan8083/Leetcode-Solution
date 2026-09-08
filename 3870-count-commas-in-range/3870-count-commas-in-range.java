class Solution {
    public int countCommas(int n) {
        int count =0;
        if (n<1000){
            return 0;
        }
        for (int i=n;i>=1000;i--){
        int temp = i;
           while(temp>=1000){
            temp/=1000;
            count++;
           }
        }
        return count;
    }
}