import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the highestValuePalindrome function below.
    static String highestValuePalindrome(String s, int n, int k) {
        int c=0;
        StringBuilder w=new StringBuilder(s);
        for(int i=0;i<w.length()/2;i++)
        {
            if(w.charAt(i)!=s.charAt(w.length()-i-1))
            c++;
        }
        if(c>k)
        return "-1";
        else
        {
            while(k>0)
            {
                for(int i=0;i<w.length()/2;i++)
                {
                    if(w.charAt(i)!='9'||w.charAt(w.length()-i-1)!='9')
                    {
                        if(k>1)
                        {
                            w.setCharAt(i,'9');
                            w.setCharAt(w.length()-i-1,'9');
                            k-=2;
                        }
                        else
                        {
                            if(w.charAt(i)>w.charAt(w.length()-i-1))
                            {
                                w.setCharAt(w.length()-i-1,w.charAt(i));
                                k-=1;
                            }
                            else if(w.charAt(i)<w.charAt(w.length()-i-1))
                            {
                                w.setCharAt(i,w.charAt(w.length()-i-1));
                                k-=1;
                            }
                        }
                    }
                }
            }
            return ""+w;
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        String s = scanner.nextLine();

        String result = highestValuePalindrome(s, n, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
