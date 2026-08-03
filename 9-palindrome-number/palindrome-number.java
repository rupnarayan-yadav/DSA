class Solution {
    public boolean isPalindrome(int x) {
        String str=String.valueOf(x);
        return check(str,0,str.length()-1);
    }
    
    public boolean check(String str, int left, int right){
        if(left>=right){
            return true;
        }
        if(str.charAt(left)!=str.charAt(right)){
            return false;
        }
        return check(str,left+1,right-1);
    }
}