import java.util.*;
public class jumpingclouds
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int e=100;
        for(int i=0;i<n;i+=k)
        {
            if(a[i]==1)
            e-=2;
        }
        System.out.println(e-(n/k));
    }
}
