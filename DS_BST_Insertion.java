

 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

	public static Node insert(Node root,int data) {
        if(root==null)
        {
        root=new Node(data);
        return root;
        }
        else
        {
        Node temp=root;
    	Node prev=null;
        Node newnode=new Node(data);
        while(temp!=null)
        {
            prev=temp;
            if(data<temp.data)
            temp=temp.left;
            else
            temp=temp.right;
        }
        if(prev==null)
        prev=newnode;
        else if(data<prev.data)
        prev.left=newnode;
        else
        prev.right=newnode;
        return root;
        }
    }

