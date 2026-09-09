class Solution {
    public long countCommas(long n) {
        long count=0;
        count+=Math.max(0,n-999L);
        count+=Math.max(0,n-999999L);
        count+=Math.max(0,n-999999999L);
        count+=Math.max(0,n-999999999999L);
        count += Math.max(0L, n - 999999999999999L);
        return count;
    }
}