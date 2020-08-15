import java.util.*;
public class funnystring
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        for(int i=0;i<q;i++)
        {
            String s=sc.next();
            int c=0;
            /*String r="";
            for(int j=s.length()-1;j>=0;j--)
            {
                r+=s.charAt(j);
            }
            System.out.println(r);*/
            for(int j=1;j<s.length();j++)
            {
                //System.out.print((int)s.charAt(j)+"-"+(int)s.charAt(j-1)+"=");
                //System.out.print((int)s.charAt(s.length()-j)+"-");
                //System.out.print((int)s.charAt(s.length()-1-j));
                if(Math.abs((int)s.charAt(j)-(int)s.charAt(j-1))!=Math.abs((int)s.charAt(s.length()-j)-(int)s.charAt(s.length()-1-j)))
                c++;
            }
            //System.out.println(c);
            if(c==0)
            System.out.println("Funny");
            else
            System.out.println("Not Funny");
            c=0;
        }
    }
}
