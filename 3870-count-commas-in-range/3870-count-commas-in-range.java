class Solution {
    public int countCommas(int n) {
        int count =0;
        count+= Math.max(0,n-999);
        count+=Math.max(0, n-999999);
        count+=Math.max(0,n-999999999);
        return count;
    }
}