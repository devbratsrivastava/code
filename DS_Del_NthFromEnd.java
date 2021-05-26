/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int t=0,s=1;
        while(temp.next!=null)
        {
            temp=temp.next;
            s++;
        }
        //temp.val=s;
        //return head;
        if(s==n)
            return head.next;
        else if(s>1)
        {
            t=s-n;
            s=0;
            temp=head;
            ListNode prev=head;
            while(s!=t)
            {
                prev=temp;
                temp=temp.next;
                s++;
            }
            prev.next=temp.next;
            //temp=temp.next;
            //temp=null;
            //temp.next=null;
            return head;
        }
        
        else
            return null;
    }
}
