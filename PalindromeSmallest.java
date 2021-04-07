class Solution {
    public boolean isPalindrome(int x) {
        String s=""+x;
        StringBuilder w=new StringBuilder(s);
        return (s.equals(""+w.reverse()));
    }
}
