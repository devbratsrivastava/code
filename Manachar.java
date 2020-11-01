import java.util.*;
public class Manachar
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int c=0;
        for(int i=1;i<=s.length();i++)
        {
            for(int j=0;j<i;j++)
            {
                String r=s.substring(j,j+s.length()-i+1);
                //System.out.print(r+" ");
                String w="";
                //for(int k=r.length()-1;k>=0;k++)
                //w+=r.charAt(i);
                if(palindrome(r)==true)
                {
                    System.out.println(r.length());
                    System.out.println(r);
                    c++;
                    break;
                }
                //if(c!=0)
                //break;
            }
            if(c!=0)
            break;
            //System.out.println();
        }
    }
    static boolean palindrome(String s)
    {
        String w="";
        for(int i=s.length()-1;i>=0;i--)
        w+=s.charAt(i);
        return s.equals(w);
    }
}
