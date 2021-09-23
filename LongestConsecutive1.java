class Solution{
    
    /*  Function to calculate the longest consecutive ones
    *   N: given input to calculate the longest consecutive ones
    */
    public static int maxConsecutiveOnes(int N) {
        int c=0,max=0;
        // Your code here
        while(N!=0)
        {
            if(N%2==0)
            c=0;
            else
            c++;
            if(max<c)
            max=c;
            N/=2;
        }
        return max;
    }
}
