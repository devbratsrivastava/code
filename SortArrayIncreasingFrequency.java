class Solution {
    public int[] frequencySort(int[] nums) {
        //int a[]=new int[201],
        int b[]=new int[nums.length],f=0;
        //ArrayList<Integer> b=new ArrayList<Integer>();
        ArrayList<Integer> a=new ArrayList<Integer>();
        ArrayList<Integer> t=new ArrayList<Integer>();
        for(int i=-100;i<=100;i++)
        {
            int c=0;
            for(int j=0;j<nums.length;j++)
            {
                if(i==nums[j])
                    c++;
            }
            //a[f++]=c;
            if(c!=0)
            {
                a.add(c);
                t.add(i);
            }
        }
        f=0;
        for(int i=1;i<=nums.length;i++)
        {
            for(int j=a.size()-1;j>=0;j--)
            {
                if(a.get(j)!=0)
                {
                    if(a.get(j)==i)
                    {
                        for(int k=0;k<i;k++)
                            b[f++]=t.get(j);
                    }
                }
            }
        }
        /*for(int i=0;i<b.size();i++)
        {
            System.out.print(b.get(i)+" ");
        }*/
        return b;
    }
}
