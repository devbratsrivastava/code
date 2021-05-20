import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the no. of blocks");
	    int a=sc.nextInt();
	    System.out.println("enter the no. of processes");
	    int b=sc.nextInt();
	    int bs[]=new int[a];
	    int ps[]=new int[b];
	    int allo[]=new int[b];
		Arrays.fill(allo,-1);
		System.out.println("enter the block sizes");
		for(int i=0;i<a;i++)
		bs[i]=sc.nextInt();
		System.out.println("enter the process sizes");
		for(int i=0;i<b;i++)
		ps[i]=sc.nextInt();
		for(int i=0;i<b;i++)
		{
		    for(int j=0;j<a;j++)
		    {
		        if(ps[i]<=bs[j])
		        {
		            allo[i]=j+1;
		            bs[j]-=ps[i];
		            break;
		        }
		    }
		}
		for(int i=0;i<b;i++)
		{
		    if(allo[i]!=-1)
		      System.out.println("process= "+i+" i.e.("+ps[i]+")is fit to block no."+allo[i]);
		    else
		      System.out.println("process="+i+"i.e.("+ps[i]+")is not allocated");
		}
	}
}
