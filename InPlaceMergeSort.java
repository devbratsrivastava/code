class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
        //Arrays.sort(arr1);
        //Arrays.sort(arr2);
        //int i1=0;i2=0;
        int i=0,j=0,k=n-1;
        long t=0;
        while(i<=k && j<m)
        {
            if(arr1[i]<arr2[j])
            i++;
            else
            {
                t=arr1[k];
                arr1[k]=arr2[j];
                arr2[j]=t;
                j++;
                k--;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}
