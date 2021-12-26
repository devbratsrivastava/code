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
		    int a[]=new int[n];
		    int b[]=new int[n];
		    for(int j=0;j<n;j++)
		    {
		        a[j]=sc.nextInt();
		        b[j]=1;
		    }
		    /*for(int j=0;j<n;j++)
		    System.out.print(a[j]+" ");
		    System.out.println();
		    for(int j=0;j<n;j++)
		    System.out.print(b[j]+" ");*/
		    for(int j=0;j<n;j++)
		    {
		        for(int k=j;k>0;k--)
		        {
		            if(Math.abs(a[k]-a[k-1])<=2)
		            {
    		            //System.out.print("b[j]="+b[j]+" i= "+i);
    		            b[j]++;
		            }
		            else
		            break;
		        }
		        //System.out.println();
		        for(int k=j;k<n-1;k++)
		        {
		            if(Math.abs(a[k]-a[k+1])<=2)
		            {
    		            //System.out.print("b[j]="+b[j]+" i= "+i);
    		            b[j]++;
		            }
		            else
		            break;
		        }
		        //System.out.println();
		    }
		    Arrays.sort(b);
		    //for(int j=0;j<n;j++)
		    //System.out.print(b[j]+" ");
		    //System.out.println();
		    System.out.println(b[0]+" "+b[b.length-1]);
		}
	}
}
