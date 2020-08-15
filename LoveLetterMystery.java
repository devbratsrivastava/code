import java.util.*;
public class loveletter
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            String s=sc.next(),w="",r="";
            int f=0;
            for(int j=s.length()-1;j>=0;j--)
            {
                w+=s.charAt(j);
            }
            //System.out.println(w);
            if(s.equals(w))
            System.out.println(0);
            else
            {
                if(s.length()%2==0)
                {
                    r=s.substring(0,s.length()/2);
                    for(int j=s.length()/2-1;j>=0;j--)
                    r+=s.charAt(j);
                    //System.out.println(r);
                    for(int j=0;j<s.length();j++)
                    f+=Math.abs((int)s.charAt(j)-(int)r.charAt(j));
                    System.out.println(f);
                }
                else
                {
                    r=s.substring(0,s.length()/2+1);
                    for(int j=s.length()/2-1;j>=0;j--)
                    r+=s.charAt(j);
                    for(int j=0;j<s.length();j++)
                    f+=Math.abs((int)s.charAt(j)-(int)r.charAt(j));
                    System.out.println(f);
                }
            }
        }
    }
}
