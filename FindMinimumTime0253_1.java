class Solution{
    static int minTime(int S1, int S2, int N)
    {
        // code here
        //LinkedList<Integer> l1=new LinkedList<>();
        int min=Math.min(S2*N,S1*N);
        //l1.add(min);
        for(int i=1;i<N;i++)
        {
            if(min>(Math.max((S1*i),(S2*(N-i)))))
            min=(Math.max((S1*i),(S2*(N-i))));
        }
        return min;
    }
}
