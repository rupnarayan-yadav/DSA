class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int maxAns=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==1){
                count++;
            }
            else{
                maxAns=Math.max(maxAns,count);
                count=0;
            }
        }
        return Math.max(maxAns,count);
    }
}