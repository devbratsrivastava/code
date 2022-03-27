public static String superReducedString(String s) {
    // Write your code here
    String res="_";
    for(int i=0;i<s.length();i++)
    {
        if(res.charAt(res.length()-1)!=s.charAt(i))
        res+=""+s.charAt(i);
        else
        res=res.substring(0,res.length()-1);
    }
    if(res.equals("_"))
    return "Empty String";
    else
    return res.substring(1,res.length());
    }
