class Solution {
    public int reverse(int x) {
        int n=0;
        if(x==0)
            return 0;
        else if(x>0)
        {
            while(x>0)
            {
                n=(n*10)+(x%10);
                x/=10;
            }
            if(Integer.MIN_VALUE>(n/10)||(n/10)>Integer.MAX_VALUE)
                return 0;
            else
                return n;
        }
        else
        {
            x=0-x;
            while(x>0)
            {
                n=(n*10)+(x%10);
                x/=10;
            }
            if(Integer.MIN_VALUE>(n/10)||(n/10)>Integer.MAX_VALUE)
                return 0;
            else
                return (0-n);
        }
    }
}
