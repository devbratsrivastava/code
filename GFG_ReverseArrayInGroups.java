class Solution {
    //Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        for(int i=0;i<n;i+=k)
        {
            int l=i,r=Math.min(i+k-1,n-1),t=0;
            while(l<r)
            {
                t=arr.get(l);
                arr.set(l,arr.get(r));
                arr.set(r,t);
                l++;
                r--;
            }
        }
    }
}
