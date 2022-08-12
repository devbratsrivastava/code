class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int max=1,need=1,i=1,j=0;
        while(i<n)
        {
            if(arr[i]>dep[j])
            {
                max--;
                j++;
            }
            else
            {
                i++;
                max++;
                if(max>need)
                need=max;
            }
        }
        return need;
    }
    
}
