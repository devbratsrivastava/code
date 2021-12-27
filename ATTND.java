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
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n=sc.nextInt();
		    String s[][]=new String[n][2];
		    for(int j=0;j<n;j++)
		    {
		        s[j][0]=sc.next();
		        s[j][1]=sc.next();
		    }
		    /*for(int j=0;j<n;j++)
		    {
		        System.out.println(s[j][0]+" "+s[j][1]);
		    }*/
		    for(int j=0;j<n;j++)
		    {
		        int c=0;
		        for(int k=0;k<n;k++)
		        {
		            if(j==k)
		            continue;
		            else
		            {
		                if(s[j][0].equals(s[k][0]))
		                {
		                    System.out.println(s[j][0]+" "+s[j][1]);
		                    c++;
		                    break;
		                }
		                
		            }
		        }
		        if(c==0)
		        System.out.println(s[j][0]);
		    }
		}
	}
}
