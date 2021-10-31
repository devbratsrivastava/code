public int mid(){
      Node slow = head;
      Node fast = head;
      while(fast.next != null && fast.next.next!=null ){
        slow = slow.next;
        fast = fast.next.next;
        
      }

      return slow.data;
    }
