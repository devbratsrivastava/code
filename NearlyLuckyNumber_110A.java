import java.io.*;
import java.util.StringTokenizer;
public class Main
{
	public static void main(String[] args)throws IOException {
	    //try
	    //{
    		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    		long n=Long.parseLong(br.readLine());
    		String s=""+n;
    		int f=0,svn=0;
    		for(int i=0;i<s.length();i++)
    		{
    		    if(s.charAt(i)=='4')
    		    f++;
    		    else if(s.charAt(i)=='7')
    		    svn++;
    		}
    		if(f>0 && svn>0 && (f+svn)==s.length())
    		System.out.println("YES");
    		else
    		System.out.println("NO");
	    //}
    	//catch(Exception e)
    	//{
    	   //System.out.println(e);
    	//}
	}
}
