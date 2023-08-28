// remove element from a sorted link list 
/*
struct Node {
  int data;
  struct Node *next;
  Node(int x) {
    data = x;
    next = NULL;
  }
};*/

//Function to remove duplicates from sorted linked list.
Node *removeDuplicates(Node *head)
{
 if(head==NULL)
    return NULL;
    if(head->next==NULL)
    return head;
    Node* curr=head;
    Node* temp=head->next;
    while(curr->next!=NULL && temp!=NULL)
    {
        if(temp->data==curr->data)
        {
            curr->next=temp->next;
        }
        else
        curr=curr->next;
        temp=curr->next;
    }
    return head;
}