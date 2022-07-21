import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(;t>0;t--)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            if(k>1)
            {
                int total = 0;
                for (int i = 1; i <= n; i++)
                    total += ((n / i)%1000000007);
                System.out.println(total);
            }
            else
                System.out.println(n);
        }
    }
}
