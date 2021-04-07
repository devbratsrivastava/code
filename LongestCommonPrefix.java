class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
            return "";
        else
        {
            int min=strs[0].length(),c=0;
            String s="";
            for(int i=0;i<strs.length;i++)
            {
                if(strs[i].length()<min)
                    min=strs[i].length();
            }
            for(int i=0;i<min;i++)
            {
                for(int j=0;j<strs.length;j++)
                {
                    if(strs[0].charAt(i)!=strs[j].charAt(i))
                        c++;
                }
                if(c==0)
                {
                    s+=strs[0].charAt(i);
                }
                else
                {
                    //s="";
                    break;
                }
            }
            return s;
        }
    }
}
