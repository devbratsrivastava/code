/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(;t>0;t--)
        {
            int n=sc.nextInt();
            int x=sc.nextInt();
            String s=sc.next(),r="";
            //char fl=s.charAt(0);
            //System.out.println(n+" "+x+" "+s+" "+fl);
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='1')
                    r+=i;
            }
            //System.out.println("r="+r);
            if(r.length()==1)
                System.out.println(s.length()/x);
            else
            {
                int fi=Integer.parseInt(""+r.charAt(0));
                int li=s.length()-1-Integer.parseInt(""+r.charAt(r.length()-1));
                //System.out.println(fi+" "+li);
                int max=Math.max(fi,li);
                //System.out.println(max);
                int mi=0;
                for(int i=0;i<r.length()-1;i++)
                {
                    if(max<(Integer.parseInt(""+r.charAt(i+1))-Integer.parseInt(""+r.charAt(i))-1))
                    {
                        max=(Integer.parseInt(""+r.charAt(i+1))-Integer.parseInt(""+r.charAt(i))-1);
                        mi=Integer.parseInt(""+r.charAt(i));
                    }
                }
                //System.out.println("mi="+mi);
                if(max>Math.max(fi,li))
                {
                    //System.out.println("middle");
                    s = s.substring(0, mi) + "0" + s.substring(mi + 1, s.length());
                }
                else if(max<=Math.max(fi,li))
                {
                    if(fi>=li)
                    {
                        //System.out.println("fi="+fi);
                        fi=Integer.parseInt(""+r.charAt(fi));
                        s = s.substring(0, fi) + "0" + s.substring(fi + 1, s.length());
                    }
                    else if(fi<li)
                    {
                        //System.out.println("li="+li);
                        li=Integer.parseInt(""+r.charAt(li));
                        s = s.substring(0, li) + "0" + s.substring(li + 1, s.length());
                    }
                }
                //System.out.println(s);
                int c=0;
                for(int i=0;i<s.length();i++)
                {
                    if(s.charAt(i)=='0')
                        c++;
                }
                System.out.println(c/x);
            }
            //System.out.println(r);
        }
    }
}
