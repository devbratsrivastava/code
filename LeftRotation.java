import java.util.*;
public class Z
{
    public static void main(String  args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=d;i<n;i++)
        System.out.print(a[i]+" ");
        for(int i=0;i<d;i++)
        System.out.print(a[i]+" ");
    }
}
