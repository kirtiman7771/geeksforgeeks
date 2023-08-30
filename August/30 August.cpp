// Delete a Node in Single Linked List

Node* deleteNode(Node *head,int x)
{
    //Your code here
    Node *temp;
    Node *curr;
    temp=head;
    if(x==1)
    {
        head=head->next;
        return head;
    }
    for(int i=0;i<x-1;i++)
    {
        curr=temp;
        temp=temp->next;
    }
    curr->next=temp->next;
    return head;
}