// Right View of Binary Tree

//User function Template for Java


/*Complete The Function Provided
Given Below is The Node Of Tree
class Node
{
    int data;
    Node left, right;
    public Node(int data)
    {
        this.data = data;
         left = right = null;
    }
}*/


class Solution{
    //Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node node) {
        //add code here.
    ArrayList<Integer> result = new ArrayList<>();
        if (node == null) {
            return result;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            // Traverse all nodes at the current level and add the last node's value to the result list.
            for (int i = 0; i < levelSize; i++) {
                node = queue.poll();
                if (i == levelSize - 1) {
                    result.add(node.data); // Last node encountered at the current level.
                }

                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }

        return result;
    }
}