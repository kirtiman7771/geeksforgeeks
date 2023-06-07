// Predecessor and Successor
public static void findPreSuc(Node root, int key)
{
    // code here.
    
    /* There are two static nodes defined above pre(representing predecessor) and suc(representing successor) as follows:
       static Node pre=null,suc=null
       You need to update these both.
       And the data inside these classes will be printed automatically by the driver code. 
    */
    if (root == null ) return ;
    findPreSuc(root.left, key);
    if(suc!=null) return ;
    if(root.data<key) pre = root;
    if(root.data>key) {suc = root; return;}
    findPreSuc(root.right, key);
}
}