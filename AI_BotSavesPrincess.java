import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char a[][]=new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.next().charAt(0);
            }
        }
        int bi=0,bj=0,qi=0,qj=0;
        //int di,dj;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i][j]=='m')
                {
                    bi=i;
                    bj=j;
                }
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
        {
            for(int i=0;i<(qi-bi);i++)
                System.out.println("DOWN");
        }
        else
        {
            for(int i=0;i<(bi-qi);i++)
                System.out.println("UP");
        } 
        if(qj>bj)
        {
            for(int i=0;i<(qj-bj);i++)
                System.out.println("RIGHT");
        }
        else
        {
            for(int i=0;i<(bj-qj);i++)
                System.out.println("LEFT");
        } 
    }
}
