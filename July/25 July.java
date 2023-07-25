// Level order traversal in spiral form

//User function Template for Java


/*
// A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Spiral
{
    //Function to return a list containing the level order 
    //traversal in spiral form.	
    ArrayList<Integer> findSpiral(Node root) 
    {
        // Your code here
    Queue<Node> q= new LinkedList<>();
        
        q.add(root);ArrayList<Integer> temp= new ArrayList<>();
        ArrayList<Integer> ans= new ArrayList<>();
        int c=0;
        while (true) {
 
         
            int nodeCount = q.size();
            if (nodeCount == 0)
                break;
         
           
            while (nodeCount > 0) {
                Node node = q.peek();
                
                temp.add(node.data);
               
                q.remove();
                if (node.left != null)
                    q.add(node.left);
                if (node.right != null)
                    q.add(node.right);
                nodeCount--;
            }
            if(c%2==0){
                Collections.reverse(temp);
            }
            
            ans.addAll(temp);
            c++;
            temp.clear();
            
        
    }
        return ans;
    }
}