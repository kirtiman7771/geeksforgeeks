// Smallest Positive missing number
class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        boolean flag= false;
        int ans=0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<size;i++){
            set.add(arr[i]);
        }
        for(int i=0;i<size;i++){
            if(set.contains(i+1))continue;
            else{
                return i+1;
            }
        }
        return size+1;
    }
}