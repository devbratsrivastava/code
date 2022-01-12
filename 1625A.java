import java.util.*;
import java.io.*;
public class A1625
{
    public static void main(String args[])
    {
        try
        {
            //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            //StringTokenizer st=new StringTokenizer(br.readLine());
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            for(;t>0;t--)
            {
                int n=sc.nextInt();
                int l=sc.nextInt();
                //System.out.print(n+" "+l);
                //System.out.println();
                int a[]=new int[n];
                String b[]=new String[n];
                for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
                //for(int i=0;i<n;i++)
                //System.out.print(a[i]+" ");
                //System.out.println();
                for(int i=0;i<n;i++)
                {
                    String bin="";
                    while(a[i]/2!=0)
                    {
                        bin=""+a[i]%2+bin;
                        a[i]/=2;
                    }
                    bin=""+a[i]%2+bin;
                    b[i]=bin;
                }
                //for(int i=0;i<n;i++)
                //System.out.print(b[i]+" ");
                //System.out.println();
                int max=b[0].length();
                for(int i=0;i<n;i++)
                {
                    if(max<b[i].length())
                        max=b[i].length();
                }
                //System.out.print(max+" ");
                //System.out.println();
                for(int i=0;i<n;i++)
                {
                    if(max>b[i].length())
                    {
                        for(int j=0;j<=(max-b[i].length());j++)
                            b[i]="0"+b[i];
                    }
                }
                //for(int i=0;i<n;i++)
                //System.out.print(b[i]+" ");
                //System.out.println();
                String r="";
                for(int i=0;i<b[0].length();i++)
                {
                    int z=0,o=0;
                    for(int j=0;j<b.length;j++)
                    {
                        if(b[j].charAt(i)=='0')
                            z++;
                        else if(b[j].charAt(i)=='1')
                            o++;
                    }
                    if(z>o)
                        r+="0";
                    else if(o>z)
                        r+="1";
                    else if(o==z)
                        r+="0";
                }
                //System.out.print(r+" ");
                int ans=0,power=0;
                for(int i=r.length()-1;i>=0;i--)
                {
                    ans+=(Integer.parseInt(""+r.charAt(i))*Math.pow(2,power++));
                }
                System.out.println(ans);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
