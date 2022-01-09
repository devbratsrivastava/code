/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(;t>0;t--)
		{
    		String s=br.readLine(),r="",ans="No";
    		//System.out.println(s);
    		//int c=0;
    		second_loop:
    		for(int i=s.length()-1,j=1;i>=0;i--)
    		{
    		    //int j=1;
    		    for(int k=0;k<=i;k++)
    		    {
    		        r=s.substring(k,k+j);
    		        //System.out.print(r+" ");
    		        //System.out.print(k+""+j+" ");
    		        int n=0,e=0;
    		        for(int l=r.length()-1;l>=0;l--)
    		        {
    		            n+=(Integer.parseInt(""+r.charAt(l))*Math.pow(2,e++));
    		        }
    		        //System.out.print(n+" ");
    		        int c=0;
    		        if(n==1 || n==4 || n==0)
    		        ans="No";
    		        else if(n==2 || n==3 || n==5)
    		        {
    		            ans="Yes";
    		            break second_loop;
    		        }
    		        else if(n>5)
    		        {
    		            for(int l=2;l<n/2;l++)
    		            {
    		                if(n%l==0)
    		                c++;
    		            }
    		            if(c==0)
    		            {
    		                ans="Yes";
    		                break second_loop;
    		            }
    		        }
    		    }
    		    j++;
    		    //System.out.print(r+" ");
    		    //System.out.println();
    		}
    		//System.out.println();
    		System.out.println(ans);
		}
	}
}
