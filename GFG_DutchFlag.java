class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int l=0,m=0,h=n-1,t;
        while(m<=h)
        {
            switch(a[m])
            {
                case 0:
                    {
                        t=a[l];
                        a[l]=a[m];
                        a[m]=t;
                        l++;
                        m++;
                        break;
                    }
                    case 1:
                        {
                            m++;
                            break;
                        }
                        case 2:
                            {
                                t=a[m];
                                a[m]=a[h];
                                a[h]=t;
                                h--;
                                break;
                            }
            }
        }
    }
}
