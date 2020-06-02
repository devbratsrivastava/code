import java.util.*;
public class gemstones
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),c=0,d=0;
        String a[]=new String[n],w="";
        for(int i=0;i<n;i++)
        {
            a[i]=sc.next();
        }
        /*for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }*/
        for(int i=0;i<n;i++)
        {
            for(char j='a';j<='z';j++)
            {
                for(int k=0;k<a[i].length();k++)
                {
                    if(a[i].charAt(k)==j)
                    {
                    w+=a[i].charAt(k);
                    break;
                    }
                }
                
            }
            a[i]=w;
            w="";
        }
        /*for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }*/
        for(char i='a';i<='z';i++)
        {
            for(int j=0;j<n;j++)
            {
                for(int k=0;k<a[j].length();k++)
                {
                    if(i==a[j].charAt(k))
                    c++;
                }
            }
            if(c==n)
            d++;
            c=0;
        }
        System.out.println(d);
    }
}
