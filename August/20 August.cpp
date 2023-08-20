// Number of occurrence

class Solution{
public:	
	/* if x is present in arr[] then returns the count
		of occurrences of x, otherwise returns 0. */
	int count(int arr[], int n, int x) {
	    // code here
	 int l = lower_bound(arr, arr+n, x)-arr;
	    int r = upper_bound(arr, arr+n, x)-arr;
	    return r-l;
	}
};