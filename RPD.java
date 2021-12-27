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
		    //for(int j=0;j<n;j++)
		    //System.out.print(a[j]+" ");
		    //System.out.println();
		    if(n==2)
		    {
		        int p=a[0]*a[1],max=0;
		        String s=""+p;
		        for(int j=0;j<n;j++)
		        max+=Integer.parseInt(""+s.charAt(j));
		        System.out.println(max);
		    }
		    else
		    {
		        int size=(n*(n-1))/2,l=0;
		        int b[]=new int[size];
		        for(int m=0;m<n-1;m++)
		        {
		            for(int k=m+1;k<n;k++)
		            {
		                int p=a[m]*a[k];
		                int max=0;
        		        String s=""+p;
        		        for(int q=0;q<s.length();q++)
        		        max+=Integer.parseInt(""+s.charAt(q));
        		        b[l++]=max;
		            }
		        }
		        //for(int m=0;m<size;m++)
		        //System.out.print(b[m]+" ");
		        //System.out.println();
		        Arrays.sort(b);
		        System.out.println(b[b.length-1]);
		    }
		}
	}
}
