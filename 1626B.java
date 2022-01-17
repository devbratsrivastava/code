import java.util.*;
import java.math.BigInteger;
public class B1626 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(;t>0;t--)
        {
            String x=sc.next();
            String a[]=new String[x.length()-1];
            int s=0;
            for(int i=0;i<x.length()-2;i++)
            {
                s=Integer.parseInt(""+x.charAt(i))+Integer.parseInt(""+x.charAt(i+1));
                a[i]=x.substring(0,i)+s+x.substring(i+2,x.length());
            }
            s=Integer.parseInt(""+x.charAt(x.length()-2))+Integer.parseInt(""+x.charAt(x.length()-1));
            a[a.length-1]=x.substring(0,x.length()-2)+s;
            /*for(int i=0;i<a.length;i++)
                System.out.print(a[i]+" ");
            System.out.println();*/
            //Arrays.sort(a);
            /*for(int i=0;i<a.length;i++)
                System.out.print(a[i]+" ");
            System.out.println();*/
            //System.out.println(a[a.length-1]);
            BigInteger max=new BigInteger(a[0]);
            for(int i=0;i<a.length;i++)
            {
                if(new BigInteger(a[i]).compareTo(max)==1)
                    max=new BigInteger(a[i]);
            }
            System.out.println(max);
        }
    }
}
