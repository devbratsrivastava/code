import java.util.*;
public class SansaandXor
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int l=0;l<t;l++)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
            //System.out.println((arr.length*(arr.length+1))/2);
            int a[]=new int[(arr.length*(arr.length+1))/2];
            int s=0,f=0;
            for(int i=0;i<arr.length;i++)
            {
                for(int j=0;j<arr.length-i;j++)
                {
                    s=arr[j];
                    //System.out.print(s+" ");
                    for(int k=j+1;k<=i+j;k++)
                    {
                        //t=a[j];
                        //t=(t^a[k]);
                        //System.out.print(arr[k]+" ");
                        s=(s^arr[k]);
                        //a[f++]=arr[k];
                    }
                    //System.out.println();
                    a[f++]=s;
                    s=0;
                    //s=t;
                    //s=(s^t);
                    //System.out.println();
                }
                //f=s;
                //f=(f^s);
                //System.out.println();
            }
            //for(int i=0;i<a.length;i++)
            //System.out.print(a[i]+" ");
            s=a[0];
            for(int i=1;i<a.length;i++)
            s=(s^a[i]);
            System.out.println(s);
        }
    }
}
