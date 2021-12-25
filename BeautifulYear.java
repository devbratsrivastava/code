import java.io.*;
import java.util.StringTokenizer;
public class Main
{
	public static void main(String[] args)throws IOException {
	    //try
	    //{
    		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    		//StringTokenizer st=new StringTokenizer(br.readLine());
    		int n=Integer.parseInt(br.readLine());
    		//String s=""+n;
    		String r="";
    		//System.out.println(s);
    		for(int i=n+1;i<=9999;i++)
    		{
    		    String s=""+i;
    		    int c=i;
    		    //System.out.print(s+" ");
    		    for(char j='0';j<='9';j++)
    		    {
    		        //System.out.print(j);
    		        for(int k=0;k<s.length();k++)
    		        {
    		            if(j==s.charAt(k))
    		            {
        		            r+=""+j;
        		            break;
    		            }
    		        }
    		    }
    		    //System.out.print(r+" ");
    		    
    		    if(r.length()==4)
    		    {
    		        System.out.print(c);
    		        break;
    		    }
    		    r="";
    		    //System.out.print(r+" ");
    		}
	    //}
    	//catch(Exception e)
    	//{
    	   //System.out.println(e);
    	//}
	}
}
