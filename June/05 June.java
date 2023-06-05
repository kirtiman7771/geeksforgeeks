// Find the Closest Element in BST
class Solution
{
    //Function to find the least absolute difference between any node
    //value of the BST and the given integer.
    static int minDiff(Node  root, int K) 
    { 
        // Write your code here
         if (root == null)
            return Integer.MAX_VALUE;

      
        if (root.data == K)
            return 0;

       
        if (root.data > K)
            return Math.min(Math.abs(K - root.data), minDiff(root.left, K));

       
        if (root.data < K)
            return Math.min(Math.abs(K - root.data), minDiff(root.right, K));

        return Integer.MAX_VALUE;
    } 
}