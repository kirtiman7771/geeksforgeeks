// Nth node from end of linked list
class GfG
{
    int getNthFromLast(Node head, int n)
    {
    	// Your code here
    Node main_ptr = head;
        Node temp_ptr = head;
        boolean mainPtrFlag = Boolean.FALSE;
        n--;
        while(temp_ptr.next!=null && n!=-1){
            if(mainPtrFlag){
                main_ptr = main_ptr.next;
                temp_ptr = temp_ptr.next;
            }
            else if(n==0){
                mainPtrFlag = Boolean.TRUE;
            }
            else {
                temp_ptr = temp_ptr.next; 
                n--;
            }
        }
    	
    	if(n!=0)
    	    return -1;
    	else 
    	    return main_ptr.data;
    }
}