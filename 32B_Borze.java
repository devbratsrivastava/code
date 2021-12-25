import java.io.*;
import java.util.StringTokenizer;
public class Main
{
	public static void main(String[] args)throws IOException {
	    try
	    {
    		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    		//StringTokenizer st=new StringTokenizer(br.readLine());
    		String s=br.readLine();
    		//System.out.println(s);
    		String r="";
    		int c=0;
    		if(s.length()==1)
    		System.out.println("0");
    		else if(s.length()==2)
    		{
    		    if(s.equals("-."))
    		    System.out.println("1");
    		    else if(s.equals("--"))
    		    System.out.println("2");
    		    else
    		    System.out.println("00");
    		}
    		else
    		{
        		for(int i=0;i<s.length();i++)
        		{
        		    
        		    if(s.charAt(i)=='.')
        		    r+="0";
        		    else if(s.charAt(i)=='-'&&s.charAt(i+1)=='.')
        		    {
        		        r+="1";
        		        i+=1;
        		        if(i==s.length()-1)
        		        c++;
        		    }
        		    else if(s.charAt(i)=='-'&&s.charAt(i+1)=='-')
        		    {
        		        r+="2";
        		        i+=1;
        		        if(i==s.length()-1)
        		        c++;
        		    }
        		    
        		}
        		if(c!=0)
        		{
            		if(s.charAt(s.length()-1)=='.'&&s.charAt(s.length()-2)!='-')
            		r+="0";
        		}
        		System.out.println(r);
    		}
	    }
    	catch(Exception e)
    	{
    	   System.out.println(e);
    	}
	}
}
