import java.util.*;
public class CircularArrayRotation
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int q=sc.nextInt();
        //System.out.print(n+" "+k+" "+q);
        //int a[]=new int[n];
        ArrayList<Integer> a=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        a.add(sc.nextInt());
        //System.out.println(a);
        //for(int i=0;i<n;i++)
        //System.out.print(a[i]+" ");
        for(int i=0;i<k;i++)
        {
            int f=a.get(n-1);
            a.add(0,f);
            a.remove(n);
        }
        for(int i=0;i<q;i++)
        {
            int x=sc.nextInt();
            System.out.println(a.get(x));
            //System.out.println(a[n-((x+k)%n)]);
        }
    }
}
