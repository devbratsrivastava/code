import java.util.*;
public class FlippingBits
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        for(int k=0;k<q;k++)
        {
            long n=sc.nextLong();
            String s="",w="";
            long x=0;
            while(n>0)
            {
                s+=""+(n%2);
                n/=2;
            }
            //System.out.println(s);
            StringBuffer sbr=new StringBuffer(s);
            sbr.reverse();
            s=""+sbr;
            //System.out.println(s);
            for(int i=0;i<(32-s.length());i++)
            w+="0";
            w+=s;
            //System.out.println(w);
            s="";
            for(int i=0;i<w.length();i++)
            {
                if(w.charAt(i)=='0')
                s+="1";
                else
                s+="0";
            }
            //System.out.println(s);
            int j=0;
            for(int i=s.length()-1;i>=0;i--)
            {
                x+=Integer.parseInt(""+s.charAt(i))*(Math.pow(2,j++));
            }
            System.out.println(x);
        }
        }
    }
