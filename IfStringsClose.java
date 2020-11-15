import java.util.Arrays;
class Solution {
    public boolean closeStrings(String word1, String word2) {
        String s1="",s2="";
        //String t1="",t2="";
        int c=0;
        for(char i='a';i<='z';i++)
        {
            for(int j=0;j<word1.length();j++)
            {
                if(i==word1.charAt(j))
                {
                    s1+=word1.charAt(j);
                    break;
                }
            }
        }
        for(char i='a';i<='z';i++)
        {
            for(int j=0;j<word2.length();j++)
            {
                if(i==word2.charAt(j))
                {
                    s2+=word2.charAt(j);
                    break;
                }
            }
        }
        if(s1.equals(s2))
        {
            /*if(word1.length()==word2.length())
                return true;
            else
                return false;*/
        for(char i='a';i<='z';i++)
        {
            for(int j=0;j<word1.length();j++)
            {
                if(i==word1.charAt(j))
                {
                    c++;
                    
                }
            }
            s1+=""+c;
            c=0;
        }
        c=0;
        for(char i='a';i<='z';i++)
        {
            for(int j=0;j<word2.length();j++)
            {
                if(i==word2.charAt(j))
                {
                    c++;
                }
            }
            s2+=""+c;
            c=0;
        }
            char t1[]=s1.toCharArray();
            Arrays.sort(t1);
            s1=new String(t1);
            char t2[]=s2.toCharArray();
            Arrays.sort(t2);
            s2=new String(t2);
            if(s1.equals(s2))
                return true;
            else
                return false;
        }
        else
            return false;
    }
}
