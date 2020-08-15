import java.util.*;
public class gameofthrones
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int c=0,d=0,a[]=new int[26];
        for(char i='a';i<='z';i++)
        {
            for(int j=0;j<s.length();j++)
            {
                if(i==s.charAt(j))
                c++;
            }
            a[(int)i-97]=c;
            c=0;
            //if(c%2!=0)
            //d++;
        }
        /*for(int i=0;i<26;i++)
        {
            System.out.print(a[i]+",");
        }*/
        for(int i=0;i<26;i++)
        {
            if(a[i]%2!=0)
            d++;
        }
        if(d<2)
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}
