class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        int localmax=0,globalmax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            localmax=Math.max(arr[i],arr[i]+localmax);
            if(localmax>globalmax)
            globalmax=localmax;
        }
        return globalmax;
    }
    
}
