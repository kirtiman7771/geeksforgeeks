// Arranging the array
class Solution {
    
    public void Rearrange(int a[], int n)
    {
        // Your code goes here
        int neg=0;
        int j=0;
        for(int i=0;i<n;i++){
            if(a[i]<0){
                neg++;
            }
        }
        int ps[]=new int[n-neg];
        int nt[]=new int[neg];
        for(int i=0;i<n;i++){
            if(a[i]<0){
                nt[j]=a[i];
                j++;
            }
        }
        j=0;
        for(int i=0;i<n;i++){
            if(a[i]>=0){
                ps[j]=a[i];
                j++;
            }
        }
        for(int i=0;i<nt.length;i++){
            a[i]=nt[i];
        }
        j=0;
        for(int i=nt.length;i<n;i++){
            a[i]=ps[j];
            j++;
        }
    }
}