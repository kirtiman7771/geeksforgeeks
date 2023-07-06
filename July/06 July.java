// Quick Sort
class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            // Partition the array into two halves.
            int pivotIndex = partition(arr, low, high);
            
            // Recursively sort the two halves.
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }
    
    // Function to partition the array and return the pivot index.
    static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        
        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot,
            // swap arr[i] and arr[j] and move the i pointer.
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        // Swap the pivot element (arr[high]) with the element at index i+1.
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        
        // Return the pivot index.
        return i + 1;
    } 
}