class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int windowsum=0;
        for(int i=0;i<k;i++){
            windowsum+=nums[i];
        }
        int maxsum=windowsum;
        for(int i=1;i<=nums.length-k;i++){
            windowsum-=nums[i-1];
            windowsum+=nums[i+k-1];
            maxsum=Math.max(maxsum,windowsum);
        }
        return (double) maxsum/k;
    }
}