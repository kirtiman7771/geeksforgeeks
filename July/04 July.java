// Count the subarrays having product less than k
class Solution {
    
    public int countSubArrayProductLessThanK(long a[], int n, long k)
    {
        int i=0;
        int j=0;
        long ans=1;
        int count=0;
        for(i=0,j=0;j<n;j++){
            ans=ans*a[j];
            
            while(ans>=k && i<n ){
                ans=ans/a[i];
                i++;
            }
            
            if(ans<k)
            {
                count+=(j-i)+1;
            }
        }
        
        return count;
    }
}