class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxAns=0;
        int countZero=0;
        int l=0;   //left pointer
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0){
                countZero++;
            }
            if(countZero>k){
                if(nums[l]==0){
                    countZero--;
                }
                l++;
            }
            maxAns=Math.max(maxAns,r-l+1);
        }
        return maxAns;
    }
}