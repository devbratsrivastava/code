import java.util.*;
import java.util.Arrays;
public class SorttheSubstring
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            String s=sc.next();
            int n=sc.nextInt();
            int m=sc.nextInt();
            String w=s.substring(n,m+1);
            char c[]=w.toCharArray();
            Arrays.sort(c);
            String q=new String(c);
            StringBuffer r=new StringBuffer(q);
            r.reverse();
            System.out.println(s.substring(0,n)+r+s.substring(m+1));
        }
    }
}
