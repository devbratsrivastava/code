class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here
        int z=0,o=0,t=0,i=0;
        for(i=0;i<a.length;i++)
        {
            if(a[i]==0)
                z++;
            else if(a[i]==1)
                o++;
            else 
                t++;
        }
        i=0;
        while(i<z)
        {
            a[i]=0;
            i++;
        }
        while(i<o+z)
        {
            a[i]=1;
            i++;
        }
        while(i<t+o+z)
        {
            a[i]=2;
            i++;
        }
    }
}
