class Solution {
    public int myAtoi(String s) {
        String w=s.trim(),r="";
        if(w.length()==0)
            return 0;
        else
        {
            int a=(int)w.charAt(0);
            //return a;
            if(a!=43&&a!=45&&(a<48||a>57))
               return 0;
            else
            {
                if(a==45)
                {
                    //r="-";
                    for(int i=1;i<w.length();i++)
                    {
                        if((int)w.charAt(i)>=48&&(int)w.charAt(i)<=57)
                            r+=w.charAt(i);
                        else
                            break;
                    }
                    //r=("-"+r);
                    if(r.length()>=10)
                    {
                        if(r.compareTo("2147483648")>0)
                            r="-2147483648";
                    }
                    //return Integer.valueOf(r);
                }
                else if(a==43||((a>=48&&a<=57)))
                {
                    //r="-";
                    for(int i=0;i<w.length();i++)
                    {
                        if(w.charAt(i)==43)
                            continue;
                        else if((int)w.charAt(i)>=48&&(int)w.charAt(i)<=57)
                            r+=w.charAt(i);
                        else
                            break;
                    }
                    if(r.length()>=10)
                    {
                        if(r.compareTo("2147483647")>0)
                            r="2147483647";
                    }
                    //else
                        //r="0";
                    //return Integer.valueOf(r);
                }
                if(a==45)
                {
                    if(r.length()==0||r.equals("-"))
                        return 0;
                    else
                    {
                            int n=Integer.valueOf(r);
                        return -n;
                    }
                }
                else
                {
                    if(r.length()==0||r.equals("-"))
                        return 0;
                    else
                    {
                            int n=Integer.valueOf(r);
                        return n;
                    }
                }
            }
        }
    }
}
