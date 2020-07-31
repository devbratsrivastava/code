/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    int i=0,c=0;
    while(i<=100)                       //100 is constraint
    {
        if(head==null)
        {
            c++;
            break;
        }
        head=head.next;
        i++;
    }
    if(c==0)
        return true;
    else
        return false;
        
}
