class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
        //Arrays.sort(arr1);
        //Arrays.sort(arr2);
        //int i1=0;i2=0;
        long t=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr1[j]>arr2[i])
                {
                    t=arr1[j];
                    arr1[j]=arr2[i];
                    arr2[i]=t;
                }
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}
