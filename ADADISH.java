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
		    for(int j=0;j<n;j++)
		    a[j]=sc.nextInt();
		    Arrays.sort(a);
		    //for(int j=0;j<n;j++)
		    //System.out.print(a[j]+" ");
		    //System.out.println();
		    if(n==1)
		    System.out.println(a[0]);
		    else if(n==2)
		    System.out.println(a[a.length-1]);
		    else
		    {
		        int s=a[a.length-2];
		        int k=a[a.length-1]-a[a.length-2];
		        int j=a.length-3;
		        while(j>=0)
		        {
		            if(k==0 || a[j]==0)
		            {
    		            s+=Math.max(k,a[j]);
    		            break;
		            }
		            s+=Math.min(k,a[j]);
		            k=Math.abs(a[j]-k);
		            j--;
		        }
		        System.out.println(s);
		    }
		}
	}
}
