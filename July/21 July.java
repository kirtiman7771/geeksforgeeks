// Reverse a Linked List in groups of given size
class Solution
{
    public static Node reverse(Node node, int k)
    {
        //Your code here
        Node dummy = new Node(0);
        int c = 0;
        dummy.next = node;
        Node temp = dummy;
        while(temp.next != null){
            c += 1;
            temp = temp.next;
        }
        temp = dummy;
        while(temp.next != null){
            int nodes = k-1;
            int nodes2 = c%k-1;
            Node tempNext = temp.next; 
            Node first = temp.next; 
            Node second = first.next;
            if(c<k){
                c--;
                while(c-- > 0){
                    Node temp2 = second.next;
                    second.next = first;
                    first = second;
                    second = temp2;
                }
            }
            else{
                while(nodes-- > 0){
                    Node temp2 = second.next;
                    second.next = first;
                    first = second;
                    second = temp2;
                }
            }
            tempNext.next = second;
            temp.next = first;
            temp = tempNext;
            c -= k;
        }
        return dummy.next;
    }
}