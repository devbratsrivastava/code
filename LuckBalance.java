import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Arrays;
public class Solution {

    // Complete the luckBalance function below.
    static int luckBalance(int k, int[][] contests) {
        int s=0,c=0,f=0;
        for(int i=0;i<contests.length;i++)
        {
            s+=contests[i][0];
            if(contests[i][1]==1)
            c++;
        }
        if(k>=c)
        return s;
        else
        {
            int t=0;
            int a[]=new int[c];
            
            for(int i=0;i<contests.length;i++)
            {
                if(contests[i][1]==1)
                {
                    //t+=contests[i][0];
                    t++;
                    a[f++]=contests[i][0];
                }
            }
            Arrays.sort(a);
            for(int i=0;i<t-k;)
            {
                //if(contests[i][1]==1)
                
                s-=(a[i]*2);
                i++;
                //continue;
            }
            return s;
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[][] contests = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] contestsRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int contestsItem = Integer.parseInt(contestsRowItems[j]);
                contests[i][j] = contestsItem;
            }
        }

        int result = luckBalance(k, contests);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
