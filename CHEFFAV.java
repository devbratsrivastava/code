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
		    String s=sc.next();
		    //System.out.println(n+" "+s);
		    int fo=0,c=0;
		    for(int j=0;j<s.length()-4+1;j++)
		    {
		        if(s.substring(j,j+4).equals("chef"))
		        {
		            fo=j;
		            break;
		        }
		    }
		    //System.out.println(fo);
		    for(int j=0;j<fo-4+1;j++)
		    {
		        if(s.substring(j,j+4).equals("code"));
		        {
		            c++;
		            break;
		        }
		    }
		    if(c==0)
		    System.out.println("WA");
		    else
		    System.out.println("AC");
		}
	}
}
