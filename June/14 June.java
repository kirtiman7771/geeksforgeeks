// Maximum Diamonds
class Solution {
    static long maxDiamonds(int[] A, int N, int K) {
        // code here
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        long sum = 0;

        for (int i = 0; i < N; i++) {
            maxHeap.offer(A[i]);
        }

        for (int i = 0; i < K; i++) {
            int max = maxHeap.poll();
            sum += max;
            maxHeap.offer(max / 2);
        }

        return sum;
    }
};