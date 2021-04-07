class Solution {
    public int romanToInt(String s) {
       int n=0;
        if(s.length()==1)
        {
            if(s.equals("I"))
                n=1;
            else if(s.equals("V"))
                n=5;
            else if(s.equals("X"))
                n=10;
            else if(s.equals("L"))
                n=50;
            else if(s.equals("C"))
                n=100;
            else if(s.equals("D"))
                n=500;
            else if(s.equals("M"))
                n=1000;
            return n;
        }
        else
        {
            for(int i=0;i<s.length()-1;i++)
            {
                if(s.charAt(i)=='C')
                {
                    if(s.charAt(i+1)=='D')
                    {
                        n+=400;
                        i++;
                    }
                    else if(s.charAt(i+1)=='M')
                    {
                        n+=900;
                        i++;
                    }
                    else
                        n+=100;
                }
                else if(s.charAt(i)=='X')
                {
                    if(s.charAt(i+1)=='L')
                    {
                        n+=40;
                        i++;
                    }
                    else if(s.charAt(i+1)=='C')
                    {
                        n+=90;
                        i++;
                    }
                    else
                        n+=10;
                }
                else if(s.charAt(i)=='I')
                {
                    if(s.charAt(i+1)=='V')
                    {
                        n+=4;
                        i++;
                    }
                    else if(s.charAt(i+1)=='X')
                    {
                        n+=9;
                        i++;
                    }
                    else
                        n+=1;
                }
                else if(s.charAt(i)=='V')
                n+=5;
            else if(s.charAt(i)=='L')
                n+=50;
            else if(s.charAt(i)=='D')
                n+=500;
            else if(s.charAt(i)=='M')
                n+=1000;
            }
            if(s.charAt(s.length()-1)=='V'&&s.charAt(s.length()-2)!='I')
                n+=5;
            else if(s.charAt(s.length()-1)=='X'&&s.charAt(s.length()-2)!='I')
                n+=10;
            else if(s.charAt(s.length()-1)=='L'&&s.charAt(s.length()-2)!='X')
                n+=50;
            else if(s.charAt(s.length()-1)=='C'&&s.charAt(s.length()-2)!='X')
                n+=100;
            else if(s.charAt(s.length()-1)=='D'&&s.charAt(s.length()-2)!='C')
                n+=500;
            else if(s.charAt(s.length()-1)=='M'&&s.charAt(s.length()-2)!='C')
                n+=1000;
            else if(s.charAt(s.length()-1)=='I')
                n+=1;
            return n;
    }
    }
}
