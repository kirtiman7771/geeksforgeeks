//Given a linked list of 0s, 1s and 2s, sort it. 

//User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        // add your code here
     Node temp = head;
        int c0 = 0;
        int c1 = 0;
        int c2 = 0;
         while(temp != null){
             if(temp.data == 0){
                 c0++;
             }
             else if(temp.data == 1){
                 c1++;
             }else{
                 c2++;
             }
             
             temp = temp.next;
         }
         
         Node ans;
         if(c0 != 0){
              ans = new Node(0);
         }else if(c1 != 0){
              ans = new Node(1);
         }else{
             ans = new Node(2);
         }
         
         Node finans = ans;
         Node n;
         for(int i = 1; i < c1+c2+c0; i++){
             
             if(i<c0){
                n = new Node(0);
                ans.next = n;
                ans = ans.next;
             }else if(i < c0+c1){
                n = new Node(1);
                ans.next = n;
                ans = ans.next;
             }else{
                n = new Node(2);
                ans.next = n;
                ans = ans.next;
             }
             
         }
         
         return finans;
    }
}