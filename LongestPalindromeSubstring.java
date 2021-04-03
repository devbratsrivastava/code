class Solution {
    public String longestPalindrome(String s) {
        String w="";
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            int k=s.length()-i;
            for(int j=0;j<=i;j++)
            {
                //for()
                //{
                
                    w=s.substring(j,k++);
                    //System.out.print(w+" ");
                    StringBuffer r=new StringBuffer(w);
                    //System.out.print(w.equals(r.reverse().toString())+" ");
                    if(w.equals(r.reverse().toString()))
                    {
                        c=1;
                        //System.out.println(i+" "+j);
                        //break;
                    }
                //}
                if(c==1)
                    break;
            }
            if(c==1)
                break;
            //System.out.println();
        }
        if(c==0)
            return s;
        else
            return w;
            
    }
}
