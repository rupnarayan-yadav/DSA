class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int maxlen=0;
        int start=0;
        int end=0;
        HashSet<Character> set=new HashSet<>();
        while(end<n){
            char current=s.charAt(end);
            if(!set.contains(current)){
                set.add(current);
                maxlen=Math.max(maxlen,end-start+1);
                end++;
            } else{
                set.remove(s.charAt(start));
                start++;
            }
        }
        return maxlen;
    }
}