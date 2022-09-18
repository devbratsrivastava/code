public class Main
{
	public static void main(String[] args) {
		String s="Move#Hash#to#Front",r="";
		int c=0;
		for(int i=0;i<s.length();i++)
		{
		    if(s.charAt(i)=='#')
		    c++;
		}
		for(int i=0;i<c;i++)
		r+="#";
		for(int i=0;i<s.length();i++)
		{
		    if(s.charAt(i)!='#')
		    r+=""+s.charAt(i);
		}
		System.out.println(r);
	}
}
