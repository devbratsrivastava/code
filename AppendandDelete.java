import java.util.*;
public class AppendandDelete
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int k=sc.nextInt(),c=0;
        if(s1.equals(s2))
        System.out.println("Yes");
        else if(Math.abs(s1.length()-s2.length())>k)
        System.out.println("No");
        else
        {
            if(s1.length()<s2.length())
            {
                c=0;
            for(int i=0;i<s1.length();i++)
            {
                if(s1.charAt(i)!=s2.charAt(i))
                {
                c=i;
                break;
                }
                
            }
            if(c==0)
            {
                if(s2.length()-s1.length()<k)
                System.out.println("Yes");
                else
                System.out.println("No");
            }
            //System.out.println(s1.substring(c,s1.length()));
            //System.out.println(s2.substring(c,s2.length()));
            else
            {
            if((s1.substring(c,s1.length())+s2.substring(c,s2.length())).length()<=k)
            System.out.println("Yes");
            else
            System.out.println("No");
            }
            }
            else
            {
                c=0;
                for(int i=0;i<s2.length();i++)
            {
                if(s1.charAt(i)!=s2.charAt(i))
                {
                c=i;
                break;
                }
                
            }
            if(c==0)
            {
                if(s1.length()-s2.length()<k)
                System.out.println("Yes");
                else
                System.out.println("No");
            }
            //System.out.println(s1.substring(c,s1.length()));
            //System.out.println(s2.substring(c,s2.length()));
            else
            {
            if((s1.substring(c,s1.length())+s2.substring(c,s2.length())).length()<=k)
            System.out.println("Yes");
            else
            System.out.println("No");
            }
            }
        }
    }
}
