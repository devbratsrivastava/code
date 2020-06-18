import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {

	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static int height(Node node) {
      	// Write your code here.
          if(node==null)
          return 0;
          else
          {
              Queue<Node> q=new LinkedList();
              q.add(node);
              int h=0;
              while(true)
              {
                  int c=q.size();
                  if(c==0)
                  return h-1;
                  else
                  h++;
                  while(c>0)
                  {
                      Node newnode=q.peek();
                      q.remove();
                      if(newnode.left!=null)
                      q.add(newnode.left);
                      if(newnode.right!=null)
                      q.add(newnode.right);
                      c--;
                  }
              }
          }
    }

	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        int height = height(root);
        System.out.println(height);
    }	
}
