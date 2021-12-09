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
		    char p[]=new char[3];
		    char o[]=new char[2];
		    for(int j=0;j<3;j++)
		    p[j]=sc.next().charAt(0);
		    for(int j=0;j<2;j++)
		    o[j]=sc.next().charAt(0);
		    firstloop:
		    for(int j=0;j<3;j++)
		    {
		        for(int k=0;k<2;k++)
		        {
		            if(p[j]==o[k])
		            {
		                System.out.println(p[j]);
		                break firstloop;
		            }
		        }
		    }
		}
	}
}
