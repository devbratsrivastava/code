import java.util.*;
public class stringconstruction
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int  i=0;i<n;i++)
        {
            String s=sc.next(),w="";
            for(char j='a';j<='z';j++)
            {
                for(int k=0;k<s.length();k++)
                {
                    if(j==s.charAt(k))
                    {
                    w+=j;
                    break;
                    }
                }
            }
            System.out.println(w.length());
            w="";
        }
    }
}
