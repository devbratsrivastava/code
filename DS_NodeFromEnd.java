//the program will find Kth node from end without using length function
public int kthFromLast(int k){
      // write your code here
      Node prev=head;
      Node curr=head;
      for(int i=0;i<k;i++)
      curr=curr.next;
      
      while(curr.next!=null)
      {
          curr=curr.next;
          prev=prev.next;
      }
      return prev.data;
    }
