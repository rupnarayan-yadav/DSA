class Solution {
    public double myPow(double x, int n) {
        long expo=n;
        if(expo<0){
            x=1/x;
            expo=-expo;
        }
        return pow(x,n,1);
    }
    double pow(double x, long n, double ans){
        if(n==0){
            return ans;
        }
        if(n%2!=0){
            ans=ans*x;
        }
        return pow(x*x, n/2, ans);
    }
}