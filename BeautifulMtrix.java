import java.io.*;
import java.util.StringTokenizer;
public class Main
{
	public static void main(String[] args)throws IOException {
	    try
	    {
    		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    		//int n=Integer.parseInt(br.readLine());
    		int a[][]=new int[5][5];
    		int r=0,c=0;
    		for(int i=0;i<5;i++)
    		{
    		    StringTokenizer st=new StringTokenizer(br.readLine());
    		    for(int j=0;j<5;j++)
    		    {
    		        a[i][j]=Integer.parseInt(st.nextToken());
    		    }
    		}
    		for(int i=0;i<5;i++)
    		{
    		    for(int j=0;j<5;j++)
    		    {
    		        if(a[i][j]==1)
    		        {
    		            r=i;
    		            c=j;
    		            break;
    		        }
    		    }
    		}
    		System.out.println(Math.abs(2-r)+Math.abs(2-c));
    	    }
    	    catch(Exception e)
    	    {
    	        System.out.println(e);
    	    }
	}
}
