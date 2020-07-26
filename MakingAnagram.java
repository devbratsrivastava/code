import java.util.*;
public class MakingAnagrams
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        //String s3=s1+s2;
        int a1[]=new int[26];
        int a2[]=new int[26],c=0,d=0;
        //int c=0,d=0;
        for(char i='a';i<='z';i++)
        {
            for(int j=0;j<s1.length();j++)
            {
                if(i==s1.charAt(j))
                c++;
            }
            a1[(int)i-97]=c;
            c=0;
        }
        for(char i='a';i<='z';i++)
        {
            for(int j=0;j<s2.length();j++)
            {
                if(i==s2.charAt(j))
                c++;
            }
            a2[(int)i-97]=c;
            c=0;
        }
        for(int i=0;i<26;i++)
        d+=Math.abs(a1[i]-a2[i]);
        System.out.print(d);
        //for(int i=0;i<26;i++)
        //System.out.print(a2[i]+" ");
    }
}
