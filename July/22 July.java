// Remove duplicates from an unsorted linked list
class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
         // Your code here
    if (head == null || head.next == null) {
            return head;
        }

        HashSet<Integer> uniqueElements = new HashSet<>();
        Node current = head;
        Node prev = null;

        while (current != null) {
            if (uniqueElements.contains(current.data)) {
                prev.next = current.next;
            } else {
                uniqueElements.add(current.data);
                prev = current;
            }
            current = current.next;
        }

        return head;
    }
}
