class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1)
            return x;
        long s=1,e=x,ans=0;
        
        while(s<=e)
        {
            long m=(s+e)/2;
            if(m*m==x)
                return (int)m;
            
            if(m*m<x)
            {
                s=m+1;
                ans=m;
            }
            else
                e=m-1;
        }
        return (int)ans;
    }
}
