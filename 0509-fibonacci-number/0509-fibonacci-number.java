class Solution {
    public int fib(int n) {
        int t0=0;
        int t1=1;
        if(n==0)
        {
            return 0;
        }
        for(int i=2;i<=n;i++)
        {
            int temp=t0+t1;
            t0=t1;
            t1=temp;
        }
        return t1;
    }
}