// Construct a full binary tree
class Solution
{
    Node helper(int[] pre, int l, int r) {
        int mid = (l + r) / 2;
        Node t = new Node(pre[l]);
        if (l < r) {
            t.left = helper(pre, l + 1, mid);
            t.right = helper(pre, mid + 1, r);
        }
        return t;
    }
    
    public Node constructBTree(int pre[], int preM[], int size) {
         return helper(pre, 0, size - 1);
    }
    
}