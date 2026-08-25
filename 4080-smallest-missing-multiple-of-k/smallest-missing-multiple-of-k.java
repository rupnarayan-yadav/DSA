class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer>myset=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            myset.add(nums[i]);
        }
        int multiple=k;
        while(myset.contains(multiple)){
            multiple=multiple+k;
        }
        return multiple;
    }
}