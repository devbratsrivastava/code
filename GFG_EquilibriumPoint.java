class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        int s=0,ls=0;
        for(int i=0;i<n;i++)
        s+=arr[i];
        for(int i=0;i<n;i++)
        {
            s-=arr[i];
            if(s==ls)
            return i+1;
            else
            ls+=arr[i];
        }
        return -1;
    }
}
