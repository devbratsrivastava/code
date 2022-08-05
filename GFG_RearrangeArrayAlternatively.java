class Solution{
    
    // temp: input array
    // n: size of array
    //Function to rearrange  the array elements alternately.
    public static void rearrange(long arr[], int n){
        
        // Your code here
        long t1=0;
        //int j=n-1;
        //int i=0;
        int k=1;
        for(int i=n-1;i>=n/2;i--)
        {
            t1=arr[n-1];
            //int k=1;
            int j=n-1;
            for(;j>=k;j--)
            {
                arr[j]=arr[j-1];
            }
            arr[j]=t1;
            k+=2;
            //for(j=0;j<n;j++)
            //    System.out.print(arr[j]+" ");
            //System.out.println();
        }
    }
    
}
