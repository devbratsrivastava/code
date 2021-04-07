class Solution {
    public String intToRoman(int num) {
        String s="";
        if(num>=1000)
        {
            for(int i=0;i<(num/1000);i++)
                s+="M";
        }
        num%=1000;
        if(num>=100)
        {
                if((num/100)%5<4)
                {
                    if((num/100)==5)
                        s+="D";
                    else if((num/100)<5)
                    {
                        for(int i=0;i<(num/100);i++)
                            s+="C";
                    }
                    else if((num/100)>5)
                    {
                        s+="D";
                        for(int i=0;i<(num/100)%5;i++)
                            s+="C";
                    }
                }
                else if((num/100)%5==4)
                {
                    if((num/100)>5)
                        s+="CM";
                    else if((num/100)<5)
                        s+="CD";
                }
        }
        num%=100;
        if(num>=10)
        {
                if((num/10)%5<4)
                {
                    if((num/10)==5)
                        s+="L";
                    else if((num/10)<5)
                    {
                        for(int i=0;i<(num/10);i++)
                            s+="X";
                    }
                    else if((num/10)>5)
                    {
                        s+="L";
                        for(int i=0;i<(num/10)%5;i++)
                            s+="X";
                    }
                }
                else if((num/10)%5==4)
                {
                    if((num/10)>5)
                        s+="XC";
                    else if((num/10)<5)
                        s+="XL";
                }
        }
        num%=10;
        if(num>=1)
        {
                if((num/1)%5<4)
                {
                    if((num/1)==5)
                        s+="V";
                    else if((num/1)<5)
                    {
                        for(int i=0;i<(num/1);i++)
                            s+="I";
                    }
                    else if((num/1)>5)
                    {
                        s+="V";
                        for(int i=0;i<(num/1)%5;i++)
                            s+="I";
                    }
                }
                else if((num/1)%5==4)
                {
                    if((num/1)>5)
                        s+="IX";
                    else if((num/1)<5)
                        s+="IV";
                }
        }
        return s;
    }
}
