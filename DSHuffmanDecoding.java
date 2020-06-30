

/*  
	class Node
		public  int frequency; // the frequency of this tree
    	public  char data;
    	public  Node left, right;
    
*/ 

	void decode(String s, Node root) {
        String w="";
        Node temp=root;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            {
                temp=temp.right;
                if(temp.left==null&&temp.right==null)
                {
                    w+=temp.data;
                    temp=root;
                }
            }
            else
            {
                temp=temp.left;
                if(temp.left==null&&temp.right==null)
                {
                    w+=temp.data;
                    temp=root;
                }
            }
        }
        System.out.println(w);
    }

