import java.io.*;
import java.util.StringTokenizer;
public class Main
{
	public static void main(String[] args)throws IOException {
	    try
	    {
    		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    		StringTokenizer st=new StringTokenizer(br.readLine());
    		int n=Integer.parseInt(st.nextToken());
    		int t=Integer.parseInt(st.nextToken());
    		String s=br.readLine();
    		String a[]=new String[n],f="";
    		for(int i=0;i<s.length();i++)
    		{
    		    a[i]=""+s.charAt(i);
    		}
    		//for(int i=0;i<s.length();i++)
    		//System.out.print(a[i]);
    		for(int j=0;j<t;j++)
    		{
        		for(int i=0;i<n-1;i++)
        		{
        		    if(a[i].equals("B")&&a[i+1].equals("G"))
        		    {
        		        f=a[i];
        		        a[i]=a[i+1];
        		        a[i+1]=f;
        		        i+=1;
        		    }
        		}
    		}
    		for(int i=0;i<s.length();i++)
    		System.out.print(a[i]);
	    }
    	catch(Exception e)
    	{
    	   System.out.println(e);
    	}
	}
}
