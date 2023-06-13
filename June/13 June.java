// k largest elements
class Solution {
    int[] kLargest(int[] arr, int n, int k) {
        // code here
      PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<n; i++) pq.add(arr[i]);
        int [] ans = new int[k];
        int j=0;
        while(k>0){
            ans[j] = pq.poll();
            j++;
            k--;
        }
        return ans;
    }
}

