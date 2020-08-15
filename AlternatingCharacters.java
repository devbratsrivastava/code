import java.util.*;
public class alternatingcharacters
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),c=0;
        for(int i=0;i<n;i++)
        {
            String s=sc.next();
            for(int j=0;j<s.length()-1;j++)
            {
                if(s.charAt(j)==s.charAt(j+1))
                c++;
            }
            System.out.println(c);
            c=0;
        }
    }
}
