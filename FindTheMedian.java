import java.util.*;
public class median
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n],f=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int max=a[0],min=a[0];
        for(int i=0;i<n;i++)
        {
            if(min>a[i])
            min=a[i];
            else if(max<a[i])
            max=a[i];
        }
        for(int i=min;i<=max;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[j]==i)
                b[f++]=a[j];
            }
        }
        System.out.println(b[n/2]);
    }
}
