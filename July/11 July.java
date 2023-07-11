// Find kth element of spiral matrix
class Solution
{
    /*You are required to complete this method*/
    int findK(int A[][], int n, int m, int k)
    {
    // Your code here
    int top=0,buttom=n-1;
    int left=0,right=m-1;
    while(top<=buttom && left<=right){
    for(int i=left;i<=right;i++){
        if(k==1) return A[top][i];
        k--;
    }
    top++;
    for(int i=top;i<=buttom;i++){
        if(k==1) return A[i][right];
        k--;
    }
    right--;
    for(int i=right;i>=left;i--){
        if(k==1) return A[buttom][i];
        k--;
    }
    buttom--;
    for(int i=buttom;i>=top;i--){
        if(k==1) return A[i][left];
        k--;
    }
    left++;
    }
    return -1;	
    }
}