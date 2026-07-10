class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxAns=0;
        int countZero=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                countZero++;
            }
            while(countZero>k){
                if(nums[j]==0){
                    countZero--;
                }
                j++;
            }
            maxAns=Math.max(maxAns,i-j+1);
        }
        return maxAns;
    }
}