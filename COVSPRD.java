/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(;t>0;t--)
		{
		    int n=sc.nextInt();
		    int d=sc.nextInt();
		    //System.out.println(n+" "+d);
		    BigInteger r=BigInteger.valueOf(1);
		    //System.out.println(r);
		    if(d==0)
		    System.out.println(1);
		    else
		    {
		        if(d>0 && d<11)
		        {
		            for(int i=0;i<d;i++)
		            {
		                if(r.compareTo(BigInteger.valueOf(n))==1)
		                break;
		                else
		                r=r.multiply(BigInteger.valueOf(2));
		            }
		        }
		        else if(d>10)
		        {
		            for(int i=0;i<d;i++)
		            {
		                if(i<10)
		                {
		                    if(r.compareTo(BigInteger.valueOf(n))==1)
    		                break;
    		                else
    		                r=r.multiply(BigInteger.valueOf(2));
		                }
		                else
		                {
    		                if(r.compareTo(BigInteger.valueOf(n))==1)
    		                break;
    		                else
    		                r=r.multiply(BigInteger.valueOf(3));
		                }
		            }
		        }
		        if(r.compareTo(BigInteger.valueOf(n))==1)
		        System.out.println(n);
		        else
		        System.out.println(r);
	        }
        }
	}
}
