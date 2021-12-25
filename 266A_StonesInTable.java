/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args)
	{
		// your code goes here
		try
		{
		    Scanner sc=new Scanner(System.in);
		    int n=sc.nextInt();
		    String s=sc.next();
		    int c=0;
		    for(int i=0;i<n-1;i++)
		    {
		        if(s.charAt(i)==s.charAt(i+1))
		        c++;
		    }
		    System.out.println(c);
		}
		catch(Exception e)
		{
		    System.out.println(e);
		}
	}
}
