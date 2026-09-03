class Solution {
    public boolean uniformArray(int[] nums1) {
        int minval=Integer.MAX_VALUE;
        boolean hasodd=false;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]<minval){
                minval=nums1[i];
            }
            if(nums1[i]%2!=0){
                hasodd=true;
            }
        }
        return !hasodd || minval%2!=0;
    }
}