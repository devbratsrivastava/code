import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char a[][]=new char[n][n];
        int bi=sc.nextInt();
        int bj=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.next().charAt(0);
            }
        }
        int qi=0,qj=0;
        //int di,dj;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                
                if(a[i][j]=='p')
                {
                    qi=i;
                    qj=j;
                }
            }
        }
        //di=qi-bi;
        //dj=qj-bj;
        if(qi>bi)
            System.out.println("RIGHT");
        else if(qi<bi)
            System.out.println("LEFT");
        else
        {
            if(qj>bj)
            System.out.println("RIGHT");
        else if(qj<bj)
            System.out.println("LEFT");
        }
    }
}
