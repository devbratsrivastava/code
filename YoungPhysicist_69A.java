import java.io.*;
import java.util.StringTokenizer;
public class Main
{
	public static void main(String[] args)throws IOException {
	    try
	    {
    		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    		int n=Integer.parseInt(br.readLine());
    		int a[][]=new int[n][3];
    		int sf=0,s=0,c=0;
    		for(int i=0;i<n;i++)
    		{
    		    StringTokenizer st=new StringTokenizer(br.readLine());
    		    for(int j=0;j<3;j++)
    		    {
    		        a[i][j]=Integer.parseInt(st.nextToken());
    		    }
    		}
    		for(int j=0;j<3;j++)
    		{
    		    //int s=0;
    		    for(int i=0;i<n;i++)
    		    {
    		        s+=a[i][j];
    		    }
    		    //System.out.println(s);
    		    //sf+=s;
    		    //s=0;
    		    if(s!=0)
    		    {
    		        c++;
    		        break;
    		    }
    		    s=0;
    		}
    		if(c==0)
    		System.out.println("YES");
    		else
    		System.out.println("NO");
    	    }
    	    catch(Exception e)
    	    {
    	        System.out.println(e);
    	    }
	}
}
