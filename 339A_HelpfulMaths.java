import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		//String s="3+3+3+3+1+2+3+2+1";
		String s=sc.next();
		String r="";
		for(int i=48;i<=51;i++)
		{
		    for(int j=0;j<s.length();j++)
		    {
		        if(s.charAt(j)==(char)i)
		        {
    		        r+=s.charAt(j);
    		        r+="+";
		        }
		        
		        
		    }
		    //if(s.charAt(j)=='+')
		        
		}
		System.out.println(r.substring(0,r.length()-1));
	}
}
