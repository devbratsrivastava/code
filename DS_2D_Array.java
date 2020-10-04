import java.util.*;
public class twodarray_ds
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[6][6];
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<6;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        int b[]=new int[16];
        int f=0;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                b[f++]=hourglasssum(i,j,a);
            }
        }
        /*for(int j=0;j<16;j++)
            {
                System.out.print(b[j]);
            }*/
            int max=b[0];
            for(int j=0;j<16;j++)
            {
                if(max<b[j])
                max=b[j];
            }
            System.out.println(max);
    }
    public static int hourglasssum(int x,int y,int z[][])
    {
       int sum=z[x][y]+z[x][y+1]+z[x][y+2]+z[x+1][y+1]+z[x+2][y]+z[x+2][y+1]+z[x+2][y+2];
       return sum;
    }
}
