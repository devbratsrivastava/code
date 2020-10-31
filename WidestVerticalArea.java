import java.util.*;
class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int max=0;
        int a[]=new int[points.length];
        for(int i=0;i<points.length;i++)
        {
            a[i]=points[i][0];
        }
        Arrays.sort(a);
        for(int i=0;i<a.length-1;i++)
        {
            if(Math.abs(a[i]-a[i+1])!=0)
            {
                max=Math.abs(a[i]-a[i+1]);
                break;
            }
        }
        for(int i=0;i<a.length-1;i++)
        {
            if(Math.abs(a[i]-a[i+1])!=0)
            {
                if(Math.abs(a[i]-a[i+1])>max)
                    max=Math.abs(a[i]-a[i+1]);
            }
        }
        //return a[a.length-1];
        //for(int i=0;i<)
        return max;
    }
}
