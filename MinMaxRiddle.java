                                                                    /*without
                                                                    stacks 
                                                                    and
                                                                    queues*/
                                                                  
                                                                     
import java.util.*;
public class MinMaxRiddle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long a[]=new long[n],max=0,min=0;
        for(int i=0;i<n;i++)
        a[i]=sc.nextLong();
        //for(int i=0;i<n;i++)
        //System.out.print(a[i]+" ");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-i;j++)
            {
                long b[]=new long[i+1];
                //System.out.print(b.length+" ");
                min=a[j];
                for(int k=j;k<j+b.length;k++)
                {
                    //System.out.print(k+" ");
                    if(min>a[k])
                    min=a[k];
                }
                //System.out.print(j+" ");
                //System.out.println();
                if(max<min)
                max=min;
            }
            //System.out.println();
            System.out.print(max+" ");
            max=0;
        }
    }
}
