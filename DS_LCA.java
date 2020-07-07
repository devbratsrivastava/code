public static Node lca(Node root, int v1, int v2) 
    {
      	
          if(root==null)
          return root;
          else
          {
              while(root!=null)
              {
                  if(root.data>v1&&root.data>v2)
                  root=root.left;
                  else if(root.data<v1&&root.data<v2)
                  root=root.right;
                  else
                  break;
              }
              return root;
          }
    }
