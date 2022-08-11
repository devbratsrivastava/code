class Solution{
    
    // temp: input array
    // n: size of array
    //Function to rearrange  the array elements alternately.
    public static void rearrange(long arr[], int n){
        
        // Your code here
        int maxind=n-1,minind=0;
        long maxele=arr[n-1]+1;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            arr[i]+=(arr[maxind--]%maxele)*maxele;
            else
            arr[i]+=(arr[minind++]%maxele)*maxele;
        }
        for(int i=0;i<n;i++)
        arr[i]/=maxele;
    }
    
}
