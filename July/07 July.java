// Merge Without Extra Space
class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
         long a[]=new long[n+m];
            for(int i=0;i<n;i++) a[i]=arr1[i];
            for(int i=n,j=0;i<n+m;i++,j++) a[i]=arr2[j];
            Arrays.sort(a);
            
            for(int i=0;i<n;i++)
                arr1[i]=a[i];
            for(int i=0,j=n;j<n+m;i++,j++)
                arr2[i]=a[j];
    }
}