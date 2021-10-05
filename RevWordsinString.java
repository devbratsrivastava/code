class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here 
        String r="";
        StringTokenizer s=new StringTokenizer(S,".");
        while(s.hasMoreTokens())
        {
            r="."+s.nextToken()+r;
        }
        return r.substring(1);
    }
}
