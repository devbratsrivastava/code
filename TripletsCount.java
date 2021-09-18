import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n],s=0;
		    
		    for(int j=0;j<n;j++)
		    a[j]=sc.nextInt();
		    Arrays.sort(a);
		    //for(int j=0;j<n;j++)
		    //s+=a[j];
		    //for(int j=0;j<n;j++)
		    //System.out.print(s);
		    
		    int b=sc.nextInt();
		    int u[]=new int[b];
		    int r[]=new int[b];
		    for(int j=0;j<b;j++)
		    u[j]=j;
		    
		    for(int j=0;j<a.length-2;j++)
		    {
		        for(int k=j+1;k<a.length-1;k++)
		        {
		            for(int l=k+1;l<a.length;l++)
		            {
		                s=a[j]+a[k]+a[l];
		                //System.out.print(s+" ");
		                /*r=s%b;
		                for(int m=0;m<b.length;m++)
		                {
		                    if(b[m]==r)
		                    System.out.print()
		                }*/
		                r[s%b]++;
		            }
		        }
		    }
		    
		    for(int j=0;j<b;j++)
		    System.out.print(r[j]+" ");
		    
		    
		}
		
	}
