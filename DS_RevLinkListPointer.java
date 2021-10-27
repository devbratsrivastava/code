public void reversePI(){
      // write your code here
      Node temp=new Node();
      temp=head;
      Node head2=head;
      //head=tail;
      for(int i=0;i<size()-2;i++)
      temp=temp.next;
      head=tail;
      tail.next=temp;
      tail=temp;
      //temp.next=null;
      
      
      for(int j=size()-3;j>=0;j--)
      {
          temp=head2;
          for(int i=0;i<j;i++)
          temp=temp.next;
          tail.next=temp;
          tail=temp;
          //temp.next=null;
      }
      tail.next=null;
    }
