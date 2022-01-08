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
		//Scanner sc=new Scanner(System.in);
		//int t=sc.nextInt();
		try
		{
    		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    		int t=Integer.parseInt(br.readLine());
    		for(int i=0;i<t;i++)
    		{
    		    StringTokenizer st=new StringTokenizer(br.readLine());
    		    
    		    //int n=sc.nextInt();
    		    //int k=sc.nextInt();
    		    int n=Integer.parseInt(st.nextToken());
    		    int k=Integer.parseInt(st.nextToken());
    		    String s=br.readLine();
    		    //String s=sc.next(),
    		    String r="";
    		    //System.out.println(n+" "+k+" "+s);
    		    for(int j=k;j>0;j--)
    		    {
    		        for(int l=j-1;l>=0;l--)
    		        r+=""+s.charAt(l);
    		        //for(int l=j;l<s.length();l++)
    		        //r+=""+s.charAt(l);
    		        r+=s.substring(j,s.length());
    		        //System.out.println(r);
    		        s=r;
    		        //System.out.println(r);
    		        r="";
    		    }
    		    //System.out.println(r);
    		    //s=r;
    		        System.out.println(s);
    		        //s=r;
    		        //r="";
    		}
		}
		catch(Exception e)
		{
		    System.out.println(e);
		}
	}
}
