// Make Matrix Beautiful

class Solution
{
    public:
    //Function to find minimum number of operations that are required 
    //to make the matrix beautiful.
    int findMinOpeartion(vector<vector<int> > matrix, int n)
    {
        // code here 
     priority_queue <int> pq1,pq2;
        for(int i = 0 ; i < n ; i++){
            int sum = 0 ;
            int sum1 = 0;
            for(int j = 0 ; j < n ; j++){
                sum+=matrix[i][j];
                sum1+=matrix[j][i];
            }
            pq1.push(sum);
            pq2.push(sum1);
            }
            
            int ans1 = 0;
            int top1 = pq1.top();
            pq1.pop();
            
            while(!pq1.empty()){
                ans1 += (top1 - pq1.top());
                pq1.pop();
            }
            
             int top2 = pq2.top();
            pq2.pop();
            int ans2 = 0;
            while(!pq2.empty()){
                ans2 += (top2 - pq2.top());
                pq2.pop();
            }
            
            
            return max(ans1,ans2);
    } 
};