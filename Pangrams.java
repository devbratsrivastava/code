import java.util.*;
public class pangrams
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        //System.out.println(s);
        s=s.toLowerCase();
        int a[]=new int[26],c=0;
        //System.out.println(s);
        for(char i='a';i<='z';i++)
        {
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(j)==i)
                a[(int)i-97]=1;
            }
        }
        for(int i=0;i<26;i++)
        {
            if(a[i]==0)
            c++;
        }
        if(c==0)
        System.out.println("pangram");
        else
        System.out.println("not pangram");
    }
}
